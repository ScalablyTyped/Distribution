package typings
package vegaDashLiteLib.buildSrcScaleMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SelectionDomain extends _Domain {
  /**
    * The encoding channel to extract selected values for, when a selection is [projected](https://vega.github.io/vega-lite/docs/project.html)
    * over multiple fields or encodings.
    */
  var encoding: js.UndefOr[java.lang.String] = js.native
  /**
    * The field name to extract selected values for, when a selection is [projected](https://vega.github.io/vega-lite/docs/project.html)
    * over multiple fields or encodings.
    */
  var field: js.UndefOr[java.lang.String] = js.native
  /**
    * The name of a selection.
    */
  var selection: js.UndefOr[java.lang.String] = js.native
}

