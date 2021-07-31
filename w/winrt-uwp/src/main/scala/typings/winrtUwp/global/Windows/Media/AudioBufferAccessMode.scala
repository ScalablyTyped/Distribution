package typings.winrtUwp.global.Windows.Media

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Defines the access mode of an AudioBuffer returned by AudioFrame::LockBuffer . */
@JSGlobal("Windows.Media.AudioBufferAccessMode")
@js.native
object AudioBufferAccessMode extends StObject {
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[typings.winrtUwp.Windows.Media.AudioBufferAccessMode & Double] = js.native
  
  /* 0 */ val read: typings.winrtUwp.Windows.Media.AudioBufferAccessMode.read & Double = js.native
  
  /* 1 */ val readWrite: typings.winrtUwp.Windows.Media.AudioBufferAccessMode.readWrite & Double = js.native
  
  /* 2 */ val write: typings.winrtUwp.Windows.Media.AudioBufferAccessMode.write & Double = js.native
}
