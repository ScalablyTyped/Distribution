package typings.winrtDashUwp.Windows.Media.Protection.PlayReady

import org.scalablytyped.runtime.TopLevel
import typings.winrtDashUwp.Windows.Media.Protection.PlayReady.PlayReadyDecryptorSetup.onDemand
import typings.winrtDashUwp.Windows.Media.Protection.PlayReady.PlayReadyDecryptorSetup.uninitialized
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
  sealed trait onDemand extends PlayReadyDecryptorSetup
  
  /** Indicates the DECRYPTORSETUP is not present in the rights management header. This indicates that a player app can guarantee that the license (chain) for the content is available prior to setting up the media graph. */
  @js.native
  sealed trait uninitialized extends PlayReadyDecryptorSetup
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[PlayReadyDecryptorSetup with Double] = js.native
  /* 1 */ @js.native
  object onDemand extends TopLevel[onDemand with Double]
  
  /* 0 */ @js.native
  object uninitialized extends TopLevel[uninitialized with Double]
  
}

