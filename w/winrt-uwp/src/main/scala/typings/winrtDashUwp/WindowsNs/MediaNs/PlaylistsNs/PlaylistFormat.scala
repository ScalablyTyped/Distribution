package typings.winrtDashUwp.WindowsNs.MediaNs.PlaylistsNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait PlaylistFormat extends js.Object

/** Indicates the format of a playlist file. */
@JSGlobal("Windows.Media.Playlists.PlaylistFormat")
@js.native
object PlaylistFormat extends js.Object {
  /** M3U playlist. */
  @js.native
  sealed trait m3u extends PlaylistFormat
  
  /** Windows Media playlist. */
  @js.native
  sealed trait windowsMedia extends PlaylistFormat
  
  /** Zune playlist. */
  @js.native
  sealed trait zune extends PlaylistFormat
  
  /* 2 */ val m3u: typings.winrtDashUwp.WindowsNs.MediaNs.PlaylistsNs.PlaylistFormat.m3u with Double = js.native
  /* 0 */ val windowsMedia: typings.winrtDashUwp.WindowsNs.MediaNs.PlaylistsNs.PlaylistFormat.windowsMedia with Double = js.native
  /* 1 */ val zune: typings.winrtDashUwp.WindowsNs.MediaNs.PlaylistsNs.PlaylistFormat.zune with Double = js.native
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[PlaylistFormat with Double] = js.native
}

