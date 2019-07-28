package typings.vegaDashLite

import typings.vegaDashLite.buildSrcCompileHeaderMod.LayoutHeaderComponent
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Column extends js.Object {
  var column: js.UndefOr[LayoutHeaderComponent] = js.undefined
  var row: js.UndefOr[LayoutHeaderComponent] = js.undefined
}

object Anon_Column {
  @scala.inline
  def apply(column: LayoutHeaderComponent = null, row: LayoutHeaderComponent = null): Anon_Column = {
    val __obj = js.Dynamic.literal()
    if (column != null) __obj.updateDynamic("column")(column)
    if (row != null) __obj.updateDynamic("row")(row)
    __obj.asInstanceOf[Anon_Column]
  }
}

