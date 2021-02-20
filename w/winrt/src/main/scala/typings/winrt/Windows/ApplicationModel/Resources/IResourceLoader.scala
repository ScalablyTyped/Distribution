package typings.winrt.Windows.ApplicationModel.Resources

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait IResourceLoader extends StObject {
  
  def getString(resource: String): String = js.native
}
object IResourceLoader {
  
  @scala.inline
  def apply(getString: String => String): IResourceLoader = {
    val __obj = js.Dynamic.literal(getString = js.Any.fromFunction1(getString))
    __obj.asInstanceOf[IResourceLoader]
  }
  
  @scala.inline
  implicit class IResourceLoaderMutableBuilder[Self <: IResourceLoader] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setGetString(value: String => String): Self = StObject.set(x, "getString", js.Any.fromFunction1(value))
  }
}
