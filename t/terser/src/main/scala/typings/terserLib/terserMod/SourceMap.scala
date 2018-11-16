package typings
package terserLib.terserMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SourceMap extends js.Object {
  def add(
    source: java.lang.String,
    gen_line: scala.Double,
    gen_col: scala.Double,
    orig_line: scala.Double,
    orig_col: scala.Double
  ): scala.Unit = js.native
  def add(
    source: java.lang.String,
    gen_line: scala.Double,
    gen_col: scala.Double,
    orig_line: scala.Double,
    orig_col: scala.Double,
    name: java.lang.String
  ): scala.Unit = js.native
  def get(): sourceDashMapLib.sourceDashMapMod.SourceMapGenerator = js.native
}

