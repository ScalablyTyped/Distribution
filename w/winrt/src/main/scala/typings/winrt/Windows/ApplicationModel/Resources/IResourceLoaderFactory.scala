package typings.winrt.Windows.ApplicationModel.Resources

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IResourceLoaderFactory extends StObject {
  
  def createResourceLoaderByName(name: String): ResourceLoader
}
object IResourceLoaderFactory {
  
  inline def apply(createResourceLoaderByName: String => ResourceLoader): IResourceLoaderFactory = {
    val __obj = js.Dynamic.literal(createResourceLoaderByName = js.Any.fromFunction1(createResourceLoaderByName))
    __obj.asInstanceOf[IResourceLoaderFactory]
  }
  
  extension [Self <: IResourceLoaderFactory](x: Self) {
    
    inline def setCreateResourceLoaderByName(value: String => ResourceLoader): Self = StObject.set(x, "createResourceLoaderByName", js.Any.fromFunction1(value))
  }
}
