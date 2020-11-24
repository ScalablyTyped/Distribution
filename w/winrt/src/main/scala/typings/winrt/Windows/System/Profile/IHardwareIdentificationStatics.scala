package typings.winrt.Windows.System.Profile

import typings.winrt.Windows.Storage.Streams.IBuffer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait IHardwareIdentificationStatics extends js.Object {
  
  def getPackageSpecificToken(nonce: IBuffer): HardwareToken = js.native
}
object IHardwareIdentificationStatics {
  
  @scala.inline
  def apply(getPackageSpecificToken: IBuffer => HardwareToken): IHardwareIdentificationStatics = {
    val __obj = js.Dynamic.literal(getPackageSpecificToken = js.Any.fromFunction1(getPackageSpecificToken))
    __obj.asInstanceOf[IHardwareIdentificationStatics]
  }
  
  @scala.inline
  implicit class IHardwareIdentificationStaticsOps[Self <: IHardwareIdentificationStatics] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setGetPackageSpecificToken(value: IBuffer => HardwareToken): Self = this.set("getPackageSpecificToken", js.Any.fromFunction1(value))
  }
}
