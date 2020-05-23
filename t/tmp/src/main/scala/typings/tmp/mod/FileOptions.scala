package typings.tmp.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait FileOptions extends TmpNameOptions {
  var detachDescriptor: js.UndefOr[Boolean] = js.undefined
  var discardDescriptor: js.UndefOr[Boolean] = js.undefined
  var keep: js.UndefOr[Boolean] = js.undefined
  var mode: js.UndefOr[Double] = js.undefined
}

object FileOptions {
  @scala.inline
  def apply(
    detachDescriptor: js.UndefOr[Boolean] = js.undefined,
    dir: String = null,
    discardDescriptor: js.UndefOr[Boolean] = js.undefined,
    keep: js.UndefOr[Boolean] = js.undefined,
    mode: js.UndefOr[Double] = js.undefined,
    name: String = null,
    postfix: String = null,
    prefix: String = null,
    template: String = null,
    tmpdir: String = null,
    tries: js.UndefOr[Double] = js.undefined
  ): FileOptions = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(detachDescriptor)) __obj.updateDynamic("detachDescriptor")(detachDescriptor.get.asInstanceOf[js.Any])
    if (dir != null) __obj.updateDynamic("dir")(dir.asInstanceOf[js.Any])
    if (!js.isUndefined(discardDescriptor)) __obj.updateDynamic("discardDescriptor")(discardDescriptor.get.asInstanceOf[js.Any])
    if (!js.isUndefined(keep)) __obj.updateDynamic("keep")(keep.get.asInstanceOf[js.Any])
    if (!js.isUndefined(mode)) __obj.updateDynamic("mode")(mode.get.asInstanceOf[js.Any])
    if (name != null) __obj.updateDynamic("name")(name.asInstanceOf[js.Any])
    if (postfix != null) __obj.updateDynamic("postfix")(postfix.asInstanceOf[js.Any])
    if (prefix != null) __obj.updateDynamic("prefix")(prefix.asInstanceOf[js.Any])
    if (template != null) __obj.updateDynamic("template")(template.asInstanceOf[js.Any])
    if (tmpdir != null) __obj.updateDynamic("tmpdir")(tmpdir.asInstanceOf[js.Any])
    if (!js.isUndefined(tries)) __obj.updateDynamic("tries")(tries.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[FileOptions]
  }
}

