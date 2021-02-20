package typings.winrtUwp.global.Windows.ApplicationModel

import typings.winrtUwp.Windows.ApplicationModel.Resources.Core.ResourceQualifierPersistence
import typings.winrtUwp.Windows.Foundation.Collections.IIterable
import typings.winrtUwp.Windows.Foundation.Uri
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Provides simplified access to application resources, such as strings, that are defined using basic naming conventions for runtime apps. */
object Resources {
  
  /** Provides classes that enable advanced resource loading. */
  object Core {
    
    /** Represents a single logical, named resource, such as a string resource named 'Header1'. */
    @JSGlobal("Windows.ApplicationModel.Resources.Core.NamedResource")
    @js.native
    abstract class NamedResource ()
      extends typings.winrtUwp.Windows.ApplicationModel.Resources.Core.NamedResource
    
    /** Represents a single possible value for a given NamedResource , the qualifiers associated with that resource, and how well those qualifiers match the context against which it was resolved. */
    @JSGlobal("Windows.ApplicationModel.Resources.Core.ResourceCandidate")
    @js.native
    abstract class ResourceCandidate ()
      extends typings.winrtUwp.Windows.ApplicationModel.Resources.Core.ResourceCandidate
    
    /** Represents a collection of ResourceCandidate objects. */
    @JSGlobal("Windows.ApplicationModel.Resources.Core.ResourceCandidateVectorView")
    @js.native
    abstract class ResourceCandidateVectorView ()
      extends typings.winrtUwp.Windows.ApplicationModel.Resources.Core.ResourceCandidateVectorView
    
    /** Encapsulates all of the factors ( ResourceQualifier s) that might affect resource selection. */
    @JSGlobal("Windows.ApplicationModel.Resources.Core.ResourceContext")
    @js.native
    /** Creates a cloned ResourceContext object. */
    class ResourceContext ()
      extends typings.winrtUwp.Windows.ApplicationModel.Resources.Core.ResourceContext
    object ResourceContext {
      
      /**
        * Creates a new ResourceContext that matches a supplied set of qualifiers.
        * @param result The list of qualifiers to be matched.
        * @return The new ResourceContext .
        */
      /* static member */
      @JSGlobal("Windows.ApplicationModel.Resources.Core.ResourceContext.createMatchingContext")
      @js.native
      def createMatchingContext(result: IIterable[typings.winrtUwp.Windows.ApplicationModel.Resources.Core.ResourceQualifier]): typings.winrtUwp.Windows.ApplicationModel.Resources.Core.ResourceContext = js.native
      
      /**
        * Gets a default ResourceContext associated with the current view for the currently running application.
        * @return The default context associated with the current view.
        */
      /* static member */
      @JSGlobal("Windows.ApplicationModel.Resources.Core.ResourceContext.getForCurrentView")
      @js.native
      def getForCurrentView(): typings.winrtUwp.Windows.ApplicationModel.Resources.Core.ResourceContext = js.native
      
      /**
        * Gets a default ResourceContext not associated with any view.
        * @return A default ResourceContext not associated with any view.
        */
      /* static member */
      @JSGlobal("Windows.ApplicationModel.Resources.Core.ResourceContext.getForViewIndependentUse")
      @js.native
      def getForViewIndependentUse(): typings.winrtUwp.Windows.ApplicationModel.Resources.Core.ResourceContext = js.native
      
      /** Removes any qualifier overrides from default contexts of all views across the app. */
      /* static member */
      @JSGlobal("Windows.ApplicationModel.Resources.Core.ResourceContext.resetGlobalQualifierValues")
      @js.native
      def resetGlobalQualifierValues(): Unit = js.native
      /**
        * Removes qualifier overrides for the specified qualifiers from default contexts of all views across the app.
        * @param qualifierNames The names of the qualifiers to be reset.
        */
      /* static member */
      @JSGlobal("Windows.ApplicationModel.Resources.Core.ResourceContext.resetGlobalQualifierValues")
      @js.native
      def resetGlobalQualifierValues(qualifierNames: IIterable[String]): Unit = js.native
      
      /**
        * Applies a single qualifier value override to default contexts of all views for the current app.
        * @param key The name of the qualifier to override.
        * @param value The override value to set.
        */
      /* static member */
      @JSGlobal("Windows.ApplicationModel.Resources.Core.ResourceContext.setGlobalQualifierValue")
      @js.native
      def setGlobalQualifierValue(key: String, value: String): Unit = js.native
      /**
        * Applies a single qualifier value override to default contexts of all views for the current app, and specifies the persistence of the override.
        * @param key The name of the qualifier to override.
        * @param value The override value to set.
        * @param persistence The persistence of the override value.
        */
      /* static member */
      @JSGlobal("Windows.ApplicationModel.Resources.Core.ResourceContext.setGlobalQualifierValue")
      @js.native
      def setGlobalQualifierValue(key: String, value: String, persistence: ResourceQualifierPersistence): Unit = js.native
    }
    
    /** Represents a collection of ResourceContext language qualifiers. */
    @JSGlobal("Windows.ApplicationModel.Resources.Core.ResourceContextLanguagesVectorView")
    @js.native
    abstract class ResourceContextLanguagesVectorView ()
      extends typings.winrtUwp.Windows.ApplicationModel.Resources.Core.ResourceContextLanguagesVectorView
    
    /** Provides access to application resource maps and more advanced resource functionality. */
    @JSGlobal("Windows.ApplicationModel.Resources.Core.ResourceManager")
    @js.native
    abstract class ResourceManager ()
      extends typings.winrtUwp.Windows.ApplicationModel.Resources.Core.ResourceManager
    object ResourceManager {
      
      @JSGlobal("Windows.ApplicationModel.Resources.Core.ResourceManager")
      @js.native
      val ^ : js.Any = js.native
      
      /** Gets the ResourceManager for the currently running application. */
      /* static member */
      @JSGlobal("Windows.ApplicationModel.Resources.Core.ResourceManager.current")
      @js.native
      def current: typings.winrtUwp.Windows.ApplicationModel.Resources.Core.ResourceManager = js.native
      @scala.inline
      def current_=(x: typings.winrtUwp.Windows.ApplicationModel.Resources.Core.ResourceManager): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("current")(x.asInstanceOf[js.Any])
      
      /**
        * Determines whether a supplied string matches the resource reference format (an ms-resource string URI identifier).
        * @param resourceReference The string you want to match.
        * @return TRUE if the string matches.
        */
      /* static member */
      @JSGlobal("Windows.ApplicationModel.Resources.Core.ResourceManager.isResourceReference")
      @js.native
      def isResourceReference(resourceReference: String): Boolean = js.native
    }
    
    /** A collection of related resources, typically either for a particular app package, or a resource file for a particular package. */
    @JSGlobal("Windows.ApplicationModel.Resources.Core.ResourceMap")
    @js.native
    abstract class ResourceMap ()
      extends typings.winrtUwp.Windows.ApplicationModel.Resources.Core.ResourceMap
    
    /** Supports iteration over a ResourceMap . */
    @JSGlobal("Windows.ApplicationModel.Resources.Core.ResourceMapIterator")
    @js.native
    abstract class ResourceMapIterator ()
      extends typings.winrtUwp.Windows.ApplicationModel.Resources.Core.ResourceMapIterator
    
    /** An unchangeable view into a map of ResourceMap objects. */
    @JSGlobal("Windows.ApplicationModel.Resources.Core.ResourceMapMapView")
    @js.native
    abstract class ResourceMapMapView ()
      extends typings.winrtUwp.Windows.ApplicationModel.Resources.Core.ResourceMapMapView
    
    /** Supports iteration over a ResourceMapMapView object. */
    @JSGlobal("Windows.ApplicationModel.Resources.Core.ResourceMapMapViewIterator")
    @js.native
    abstract class ResourceMapMapViewIterator ()
      extends typings.winrtUwp.Windows.ApplicationModel.Resources.Core.ResourceMapMapViewIterator
    
    /** Defines the qualifiers associated with a ResourceCandidate . */
    @JSGlobal("Windows.ApplicationModel.Resources.Core.ResourceQualifier")
    @js.native
    abstract class ResourceQualifier ()
      extends typings.winrtUwp.Windows.ApplicationModel.Resources.Core.ResourceQualifier
    
    /** An unchangeable view into a map of ResourceQualifier objects. */
    @JSGlobal("Windows.ApplicationModel.Resources.Core.ResourceQualifierMapView")
    @js.native
    abstract class ResourceQualifierMapView ()
      extends typings.winrtUwp.Windows.ApplicationModel.Resources.Core.ResourceQualifierMapView
    
    /** Notifies listeners of dynamic changes to a map of ResourceQualifier objects, such as when items get added or removed, and allows qualifier values to change. */
    @JSGlobal("Windows.ApplicationModel.Resources.Core.ResourceQualifierObservableMap")
    @js.native
    abstract class ResourceQualifierObservableMap ()
      extends typings.winrtUwp.Windows.ApplicationModel.Resources.Core.ResourceQualifierObservableMap
    
    /** Possible values for the persistence of a global qualifier value override. */
    @JSGlobal("Windows.ApplicationModel.Resources.Core.ResourceQualifierPersistence")
    @js.native
    object ResourceQualifierPersistence extends StObject {
      
      @JSBracketAccess
      def apply(value: Double): js.UndefOr[
            typings.winrtUwp.Windows.ApplicationModel.Resources.Core.ResourceQualifierPersistence with Double
          ] = js.native
      
      /* 1 */ val localMachine: typings.winrtUwp.Windows.ApplicationModel.Resources.Core.ResourceQualifierPersistence.localMachine with Double = js.native
      
      /* 0 */ val none: typings.winrtUwp.Windows.ApplicationModel.Resources.Core.ResourceQualifierPersistence.none with Double = js.native
    }
    
    /** An unchangeable view into a vector of ResourceQualifier objects. */
    @JSGlobal("Windows.ApplicationModel.Resources.Core.ResourceQualifierVectorView")
    @js.native
    abstract class ResourceQualifierVectorView ()
      extends typings.winrtUwp.Windows.ApplicationModel.Resources.Core.ResourceQualifierVectorView
  }
  
  object Management {
    
    /** Specifies whether an IndexedResourceCandidate is a file or a string. */
    @JSGlobal("Windows.ApplicationModel.Resources.Management.IndexedResourceType")
    @js.native
    object IndexedResourceType extends StObject {
      
      @JSBracketAccess
      def apply(value: Double): js.UndefOr[
            typings.winrtUwp.Windows.ApplicationModel.Resources.Management.IndexedResourceType with Double
          ] = js.native
      
      /* 2 */ val embeddedData: typings.winrtUwp.Windows.ApplicationModel.Resources.Management.IndexedResourceType.embeddedData with Double = js.native
      
      /* 1 */ val path: typings.winrtUwp.Windows.ApplicationModel.Resources.Management.IndexedResourceType.path with Double = js.native
      
      /* 0 */ val string: typings.winrtUwp.Windows.ApplicationModel.Resources.Management.IndexedResourceType.string with Double = js.native
    }
  }
  
  /** Provides simplified access to app resources such as app UI strings. */
  @JSGlobal("Windows.ApplicationModel.Resources.ResourceLoader")
  @js.native
  /** Constructs a new ResourceLoader object for the "Resources" subtree of the currently running app's main ResourceMap . */
  class ResourceLoader ()
    extends typings.winrtUwp.Windows.ApplicationModel.Resources.ResourceLoader {
    /**
      * Constructs a new ResourceLoader object for the specified ResourceMap .
      * @param name The resource identifier of the ResourceMap that the new resource loader uses for unqualified resource references. It can then retrieve resources relative to those references.
      */
    def this(name: String) = this()
  }
  object ResourceLoader {
    
    /**
      * Gets a ResourceLoader object for the Resources subtree of the currently running app's main ResourceMap . This ResourceLoader uses a default context associated with the current view.
      * @return A resource loader for the Resources subtree of the currently running app's main ResourceMap .
      */
    /* static member */
    @JSGlobal("Windows.ApplicationModel.Resources.ResourceLoader.getForCurrentView")
    @js.native
    def getForCurrentView(): typings.winrtUwp.Windows.ApplicationModel.Resources.ResourceLoader = js.native
    /**
      * Gets a ResourceLoader object for the specified ResourceMap . This ResourceLoader uses a default context associated with the current view.
      * @param name The resource identifier of the ResourceMap that the new resource loader uses for unqualified resource references. The loader can then retrieve resources relative to those references.
      * @return A resource loader for the specified ResourceMap .
      */
    /* static member */
    @JSGlobal("Windows.ApplicationModel.Resources.ResourceLoader.getForCurrentView")
    @js.native
    def getForCurrentView(name: String): typings.winrtUwp.Windows.ApplicationModel.Resources.ResourceLoader = js.native
    
    /**
      * Gets a ResourceLoader object for the Resources subtree of the currently running app's main ResourceMap . This ResourceLoader uses a default context that's not associated with any view.
      * @return A resource loader for the Resources subtree of the currently running app's main ResourceMap . This ResourceLoader uses a default context that's not associated with any view. You can't use this ResourceLoader to retrieve any resource that has resource candidates qualified for scale.
      */
    /* static member */
    @JSGlobal("Windows.ApplicationModel.Resources.ResourceLoader.getForViewIndependentUse")
    @js.native
    def getForViewIndependentUse(): typings.winrtUwp.Windows.ApplicationModel.Resources.ResourceLoader = js.native
    /**
      * Gets a ResourceLoader object for the specified ResourceMap . This ResourceLoader uses a default context that's not associated with any view.
      * @param name The resource identifier of the ResourceMap that the new resource loader uses for unqualified resource references. The loader can then retrieve resources relative to those references.
      * @return A resource loader for the Resources subtree of the currently running app's main ResourceMap . This ResourceLoader uses a default context that's not associated with any view. You can't use this ResourceLoader to retrieve any resource that has resource candidates qualified for scale.
      */
    /* static member */
    @JSGlobal("Windows.ApplicationModel.Resources.ResourceLoader.getForViewIndependentUse")
    @js.native
    def getForViewIndependentUse(name: String): typings.winrtUwp.Windows.ApplicationModel.Resources.ResourceLoader = js.native
    
    /**
      * Returns the most appropriate string value of a resource, specified as a Uri for a resource identifier, for the default ResourceContext of the currently running app.
      * @param uri A Uri that represents the resource to be retrieved.
      * @return The most appropriate string value of the specified resource for the default ResourceContext .
      */
    /* static member */
    @JSGlobal("Windows.ApplicationModel.Resources.ResourceLoader.getStringForReference")
    @js.native
    def getStringForReference(uri: Uri): String = js.native
  }
}
