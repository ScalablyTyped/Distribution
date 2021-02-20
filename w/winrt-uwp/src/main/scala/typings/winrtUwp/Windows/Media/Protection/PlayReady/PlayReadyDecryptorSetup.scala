package typings.winrtUwp.Windows.Media.Protection.PlayReady

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait PlayReadyDecryptorSetup extends StObject
/** Defines decryptor setup requirements indicating when to acquire licenses for the content. */
@JSGlobal("Windows.Media.Protection.PlayReady.PlayReadyDecryptorSetup")
@js.native
object PlayReadyDecryptorSetup extends StObject {
  
  /** Indicates that a player app cannot guarantee that the license (chain) for the content is available prior to setting up the media graph. */
  @js.native
  sealed trait onDemand extends PlayReadyDecryptorSetup
  
  /** Indicates the DECRYPTORSETUP is not present in the rights management header. This indicates that a player app can guarantee that the license (chain) for the content is available prior to setting up the media graph. */
  @js.native
  sealed trait uninitialized extends PlayReadyDecryptorSetup
}
