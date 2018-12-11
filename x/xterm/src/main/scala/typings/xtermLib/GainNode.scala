package typings
package xtermLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GainNode extends AudioNode {
  val gain: AudioParam = js.native
}

@JSGlobal("GainNode")
@js.native
object GainNode
  extends ScalablyTyped.runtime.Instantiable1[/* context */ BaseAudioContext, GainNode]
     with ScalablyTyped.runtime.Instantiable2[/* context */ BaseAudioContext, /* options */ GainOptions, GainNode]

