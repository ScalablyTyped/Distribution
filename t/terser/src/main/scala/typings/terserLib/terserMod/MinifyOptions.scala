package typings
package terserLib.terserMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait MinifyOptions extends js.Object {
  var compress: js.UndefOr[scala.Boolean | CompressOptions] = js.undefined
  var ecma: js.UndefOr[ECMA] = js.undefined
  var ie8: js.UndefOr[scala.Boolean] = js.undefined
  var keep_classnames: js.UndefOr[scala.Boolean | stdLib.RegExp] = js.undefined
  var keep_fnames: js.UndefOr[scala.Boolean | stdLib.RegExp] = js.undefined
  var mangle: js.UndefOr[scala.Boolean | MangleOptions] = js.undefined
  var module: js.UndefOr[scala.Boolean] = js.undefined
  var nameCache: js.UndefOr[js.Object] = js.undefined
  var output: js.UndefOr[OutputOptions] = js.undefined
  var parse: js.UndefOr[ParseOptions] = js.undefined
  var safari10: js.UndefOr[scala.Boolean] = js.undefined
  var sourceMap: js.UndefOr[scala.Boolean | SourceMapOptions] = js.undefined
  var toplevel: js.UndefOr[scala.Boolean] = js.undefined
  var warnings: js.UndefOr[scala.Boolean | terserLib.terserLibStrings.verbose] = js.undefined
}

