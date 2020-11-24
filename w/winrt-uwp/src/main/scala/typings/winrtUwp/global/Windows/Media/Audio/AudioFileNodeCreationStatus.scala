package typings.winrtUwp.global.Windows.Media.Audio

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Defines status values for audio file node creation. */
@JSGlobal("Windows.Media.Audio.AudioFileNodeCreationStatus")
@js.native
object AudioFileNodeCreationStatus extends js.Object {
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[typings.winrtUwp.Windows.Media.Audio.AudioFileNodeCreationStatus with Double] = js.native
  
  /* 1 */ val fileNotFound: typings.winrtUwp.Windows.Media.Audio.AudioFileNodeCreationStatus.fileNotFound with Double = js.native
  
  /* 3 */ val formatNotSupported: typings.winrtUwp.Windows.Media.Audio.AudioFileNodeCreationStatus.formatNotSupported with Double = js.native
  
  /* 2 */ val invalidFileType: typings.winrtUwp.Windows.Media.Audio.AudioFileNodeCreationStatus.invalidFileType with Double = js.native
  
  /* 0 */ val success: typings.winrtUwp.Windows.Media.Audio.AudioFileNodeCreationStatus.success with Double = js.native
  
  /* 4 */ val unknownFailure: typings.winrtUwp.Windows.Media.Audio.AudioFileNodeCreationStatus.unknownFailure with Double = js.native
}
