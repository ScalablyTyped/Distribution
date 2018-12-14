package typings
package xtermLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ConvolverNode extends AudioNode {
  var buffer: AudioBuffer | scala.Null = js.native
  var normalize: scala.Boolean = js.native
}

@JSGlobal("ConvolverNode")
@js.native
object ConvolverNode
  extends org.scalablytyped.runtime.Instantiable1[/* context */ BaseAudioContext, ConvolverNode]
     with org.scalablytyped.runtime.Instantiable2[/* context */ BaseAudioContext, /* options */ ConvolverOptions, ConvolverNode]

