package typings
package xtermLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._


trait ByteLengthQueuingStrategy
  extends QueuingStrategy[stdLib.ArrayBufferView] {
  @JSName("highWaterMark")
  var highWaterMark_ByteLengthQueuingStrategy: scala.Double
  @JSName("size")
  def size_MByteLengthQueuingStrategy(chunk: stdLib.ArrayBufferView): scala.Double
}

@JSGlobal("ByteLengthQueuingStrategy")
@js.native
object ByteLengthQueuingStrategy
  extends ScalablyTyped.runtime.Instantiable1[/* options */ Anon_HighWaterMarkNumber, ByteLengthQueuingStrategy]

