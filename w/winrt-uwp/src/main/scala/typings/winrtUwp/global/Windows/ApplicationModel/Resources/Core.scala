package typings.winrtUwp.global.Windows.ApplicationModel.Resources

import typings.winrtUwp.Windows.ApplicationModel.Resources.Core.ResourceLayoutInfo
import typings.winrtUwp.Windows.ApplicationModel.Resources.Core.ResourceQualifierPersistence
import typings.winrtUwp.Windows.Foundation.Collections.IIterable
import typings.winrtUwp.Windows.Foundation.Collections.IIterator
import typings.winrtUwp.Windows.Foundation.Collections.IKeyValuePair
import typings.winrtUwp.Windows.Foundation.Collections.IMapView
import typings.winrtUwp.Windows.Foundation.Collections.IVectorView
import typings.winrtUwp.Windows.Foundation.IPromiseWithIAsyncOperation
import typings.winrtUwp.Windows.Storage.IStorageFile
import typings.winrtUwp.Windows.Storage.StorageFile
import typings.winrtUwp.Windows.Storage.Streams.IRandomAccessStream
import typings.winrtUwp.anon.FirstIMapView
import typings.winrtUwp.anon.ItemsIKeyValuePair
import typings.winrtUwp.anon.SecondIMapView
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Provides classes that enable advanced resource loading. */
@JSGlobal("Windows.ApplicationModel.Resources.Core")
@js.native
object Core extends js.Object {
  /** Represents a single logical, named resource, such as a string resource named 'Header1'. */
  @js.native
  abstract class NamedResource ()
    extends typings.winrtUwp.Windows.ApplicationModel.Resources.Core.NamedResource
  
  /** Represents a single possible value for a given NamedResource , the qualifiers associated with that resource, and how well those qualifiers match the context against which it was resolved. */
  @js.native
  abstract class ResourceCandidate ()
    extends typings.winrtUwp.Windows.ApplicationModel.Resources.Core.ResourceCandidate {
    /** Indicates whether this ResourceCandidate can be used as a default fallback value for any context. */
    /* CompleteClass */
    override var isDefault: Boolean = js.native
    /** Indicates whether this ResourceCandidate matched the ResourceContext against which it was evaluated. */
    /* CompleteClass */
    override var isMatch: Boolean = js.native
    /** Indicates whether this ResourceCandidate matched the ResourceContext against which it was evaluated as a result of being a true match, a default fallback value, or a mixed match with default fallback (that is, a match in relation to some qualifiers but using default fallback values for other qualifiers). */
    /* CompleteClass */
    override var isMatchAsDefault: Boolean = js.native
    /** Gets the qualifiers associated with this ResourceCandidate . */
    /* CompleteClass */
    override var qualifiers: IVectorView[typings.winrtUwp.Windows.ApplicationModel.Resources.Core.ResourceQualifier] = js.native
    /** Gets the value of this ResourceCandidate , expressed as a string. */
    /* CompleteClass */
    override var valueAsString: String = js.native
    /**
      * Returns the value of a qualifier, given its name.
      * @param qualifierName The name of the qualifier.
      * @return The value of the qualifier.
      */
    /* CompleteClass */
    override def getQualifierValue(qualifierName: String): String = js.native
    /**
      * Asynchronously returns a StorageFile that accesses the value of this ResourceCandidate . This only works on certain types of ResourceCandidates that are files.
      * @return An asynchronous operation to return the requested StorageFile .
      */
    /* CompleteClass */
    override def getValueAsFileAsync(): IPromiseWithIAsyncOperation[StorageFile] = js.native
    /**
      * Asynchronously returns an IRandomAccessStream that accesses the value of this ResourceCandidate .
      * @return An asynchronous operation to return the requested IRandomAccessStream .
      */
    /* CompleteClass */
    override def getValueAsStreamAsync(): IPromiseWithIAsyncOperation[IRandomAccessStream] = js.native
  }
  
  /** Represents a collection of ResourceCandidate objects. */
  @js.native
  abstract class ResourceCandidateVectorView ()
    extends typings.winrtUwp.Windows.ApplicationModel.Resources.Core.ResourceCandidateVectorView
  
  /** Encapsulates all of the factors ( ResourceQualifier s) that might affect resource selection. */
  @js.native
  /** Creates a cloned ResourceContext object. */
  class ResourceContext ()
    extends typings.winrtUwp.Windows.ApplicationModel.Resources.Core.ResourceContext
  
  /** Represents a collection of ResourceContext language qualifiers. */
  @js.native
  abstract class ResourceContextLanguagesVectorView ()
    extends typings.winrtUwp.Windows.ApplicationModel.Resources.Core.ResourceContextLanguagesVectorView
  
  /** Provides access to application resource maps and more advanced resource functionality. */
  @js.native
  abstract class ResourceManager ()
    extends typings.winrtUwp.Windows.ApplicationModel.Resources.Core.ResourceManager {
    /** Gets a map of ResourceMap objects typically associated with the app packages, indexed by package name. */
    /* CompleteClass */
    override var allResourceMaps: IMapView[String, typings.winrtUwp.Windows.ApplicationModel.Resources.Core.ResourceMap] = js.native
    /** Gets the default ResourceContext for the currently running application. Unless explicitly overridden, the default ResourceContext is used to determine the most appropriate representation of any given named resource. */
    /* CompleteClass */
    override var defaultContext: typings.winrtUwp.Windows.ApplicationModel.Resources.Core.ResourceContext = js.native
    /** Gets the ResourceMap that is associated with the main package of the currently running application. */
    /* CompleteClass */
    override var mainResourceMap: typings.winrtUwp.Windows.ApplicationModel.Resources.Core.ResourceMap = js.native
    /**
      * Gets a list of all named resources for an app package.
      * @param packageName The name of the app package.
      * @param resourceLayoutInfo Specifies the resource version and the named resource count.
      * @return A list of NamedResource objects.
      */
    /* CompleteClass */
    override def getAllNamedResourcesForPackage(packageName: String, resourceLayoutInfo: ResourceLayoutInfo): IVectorView[typings.winrtUwp.Windows.ApplicationModel.Resources.Core.NamedResource] = js.native
    /**
      * Gets a list of all collections of resource subtrees for an app package.
      * @param packageName The name of the app package.
      * @param resourceLayoutInfo Specifies the resource version and the resource subtree count.
      * @return A list of resource subtrees ( ResourceMap objects).
      */
    /* CompleteClass */
    override def getAllSubtreesForPackage(packageName: String, resourceLayoutInfo: ResourceLayoutInfo): IVectorView[typings.winrtUwp.Windows.ApplicationModel.Resources.Core.ResourceMap] = js.native
    /**
      * Loads one or more PRI files and adds their contents to the default resource manager.
      * @param files The files you want to add.
      */
    /* CompleteClass */
    override def loadPriFiles(files: IIterable[IStorageFile]): Unit = js.native
    /**
      * Unloads one or more PRI files.
      * @param files The files you want unloaded.
      */
    /* CompleteClass */
    override def unloadPriFiles(files: IIterable[IStorageFile]): Unit = js.native
  }
  
  /** A collection of related resources, typically either for a particular app package, or a resource file for a particular package. */
  @js.native
  abstract class ResourceMap ()
    extends typings.winrtUwp.Windows.ApplicationModel.Resources.Core.ResourceMap
  
  /** Supports iteration over a ResourceMap . */
  @js.native
  abstract class ResourceMapIterator ()
    extends typings.winrtUwp.Windows.ApplicationModel.Resources.Core.ResourceMapIterator {
    /** Gets the current item in the ResourceMap . */
    /* CompleteClass */
    override var current: IKeyValuePair[String, typings.winrtUwp.Windows.ApplicationModel.Resources.Core.NamedResource] = js.native
    /** Gets a value that indicates whether there is a current item, or whether the iterator is at the end of the ResourceMap . */
    /* CompleteClass */
    override var hasCurrent: Boolean = js.native
    /**
      * Returns all the items in the ResourceMap .
      */
    /* CompleteClass */
    override def getMany(): ItemsIKeyValuePair = js.native
    /**
      * Moves the iterator forward to the next item and returns HasCurrent .
      * @return TRUE if the iterator refers to a valid item that is in the map, and otherwise FALSE.
      */
    /* CompleteClass */
    override def moveNext(): Boolean = js.native
  }
  
  /** An unchangeable view into a map of ResourceMap objects. */
  @js.native
  abstract class ResourceMapMapView ()
    extends typings.winrtUwp.Windows.ApplicationModel.Resources.Core.ResourceMapMapView {
    /** Gets the number of ResourceMap objects in the map. */
    /* CompleteClass */
    override var size: Double = js.native
    /**
      * Returns an iterator to enumerate the items in the map view.
      * @return The iterator. The current position of the iterator is index 0, or the end of the map if the map is empty.
      */
    /* CompleteClass */
    override def first(): IIterator[IKeyValuePair[_, _]] = js.native
    /**
      * Determines whether the map view contains the specified key.
      * @param key The key to locate in the map view.
      * @return TRUE if the key is found, otherwise FALSE if it is not found.
      */
    /* CompleteClass */
    override def hasKey(key: String): Boolean = js.native
    /**
      * Returns the ResourceMap at the specified key in the map view.
      * @param key The key to locate in the map view.
      * @return The ResourceMap associated with the specified key.
      */
    /* CompleteClass */
    override def lookup(key: String): typings.winrtUwp.Windows.ApplicationModel.Resources.Core.ResourceMap = js.native
    /**
      * Splits the map view into two views.
      */
    /* CompleteClass */
    override def split(): FirstIMapView = js.native
  }
  
  /** Supports iteration over a ResourceMapMapView object. */
  @js.native
  abstract class ResourceMapMapViewIterator ()
    extends typings.winrtUwp.Windows.ApplicationModel.Resources.Core.ResourceMapMapViewIterator {
    /** Gets the current item in the ResourceMapMapView . */
    /* CompleteClass */
    override var current: IKeyValuePair[String, typings.winrtUwp.Windows.ApplicationModel.Resources.Core.ResourceMap] = js.native
    /** Gets a value that indicates whether there is a current item, or whether the iterator is at the end of the ResourceMapMapView . */
    /* CompleteClass */
    override var hasCurrent: Boolean = js.native
    /**
      * Returns all the items in the ResourceMapMapView .
      */
    /* CompleteClass */
    override def getMany(): ItemsIKeyValuePair = js.native
    /**
      * Moves the iterator forward to the next item and returns HasCurrent .
      * @return TRUE if the iterator refers to a valid item that is in the map view, and otherwise FALSE.
      */
    /* CompleteClass */
    override def moveNext(): Boolean = js.native
  }
  
  /** Defines the qualifiers associated with a ResourceCandidate . */
  @js.native
  abstract class ResourceQualifier ()
    extends typings.winrtUwp.Windows.ApplicationModel.Resources.Core.ResourceQualifier {
    /** Indicates whether this qualifier should be considered as a default match when no match is found. */
    /* CompleteClass */
    override var isDefault: Boolean = js.native
    /** Indicates whether a given qualifier for a given candidate matched the context when a named resource is resolved to a candidate for some given context. */
    /* CompleteClass */
    override var isMatch: Boolean = js.native
    /** The name of the qualifier. */
    /* CompleteClass */
    override var qualifierName: String = js.native
    /** The value of the qualifier. */
    /* CompleteClass */
    override var qualifierValue: String = js.native
    /** A score that indicates how well the qualifier matched the context against which it was resolved. */
    /* CompleteClass */
    override var score: Double = js.native
  }
  
  /** An unchangeable view into a map of ResourceQualifier objects. */
  @js.native
  abstract class ResourceQualifierMapView ()
    extends typings.winrtUwp.Windows.ApplicationModel.Resources.Core.ResourceQualifierMapView {
    /** Gets the number of ResourceQualifier objects in the map. */
    /* CompleteClass */
    override var size: Double = js.native
    /**
      * Returns an iterator to enumerate the items in the map view.
      * @return The iterator. The current position of the iterator is index 0, or the end of the map view if the map view is empty.
      */
    /* CompleteClass */
    override def first(): IIterator[IKeyValuePair[_, _]] = js.native
    /**
      * Determines whether the map view contains the specified key.
      * @param key The key to locate in the map view.
      * @return TRUE if the key is found, otherwise FALSE if it is not found.
      */
    /* CompleteClass */
    override def hasKey(key: String): Boolean = js.native
    /**
      * Returns the qualifier name at the specified key in the map view.
      * @param key The key to locate in the map view.
      * @return The qualifier name associated with the specified key.
      */
    /* CompleteClass */
    override def lookup(key: String): String = js.native
    /**
      * Splits the map view into two views.
      */
    /* CompleteClass */
    override def split(): SecondIMapView = js.native
  }
  
  /** Notifies listeners of dynamic changes to a map of ResourceQualifier objects, such as when items get added or removed, and allows qualifier values to change. */
  @js.native
  abstract class ResourceQualifierObservableMap ()
    extends typings.winrtUwp.Windows.ApplicationModel.Resources.Core.ResourceQualifierObservableMap
  
  /** An unchangeable view into a vector of ResourceQualifier objects. */
  @js.native
  abstract class ResourceQualifierVectorView ()
    extends typings.winrtUwp.Windows.ApplicationModel.Resources.Core.ResourceQualifierVectorView
  
  /* static members */
  @js.native
  object ResourceContext extends js.Object {
    /**
      * Creates a new ResourceContext that matches a supplied set of qualifiers.
      * @param result The list of qualifiers to be matched.
      * @return The new ResourceContext .
      */
    def createMatchingContext(result: IIterable[typings.winrtUwp.Windows.ApplicationModel.Resources.Core.ResourceQualifier]): typings.winrtUwp.Windows.ApplicationModel.Resources.Core.ResourceContext = js.native
    /**
      * Gets a default ResourceContext associated with the current view for the currently running application.
      * @return The default context associated with the current view.
      */
    def getForCurrentView(): typings.winrtUwp.Windows.ApplicationModel.Resources.Core.ResourceContext = js.native
    /**
      * Gets a default ResourceContext not associated with any view.
      * @return A default ResourceContext not associated with any view.
      */
    def getForViewIndependentUse(): typings.winrtUwp.Windows.ApplicationModel.Resources.Core.ResourceContext = js.native
    /** Removes any qualifier overrides from default contexts of all views across the app. */
    def resetGlobalQualifierValues(): Unit = js.native
    /**
      * Removes qualifier overrides for the specified qualifiers from default contexts of all views across the app.
      * @param qualifierNames The names of the qualifiers to be reset.
      */
    def resetGlobalQualifierValues(qualifierNames: IIterable[String]): Unit = js.native
    /**
      * Applies a single qualifier value override to default contexts of all views for the current app.
      * @param key The name of the qualifier to override.
      * @param value The override value to set.
      */
    def setGlobalQualifierValue(key: String, value: String): Unit = js.native
    /**
      * Applies a single qualifier value override to default contexts of all views for the current app, and specifies the persistence of the override.
      * @param key The name of the qualifier to override.
      * @param value The override value to set.
      * @param persistence The persistence of the override value.
      */
    def setGlobalQualifierValue(key: String, value: String, persistence: ResourceQualifierPersistence): Unit = js.native
  }
  
  /* static members */
  @js.native
  object ResourceManager extends js.Object {
    /** Gets the ResourceManager for the currently running application. */
    var current: typings.winrtUwp.Windows.ApplicationModel.Resources.Core.ResourceManager = js.native
    /**
      * Determines whether a supplied string matches the resource reference format (an ms-resource string URI identifier).
      * @param resourceReference The string you want to match.
      * @return TRUE if the string matches.
      */
    def isResourceReference(resourceReference: String): Boolean = js.native
  }
  
  /** Possible values for the persistence of a global qualifier value override. */
  @js.native
  object ResourceQualifierPersistence extends js.Object {
    /* 1 */ val localMachine: typings.winrtUwp.Windows.ApplicationModel.Resources.Core.ResourceQualifierPersistence.localMachine with Double = js.native
    /* 0 */ val none: typings.winrtUwp.Windows.ApplicationModel.Resources.Core.ResourceQualifierPersistence.none with Double = js.native
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[
        typings.winrtUwp.Windows.ApplicationModel.Resources.Core.ResourceQualifierPersistence with Double
      ] = js.native
  }
  
}

