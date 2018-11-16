package typings
package winrtDashUwpLib.WindowsNs.MediaNs.PlaylistsNs

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
  sealed trait m3u
    extends winrtDashUwpLib.WindowsNs.MediaNs.PlaylistsNs.PlaylistFormat
  
  /** Windows Media playlist. */
  @js.native
  sealed trait windowsMedia
    extends winrtDashUwpLib.WindowsNs.MediaNs.PlaylistsNs.PlaylistFormat
  
  /** Zune playlist. */
  @js.native
  sealed trait zune
    extends winrtDashUwpLib.WindowsNs.MediaNs.PlaylistsNs.PlaylistFormat
  
  val m3u: m3u with java.lang.String = js.native
  val windowsMedia: windowsMedia with java.lang.String = js.native
  val zune: zune with java.lang.String = js.native
  @JSBracketAccess
  def apply(value: java.lang.String): js.UndefOr[
    winrtDashUwpLib.WindowsNs.MediaNs.PlaylistsNs.PlaylistFormat with java.lang.String
  ] = js.native
}

