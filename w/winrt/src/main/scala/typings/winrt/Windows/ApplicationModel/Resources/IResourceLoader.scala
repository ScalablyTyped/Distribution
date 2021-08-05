package typings.winrt.Windows.ApplicationModel.Resources

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IResourceLoader extends StObject {
  
  def getString(resource: String): String
}
object IResourceLoader {
  
  inline def apply(getString: String => String): IResourceLoader = {
    val __obj = js.Dynamic.literal(getString = js.Any.fromFunction1(getString))
    __obj.asInstanceOf[IResourceLoader]
  }
  
  extension [Self <: IResourceLoader](x: Self) {
    
    inline def setGetString(value: String => String): Self = StObject.set(x, "getString", js.Any.fromFunction1(value))
  }
}
