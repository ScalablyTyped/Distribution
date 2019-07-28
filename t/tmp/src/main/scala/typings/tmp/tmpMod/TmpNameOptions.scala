package typings.tmp.tmpMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TmpNameOptions extends js.Object {
  var dir: js.UndefOr[String] = js.undefined
  var postfix: js.UndefOr[String] = js.undefined
  var prefix: js.UndefOr[String] = js.undefined
  var template: js.UndefOr[String] = js.undefined
  var tries: js.UndefOr[Double] = js.undefined
}

object TmpNameOptions {
  @scala.inline
  def apply(
    dir: String = null,
    postfix: String = null,
    prefix: String = null,
    template: String = null,
    tries: Int | Double = null
  ): TmpNameOptions = {
    val __obj = js.Dynamic.literal()
    if (dir != null) __obj.updateDynamic("dir")(dir)
    if (postfix != null) __obj.updateDynamic("postfix")(postfix)
    if (prefix != null) __obj.updateDynamic("prefix")(prefix)
    if (template != null) __obj.updateDynamic("template")(template)
    if (tries != null) __obj.updateDynamic("tries")(tries.asInstanceOf[js.Any])
    __obj.asInstanceOf[TmpNameOptions]
  }
}

