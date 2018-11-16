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
  
  val m3u: m3u with java.lang.String = js.native
  val windowsMedia: windowsMedia with java.lang.String = js.native
  val zune: zune with java.lang.String = js.native
  @JSBracketAccess
  def apply(value: java.lang.String): js.UndefOr[winrtLib.WindowsNs.MediaNs.PlaylistsNs.PlaylistFormat with java.lang.String] = js.native
}

