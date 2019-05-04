package typings
package vegaDashLiteLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Column extends js.Object {
  var column: js.UndefOr[vegaDashLiteLib.buildSrcCompileHeaderMod.LayoutHeaderComponent] = js.undefined
  var row: js.UndefOr[vegaDashLiteLib.buildSrcCompileHeaderMod.LayoutHeaderComponent] = js.undefined
}

object Anon_Column {
  @scala.inline
  def apply(
    column: vegaDashLiteLib.buildSrcCompileHeaderMod.LayoutHeaderComponent = null,
    row: vegaDashLiteLib.buildSrcCompileHeaderMod.LayoutHeaderComponent = null
  ): Anon_Column = {
    val __obj = js.Dynamic.literal()
    if (column != null) __obj.updateDynamic("column")(column)
    if (row != null) __obj.updateDynamic("row")(row)
    __obj.asInstanceOf[Anon_Column]
  }
}

