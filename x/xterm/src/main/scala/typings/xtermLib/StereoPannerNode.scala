package typings
package xtermLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait StereoPannerNode extends AudioNode {
  val pan: AudioParam = js.native
}

@JSGlobal("StereoPannerNode")
@js.native
object StereoPannerNode
  extends ScalablyTyped.runtime.Instantiable1[/* context */ BaseAudioContext, StereoPannerNode]
     with ScalablyTyped.runtime.Instantiable2[/* context */ BaseAudioContext, /* options */ StereoPannerOptions, StereoPannerNode]

