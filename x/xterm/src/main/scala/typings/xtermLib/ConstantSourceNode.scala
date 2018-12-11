package typings
package xtermLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ConstantSourceNode extends AudioScheduledSourceNode {
  val offset: AudioParam = js.native
}

@JSGlobal("ConstantSourceNode")
@js.native
object ConstantSourceNode
  extends ScalablyTyped.runtime.Instantiable1[/* context */ BaseAudioContext, ConstantSourceNode]
     with ScalablyTyped.runtime.Instantiable2[
      /* context */ BaseAudioContext, 
      /* options */ ConstantSourceOptions, 
      ConstantSourceNode
    ]

