package typings.winrt.global.Windows.System

import typings.winrt.Windows.Storage.Streams.IBuffer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("Windows.System.Profile")
@js.native
object Profile extends js.Object {
  @js.native
  class HardwareIdentification ()
    extends typings.winrt.Windows.System.Profile.HardwareIdentification
  
  @js.native
  class HardwareToken ()
    extends typings.winrt.Windows.System.Profile.HardwareToken {
    /* CompleteClass */
    override var certificate: IBuffer = js.native
    /* CompleteClass */
    override var id: IBuffer = js.native
    /* CompleteClass */
    override var signature: IBuffer = js.native
  }
  
  /* static members */
  @js.native
  object HardwareIdentification extends js.Object {
    def getPackageSpecificToken(nonce: IBuffer): typings.winrt.Windows.System.Profile.HardwareToken = js.native
  }
  
}

