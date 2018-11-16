package typings
package uglifyDashJsLib.uglifyDashJsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._


trait MinifyOptions extends js.Object {
  var compress: js.UndefOr[scala.Boolean | CompressOptions] = js.undefined
  var ie8: js.UndefOr[scala.Boolean] = js.undefined
  var keep_fnames: js.UndefOr[scala.Boolean] = js.undefined
  var mangle: js.UndefOr[scala.Boolean | MangleOptions] = js.undefined
  var nameCache: js.UndefOr[js.Object] = js.undefined
  var output: js.UndefOr[OutputOptions] = js.undefined
  var parse: js.UndefOr[ParseOptions] = js.undefined
  var sourceMap: js.UndefOr[scala.Boolean | SourceMapOptions] = js.undefined
  var toplevel: js.UndefOr[scala.Boolean] = js.undefined
  /** Pass true to return compressor warnings in result.warnings. Use the value `verbose` for more detailed warnings. */
  var warnings: js.UndefOr[scala.Boolean | uglifyDashJsLib.uglifyDashJsLibStrings.verbose] = js.undefined
}

