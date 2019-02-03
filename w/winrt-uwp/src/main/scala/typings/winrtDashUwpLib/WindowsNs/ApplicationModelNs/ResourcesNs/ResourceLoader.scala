package typings
package winrtDashUwpLib.WindowsNs.ApplicationModelNs.ResourcesNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Provides simplified access to app resources such as app UI strings. */
@JSGlobal("Windows.ApplicationModel.Resources.ResourceLoader")
@js.native
/** Constructs a new ResourceLoader object for the "Resources" subtree of the currently running app's main ResourceMap . */
class ResourceLoader () extends js.Object {
  /**
    * Constructs a new ResourceLoader object for the specified ResourceMap .
    * @param name The resource identifier of the ResourceMap that the new resource loader uses for unqualified resource references. It can then retrieve resources relative to those references.
    */
  def this(name: java.lang.String) = this()
  /**
    * Returns the most appropriate string value of a resource, specified by resource identifier, for the default ResourceContext of the view in which the ResourceLoader was obtained using ResourceLoader.GetForCurrentView .
    * @param resource The resource identifier of the resource to be resolved.
    * @return The most appropriate string value of the specified resource for the default ResourceContext .
    */
  def getString(resource: java.lang.String): java.lang.String = js.native
  /**
    * Returns the most appropriate string value of a resource, specified by a Uniform Resource Identifier (URI) resource identifier, for the default ResourceContext of the currently running app.
    * @param uri A URI that represents the resource to be retrieved.
    * @return The most appropriate string value of the specified resource for the default ResourceContext .
    */
  def getStringForUri(uri: winrtDashUwpLib.WindowsNs.FoundationNs.Uri): java.lang.String = js.native
}

/* static members */
@JSGlobal("Windows.ApplicationModel.Resources.ResourceLoader")
@js.native
object ResourceLoader extends js.Object {
  /**
    * Gets a ResourceLoader object for the Resources subtree of the currently running app's main ResourceMap . This ResourceLoader uses a default context associated with the current view.
    * @return A resource loader for the Resources subtree of the currently running app's main ResourceMap .
    */
  def getForCurrentView(): winrtDashUwpLib.WindowsNs.ApplicationModelNs.ResourcesNs.ResourceLoader = js.native
  /**
    * Gets a ResourceLoader object for the specified ResourceMap . This ResourceLoader uses a default context associated with the current view.
    * @param name The resource identifier of the ResourceMap that the new resource loader uses for unqualified resource references. The loader can then retrieve resources relative to those references.
    * @return A resource loader for the specified ResourceMap .
    */
  def getForCurrentView(name: java.lang.String): winrtDashUwpLib.WindowsNs.ApplicationModelNs.ResourcesNs.ResourceLoader = js.native
  /**
    * Gets a ResourceLoader object for the Resources subtree of the currently running app's main ResourceMap . This ResourceLoader uses a default context that's not associated with any view.
    * @return A resource loader for the Resources subtree of the currently running app's main ResourceMap . This ResourceLoader uses a default context that's not associated with any view. You can't use this ResourceLoader to retrieve any resource that has resource candidates qualified for scale.
    */
  def getForViewIndependentUse(): winrtDashUwpLib.WindowsNs.ApplicationModelNs.ResourcesNs.ResourceLoader = js.native
  /**
    * Gets a ResourceLoader object for the specified ResourceMap . This ResourceLoader uses a default context that's not associated with any view.
    * @param name The resource identifier of the ResourceMap that the new resource loader uses for unqualified resource references. The loader can then retrieve resources relative to those references.
    * @return A resource loader for the Resources subtree of the currently running app's main ResourceMap . This ResourceLoader uses a default context that's not associated with any view. You can't use this ResourceLoader to retrieve any resource that has resource candidates qualified for scale.
    */
  def getForViewIndependentUse(name: java.lang.String): winrtDashUwpLib.WindowsNs.ApplicationModelNs.ResourcesNs.ResourceLoader = js.native
  /**
    * Returns the most appropriate string value of a resource, specified as a Uri for a resource identifier, for the default ResourceContext of the currently running app.
    * @param uri A Uri that represents the resource to be retrieved.
    * @return The most appropriate string value of the specified resource for the default ResourceContext .
    */
  def getStringForReference(uri: winrtDashUwpLib.WindowsNs.FoundationNs.Uri): java.lang.String = js.native
}

