package typings
package winrtLib.WindowsNs.MediaNs.PlaylistsNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait PlaylistFormat extends js.Object

@JSGlobal("Windows.Media.Playlists.PlaylistFormat")
@js.native
object PlaylistFormat extends js.Object {
  @js.native
  sealed trait m3u
    extends winrtLib.WindowsNs.MediaNs.PlaylistsNs.PlaylistFormat
  
  @js.native
  sealed trait windowsMedia
    extends winrtLib.WindowsNs.MediaNs.PlaylistsNs.PlaylistFormat
  
  @js.native
  sealed trait zune
    extends winrtLib.WindowsNs.MediaNs.PlaylistsNs.PlaylistFormat
  
  /* 2 */ val m3u: m3u with scala.Double = js.native
  /* 0 */ val windowsMedia: windowsMedia with scala.Double = js.native
  /* 1 */ val zune: zune with scala.Double = js.native
  @JSBracketAccess
  def apply(value: scala.Double): js.UndefOr[winrtLib.WindowsNs.MediaNs.PlaylistsNs.PlaylistFormat with scala.Double] = js.native
}

