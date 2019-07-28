package typings.vegaDashLite.buildSrcScaleMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SelectionDomain extends _Domain {
  /**
    * The encoding channel to extract selected values for, when a selection is [projected](https://vega.github.io/vega-lite/docs/project.html)
    * over multiple fields or encodings.
    */
  var encoding: js.UndefOr[String] = js.undefined
  /**
    * The field name to extract selected values for, when a selection is [projected](https://vega.github.io/vega-lite/docs/project.html)
    * over multiple fields or encodings.
    */
  var field: js.UndefOr[String] = js.undefined
  /**
    * The name of a selection.
    */
  var selection: js.UndefOr[String] = js.undefined
}

object SelectionDomain {
  @scala.inline
  def apply(encoding: String = null, field: String = null, selection: String = null): SelectionDomain = {
    val __obj = js.Dynamic.literal()
    if (encoding != null) __obj.updateDynamic("encoding")(encoding)
    if (field != null) __obj.updateDynamic("field")(field)
    if (selection != null) __obj.updateDynamic("selection")(selection)
    __obj.asInstanceOf[SelectionDomain]
  }
}

