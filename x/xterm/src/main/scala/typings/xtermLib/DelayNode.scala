package typings
package xtermLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DelayNode extends AudioNode {
  val delayTime: AudioParam = js.native
}

@JSGlobal("DelayNode")
@js.native
object DelayNode
  extends org.scalablytyped.runtime.Instantiable1[/* context */ BaseAudioContext, DelayNode]
     with org.scalablytyped.runtime.Instantiable2[/* context */ BaseAudioContext, /* options */ DelayOptions, DelayNode]

