package typings.winrt.Windows.Foundation

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait IWwwFormUrlDecoderRuntimeClassFactory extends StObject {
  
  def createWwwFormUrlDecoder(query: String): WwwFormUrlDecoder = js.native
}
object IWwwFormUrlDecoderRuntimeClassFactory {
  
  @scala.inline
  def apply(createWwwFormUrlDecoder: String => WwwFormUrlDecoder): IWwwFormUrlDecoderRuntimeClassFactory = {
    val __obj = js.Dynamic.literal(createWwwFormUrlDecoder = js.Any.fromFunction1(createWwwFormUrlDecoder))
    __obj.asInstanceOf[IWwwFormUrlDecoderRuntimeClassFactory]
  }
  
  @scala.inline
  implicit class IWwwFormUrlDecoderRuntimeClassFactoryMutableBuilder[Self <: IWwwFormUrlDecoderRuntimeClassFactory] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCreateWwwFormUrlDecoder(value: String => WwwFormUrlDecoder): Self = StObject.set(x, "createWwwFormUrlDecoder", js.Any.fromFunction1(value))
  }
}
