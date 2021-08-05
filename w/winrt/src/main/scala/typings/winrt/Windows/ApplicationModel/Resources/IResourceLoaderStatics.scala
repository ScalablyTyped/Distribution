package typings.winrt.Windows.ApplicationModel.Resources

import typings.winrt.Windows.Foundation.Uri
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IResourceLoaderStatics extends StObject {
  
  def getStringForReference(uri: Uri): String
}
object IResourceLoaderStatics {
  
  inline def apply(getStringForReference: Uri => String): IResourceLoaderStatics = {
    val __obj = js.Dynamic.literal(getStringForReference = js.Any.fromFunction1(getStringForReference))
    __obj.asInstanceOf[IResourceLoaderStatics]
  }
  
  extension [Self <: IResourceLoaderStatics](x: Self) {
    
    inline def setGetStringForReference(value: Uri => String): Self = StObject.set(x, "getStringForReference", js.Any.fromFunction1(value))
  }
}
