package typings.wicgMediasession

import typings.wicgMediasession.anon.RequiredPickMediaSessionA
import typings.wicgMediasession.wicgMediasessionStrings.seekto
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait MediaSession extends StObject {
  
  // Current media session meta data.
  var metadata: MediaMetadata | Null = js.native
  
  // Current media session playback state.
  var playbackState: MediaSessionPlaybackState = js.native
  
  def setActionHandler(action: MediaSessionAction): Unit = js.native
  def setActionHandler(action: MediaSessionAction, listener: js.Function1[/* details */ MediaSessionActionDetails, Unit]): Unit = js.native
  // Set/Unset actions handlers.
  @JSName("setActionHandler")
  def setActionHandler_seekto(action: seekto): Unit = js.native
  @JSName("setActionHandler")
  def setActionHandler_seekto(action: seekto, listener: js.Function1[/* details */ RequiredPickMediaSessionA, Unit]): Unit = js.native
  
  // Set/unset position state
  var setPositionState: js.UndefOr[SetPositionState] = js.native
}
