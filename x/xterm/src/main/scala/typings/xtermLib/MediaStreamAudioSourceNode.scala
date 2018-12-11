package typings
package xtermLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait MediaStreamAudioSourceNode extends AudioNode {
  val mediaStream: MediaStream = js.native
}

@JSGlobal("MediaStreamAudioSourceNode")
@js.native
object MediaStreamAudioSourceNode
  extends ScalablyTyped.runtime.Instantiable2[
      /* context */ AudioContext, 
      /* options */ MediaStreamAudioSourceOptions, 
      MediaStreamAudioSourceNode
    ]

