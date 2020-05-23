package typings.xmlFormatter.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Options extends js.Object {
  var collapseContent: js.UndefOr[Boolean] = js.undefined
  var debug: js.UndefOr[Boolean] = js.undefined
  var indentation: js.UndefOr[String] = js.undefined
  var stripComments: js.UndefOr[Boolean] = js.undefined
}

object Options {
  @scala.inline
  def apply(
    collapseContent: js.UndefOr[Boolean] = js.undefined,
    debug: js.UndefOr[Boolean] = js.undefined,
    indentation: String = null,
    stripComments: js.UndefOr[Boolean] = js.undefined
  ): Options = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(collapseContent)) __obj.updateDynamic("collapseContent")(collapseContent.get.asInstanceOf[js.Any])
    if (!js.isUndefined(debug)) __obj.updateDynamic("debug")(debug.get.asInstanceOf[js.Any])
    if (indentation != null) __obj.updateDynamic("indentation")(indentation.asInstanceOf[js.Any])
    if (!js.isUndefined(stripComments)) __obj.updateDynamic("stripComments")(stripComments.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[Options]
  }
}

