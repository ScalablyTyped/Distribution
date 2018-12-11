package typings
package xtermLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait MediaStreamAudioDestinationNode extends AudioNode {
  val stream: MediaStream = js.native
}

@JSGlobal("MediaStreamAudioDestinationNode")
@js.native
object MediaStreamAudioDestinationNode
  extends ScalablyTyped.runtime.Instantiable1[/* context */ AudioContext, MediaStreamAudioDestinationNode]
     with ScalablyTyped.runtime.Instantiable2[
      /* context */ AudioContext, 
      /* options */ AudioNodeOptions, 
      MediaStreamAudioDestinationNode
    ]

