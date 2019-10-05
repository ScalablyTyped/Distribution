package typings.winrt.Windows.Media.Playlists

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait PlaylistFormat extends js.Object

@JSGlobal("Windows.Media.Playlists.PlaylistFormat")
@js.native
object PlaylistFormat extends js.Object {
  @js.native
  sealed trait m3u extends PlaylistFormat
  
  @js.native
  sealed trait windowsMedia extends PlaylistFormat
  
  @js.native
  sealed trait zune extends PlaylistFormat
  
  /* 2 */ val m3u: typings.winrt.Windows.Media.Playlists.PlaylistFormat.m3u with Double = js.native
  /* 0 */ val windowsMedia: typings.winrt.Windows.Media.Playlists.PlaylistFormat.windowsMedia with Double = js.native
  /* 1 */ val zune: typings.winrt.Windows.Media.Playlists.PlaylistFormat.zune with Double = js.native
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[PlaylistFormat with Double] = js.native
}

