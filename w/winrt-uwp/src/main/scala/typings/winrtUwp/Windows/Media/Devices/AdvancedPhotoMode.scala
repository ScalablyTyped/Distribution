package typings.winrtUwp.Windows.Media.Devices

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait AdvancedPhotoMode extends StObject
/** Defines the advanced photo capture modes. */
@JSGlobal("Windows.Media.Devices.AdvancedPhotoMode")
@js.native
object AdvancedPhotoMode extends StObject {
  
  /** The system dynamically determines the advanced photo capture mode. */
  @js.native
  sealed trait auto extends AdvancedPhotoMode
  
  /** High Dynamic Range (HDR) capture mode. */
  @js.native
  sealed trait hdr extends AdvancedPhotoMode
  
  /** Standard capture mode. */
  @js.native
  sealed trait standard extends AdvancedPhotoMode
}
