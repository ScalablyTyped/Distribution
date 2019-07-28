package typings.vegaDashLite.buildSrcCompileDataMod

import typings.std.Partial
import typings.vegaDashLite.buildSrcCompileSplitMod.Split
import typings.vegaDashLite.buildSrcUtilMod.Dict
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("vega-lite/build/src/compile/data", "AncestorParse")
@js.native
class AncestorParse () extends Split[Dict[String]] {
  def this(explicit: Partial[Dict[String]]) = this()
  def this(explicit: Partial[Dict[String]], `implicit`: Partial[Dict[String]]) = this()
  def this(explicit: Partial[Dict[String]], `implicit`: Partial[Dict[String]], parseNothing: Boolean) = this()
  var parseNothing: Boolean = js.native
}

