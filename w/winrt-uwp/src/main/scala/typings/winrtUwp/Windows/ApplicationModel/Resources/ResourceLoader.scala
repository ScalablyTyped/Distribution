package typings.winrtUwp.Windows.ApplicationModel.Resources

import typings.winrtUwp.Windows.Foundation.Uri
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Provides simplified access to app resources such as app UI strings. */
trait ResourceLoader extends StObject {
  
  /**
    * Returns the most appropriate string value of a resource, specified by resource identifier, for the default ResourceContext of the view in which the ResourceLoader was obtained using ResourceLoader.GetForCurrentView .
    * @param resource The resource identifier of the resource to be resolved.
    * @return The most appropriate string value of the specified resource for the default ResourceContext .
    */
  def getString(resource: String): String
  
  /**
    * Returns the most appropriate string value of a resource, specified by a Uniform Resource Identifier (URI) resource identifier, for the default ResourceContext of the currently running app.
    * @param uri A URI that represents the resource to be retrieved.
    * @return The most appropriate string value of the specified resource for the default ResourceContext .
    */
  def getStringForUri(uri: Uri): String
}
object ResourceLoader {
  
  inline def apply(getString: String => String, getStringForUri: Uri => String): ResourceLoader = {
    val __obj = js.Dynamic.literal(getString = js.Any.fromFunction1(getString), getStringForUri = js.Any.fromFunction1(getStringForUri))
    __obj.asInstanceOf[ResourceLoader]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ResourceLoader] (val x: Self) extends AnyVal {
    
    inline def setGetString(value: String => String): Self = StObject.set(x, "getString", js.Any.fromFunction1(value))
    
    inline def setGetStringForUri(value: Uri => String): Self = StObject.set(x, "getStringForUri", js.Any.fromFunction1(value))
  }
}
