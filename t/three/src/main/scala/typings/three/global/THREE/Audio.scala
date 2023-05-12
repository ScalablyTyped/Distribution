package typings.three.global.THREE

import typings.std.AudioNode
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSGlobal("THREE.Audio")
@js.native
open class Audio[NodeType /* <: AudioNode */] protected ()
  extends typings.three.mod.Audio[NodeType] {
  /**
    * Create a new instance of {@link Audio}
    * @param listener (required) {@link AudioListener | AudioListener} instance.
    */
  def this(listener: typings.three.srcAudioAudioListenerMod.AudioListener) = this()
}
