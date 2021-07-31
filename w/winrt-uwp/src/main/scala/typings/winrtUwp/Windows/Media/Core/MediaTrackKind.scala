package typings.winrtUwp.Windows.Media.Core

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait MediaTrackKind extends StObject
/** Specifies the type of a media track. */
@JSGlobal("Windows.Media.Core.MediaTrackKind")
@js.native
object MediaTrackKind extends StObject {
  
  /** The track is an audio track. */
  @js.native
  sealed trait audio
    extends StObject
       with MediaTrackKind
  
  /** The track is a timed metadata track. */
  @js.native
  sealed trait timedMetadata
    extends StObject
       with MediaTrackKind
  
  /** The track is a video track. */
  @js.native
  sealed trait video
    extends StObject
       with MediaTrackKind
}
