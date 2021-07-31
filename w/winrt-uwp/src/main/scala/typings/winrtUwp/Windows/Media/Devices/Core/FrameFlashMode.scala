package typings.winrtUwp.Windows.Media.Devices.Core

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait FrameFlashMode extends StObject
/** Specifies the flash mode for a frame in a variable photo sequence. */
@JSGlobal("Windows.Media.Devices.Core.FrameFlashMode")
@js.native
object FrameFlashMode extends StObject {
  
  /** The flash is disabled. */
  @js.native
  sealed trait disable
    extends StObject
       with FrameFlashMode
  
  /** The flash is enabled. */
  @js.native
  sealed trait enable
    extends StObject
       with FrameFlashMode
  
  /** The flash uses the global flash mode. */
  @js.native
  sealed trait global
    extends StObject
       with FrameFlashMode
}
