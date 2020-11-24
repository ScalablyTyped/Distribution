package typings.winrt.Windows.Media.Playlists

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

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
}
