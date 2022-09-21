package typings.tizenCommonWeb.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait MediaControllerPlaylistUpdatedCallback extends StObject {
  
  /**
    * Event triggered when playlist is removed from database.
    *
    * @param serverName Name of server which triggered the event.
    * @param playlistName Name of playlist for which the event was triggered.
    */
  def onplaylistdeleted(serverName: String, playlistName: String): Unit
  
  /**
    * Event triggered when playlist is updated in database.
    *
    * @param serverName Name of server which triggered the event.
    * @param playlist Playlist for which event was triggered.
    */
  def onplaylistupdated(serverName: String, playlist: MediaControllerPlaylist): Unit
}
object MediaControllerPlaylistUpdatedCallback {
  
  inline def apply(
    onplaylistdeleted: (String, String) => Unit,
    onplaylistupdated: (String, MediaControllerPlaylist) => Unit
  ): MediaControllerPlaylistUpdatedCallback = {
    val __obj = js.Dynamic.literal(onplaylistdeleted = js.Any.fromFunction2(onplaylistdeleted), onplaylistupdated = js.Any.fromFunction2(onplaylistupdated))
    __obj.asInstanceOf[MediaControllerPlaylistUpdatedCallback]
  }
  
  extension [Self <: MediaControllerPlaylistUpdatedCallback](x: Self) {
    
    inline def setOnplaylistdeleted(value: (String, String) => Unit): Self = StObject.set(x, "onplaylistdeleted", js.Any.fromFunction2(value))
    
    inline def setOnplaylistupdated(value: (String, MediaControllerPlaylist) => Unit): Self = StObject.set(x, "onplaylistupdated", js.Any.fromFunction2(value))
  }
}
