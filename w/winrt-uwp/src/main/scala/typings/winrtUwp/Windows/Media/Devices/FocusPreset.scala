package typings.winrtUwp.Windows.Media.Devices

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait FocusPreset extends StObject
/** Defines the values for the possible focus presets. */
@JSGlobal("Windows.Media.Devices.FocusPreset")
@js.native
object FocusPreset extends StObject {
  
  /** Indicates that focus is automatically set by the capture. */
  @js.native
  sealed trait auto
    extends StObject
       with FocusPreset
  
  /** Indicates that the capture device uses a hyperfocal autofocus range. */
  @js.native
  sealed trait autoHyperfocal
    extends StObject
       with FocusPreset
  
  /** Indicates that the capture device uses an infinite autofocus range. */
  @js.native
  sealed trait autoInfinity
    extends StObject
       with FocusPreset
  
  /** Indicates that the capture device uses a close autofocus range. */
  @js.native
  sealed trait autoMacro
    extends StObject
       with FocusPreset
  
  /** Indicates that the capture device uses a normal autofocus range. */
  @js.native
  sealed trait autoNormal
    extends StObject
       with FocusPreset
  
  /** Indicates that focus is manually set. */
  @js.native
  sealed trait manual
    extends StObject
       with FocusPreset
}
