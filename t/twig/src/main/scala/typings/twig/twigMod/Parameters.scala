package typings.twig.twigMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Parameters extends js.Object {
  var async: js.UndefOr[js.Any] = js.undefined
  var base: js.UndefOr[js.Any] = js.undefined
  var blocks: js.UndefOr[js.Any] = js.undefined
  var data: js.UndefOr[js.Any] = js.undefined
  var href: js.UndefOr[js.Any] = js.undefined
  var id: js.UndefOr[js.Any] = js.undefined
  var load: js.UndefOr[js.Function1[/* template */ Template, Unit]] = js.undefined
  var macros: js.UndefOr[js.Any] = js.undefined
  var method: js.UndefOr[js.Any] = js.undefined
  var name: js.UndefOr[js.Any] = js.undefined
  var options: js.UndefOr[js.Any] = js.undefined
  var path: js.UndefOr[js.Any] = js.undefined
}

object Parameters {
  @scala.inline
  def apply(
    async: js.Any = null,
    base: js.Any = null,
    blocks: js.Any = null,
    data: js.Any = null,
    href: js.Any = null,
    id: js.Any = null,
    load: /* template */ Template => Unit = null,
    macros: js.Any = null,
    method: js.Any = null,
    name: js.Any = null,
    options: js.Any = null,
    path: js.Any = null
  ): Parameters = {
    val __obj = js.Dynamic.literal()
    if (async != null) __obj.updateDynamic("async")(async.asInstanceOf[js.Any])
    if (base != null) __obj.updateDynamic("base")(base.asInstanceOf[js.Any])
    if (blocks != null) __obj.updateDynamic("blocks")(blocks.asInstanceOf[js.Any])
    if (data != null) __obj.updateDynamic("data")(data.asInstanceOf[js.Any])
    if (href != null) __obj.updateDynamic("href")(href.asInstanceOf[js.Any])
    if (id != null) __obj.updateDynamic("id")(id.asInstanceOf[js.Any])
    if (load != null) __obj.updateDynamic("load")(js.Any.fromFunction1(load))
    if (macros != null) __obj.updateDynamic("macros")(macros.asInstanceOf[js.Any])
    if (method != null) __obj.updateDynamic("method")(method.asInstanceOf[js.Any])
    if (name != null) __obj.updateDynamic("name")(name.asInstanceOf[js.Any])
    if (options != null) __obj.updateDynamic("options")(options.asInstanceOf[js.Any])
    if (path != null) __obj.updateDynamic("path")(path.asInstanceOf[js.Any])
    __obj.asInstanceOf[Parameters]
  }
}

