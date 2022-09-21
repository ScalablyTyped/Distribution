package typings.three.threeMod

import typings.std.AudioNode
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("three/src/Three", "Audio")
@js.native
open class Audio[NodeType /* <: AudioNode */] protected ()
  extends typings.three.audioMod.Audio[NodeType] {
  def this(listener: typings.three.audioListenerMod.AudioListener) = this()
}
