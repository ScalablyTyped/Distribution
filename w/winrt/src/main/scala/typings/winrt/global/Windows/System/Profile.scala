package typings.winrt.global.Windows.System

import typings.winrt.Windows.Storage.Streams.IBuffer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSGlobal("Windows.System.Profile")
@js.native
object Profile extends js.Object {
  
  @js.native
  class HardwareIdentification ()
    extends typings.winrt.Windows.System.Profile.HardwareIdentification
  /* static members */
  @js.native
  object HardwareIdentification extends js.Object {
    
    def getPackageSpecificToken(nonce: IBuffer): typings.winrt.Windows.System.Profile.HardwareToken = js.native
  }
  
  @js.native
  class HardwareToken ()
    extends typings.winrt.Windows.System.Profile.HardwareToken
}
