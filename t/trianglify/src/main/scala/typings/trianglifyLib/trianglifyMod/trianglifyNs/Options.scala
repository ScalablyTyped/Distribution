package typings
package trianglifyLib.trianglifyMod.trianglifyNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Options extends js.Object {
  /** Size of the cells used to generate a randomized grid */
  var cell_size: js.UndefOr[scala.Double] = js.undefined
  /** Color function f(x, y) that returns a color specification that is consumable by chroma-js */
  var color_function: js.UndefOr[
    (js.Function2[/* x */ scala.Double, /* y */ scala.Double, java.lang.String]) | scala.Null
  ] = js.undefined
  /** Color space used for gradient construction & interpolation */
  var color_space: js.UndefOr[java.lang.String] = js.undefined
  /** Height of pattern */
  var height: js.UndefOr[scala.Double] = js.undefined
  /** An array of [x,y] coordinates to trianglulate. Defaults to undefined, and points are generated. */
  var points: js.UndefOr[js.Array[scala.Double]] = js.undefined
  /** Seed for the RNG */
  var seed: js.UndefOr[scala.Double | java.lang.String | scala.Null] = js.undefined
  /** Width of stroke. Defaults to 1.51 to fix an issue with canvas antialiasing. */
  var stroke_width: js.UndefOr[scala.Double] = js.undefined
  /** how much to randomize the grid */
  var variance: js.UndefOr[scala.Double] = js.undefined
  /** Width of pattern */
  var width: js.UndefOr[scala.Double] = js.undefined
  /** X color stops */
  var x_colors: js.UndefOr[
    trianglifyLib.trianglifyLibNumbers.`false` | java.lang.String | js.Array[java.lang.String]
  ] = js.undefined
  /** Y color stops */
  var y_colors: js.UndefOr[
    trianglifyLib.trianglifyLibNumbers.`false` | java.lang.String | js.Array[java.lang.String]
  ] = js.undefined
}

