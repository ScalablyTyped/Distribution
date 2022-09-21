package typings.videoJs.mod.videojs

import typings.std.SourceBuffer
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait VideojsAudioTrack
  extends StObject
     with Track {
  
  var enabled: Boolean = js.native
  
  val sourceBuffer: SourceBuffer | Null = js.native
}
