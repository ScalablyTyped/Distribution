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
  
  @scala.inline
  implicit open class MutableBuilder[Self <: IResourceLoaderFactory] (val x: Self) extends AnyVal {
    
    inline def setCreateResourceLoaderByName(value: String => ResourceLoader): Self = StObject.set(x, "createResourceLoaderByName", js.Any.fromFunction1(value))
  }
}
