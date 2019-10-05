package typings.winrt.Windows.Foundation

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IWwwFormUrlDecoderRuntimeClassFactory extends js.Object {
  def createWwwFormUrlDecoder(query: String): WwwFormUrlDecoder
}

object IWwwFormUrlDecoderRuntimeClassFactory {
  @scala.inline
  def apply(createWwwFormUrlDecoder: String => WwwFormUrlDecoder): IWwwFormUrlDecoderRuntimeClassFactory = {
    val __obj = js.Dynamic.literal(createWwwFormUrlDecoder = js.Any.fromFunction1(createWwwFormUrlDecoder))
  
    __obj.asInstanceOf[IWwwFormUrlDecoderRuntimeClassFactory]
  }
}

