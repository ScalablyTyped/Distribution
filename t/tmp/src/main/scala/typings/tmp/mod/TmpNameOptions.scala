package typings.tmp.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TmpNameOptions extends js.Object {
  var dir: js.UndefOr[String] = js.undefined
  var name: js.UndefOr[String] = js.undefined
  var postfix: js.UndefOr[String] = js.undefined
  var prefix: js.UndefOr[String] = js.undefined
  var template: js.UndefOr[String] = js.undefined
  var tmpdir: js.UndefOr[String] = js.undefined
  var tries: js.UndefOr[Double] = js.undefined
}

object TmpNameOptions {
  @scala.inline
  def apply(
    dir: String = null,
    name: String = null,
    postfix: String = null,
    prefix: String = null,
    template: String = null,
    tmpdir: String = null,
    tries: js.UndefOr[Double] = js.undefined
  ): TmpNameOptions = {
    val __obj = js.Dynamic.literal()
    if (dir != null) __obj.updateDynamic("dir")(dir.asInstanceOf[js.Any])
    if (name != null) __obj.updateDynamic("name")(name.asInstanceOf[js.Any])
    if (postfix != null) __obj.updateDynamic("postfix")(postfix.asInstanceOf[js.Any])
    if (prefix != null) __obj.updateDynamic("prefix")(prefix.asInstanceOf[js.Any])
    if (template != null) __obj.updateDynamic("template")(template.asInstanceOf[js.Any])
    if (tmpdir != null) __obj.updateDynamic("tmpdir")(tmpdir.asInstanceOf[js.Any])
    if (!js.isUndefined(tries)) __obj.updateDynamic("tries")(tries.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[TmpNameOptions]
  }
}

