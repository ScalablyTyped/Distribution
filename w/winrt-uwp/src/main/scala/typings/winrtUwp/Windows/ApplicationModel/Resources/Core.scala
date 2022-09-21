package typings.winrtUwp.Windows.ApplicationModel.Resources

import typings.std.Array
import typings.winrtUwp.Windows.Foundation.Collections.IIterable
import typings.winrtUwp.Windows.Foundation.Collections.IIterator
import typings.winrtUwp.Windows.Foundation.Collections.IKeyValuePair
import typings.winrtUwp.Windows.Foundation.Collections.IMapChangedEventArgs
import typings.winrtUwp.Windows.Foundation.Collections.IMapView
import typings.winrtUwp.Windows.Foundation.Collections.IObservableMap
import typings.winrtUwp.Windows.Foundation.Collections.IVectorView
import typings.winrtUwp.Windows.Foundation.Collections.MapChangedEventHandler
import typings.winrtUwp.Windows.Foundation.EventHandler
import typings.winrtUwp.Windows.Foundation.IPromiseWithIAsyncOperation
import typings.winrtUwp.Windows.Foundation.Uri
import typings.winrtUwp.Windows.Storage.IStorageFile
import typings.winrtUwp.Windows.Storage.StorageFile
import typings.winrtUwp.Windows.Storage.Streams.IRandomAccessStream
import typings.winrtUwp.Windows.WinRTEvent
import typings.winrtUwp.anon.FirstIMapView
import typings.winrtUwp.anon.FirstSecond
import typings.winrtUwp.anon.Index
import typings.winrtUwp.anon.ItemsArray
import typings.winrtUwp.anon.ItemsIKeyValuePair
import typings.winrtUwp.anon.ItemsResourceCandidate
import typings.winrtUwp.anon.ItemsResourceQualifier
import typings.winrtUwp.anon.SecondIMapView
import typings.winrtUwp.winrtUwpStrings.mapchanged
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Provides classes that enable advanced resource loading. */
object Core {
  
  @js.native
  sealed trait ResourceQualifierPersistence extends StObject
  /** Possible values for the persistence of a global qualifier value override. */
  @JSGlobal("Windows.ApplicationModel.Resources.Core.ResourceQualifierPersistence")
  @js.native
  object ResourceQualifierPersistence extends StObject {
    
    /** The override value persists on the local machine. */
    @js.native
    sealed trait localMachine
      extends StObject
         with ResourceQualifierPersistence
    
    /** The override value is not persistent. */
    @js.native
    sealed trait none
      extends StObject
         with ResourceQualifierPersistence
  }
  
  /** Represents a single logical, named resource, such as a string resource named 'Header1'. */
  @js.native
  trait NamedResource extends StObject {
    
    /** Gets all possible candidate values for this named resource. */
    var candidates: IVectorView[ResourceCandidate] = js.native
    
    /**
      * Resolves this NamedResource object against the default context and returns the most appropriate candidate.
      * @return The most appropriate candidate for the default context.
      */
    def resolve(): ResourceCandidate = js.native
    /**
      * Resolves this NamedResource object against a supplied context and returns the most appropriate candidate.
      * @param resourceContext The context against which the NamedResource should be resolved.
      * @return The most appropriate candidate for the specified context.
      */
    def resolve(resourceContext: ResourceContext): ResourceCandidate = js.native
    
    /**
      * Resolves this NamedResource object against the default context and returns a list of all possible candidates in preference order.
      * @return A list of ResourceCandidate objects, in order of preference. The object in first position in the list is the most appropriate candidate for the corresponding context, and the object in last position is the least appropriate.
      */
    def resolveAll(): IVectorView[ResourceCandidate] = js.native
    /**
      * Resolves this NamedResource object against a supplied context and returns a list of all possible candidates in preference order.
      * @param resourceContext The context against which the NamedResource should be resolved.
      * @return A list of ResourceCandidate objects, in order of preference. The object in first position in the list is the most appropriate candidate for the corresponding context, and the object in last position is the least appropriate.
      */
    def resolveAll(resourceContext: ResourceContext): IVectorView[ResourceCandidate] = js.native
    
    /** Gets a URI that can be used to refer to this named resource. */
    var uri: Uri = js.native
  }
  
  /** Represents a single possible value for a given NamedResource , the qualifiers associated with that resource, and how well those qualifiers match the context against which it was resolved. */
  trait ResourceCandidate extends StObject {
    
    /**
      * Returns the value of a qualifier, given its name.
      * @param qualifierName The name of the qualifier.
      * @return The value of the qualifier.
      */
    def getQualifierValue(qualifierName: String): String
    
    /**
      * Asynchronously returns a StorageFile that accesses the value of this ResourceCandidate . This only works on certain types of ResourceCandidates that are files.
      * @return An asynchronous operation to return the requested StorageFile .
      */
    def getValueAsFileAsync(): IPromiseWithIAsyncOperation[StorageFile]
    
    /**
      * Asynchronously returns an IRandomAccessStream that accesses the value of this ResourceCandidate .
      * @return An asynchronous operation to return the requested IRandomAccessStream .
      */
    def getValueAsStreamAsync(): IPromiseWithIAsyncOperation[IRandomAccessStream]
    
    /** Indicates whether this ResourceCandidate can be used as a default fallback value for any context. */
    var isDefault: Boolean
    
    /** Indicates whether this ResourceCandidate matched the ResourceContext against which it was evaluated. */
    var isMatch: Boolean
    
    /** Indicates whether this ResourceCandidate matched the ResourceContext against which it was evaluated as a result of being a true match, a default fallback value, or a mixed match with default fallback (that is, a match in relation to some qualifiers but using default fallback values for other qualifiers). */
    var isMatchAsDefault: Boolean
    
    /** Gets the qualifiers associated with this ResourceCandidate . */
    var qualifiers: IVectorView[ResourceQualifier]
    
    /** Gets the value of this ResourceCandidate , expressed as a string. */
    var valueAsString: String
  }
  object ResourceCandidate {
    
    inline def apply(
      getQualifierValue: String => String,
      getValueAsFileAsync: () => IPromiseWithIAsyncOperation[StorageFile],
      getValueAsStreamAsync: () => IPromiseWithIAsyncOperation[IRandomAccessStream],
      isDefault: Boolean,
      isMatch: Boolean,
      isMatchAsDefault: Boolean,
      qualifiers: IVectorView[ResourceQualifier],
      valueAsString: String
    ): ResourceCandidate = {
      val __obj = js.Dynamic.literal(getQualifierValue = js.Any.fromFunction1(getQualifierValue), getValueAsFileAsync = js.Any.fromFunction0(getValueAsFileAsync), getValueAsStreamAsync = js.Any.fromFunction0(getValueAsStreamAsync), isDefault = isDefault.asInstanceOf[js.Any], isMatch = isMatch.asInstanceOf[js.Any], isMatchAsDefault = isMatchAsDefault.asInstanceOf[js.Any], qualifiers = qualifiers.asInstanceOf[js.Any], valueAsString = valueAsString.asInstanceOf[js.Any])
      __obj.asInstanceOf[ResourceCandidate]
    }
    
    extension [Self <: ResourceCandidate](x: Self) {
      
      inline def setGetQualifierValue(value: String => String): Self = StObject.set(x, "getQualifierValue", js.Any.fromFunction1(value))
      
      inline def setGetValueAsFileAsync(value: () => IPromiseWithIAsyncOperation[StorageFile]): Self = StObject.set(x, "getValueAsFileAsync", js.Any.fromFunction0(value))
      
      inline def setGetValueAsStreamAsync(value: () => IPromiseWithIAsyncOperation[IRandomAccessStream]): Self = StObject.set(x, "getValueAsStreamAsync", js.Any.fromFunction0(value))
      
      inline def setIsDefault(value: Boolean): Self = StObject.set(x, "isDefault", value.asInstanceOf[js.Any])
      
      inline def setIsMatch(value: Boolean): Self = StObject.set(x, "isMatch", value.asInstanceOf[js.Any])
      
      inline def setIsMatchAsDefault(value: Boolean): Self = StObject.set(x, "isMatchAsDefault", value.asInstanceOf[js.Any])
      
      inline def setQualifiers(value: IVectorView[ResourceQualifier]): Self = StObject.set(x, "qualifiers", value.asInstanceOf[js.Any])
      
      inline def setValueAsString(value: String): Self = StObject.set(x, "valueAsString", value.asInstanceOf[js.Any])
    }
  }
  
  /** Represents a collection of ResourceCandidate objects. */
  @js.native
  trait ResourceCandidateVectorView
    extends StObject
       with Array[ResourceCandidate] {
    
    /**
      * Returns an iterator to enumerate the items in the set of ResourceCandidate objects.
      * @return The iterator. The current position of the iterator is index 0, or the end of the set if the set is empty.
      */
    def first(): IIterator[ResourceCandidate] = js.native
    
    /**
      * Returns the ResourceCandidate at the specified index in the set.
      * @param index The zero-based index of the ResourceCandidate in the set to return.
      * @return The ResourceCandidate at the specified index.
      */
    def getAt(index: Double): ResourceCandidate = js.native
    
    /**
      * Returns the ResourceCandidate objects that start at the specified index in the set.
      * @param startIndex The zero-based index of the start of the ResourceCandidate objects in the set to return.
      */
    def getMany(startIndex: Double): ItemsResourceCandidate = js.native
    
    def indexOf(value: ResourceCandidate, extra: Any*): Index = js.native
    /* hack */
    @JSName("indexOf")
    def indexOf_Double(searchElement: ResourceCandidate): Double = js.native
    
    /** Gets the number of ResourceCandidate objects in the set. */
    var size: Double = js.native
  }
  
  /** Encapsulates all of the factors ( ResourceQualifier s) that might affect resource selection. */
  @js.native
  trait ResourceContext extends StObject {
    
    /** Gets or sets the language qualifier for this context. */
    var languages: IVectorView[String] = js.native
    
    /**
      * Overrides the qualifier values supplied by this context to match a specified list of resolved ResourceQualifier s. Typically the resolved ResourceQualifiers are associated with a resource that was looked up earlier.
      * @param result The ResourceQualifier s to be applied to the context.
      */
    def overrideToMatch(result: IIterable[ResourceQualifier]): Unit = js.native
    
    /** Gets a writable, observable map of all supported qualifiers, indexed by name. */
    var qualifierValues: IObservableMap[String, String] = js.native
    
    /** Resets the overridden values for all qualifiers on the given ResourceContext instance. */
    def reset(): Unit = js.native
    /**
      * Resets the overridden values for the specified qualifiers on the given ResourceContext instance.
      * @param qualifierNames The names of the qualifiers to be reset.
      */
    def reset(qualifierNames: IIterable[String]): Unit = js.native
  }
  
  /** Represents a collection of ResourceContext language qualifiers. */
  @js.native
  trait ResourceContextLanguagesVectorView
    extends StObject
       with Array[String] {
    
    /**
      * Returns an iterator to enumerate the items in the set of ResourceContext language qualifiers.
      * @return The iterator. The current position of the iterator is index 0, or the end of the set if the set is empty.
      */
    def first(): IIterator[String] = js.native
    
    /**
      * Returns the ResourceContext language qualifier at the specified index in the set.
      * @param index The zero-based index of the ResourceContext language qualifier in the set to return.
      * @return The ResourceContext language qualifier at the specified index.
      */
    def getAt(index: Double): String = js.native
    
    /**
      * Returns the ResourceContext language qualifiers that start at the specified index in the set.
      * @param startIndex The zero-based index of the start of the ResourceContext language qualifiers in the set to return.
      */
    def getMany(startIndex: Double): ItemsArray = js.native
    
    def indexOf(value: String, extra: Any*): Index = js.native
    /* hack */
    @JSName("indexOf")
    def indexOf_Double(searchElement: String): Double = js.native
    
    /** Gets the number of ResourceContext language qualifiers in the set. */
    var size: Double = js.native
  }
  
  /** Structure that determines version and counts of resources returned for the app package. */
  trait ResourceLayoutInfo extends StObject {
    
    /** Framework-generated checksum. */
    var checksum: Double
    
    /** Major version of resources to be returned. */
    var majorVersion: Double
    
    /** Minor version of resources to be returned. */
    var minorVersion: Double
    
    /** Number of named resources to be returned. */
    var namedResourceCount: Double
    
    /** Number of resource subtrees to be returned. */
    var resourceSubtreeCount: Double
  }
  object ResourceLayoutInfo {
    
    inline def apply(
      checksum: Double,
      majorVersion: Double,
      minorVersion: Double,
      namedResourceCount: Double,
      resourceSubtreeCount: Double
    ): ResourceLayoutInfo = {
      val __obj = js.Dynamic.literal(checksum = checksum.asInstanceOf[js.Any], majorVersion = majorVersion.asInstanceOf[js.Any], minorVersion = minorVersion.asInstanceOf[js.Any], namedResourceCount = namedResourceCount.asInstanceOf[js.Any], resourceSubtreeCount = resourceSubtreeCount.asInstanceOf[js.Any])
      __obj.asInstanceOf[ResourceLayoutInfo]
    }
    
    extension [Self <: ResourceLayoutInfo](x: Self) {
      
      inline def setChecksum(value: Double): Self = StObject.set(x, "checksum", value.asInstanceOf[js.Any])
      
      inline def setMajorVersion(value: Double): Self = StObject.set(x, "majorVersion", value.asInstanceOf[js.Any])
      
      inline def setMinorVersion(value: Double): Self = StObject.set(x, "minorVersion", value.asInstanceOf[js.Any])
      
      inline def setNamedResourceCount(value: Double): Self = StObject.set(x, "namedResourceCount", value.asInstanceOf[js.Any])
      
      inline def setResourceSubtreeCount(value: Double): Self = StObject.set(x, "resourceSubtreeCount", value.asInstanceOf[js.Any])
    }
  }
  
  /** Provides access to application resource maps and more advanced resource functionality. */
  trait ResourceManager extends StObject {
    
    /** Gets a map of ResourceMap objects typically associated with the app packages, indexed by package name. */
    var allResourceMaps: IMapView[String, ResourceMap]
    
    /** Gets the default ResourceContext for the currently running application. Unless explicitly overridden, the default ResourceContext is used to determine the most appropriate representation of any given named resource. */
    var defaultContext: ResourceContext
    
    /**
      * Gets a list of all named resources for an app package.
      * @param packageName The name of the app package.
      * @param resourceLayoutInfo Specifies the resource version and the named resource count.
      * @return A list of NamedResource objects.
      */
    def getAllNamedResourcesForPackage(packageName: String, resourceLayoutInfo: ResourceLayoutInfo): IVectorView[NamedResource]
    
    /**
      * Gets a list of all collections of resource subtrees for an app package.
      * @param packageName The name of the app package.
      * @param resourceLayoutInfo Specifies the resource version and the resource subtree count.
      * @return A list of resource subtrees ( ResourceMap objects).
      */
    def getAllSubtreesForPackage(packageName: String, resourceLayoutInfo: ResourceLayoutInfo): IVectorView[ResourceMap]
    
    /**
      * Loads one or more PRI files and adds their contents to the default resource manager.
      * @param files The files you want to add.
      */
    def loadPriFiles(files: IIterable[IStorageFile]): Unit
    
    /** Gets the ResourceMap that is associated with the main package of the currently running application. */
    var mainResourceMap: ResourceMap
    
    /**
      * Unloads one or more PRI files.
      * @param files The files you want unloaded.
      */
    def unloadPriFiles(files: IIterable[IStorageFile]): Unit
  }
  object ResourceManager {
    
    inline def apply(
      allResourceMaps: IMapView[String, ResourceMap],
      defaultContext: ResourceContext,
      getAllNamedResourcesForPackage: (String, ResourceLayoutInfo) => IVectorView[NamedResource],
      getAllSubtreesForPackage: (String, ResourceLayoutInfo) => IVectorView[ResourceMap],
      loadPriFiles: IIterable[IStorageFile] => Unit,
      mainResourceMap: ResourceMap,
      unloadPriFiles: IIterable[IStorageFile] => Unit
    ): ResourceManager = {
      val __obj = js.Dynamic.literal(allResourceMaps = allResourceMaps.asInstanceOf[js.Any], defaultContext = defaultContext.asInstanceOf[js.Any], getAllNamedResourcesForPackage = js.Any.fromFunction2(getAllNamedResourcesForPackage), getAllSubtreesForPackage = js.Any.fromFunction2(getAllSubtreesForPackage), loadPriFiles = js.Any.fromFunction1(loadPriFiles), mainResourceMap = mainResourceMap.asInstanceOf[js.Any], unloadPriFiles = js.Any.fromFunction1(unloadPriFiles))
      __obj.asInstanceOf[ResourceManager]
    }
    
    extension [Self <: ResourceManager](x: Self) {
      
      inline def setAllResourceMaps(value: IMapView[String, ResourceMap]): Self = StObject.set(x, "allResourceMaps", value.asInstanceOf[js.Any])
      
      inline def setDefaultContext(value: ResourceContext): Self = StObject.set(x, "defaultContext", value.asInstanceOf[js.Any])
      
      inline def setGetAllNamedResourcesForPackage(value: (String, ResourceLayoutInfo) => IVectorView[NamedResource]): Self = StObject.set(x, "getAllNamedResourcesForPackage", js.Any.fromFunction2(value))
      
      inline def setGetAllSubtreesForPackage(value: (String, ResourceLayoutInfo) => IVectorView[ResourceMap]): Self = StObject.set(x, "getAllSubtreesForPackage", js.Any.fromFunction2(value))
      
      inline def setLoadPriFiles(value: IIterable[IStorageFile] => Unit): Self = StObject.set(x, "loadPriFiles", js.Any.fromFunction1(value))
      
      inline def setMainResourceMap(value: ResourceMap): Self = StObject.set(x, "mainResourceMap", value.asInstanceOf[js.Any])
      
      inline def setUnloadPriFiles(value: IIterable[IStorageFile] => Unit): Self = StObject.set(x, "unloadPriFiles", js.Any.fromFunction1(value))
    }
  }
  
  /** A collection of related resources, typically either for a particular app package, or a resource file for a particular package. */
  @js.native
  trait ResourceMap extends StObject {
    
    /**
      * Returns an iterator to enumerate the items in the map.
      * @return The iterator. The current position of the iterator is index 0, or the end of the set if the map is empty.
      */
    def first(): IIterator[IKeyValuePair[Any, Any]] = js.native
    
    /**
      * Returns a ResourceMap that represents a subtree of another ResourceMap, typically used to access a particular resource file within an app package.
      * @param reference A resource map identifier that identifies the root of the new subtree.
      * @return The subtree ResourceMap .
      */
    def getSubtree(reference: String): ResourceMap = js.native
    
    /**
      * Returns the most appropriate candidate for a resource that is specified by a resource identifier within the default context.
      * @param resource A resource identifier specified as a name or reference.
      * @return A ResourceCandidate that describes the most appropriate candidate.
      */
    def getValue(resource: String): ResourceCandidate = js.native
    /**
      * Returns the most appropriate candidate for a resource that is specified by a resource identifier for the supplied context.
      * @param resource A resource specified as a name or reference.
      * @param context The context for which to select the most appropriate candidate.
      * @return A ResourceCandidate that describes the most appropriate candidate.
      */
    def getValue(resource: String, context: ResourceContext): ResourceCandidate = js.native
    
    /**
      * Determines whether the map can retrieve a resource with the specified resource identifier.
      * @param key The resource identifier to locate in the map.
      * @return TRUE if the key is found, otherwise FALSE.
      */
    def hasKey(key: String): Boolean = js.native
    
    /**
      * Returns the NamedResource at the specified resource identifier in the map.
      * @param key The resource identifier to use to locate the resource in the map.
      * @return The NamedResource associated with the specified key.
      */
    def lookup(key: String): NamedResource = js.native
    
    /** Gets the number of resources in the map. */
    var size: Double = js.native
    
    /**
      * Splits the map view into two views.
      */
    def split(): FirstSecond = js.native
    
    /** Gets a URI that can be used to refer to this ResourceMap . */
    var uri: Uri = js.native
  }
  
  /** Supports iteration over a ResourceMap . */
  trait ResourceMapIterator extends StObject {
    
    /** Gets the current item in the ResourceMap . */
    var current: IKeyValuePair[String, NamedResource]
    
    /**
      * Returns all the items in the ResourceMap .
      */
    def getMany(): ItemsIKeyValuePair
    
    /** Gets a value that indicates whether there is a current item, or whether the iterator is at the end of the ResourceMap . */
    var hasCurrent: Boolean
    
    /**
      * Moves the iterator forward to the next item and returns HasCurrent .
      * @return TRUE if the iterator refers to a valid item that is in the map, and otherwise FALSE.
      */
    def moveNext(): Boolean
  }
  object ResourceMapIterator {
    
    inline def apply(
      current: IKeyValuePair[String, NamedResource],
      getMany: () => ItemsIKeyValuePair,
      hasCurrent: Boolean,
      moveNext: () => Boolean
    ): ResourceMapIterator = {
      val __obj = js.Dynamic.literal(current = current.asInstanceOf[js.Any], getMany = js.Any.fromFunction0(getMany), hasCurrent = hasCurrent.asInstanceOf[js.Any], moveNext = js.Any.fromFunction0(moveNext))
      __obj.asInstanceOf[ResourceMapIterator]
    }
    
    extension [Self <: ResourceMapIterator](x: Self) {
      
      inline def setCurrent(value: IKeyValuePair[String, NamedResource]): Self = StObject.set(x, "current", value.asInstanceOf[js.Any])
      
      inline def setGetMany(value: () => ItemsIKeyValuePair): Self = StObject.set(x, "getMany", js.Any.fromFunction0(value))
      
      inline def setHasCurrent(value: Boolean): Self = StObject.set(x, "hasCurrent", value.asInstanceOf[js.Any])
      
      inline def setMoveNext(value: () => Boolean): Self = StObject.set(x, "moveNext", js.Any.fromFunction0(value))
    }
  }
  
  /** An unchangeable view into a map of ResourceMap objects. */
  trait ResourceMapMapView extends StObject {
    
    /**
      * Returns an iterator to enumerate the items in the map view.
      * @return The iterator. The current position of the iterator is index 0, or the end of the map if the map is empty.
      */
    def first(): IIterator[IKeyValuePair[Any, Any]]
    
    /**
      * Determines whether the map view contains the specified key.
      * @param key The key to locate in the map view.
      * @return TRUE if the key is found, otherwise FALSE if it is not found.
      */
    def hasKey(key: String): Boolean
    
    /**
      * Returns the ResourceMap at the specified key in the map view.
      * @param key The key to locate in the map view.
      * @return The ResourceMap associated with the specified key.
      */
    def lookup(key: String): ResourceMap
    
    /** Gets the number of ResourceMap objects in the map. */
    var size: Double
    
    /**
      * Splits the map view into two views.
      */
    def split(): FirstIMapView
  }
  object ResourceMapMapView {
    
    inline def apply(
      first: () => IIterator[IKeyValuePair[Any, Any]],
      hasKey: String => Boolean,
      lookup: String => ResourceMap,
      size: Double,
      split: () => FirstIMapView
    ): ResourceMapMapView = {
      val __obj = js.Dynamic.literal(first = js.Any.fromFunction0(first), hasKey = js.Any.fromFunction1(hasKey), lookup = js.Any.fromFunction1(lookup), size = size.asInstanceOf[js.Any], split = js.Any.fromFunction0(split))
      __obj.asInstanceOf[ResourceMapMapView]
    }
    
    extension [Self <: ResourceMapMapView](x: Self) {
      
      inline def setFirst(value: () => IIterator[IKeyValuePair[Any, Any]]): Self = StObject.set(x, "first", js.Any.fromFunction0(value))
      
      inline def setHasKey(value: String => Boolean): Self = StObject.set(x, "hasKey", js.Any.fromFunction1(value))
      
      inline def setLookup(value: String => ResourceMap): Self = StObject.set(x, "lookup", js.Any.fromFunction1(value))
      
      inline def setSize(value: Double): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
      
      inline def setSplit(value: () => FirstIMapView): Self = StObject.set(x, "split", js.Any.fromFunction0(value))
    }
  }
  
  /** Supports iteration over a ResourceMapMapView object. */
  trait ResourceMapMapViewIterator extends StObject {
    
    /** Gets the current item in the ResourceMapMapView . */
    var current: IKeyValuePair[String, ResourceMap]
    
    /**
      * Returns all the items in the ResourceMapMapView .
      */
    def getMany(): ItemsIKeyValuePair
    
    /** Gets a value that indicates whether there is a current item, or whether the iterator is at the end of the ResourceMapMapView . */
    var hasCurrent: Boolean
    
    /**
      * Moves the iterator forward to the next item and returns HasCurrent .
      * @return TRUE if the iterator refers to a valid item that is in the map view, and otherwise FALSE.
      */
    def moveNext(): Boolean
  }
  object ResourceMapMapViewIterator {
    
    inline def apply(
      current: IKeyValuePair[String, ResourceMap],
      getMany: () => ItemsIKeyValuePair,
      hasCurrent: Boolean,
      moveNext: () => Boolean
    ): ResourceMapMapViewIterator = {
      val __obj = js.Dynamic.literal(current = current.asInstanceOf[js.Any], getMany = js.Any.fromFunction0(getMany), hasCurrent = hasCurrent.asInstanceOf[js.Any], moveNext = js.Any.fromFunction0(moveNext))
      __obj.asInstanceOf[ResourceMapMapViewIterator]
    }
    
    extension [Self <: ResourceMapMapViewIterator](x: Self) {
      
      inline def setCurrent(value: IKeyValuePair[String, ResourceMap]): Self = StObject.set(x, "current", value.asInstanceOf[js.Any])
      
      inline def setGetMany(value: () => ItemsIKeyValuePair): Self = StObject.set(x, "getMany", js.Any.fromFunction0(value))
      
      inline def setHasCurrent(value: Boolean): Self = StObject.set(x, "hasCurrent", value.asInstanceOf[js.Any])
      
      inline def setMoveNext(value: () => Boolean): Self = StObject.set(x, "moveNext", js.Any.fromFunction0(value))
    }
  }
  
  /** Defines the qualifiers associated with a ResourceCandidate . */
  trait ResourceQualifier extends StObject {
    
    /** Indicates whether this qualifier should be considered as a default match when no match is found. */
    var isDefault: Boolean
    
    /** Indicates whether a given qualifier for a given candidate matched the context when a named resource is resolved to a candidate for some given context. */
    var isMatch: Boolean
    
    /** The name of the qualifier. */
    var qualifierName: String
    
    /** The value of the qualifier. */
    var qualifierValue: String
    
    /** A score that indicates how well the qualifier matched the context against which it was resolved. */
    var score: Double
  }
  object ResourceQualifier {
    
    inline def apply(isDefault: Boolean, isMatch: Boolean, qualifierName: String, qualifierValue: String, score: Double): ResourceQualifier = {
      val __obj = js.Dynamic.literal(isDefault = isDefault.asInstanceOf[js.Any], isMatch = isMatch.asInstanceOf[js.Any], qualifierName = qualifierName.asInstanceOf[js.Any], qualifierValue = qualifierValue.asInstanceOf[js.Any], score = score.asInstanceOf[js.Any])
      __obj.asInstanceOf[ResourceQualifier]
    }
    
    extension [Self <: ResourceQualifier](x: Self) {
      
      inline def setIsDefault(value: Boolean): Self = StObject.set(x, "isDefault", value.asInstanceOf[js.Any])
      
      inline def setIsMatch(value: Boolean): Self = StObject.set(x, "isMatch", value.asInstanceOf[js.Any])
      
      inline def setQualifierName(value: String): Self = StObject.set(x, "qualifierName", value.asInstanceOf[js.Any])
      
      inline def setQualifierValue(value: String): Self = StObject.set(x, "qualifierValue", value.asInstanceOf[js.Any])
      
      inline def setScore(value: Double): Self = StObject.set(x, "score", value.asInstanceOf[js.Any])
    }
  }
  
  /** An unchangeable view into a map of ResourceQualifier objects. */
  trait ResourceQualifierMapView extends StObject {
    
    /**
      * Returns an iterator to enumerate the items in the map view.
      * @return The iterator. The current position of the iterator is index 0, or the end of the map view if the map view is empty.
      */
    def first(): IIterator[IKeyValuePair[Any, Any]]
    
    /**
      * Determines whether the map view contains the specified key.
      * @param key The key to locate in the map view.
      * @return TRUE if the key is found, otherwise FALSE if it is not found.
      */
    def hasKey(key: String): Boolean
    
    /**
      * Returns the qualifier name at the specified key in the map view.
      * @param key The key to locate in the map view.
      * @return The qualifier name associated with the specified key.
      */
    def lookup(key: String): String
    
    /** Gets the number of ResourceQualifier objects in the map. */
    var size: Double
    
    /**
      * Splits the map view into two views.
      */
    def split(): SecondIMapView
  }
  object ResourceQualifierMapView {
    
    inline def apply(
      first: () => IIterator[IKeyValuePair[Any, Any]],
      hasKey: String => Boolean,
      lookup: String => String,
      size: Double,
      split: () => SecondIMapView
    ): ResourceQualifierMapView = {
      val __obj = js.Dynamic.literal(first = js.Any.fromFunction0(first), hasKey = js.Any.fromFunction1(hasKey), lookup = js.Any.fromFunction1(lookup), size = size.asInstanceOf[js.Any], split = js.Any.fromFunction0(split))
      __obj.asInstanceOf[ResourceQualifierMapView]
    }
    
    extension [Self <: ResourceQualifierMapView](x: Self) {
      
      inline def setFirst(value: () => IIterator[IKeyValuePair[Any, Any]]): Self = StObject.set(x, "first", js.Any.fromFunction0(value))
      
      inline def setHasKey(value: String => Boolean): Self = StObject.set(x, "hasKey", js.Any.fromFunction1(value))
      
      inline def setLookup(value: String => String): Self = StObject.set(x, "lookup", js.Any.fromFunction1(value))
      
      inline def setSize(value: Double): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
      
      inline def setSplit(value: () => SecondIMapView): Self = StObject.set(x, "split", js.Any.fromFunction0(value))
    }
  }
  
  /** Notifies listeners of dynamic changes to a map of ResourceQualifier objects, such as when items get added or removed, and allows qualifier values to change. */
  @js.native
  trait ResourceQualifierObservableMap extends StObject {
    
    def addEventListener(`type`: String, listener: EventHandler[Any]): Unit = js.native
    @JSName("addEventListener")
    def addEventListener_mapchanged(`type`: mapchanged, listener: MapChangedEventHandler[String, String]): Unit = js.native
    
    /** Removes all items from the observable map. */
    def clear(): Unit = js.native
    
    /**
      * Returns an iterator to enumerate the items in the observable map.
      * @return The iterator. The current position of the iterator is index 0, or the end of the observable map if the observable map is empty.
      */
    def first(): IIterator[IKeyValuePair[Any, Any]] = js.native
    
    /**
      * Returns an unchangeable view of the observable map.
      * @return The view of the map.
      */
    def getView(): IMapView[String, String] = js.native
    
    /**
      * Determines whether the observable map contains the specified key.
      * @param key The key to locate in the observable map.
      * @return TRUE if the key is found, otherwise FALSE if it is not found.
      */
    def hasKey(key: String): Boolean = js.native
    
    /**
      * Inserts or replaces an item in the observable map.
      * @param key The key associated with the item to insert.
      * @param value The item to insert.
      * @return TRUE if an item with the specified key is an existing item and was replaced, otherwise FALSE.
      */
    def insert(key: String, value: String): Boolean = js.native
    
    /**
      * Returns the qualifier name at the specified key in the observable map.
      * @param key The key to locate in the observable map.
      * @return The qualifier name associated with the specified key.
      */
    def lookup(key: String): String = js.native
    
    /** Occurs when the map changes. */
    def onmapchanged(ev: IMapChangedEventArgs[String] & (WinRTEvent[IObservableMap[String, String]])): Unit = js.native
    /** Occurs when the map changes. */
    @JSName("onmapchanged")
    var onmapchanged_Original: MapChangedEventHandler[String, String] = js.native
    
    /**
      * Removes an item from the observable map.
      * @param key The key associated with the item to remove.
      */
    def remove(key: String): Unit = js.native
    
    def removeEventListener(`type`: String, listener: EventHandler[Any]): Unit = js.native
    @JSName("removeEventListener")
    def removeEventListener_mapchanged(`type`: mapchanged, listener: MapChangedEventHandler[String, String]): Unit = js.native
    
    /** Gets the number of ResourceQualifier objects in the observable map. */
    var size: Double = js.native
  }
  
  /** An unchangeable view into a vector of ResourceQualifier objects. */
  @js.native
  trait ResourceQualifierVectorView
    extends StObject
       with Array[ResourceQualifier] {
    
    /**
      * Returns an iterator to enumerate the items in the view.
      * @return The iterator. The current position of the iterator is index 0, or the end of the view if the view is empty.
      */
    def first(): IIterator[ResourceQualifier] = js.native
    
    /**
      * Returns the ResourceQualifier at the specified index in the view.
      * @param index The zero-based index of the ResourceQualifier in the view to return.
      * @return The ResourceQualifier at the specified index.
      */
    def getAt(index: Double): ResourceQualifier = js.native
    
    /**
      * Returns the ResourceQualifier objects that start at the specified index in the view.
      * @param startIndex The zero-based index of the start of the objects in the view to return.
      */
    def getMany(startIndex: Double): ItemsResourceQualifier = js.native
    
    def indexOf(value: ResourceQualifier, extra: Any*): Index = js.native
    /* hack */
    @JSName("indexOf")
    def indexOf_Double(searchElement: ResourceQualifier): Double = js.native
    
    /** Gets the number of ResourceQualifier objects in the view. */
    var size: Double = js.native
  }
}
