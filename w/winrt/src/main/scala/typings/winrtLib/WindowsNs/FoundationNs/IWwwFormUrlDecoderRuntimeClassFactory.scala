package typings
package winrtLib.WindowsNs.FoundationNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IWwwFormUrlDecoderRuntimeClassFactory extends js.Object {
  def createWwwFormUrlDecoder(query: java.lang.String): WwwFormUrlDecoder
}

object IWwwFormUrlDecoderRuntimeClassFactory {
  @scala.inline
  def apply(createWwwFormUrlDecoder: js.Function1[java.lang.String, WwwFormUrlDecoder]): IWwwFormUrlDecoderRuntimeClassFactory = {
    val __obj = js.Dynamic.literal(createWwwFormUrlDecoder = createWwwFormUrlDecoder)
  
    __obj.asInstanceOf[IWwwFormUrlDecoderRuntimeClassFactory]
  }
}

