package typings.winrt.WindowsNs.SystemNs.ProfileNs

import typings.winrt.WindowsNs.StorageNs.StreamsNs.IBuffer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IHardwareIdentificationStatics extends js.Object {
  def getPackageSpecificToken(nonce: IBuffer): HardwareToken
}

object IHardwareIdentificationStatics {
  @scala.inline
  def apply(getPackageSpecificToken: IBuffer => HardwareToken): IHardwareIdentificationStatics = {
    val __obj = js.Dynamic.literal(getPackageSpecificToken = js.Any.fromFunction1(getPackageSpecificToken))
  
    __obj.asInstanceOf[IHardwareIdentificationStatics]
  }
}

