package typings.winrt.Windows.Media.Playlists

import org.scalablytyped.runtime.TopLevel
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
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[PlaylistFormat with Double] = js.native
  /* 2 */ @js.native
  object m3u extends TopLevel[m3u with Double]
  
  /* 0 */ @js.native
  object windowsMedia extends TopLevel[windowsMedia with Double]
  
  /* 1 */ @js.native
  object zune extends TopLevel[zune with Double]
  
}

