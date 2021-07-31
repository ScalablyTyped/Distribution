package typings.winrtUwp.Windows.Media

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait AudioBufferAccessMode extends StObject
/** Defines the access mode of an AudioBuffer returned by AudioFrame::LockBuffer . */
@JSGlobal("Windows.Media.AudioBufferAccessMode")
@js.native
object AudioBufferAccessMode extends StObject {
  
  /** The audio buffer is read-only. */
  @js.native
  sealed trait read
    extends StObject
       with AudioBufferAccessMode
  
  /** The audio buffer can be written to and read from. */
  @js.native
  sealed trait readWrite
    extends StObject
       with AudioBufferAccessMode
  
  /** The audio buffer is write-only. */
  @js.native
  sealed trait write
    extends StObject
       with AudioBufferAccessMode
}
