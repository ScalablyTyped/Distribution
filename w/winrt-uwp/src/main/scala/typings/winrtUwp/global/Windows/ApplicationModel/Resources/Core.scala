package typings.winrtUwp.global.Windows.ApplicationModel.Resources

import typings.winrtUwp.Windows.ApplicationModel.Resources.Core.ResourceQualifierPersistence
import typings.winrtUwp.Windows.Foundation.Collections.IIterable
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
    extends typings.winrtUwp.Windows.ApplicationModel.Resources.Core.ResourceCandidate
  
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
    extends typings.winrtUwp.Windows.ApplicationModel.Resources.Core.ResourceManager
  
  /** A collection of related resources, typically either for a particular app package, or a resource file for a particular package. */
  @js.native
  abstract class ResourceMap ()
    extends typings.winrtUwp.Windows.ApplicationModel.Resources.Core.ResourceMap
  
  /** Supports iteration over a ResourceMap . */
  @js.native
  abstract class ResourceMapIterator ()
    extends typings.winrtUwp.Windows.ApplicationModel.Resources.Core.ResourceMapIterator
  
  /** An unchangeable view into a map of ResourceMap objects. */
  @js.native
  abstract class ResourceMapMapView ()
    extends typings.winrtUwp.Windows.ApplicationModel.Resources.Core.ResourceMapMapView
  
  /** Supports iteration over a ResourceMapMapView object. */
  @js.native
  abstract class ResourceMapMapViewIterator ()
    extends typings.winrtUwp.Windows.ApplicationModel.Resources.Core.ResourceMapMapViewIterator
  
  /** Defines the qualifiers associated with a ResourceCandidate . */
  @js.native
  abstract class ResourceQualifier ()
    extends typings.winrtUwp.Windows.ApplicationModel.Resources.Core.ResourceQualifier
  
  /** An unchangeable view into a map of ResourceQualifier objects. */
  @js.native
  abstract class ResourceQualifierMapView ()
    extends typings.winrtUwp.Windows.ApplicationModel.Resources.Core.ResourceQualifierMapView
  
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

