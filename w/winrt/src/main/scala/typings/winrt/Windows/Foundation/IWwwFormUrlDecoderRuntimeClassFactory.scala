package typings.winrt.Windows.Foundation

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IWwwFormUrlDecoderRuntimeClassFactory extends StObject {
  
  def createWwwFormUrlDecoder(query: String): WwwFormUrlDecoder
}
object IWwwFormUrlDecoderRuntimeClassFactory {
  
  inline def apply(createWwwFormUrlDecoder: String => WwwFormUrlDecoder): IWwwFormUrlDecoderRuntimeClassFactory = {
    val __obj = js.Dynamic.literal(createWwwFormUrlDecoder = js.Any.fromFunction1(createWwwFormUrlDecoder))
    __obj.asInstanceOf[IWwwFormUrlDecoderRuntimeClassFactory]
  }
  
  extension [Self <: IWwwFormUrlDecoderRuntimeClassFactory](x: Self) {
    
    inline def setCreateWwwFormUrlDecoder(value: String => WwwFormUrlDecoder): Self = StObject.set(x, "createWwwFormUrlDecoder", js.Any.fromFunction1(value))
  }
}
