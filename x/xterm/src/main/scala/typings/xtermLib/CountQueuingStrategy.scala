package typings
package xtermLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CountQueuingStrategy
  extends QueuingStrategy[js.Any] {
  @JSName("highWaterMark")
  var highWaterMark_CountQueuingStrategy: scala.Double
  @JSName("size")
  def size_MCountQueuingStrategy(chunk: js.Any): xtermLib.xtermLibNumbers.`1`
}

@JSGlobal("CountQueuingStrategy")
@js.native
object CountQueuingStrategy
  extends org.scalablytyped.runtime.Instantiable1[/* options */ Anon_HighWaterMarkNumber, CountQueuingStrategy]

