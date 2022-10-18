package typings.winrtUwp.global.Windows.Media

import typings.winrtUwp.Windows.Foundation.EventHandler
import typings.winrtUwp.Windows.Foundation.Uri
import typings.winrtUwp.winrtUwpStrings.channeldownpressed
import typings.winrtUwp.winrtUwpStrings.channeluppressed
import typings.winrtUwp.winrtUwpStrings.fastforwardpressed
import typings.winrtUwp.winrtUwpStrings.nexttrackpressed
import typings.winrtUwp.winrtUwpStrings.pausepressed
import typings.winrtUwp.winrtUwpStrings.playpausetogglepressed
import typings.winrtUwp.winrtUwpStrings.playpressed
import typings.winrtUwp.winrtUwpStrings.previoustrackpressed
import typings.winrtUwp.winrtUwpStrings.recordpressed
import typings.winrtUwp.winrtUwpStrings.rewindpressed
import typings.winrtUwp.winrtUwpStrings.soundlevelchanged
import typings.winrtUwp.winrtUwpStrings.stoppressed
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Describes the object that applications register with, to receive media focus and transport control notifications. */
/* note: abstract class */ @JSGlobal("Windows.Media.MediaControl")
@js.native
open class MediaControl ()
  extends StObject
     with typings.winrtUwp.Windows.Media.MediaControl
object MediaControl {
  
  @JSGlobal("Windows.Media.MediaControl")
  @js.native
  val ^ : js.Any = js.native
  
  /* static member */
  inline def addEventListener(`type`: String, listener: EventHandler[Any]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("addEventListener")(`type`.asInstanceOf[js.Any], listener.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  /* static member */
  inline def addEventListener_channeldownpressed(`type`: channeldownpressed, listener: EventHandler[Any]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("addEventListener")(`type`.asInstanceOf[js.Any], listener.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  /* static member */
  inline def addEventListener_channeluppressed(`type`: channeluppressed, listener: EventHandler[Any]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("addEventListener")(`type`.asInstanceOf[js.Any], listener.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  /* static member */
  inline def addEventListener_fastforwardpressed(`type`: fastforwardpressed, listener: EventHandler[Any]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("addEventListener")(`type`.asInstanceOf[js.Any], listener.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  /* static member */
  inline def addEventListener_nexttrackpressed(`type`: nexttrackpressed, listener: EventHandler[Any]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("addEventListener")(`type`.asInstanceOf[js.Any], listener.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  /* static member */
  inline def addEventListener_pausepressed(`type`: pausepressed, listener: EventHandler[Any]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("addEventListener")(`type`.asInstanceOf[js.Any], listener.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  /* static member */
  inline def addEventListener_playpausetogglepressed(`type`: playpausetogglepressed, listener: EventHandler[Any]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("addEventListener")(`type`.asInstanceOf[js.Any], listener.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  /* static member */
  inline def addEventListener_playpressed(`type`: playpressed, listener: EventHandler[Any]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("addEventListener")(`type`.asInstanceOf[js.Any], listener.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  /* static member */
  inline def addEventListener_previoustrackpressed(`type`: previoustrackpressed, listener: EventHandler[Any]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("addEventListener")(`type`.asInstanceOf[js.Any], listener.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  /* static member */
  inline def addEventListener_recordpressed(`type`: recordpressed, listener: EventHandler[Any]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("addEventListener")(`type`.asInstanceOf[js.Any], listener.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  /* static member */
  inline def addEventListener_rewindpressed(`type`: rewindpressed, listener: EventHandler[Any]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("addEventListener")(`type`.asInstanceOf[js.Any], listener.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  /* static member */
  inline def addEventListener_soundlevelchanged(`type`: soundlevelchanged, listener: EventHandler[Any]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("addEventListener")(`type`.asInstanceOf[js.Any], listener.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  /* static member */
  inline def addEventListener_stoppressed(`type`: stoppressed, listener: EventHandler[Any]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("addEventListener")(`type`.asInstanceOf[js.Any], listener.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  /** Gets or sets the path to the artwork for the album cover. */
  /* static member */
  @JSGlobal("Windows.Media.MediaControl.albumArt")
  @js.native
  def albumArt: Uri = js.native
  inline def albumArt_=(x: Uri): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("albumArt")(x.asInstanceOf[js.Any])
  
  /** Gets or sets the name of the artist. */
  /* static member */
  @JSGlobal("Windows.Media.MediaControl.artistName")
  @js.native
  def artistName: String = js.native
  inline def artistName_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("artistName")(x.asInstanceOf[js.Any])
  
  /** Gets or sets the state of the Play button. */
  /* static member */
  @JSGlobal("Windows.Media.MediaControl.isPlaying")
  @js.native
  def isPlaying: Boolean = js.native
  inline def isPlaying_=(x: Boolean): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("isPlaying")(x.asInstanceOf[js.Any])
  
  /** Event raised when a ChannelDown command is issued to the application. */
  /* static member */
  @JSGlobal("Windows.Media.MediaControl.onchanneldownpressed")
  @js.native
  def onchanneldownpressed: EventHandler[Any] = js.native
  inline def onchanneldownpressed_=(x: EventHandler[Any]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("onchanneldownpressed")(x.asInstanceOf[js.Any])
  
  /** Event raised when a ChannelUp command is issued to the application. */
  /* static member */
  @JSGlobal("Windows.Media.MediaControl.onchanneluppressed")
  @js.native
  def onchanneluppressed: EventHandler[Any] = js.native
  inline def onchanneluppressed_=(x: EventHandler[Any]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("onchanneluppressed")(x.asInstanceOf[js.Any])
  
  /** Event raised when a FastForward command is issued to the application. */
  /* static member */
  @JSGlobal("Windows.Media.MediaControl.onfastforwardpressed")
  @js.native
  def onfastforwardpressed: EventHandler[Any] = js.native
  inline def onfastforwardpressed_=(x: EventHandler[Any]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("onfastforwardpressed")(x.asInstanceOf[js.Any])
  
  /** Event raised when a NextTrack command is issued to the application. */
  /* static member */
  @JSGlobal("Windows.Media.MediaControl.onnexttrackpressed")
  @js.native
  def onnexttrackpressed: EventHandler[Any] = js.native
  inline def onnexttrackpressed_=(x: EventHandler[Any]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("onnexttrackpressed")(x.asInstanceOf[js.Any])
  
  /** Event raised when a Pause command is issued to the application. */
  /* static member */
  @JSGlobal("Windows.Media.MediaControl.onpausepressed")
  @js.native
  def onpausepressed: EventHandler[Any] = js.native
  inline def onpausepressed_=(x: EventHandler[Any]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("onpausepressed")(x.asInstanceOf[js.Any])
  
  /** Event raised when a PlayPauseToggle command is issued to the application. */
  /* static member */
  @JSGlobal("Windows.Media.MediaControl.onplaypausetogglepressed")
  @js.native
  def onplaypausetogglepressed: EventHandler[Any] = js.native
  inline def onplaypausetogglepressed_=(x: EventHandler[Any]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("onplaypausetogglepressed")(x.asInstanceOf[js.Any])
  
  /** Event raised when a Play command is issued to the application. */
  /* static member */
  @JSGlobal("Windows.Media.MediaControl.onplaypressed")
  @js.native
  def onplaypressed: EventHandler[Any] = js.native
  inline def onplaypressed_=(x: EventHandler[Any]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("onplaypressed")(x.asInstanceOf[js.Any])
  
  /** Event raised when a PreviousTrack command is issued to the application. */
  /* static member */
  @JSGlobal("Windows.Media.MediaControl.onprevioustrackpressed")
  @js.native
  def onprevioustrackpressed: EventHandler[Any] = js.native
  inline def onprevioustrackpressed_=(x: EventHandler[Any]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("onprevioustrackpressed")(x.asInstanceOf[js.Any])
  
  /** Event raised when a Record command is issued to the application. */
  /* static member */
  @JSGlobal("Windows.Media.MediaControl.onrecordpressed")
  @js.native
  def onrecordpressed: EventHandler[Any] = js.native
  inline def onrecordpressed_=(x: EventHandler[Any]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("onrecordpressed")(x.asInstanceOf[js.Any])
  
  /** Event raised when a Rewind command is issued to the application. */
  /* static member */
  @JSGlobal("Windows.Media.MediaControl.onrewindpressed")
  @js.native
  def onrewindpressed: EventHandler[Any] = js.native
  inline def onrewindpressed_=(x: EventHandler[Any]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("onrewindpressed")(x.asInstanceOf[js.Any])
  
  /** Event raised when the sound level changes. */
  /* static member */
  @JSGlobal("Windows.Media.MediaControl.onsoundlevelchanged")
  @js.native
  def onsoundlevelchanged: EventHandler[Any] = js.native
  inline def onsoundlevelchanged_=(x: EventHandler[Any]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("onsoundlevelchanged")(x.asInstanceOf[js.Any])
  
  /** Event raised when a Stop command is issued to the application. */
  /* static member */
  @JSGlobal("Windows.Media.MediaControl.onstoppressed")
  @js.native
  def onstoppressed: EventHandler[Any] = js.native
  inline def onstoppressed_=(x: EventHandler[Any]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("onstoppressed")(x.asInstanceOf[js.Any])
  
  /* static member */
  inline def removeEventListener(`type`: String, listener: EventHandler[Any]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("removeEventListener")(`type`.asInstanceOf[js.Any], listener.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  /* static member */
  inline def removeEventListener_channeldownpressed(`type`: channeldownpressed, listener: EventHandler[Any]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("removeEventListener")(`type`.asInstanceOf[js.Any], listener.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  /* static member */
  inline def removeEventListener_channeluppressed(`type`: channeluppressed, listener: EventHandler[Any]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("removeEventListener")(`type`.asInstanceOf[js.Any], listener.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  /* static member */
  inline def removeEventListener_fastforwardpressed(`type`: fastforwardpressed, listener: EventHandler[Any]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("removeEventListener")(`type`.asInstanceOf[js.Any], listener.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  /* static member */
  inline def removeEventListener_nexttrackpressed(`type`: nexttrackpressed, listener: EventHandler[Any]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("removeEventListener")(`type`.asInstanceOf[js.Any], listener.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  /* static member */
  inline def removeEventListener_pausepressed(`type`: pausepressed, listener: EventHandler[Any]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("removeEventListener")(`type`.asInstanceOf[js.Any], listener.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  /* static member */
  inline def removeEventListener_playpausetogglepressed(`type`: playpausetogglepressed, listener: EventHandler[Any]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("removeEventListener")(`type`.asInstanceOf[js.Any], listener.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  /* static member */
  inline def removeEventListener_playpressed(`type`: playpressed, listener: EventHandler[Any]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("removeEventListener")(`type`.asInstanceOf[js.Any], listener.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  /* static member */
  inline def removeEventListener_previoustrackpressed(`type`: previoustrackpressed, listener: EventHandler[Any]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("removeEventListener")(`type`.asInstanceOf[js.Any], listener.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  /* static member */
  inline def removeEventListener_recordpressed(`type`: recordpressed, listener: EventHandler[Any]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("removeEventListener")(`type`.asInstanceOf[js.Any], listener.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  /* static member */
  inline def removeEventListener_rewindpressed(`type`: rewindpressed, listener: EventHandler[Any]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("removeEventListener")(`type`.asInstanceOf[js.Any], listener.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  /* static member */
  inline def removeEventListener_soundlevelchanged(`type`: soundlevelchanged, listener: EventHandler[Any]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("removeEventListener")(`type`.asInstanceOf[js.Any], listener.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  /* static member */
  inline def removeEventListener_stoppressed(`type`: stoppressed, listener: EventHandler[Any]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("removeEventListener")(`type`.asInstanceOf[js.Any], listener.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  /** Gets the current sound level. */
  /* static member */
  @JSGlobal("Windows.Media.MediaControl.soundLevel")
  @js.native
  def soundLevel: typings.winrtUwp.Windows.Media.SoundLevel = js.native
  inline def soundLevel_=(x: typings.winrtUwp.Windows.Media.SoundLevel): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("soundLevel")(x.asInstanceOf[js.Any])
  
  /** Gets or sets the track name. */
  /* static member */
  @JSGlobal("Windows.Media.MediaControl.trackName")
  @js.native
  def trackName: String = js.native
  inline def trackName_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("trackName")(x.asInstanceOf[js.Any])
}
