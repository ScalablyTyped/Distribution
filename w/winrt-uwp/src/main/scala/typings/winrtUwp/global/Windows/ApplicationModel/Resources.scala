package typings.winrtUwp.global.Windows.ApplicationModel

import typings.winrtUwp.Windows.ApplicationModel.Resources.Core.ResourceLayoutInfo
import typings.winrtUwp.Windows.ApplicationModel.Resources.Core.ResourceQualifierPersistence
import typings.winrtUwp.Windows.Foundation.Collections.IIterable
import typings.winrtUwp.Windows.Foundation.Collections.IIterator
import typings.winrtUwp.Windows.Foundation.Collections.IKeyValuePair
import typings.winrtUwp.Windows.Foundation.Collections.IMapView
import typings.winrtUwp.Windows.Foundation.Collections.IVectorView
import typings.winrtUwp.Windows.Foundation.IPromiseWithIAsyncOperation
import typings.winrtUwp.Windows.Foundation.Uri
import typings.winrtUwp.Windows.Storage.IStorageFile
import typings.winrtUwp.Windows.Storage.StorageFile
import typings.winrtUwp.Windows.Storage.Streams.IRandomAccessStream
import typings.winrtUwp.anon.FirstIMapView
import typings.winrtUwp.anon.ItemsIKeyValuePair
import typings.winrtUwp.anon.SecondIMapView
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Provides simplified access to application resources, such as strings, that are defined using basic naming conventions for runtime apps. */
object Resources {
  
  /** Provides classes that enable advanced resource loading. */
  object Core {
    
    /** Represents a single logical, named resource, such as a string resource named 'Header1'. */
    @JSGlobal("Windows.ApplicationModel.Resources.Core.NamedResource")
    @js.native
    abstract class NamedResource ()
      extends StObject
         with typings.winrtUwp.Windows.ApplicationModel.Resources.Core.NamedResource
    
    /** Represents a single possible value for a given NamedResource , the qualifiers associated with that resource, and how well those qualifiers match the context against which it was resolved. */
    @JSGlobal("Windows.ApplicationModel.Resources.Core.ResourceCandidate")
    @js.native
    abstract class ResourceCandidate ()
      extends StObject
         with typings.winrtUwp.Windows.ApplicationModel.Resources.Core.ResourceCandidate {
      
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
      
      /** Indicates whether this ResourceCandidate can be used as a default fallback value for any context. */
      /* CompleteClass */
      var isDefault: Boolean = js.native
      
      /** Indicates whether this ResourceCandidate matched the ResourceContext against which it was evaluated. */
      /* CompleteClass */
      var isMatch: Boolean = js.native
      
      /** Indicates whether this ResourceCandidate matched the ResourceContext against which it was evaluated as a result of being a true match, a default fallback value, or a mixed match with default fallback (that is, a match in relation to some qualifiers but using default fallback values for other qualifiers). */
      /* CompleteClass */
      var isMatchAsDefault: Boolean = js.native
      
      /** Gets the qualifiers associated with this ResourceCandidate . */
      /* CompleteClass */
      var qualifiers: IVectorView[typings.winrtUwp.Windows.ApplicationModel.Resources.Core.ResourceQualifier] = js.native
      
      /** Gets the value of this ResourceCandidate , expressed as a string. */
      /* CompleteClass */
      var valueAsString: String = js.native
    }
    
    /** Represents a collection of ResourceCandidate objects. */
    @JSGlobal("Windows.ApplicationModel.Resources.Core.ResourceCandidateVectorView")
    @js.native
    abstract class ResourceCandidateVectorView ()
      extends StObject
         with typings.winrtUwp.Windows.ApplicationModel.Resources.Core.ResourceCandidateVectorView
    
    /** Encapsulates all of the factors ( ResourceQualifier s) that might affect resource selection. */
    @JSGlobal("Windows.ApplicationModel.Resources.Core.ResourceContext")
    @js.native
    /** Creates a cloned ResourceContext object. */
    class ResourceContext ()
      extends StObject
         with typings.winrtUwp.Windows.ApplicationModel.Resources.Core.ResourceContext
    object ResourceContext {
      
      @JSGlobal("Windows.ApplicationModel.Resources.Core.ResourceContext")
      @js.native
      val ^ : js.Any = js.native
      
      /**
        * Creates a new ResourceContext that matches a supplied set of qualifiers.
        * @param result The list of qualifiers to be matched.
        * @return The new ResourceContext .
        */
      /* static member */
      inline def createMatchingContext(result: IIterable[typings.winrtUwp.Windows.ApplicationModel.Resources.Core.ResourceQualifier]): typings.winrtUwp.Windows.ApplicationModel.Resources.Core.ResourceContext = ^.asInstanceOf[js.Dynamic].applyDynamic("createMatchingContext")(result.asInstanceOf[js.Any]).asInstanceOf[typings.winrtUwp.Windows.ApplicationModel.Resources.Core.ResourceContext]
      
      /**
        * Gets a default ResourceContext associated with the current view for the currently running application.
        * @return The default context associated with the current view.
        */
      /* static member */
      inline def getForCurrentView(): typings.winrtUwp.Windows.ApplicationModel.Resources.Core.ResourceContext = ^.asInstanceOf[js.Dynamic].applyDynamic("getForCurrentView")().asInstanceOf[typings.winrtUwp.Windows.ApplicationModel.Resources.Core.ResourceContext]
      
      /**
        * Gets a default ResourceContext not associated with any view.
        * @return A default ResourceContext not associated with any view.
        */
      /* static member */
      inline def getForViewIndependentUse(): typings.winrtUwp.Windows.ApplicationModel.Resources.Core.ResourceContext = ^.asInstanceOf[js.Dynamic].applyDynamic("getForViewIndependentUse")().asInstanceOf[typings.winrtUwp.Windows.ApplicationModel.Resources.Core.ResourceContext]
      
      /** Removes any qualifier overrides from default contexts of all views across the app. */
      /* static member */
      inline def resetGlobalQualifierValues(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("resetGlobalQualifierValues")().asInstanceOf[Unit]
      /**
        * Removes qualifier overrides for the specified qualifiers from default contexts of all views across the app.
        * @param qualifierNames The names of the qualifiers to be reset.
        */
      /* static member */
      inline def resetGlobalQualifierValues(qualifierNames: IIterable[String]): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("resetGlobalQualifierValues")(qualifierNames.asInstanceOf[js.Any]).asInstanceOf[Unit]
      
      /**
        * Applies a single qualifier value override to default contexts of all views for the current app.
        * @param key The name of the qualifier to override.
        * @param value The override value to set.
        */
      /* static member */
      inline def setGlobalQualifierValue(key: String, value: String): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("setGlobalQualifierValue")(key.asInstanceOf[js.Any], value.asInstanceOf[js.Any])).asInstanceOf[Unit]
      /**
        * Applies a single qualifier value override to default contexts of all views for the current app, and specifies the persistence of the override.
        * @param key The name of the qualifier to override.
        * @param value The override value to set.
        * @param persistence The persistence of the override value.
        */
      /* static member */
      inline def setGlobalQualifierValue(key: String, value: String, persistence: ResourceQualifierPersistence): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("setGlobalQualifierValue")(key.asInstanceOf[js.Any], value.asInstanceOf[js.Any], persistence.asInstanceOf[js.Any])).asInstanceOf[Unit]
    }
    
    /** Represents a collection of ResourceContext language qualifiers. */
    @JSGlobal("Windows.ApplicationModel.Resources.Core.ResourceContextLanguagesVectorView")
    @js.native
    abstract class ResourceContextLanguagesVectorView ()
      extends StObject
         with typings.winrtUwp.Windows.ApplicationModel.Resources.Core.ResourceContextLanguagesVectorView
    
    /** Provides access to application resource maps and more advanced resource functionality. */
    @JSGlobal("Windows.ApplicationModel.Resources.Core.ResourceManager")
    @js.native
    abstract class ResourceManager ()
      extends StObject
         with typings.winrtUwp.Windows.ApplicationModel.Resources.Core.ResourceManager {
      
      /** Gets a map of ResourceMap objects typically associated with the app packages, indexed by package name. */
      /* CompleteClass */
      var allResourceMaps: IMapView[String, typings.winrtUwp.Windows.ApplicationModel.Resources.Core.ResourceMap] = js.native
      
      /** Gets the default ResourceContext for the currently running application. Unless explicitly overridden, the default ResourceContext is used to determine the most appropriate representation of any given named resource. */
      /* CompleteClass */
      var defaultContext: typings.winrtUwp.Windows.ApplicationModel.Resources.Core.ResourceContext = js.native
      
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
      
      /** Gets the ResourceMap that is associated with the main package of the currently running application. */
      /* CompleteClass */
      var mainResourceMap: typings.winrtUwp.Windows.ApplicationModel.Resources.Core.ResourceMap = js.native
      
      /**
        * Unloads one or more PRI files.
        * @param files The files you want unloaded.
        */
      /* CompleteClass */
      override def unloadPriFiles(files: IIterable[IStorageFile]): Unit = js.native
    }
    object ResourceManager {
      
      @JSGlobal("Windows.ApplicationModel.Resources.Core.ResourceManager")
      @js.native
      val ^ : js.Any = js.native
      
      /** Gets the ResourceManager for the currently running application. */
      /* static member */
      @JSGlobal("Windows.ApplicationModel.Resources.Core.ResourceManager.current")
      @js.native
      def current: typings.winrtUwp.Windows.ApplicationModel.Resources.Core.ResourceManager = js.native
      inline def current_=(x: typings.winrtUwp.Windows.ApplicationModel.Resources.Core.ResourceManager): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("current")(x.asInstanceOf[js.Any])
      
      /**
        * Determines whether a supplied string matches the resource reference format (an ms-resource string URI identifier).
        * @param resourceReference The string you want to match.
        * @return TRUE if the string matches.
        */
      /* static member */
      inline def isResourceReference(resourceReference: String): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isResourceReference")(resourceReference.asInstanceOf[js.Any]).asInstanceOf[Boolean]
    }
    
    /** A collection of related resources, typically either for a particular app package, or a resource file for a particular package. */
    @JSGlobal("Windows.ApplicationModel.Resources.Core.ResourceMap")
    @js.native
    abstract class ResourceMap ()
      extends StObject
         with typings.winrtUwp.Windows.ApplicationModel.Resources.Core.ResourceMap
    
    /** Supports iteration over a ResourceMap . */
    @JSGlobal("Windows.ApplicationModel.Resources.Core.ResourceMapIterator")
    @js.native
    abstract class ResourceMapIterator ()
      extends StObject
         with typings.winrtUwp.Windows.ApplicationModel.Resources.Core.ResourceMapIterator {
      
      /** Gets the current item in the ResourceMap . */
      /* CompleteClass */
      var current: IKeyValuePair[String, typings.winrtUwp.Windows.ApplicationModel.Resources.Core.NamedResource] = js.native
      
      /**
        * Returns all the items in the ResourceMap .
        */
      /* CompleteClass */
      override def getMany(): ItemsIKeyValuePair = js.native
      
      /** Gets a value that indicates whether there is a current item, or whether the iterator is at the end of the ResourceMap . */
      /* CompleteClass */
      var hasCurrent: Boolean = js.native
      
      /**
        * Moves the iterator forward to the next item and returns HasCurrent .
        * @return TRUE if the iterator refers to a valid item that is in the map, and otherwise FALSE.
        */
      /* CompleteClass */
      override def moveNext(): Boolean = js.native
    }
    
    /** An unchangeable view into a map of ResourceMap objects. */
    @JSGlobal("Windows.ApplicationModel.Resources.Core.ResourceMapMapView")
    @js.native
    abstract class ResourceMapMapView ()
      extends StObject
         with typings.winrtUwp.Windows.ApplicationModel.Resources.Core.ResourceMapMapView {
      
      /**
        * Returns an iterator to enumerate the items in the map view.
        * @return The iterator. The current position of the iterator is index 0, or the end of the map if the map is empty.
        */
      /* CompleteClass */
      override def first(): IIterator[IKeyValuePair[js.Any, js.Any]] = js.native
      
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
      
      /** Gets the number of ResourceMap objects in the map. */
      /* CompleteClass */
      var size: Double = js.native
      
      /**
        * Splits the map view into two views.
        */
      /* CompleteClass */
      override def split(): FirstIMapView = js.native
    }
    
    /** Supports iteration over a ResourceMapMapView object. */
    @JSGlobal("Windows.ApplicationModel.Resources.Core.ResourceMapMapViewIterator")
    @js.native
    abstract class ResourceMapMapViewIterator ()
      extends StObject
         with typings.winrtUwp.Windows.ApplicationModel.Resources.Core.ResourceMapMapViewIterator {
      
      /** Gets the current item in the ResourceMapMapView . */
      /* CompleteClass */
      var current: IKeyValuePair[String, typings.winrtUwp.Windows.ApplicationModel.Resources.Core.ResourceMap] = js.native
      
      /**
        * Returns all the items in the ResourceMapMapView .
        */
      /* CompleteClass */
      override def getMany(): ItemsIKeyValuePair = js.native
      
      /** Gets a value that indicates whether there is a current item, or whether the iterator is at the end of the ResourceMapMapView . */
      /* CompleteClass */
      var hasCurrent: Boolean = js.native
      
      /**
        * Moves the iterator forward to the next item and returns HasCurrent .
        * @return TRUE if the iterator refers to a valid item that is in the map view, and otherwise FALSE.
        */
      /* CompleteClass */
      override def moveNext(): Boolean = js.native
    }
    
    /** Defines the qualifiers associated with a ResourceCandidate . */
    @JSGlobal("Windows.ApplicationModel.Resources.Core.ResourceQualifier")
    @js.native
    abstract class ResourceQualifier ()
      extends StObject
         with typings.winrtUwp.Windows.ApplicationModel.Resources.Core.ResourceQualifier {
      
      /** Indicates whether this qualifier should be considered as a default match when no match is found. */
      /* CompleteClass */
      var isDefault: Boolean = js.native
      
      /** Indicates whether a given qualifier for a given candidate matched the context when a named resource is resolved to a candidate for some given context. */
      /* CompleteClass */
      var isMatch: Boolean = js.native
      
      /** The name of the qualifier. */
      /* CompleteClass */
      var qualifierName: String = js.native
      
      /** The value of the qualifier. */
      /* CompleteClass */
      var qualifierValue: String = js.native
      
      /** A score that indicates how well the qualifier matched the context against which it was resolved. */
      /* CompleteClass */
      var score: Double = js.native
    }
    
    /** An unchangeable view into a map of ResourceQualifier objects. */
    @JSGlobal("Windows.ApplicationModel.Resources.Core.ResourceQualifierMapView")
    @js.native
    abstract class ResourceQualifierMapView ()
      extends StObject
         with typings.winrtUwp.Windows.ApplicationModel.Resources.Core.ResourceQualifierMapView {
      
      /**
        * Returns an iterator to enumerate the items in the map view.
        * @return The iterator. The current position of the iterator is index 0, or the end of the map view if the map view is empty.
        */
      /* CompleteClass */
      override def first(): IIterator[IKeyValuePair[js.Any, js.Any]] = js.native
      
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
      
      /** Gets the number of ResourceQualifier objects in the map. */
      /* CompleteClass */
      var size: Double = js.native
      
      /**
        * Splits the map view into two views.
        */
      /* CompleteClass */
      override def split(): SecondIMapView = js.native
    }
    
    /** Notifies listeners of dynamic changes to a map of ResourceQualifier objects, such as when items get added or removed, and allows qualifier values to change. */
    @JSGlobal("Windows.ApplicationModel.Resources.Core.ResourceQualifierObservableMap")
    @js.native
    abstract class ResourceQualifierObservableMap ()
      extends StObject
         with typings.winrtUwp.Windows.ApplicationModel.Resources.Core.ResourceQualifierObservableMap
    
    /** Possible values for the persistence of a global qualifier value override. */
    @JSGlobal("Windows.ApplicationModel.Resources.Core.ResourceQualifierPersistence")
    @js.native
    object ResourceQualifierPersistence extends StObject {
      
      @JSBracketAccess
      def apply(value: Double): js.UndefOr[
            typings.winrtUwp.Windows.ApplicationModel.Resources.Core.ResourceQualifierPersistence & Double
          ] = js.native
      
      /* 1 */ val localMachine: typings.winrtUwp.Windows.ApplicationModel.Resources.Core.ResourceQualifierPersistence.localMachine & Double = js.native
      
      /* 0 */ val none: typings.winrtUwp.Windows.ApplicationModel.Resources.Core.ResourceQualifierPersistence.none & Double = js.native
    }
    
    /** An unchangeable view into a vector of ResourceQualifier objects. */
    @JSGlobal("Windows.ApplicationModel.Resources.Core.ResourceQualifierVectorView")
    @js.native
    abstract class ResourceQualifierVectorView ()
      extends StObject
         with typings.winrtUwp.Windows.ApplicationModel.Resources.Core.ResourceQualifierVectorView
  }
  
  object Management {
    
    /** Specifies whether an IndexedResourceCandidate is a file or a string. */
    @JSGlobal("Windows.ApplicationModel.Resources.Management.IndexedResourceType")
    @js.native
    object IndexedResourceType extends StObject {
      
      @JSBracketAccess
      def apply(value: Double): js.UndefOr[
            typings.winrtUwp.Windows.ApplicationModel.Resources.Management.IndexedResourceType & Double
          ] = js.native
      
      /* 2 */ val embeddedData: typings.winrtUwp.Windows.ApplicationModel.Resources.Management.IndexedResourceType.embeddedData & Double = js.native
      
      /* 1 */ val path: typings.winrtUwp.Windows.ApplicationModel.Resources.Management.IndexedResourceType.path & Double = js.native
      
      /* 0 */ val string: typings.winrtUwp.Windows.ApplicationModel.Resources.Management.IndexedResourceType.string & Double = js.native
    }
  }
  
  /** Provides simplified access to app resources such as app UI strings. */
  @JSGlobal("Windows.ApplicationModel.Resources.ResourceLoader")
  @js.native
  /** Constructs a new ResourceLoader object for the "Resources" subtree of the currently running app's main ResourceMap . */
  class ResourceLoader ()
    extends StObject
       with typings.winrtUwp.Windows.ApplicationModel.Resources.ResourceLoader {
    /**
      * Constructs a new ResourceLoader object for the specified ResourceMap .
      * @param name The resource identifier of the ResourceMap that the new resource loader uses for unqualified resource references. It can then retrieve resources relative to those references.
      */
    def this(name: String) = this()
    
    /**
      * Returns the most appropriate string value of a resource, specified by resource identifier, for the default ResourceContext of the view in which the ResourceLoader was obtained using ResourceLoader.GetForCurrentView .
      * @param resource The resource identifier of the resource to be resolved.
      * @return The most appropriate string value of the specified resource for the default ResourceContext .
      */
    /* CompleteClass */
    override def getString(resource: String): String = js.native
    
    /**
      * Returns the most appropriate string value of a resource, specified by a Uniform Resource Identifier (URI) resource identifier, for the default ResourceContext of the currently running app.
      * @param uri A URI that represents the resource to be retrieved.
      * @return The most appropriate string value of the specified resource for the default ResourceContext .
      */
    /* CompleteClass */
    override def getStringForUri(uri: Uri): String = js.native
  }
  object ResourceLoader {
    
    @JSGlobal("Windows.ApplicationModel.Resources.ResourceLoader")
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * Gets a ResourceLoader object for the Resources subtree of the currently running app's main ResourceMap . This ResourceLoader uses a default context associated with the current view.
      * @return A resource loader for the Resources subtree of the currently running app's main ResourceMap .
      */
    /* static member */
    inline def getForCurrentView(): typings.winrtUwp.Windows.ApplicationModel.Resources.ResourceLoader = ^.asInstanceOf[js.Dynamic].applyDynamic("getForCurrentView")().asInstanceOf[typings.winrtUwp.Windows.ApplicationModel.Resources.ResourceLoader]
    /**
      * Gets a ResourceLoader object for the specified ResourceMap . This ResourceLoader uses a default context associated with the current view.
      * @param name The resource identifier of the ResourceMap that the new resource loader uses for unqualified resource references. The loader can then retrieve resources relative to those references.
      * @return A resource loader for the specified ResourceMap .
      */
    /* static member */
    inline def getForCurrentView(name: String): typings.winrtUwp.Windows.ApplicationModel.Resources.ResourceLoader = ^.asInstanceOf[js.Dynamic].applyDynamic("getForCurrentView")(name.asInstanceOf[js.Any]).asInstanceOf[typings.winrtUwp.Windows.ApplicationModel.Resources.ResourceLoader]
    
    /**
      * Gets a ResourceLoader object for the Resources subtree of the currently running app's main ResourceMap . This ResourceLoader uses a default context that's not associated with any view.
      * @return A resource loader for the Resources subtree of the currently running app's main ResourceMap . This ResourceLoader uses a default context that's not associated with any view. You can't use this ResourceLoader to retrieve any resource that has resource candidates qualified for scale.
      */
    /* static member */
    inline def getForViewIndependentUse(): typings.winrtUwp.Windows.ApplicationModel.Resources.ResourceLoader = ^.asInstanceOf[js.Dynamic].applyDynamic("getForViewIndependentUse")().asInstanceOf[typings.winrtUwp.Windows.ApplicationModel.Resources.ResourceLoader]
    /**
      * Gets a ResourceLoader object for the specified ResourceMap . This ResourceLoader uses a default context that's not associated with any view.
      * @param name The resource identifier of the ResourceMap that the new resource loader uses for unqualified resource references. The loader can then retrieve resources relative to those references.
      * @return A resource loader for the Resources subtree of the currently running app's main ResourceMap . This ResourceLoader uses a default context that's not associated with any view. You can't use this ResourceLoader to retrieve any resource that has resource candidates qualified for scale.
      */
    /* static member */
    inline def getForViewIndependentUse(name: String): typings.winrtUwp.Windows.ApplicationModel.Resources.ResourceLoader = ^.asInstanceOf[js.Dynamic].applyDynamic("getForViewIndependentUse")(name.asInstanceOf[js.Any]).asInstanceOf[typings.winrtUwp.Windows.ApplicationModel.Resources.ResourceLoader]
    
    /**
      * Returns the most appropriate string value of a resource, specified as a Uri for a resource identifier, for the default ResourceContext of the currently running app.
      * @param uri A Uri that represents the resource to be retrieved.
      * @return The most appropriate string value of the specified resource for the default ResourceContext .
      */
    /* static member */
    inline def getStringForReference(uri: Uri): String = ^.asInstanceOf[js.Dynamic].applyDynamic("getStringForReference")(uri.asInstanceOf[js.Any]).asInstanceOf[String]
  }
}
