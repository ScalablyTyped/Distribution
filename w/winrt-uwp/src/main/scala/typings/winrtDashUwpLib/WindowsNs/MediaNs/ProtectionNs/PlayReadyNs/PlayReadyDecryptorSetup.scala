package typings
package winrtDashUwpLib.WindowsNs.MediaNs.ProtectionNs.PlayReadyNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait PlayReadyDecryptorSetup extends js.Object

/** Defines decryptor setup requirements indicating when to acquire licenses for the content. */
@JSGlobal("Windows.Media.Protection.PlayReady.PlayReadyDecryptorSetup")
@js.native
object PlayReadyDecryptorSetup extends js.Object {
  /** Indicates that a player app cannot guarantee that the license (chain) for the content is available prior to setting up the media graph. */
  @js.native
  sealed trait onDemand
    extends winrtDashUwpLib.WindowsNs.MediaNs.ProtectionNs.PlayReadyNs.PlayReadyDecryptorSetup
  
  /** Indicates the DECRYPTORSETUP is not present in the rights management header. This indicates that a player app can guarantee that the license (chain) for the content is available prior to setting up the media graph. */
  @js.native
  sealed trait uninitialized
    extends winrtDashUwpLib.WindowsNs.MediaNs.ProtectionNs.PlayReadyNs.PlayReadyDecryptorSetup
  
  val onDemand: onDemand with java.lang.String = js.native
  val uninitialized: uninitialized with java.lang.String = js.native
  @JSBracketAccess
  def apply(value: java.lang.String): js.UndefOr[
    winrtDashUwpLib.WindowsNs.MediaNs.ProtectionNs.PlayReadyNs.PlayReadyDecryptorSetup with java.lang.String
  ] = js.native
}

