package typings.winrtUwp.Windows.ApplicationModel.Resources

import typings.winrtUwp.Windows.Foundation.Uri
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Provides simplified access to app resources such as app UI strings. */
@js.native
trait ResourceLoader extends js.Object {
  
  /**
    * Returns the most appropriate string value of a resource, specified by resource identifier, for the default ResourceContext of the view in which the ResourceLoader was obtained using ResourceLoader.GetForCurrentView .
    * @param resource The resource identifier of the resource to be resolved.
    * @return The most appropriate string value of the specified resource for the default ResourceContext .
    */
  def getString(resource: String): String = js.native
  
  /**
    * Returns the most appropriate string value of a resource, specified by a Uniform Resource Identifier (URI) resource identifier, for the default ResourceContext of the currently running app.
    * @param uri A URI that represents the resource to be retrieved.
    * @return The most appropriate string value of the specified resource for the default ResourceContext .
    */
  def getStringForUri(uri: Uri): String = js.native
}
object ResourceLoader {
  
  @scala.inline
  def apply(getString: String => String, getStringForUri: Uri => String): ResourceLoader = {
    val __obj = js.Dynamic.literal(getString = js.Any.fromFunction1(getString), getStringForUri = js.Any.fromFunction1(getStringForUri))
    __obj.asInstanceOf[ResourceLoader]
  }
  
  @scala.inline
  implicit class ResourceLoaderOps[Self <: ResourceLoader] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setGetString(value: String => String): Self = this.set("getString", js.Any.fromFunction1(value))
    
    @scala.inline
    def setGetStringForUri(value: Uri => String): Self = this.set("getStringForUri", js.Any.fromFunction1(value))
  }
}
