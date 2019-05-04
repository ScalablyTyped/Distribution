package typings
package vegaDashEmbedLib.vegaDashEmbedMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Actions extends js.Object {
  var compiled: js.UndefOr[scala.Boolean] = js.undefined
  var editor: js.UndefOr[scala.Boolean] = js.undefined
  var export: js.UndefOr[scala.Boolean | vegaDashEmbedLib.Anon_Png] = js.undefined
  var source: js.UndefOr[scala.Boolean] = js.undefined
}

object Actions {
  @scala.inline
  def apply(
    compiled: js.UndefOr[scala.Boolean] = js.undefined,
    editor: js.UndefOr[scala.Boolean] = js.undefined,
    export: scala.Boolean | vegaDashEmbedLib.Anon_Png = null,
    source: js.UndefOr[scala.Boolean] = js.undefined
  ): Actions = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(compiled)) __obj.updateDynamic("compiled")(compiled)
    if (!js.isUndefined(editor)) __obj.updateDynamic("editor")(editor)
    if (export != null) __obj.updateDynamic("export")(export.asInstanceOf[js.Any])
    if (!js.isUndefined(source)) __obj.updateDynamic("source")(source)
    __obj.asInstanceOf[Actions]
  }
}

