package typings
package twigLib.twigMod

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
  var load: js.UndefOr[js.Function1[/* template */ Template, scala.Unit]] = js.undefined
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
    load: /* template */ Template => scala.Unit = null,
    macros: js.Any = null,
    method: js.Any = null,
    name: js.Any = null,
    options: js.Any = null,
    path: js.Any = null
  ): Parameters = {
    val __obj = js.Dynamic.literal()
    if (async != null) __obj.updateDynamic("async")(async)
    if (base != null) __obj.updateDynamic("base")(base)
    if (blocks != null) __obj.updateDynamic("blocks")(blocks)
    if (data != null) __obj.updateDynamic("data")(data)
    if (href != null) __obj.updateDynamic("href")(href)
    if (id != null) __obj.updateDynamic("id")(id)
    if (load != null) __obj.updateDynamic("load")(js.Any.fromFunction1(load))
    if (macros != null) __obj.updateDynamic("macros")(macros)
    if (method != null) __obj.updateDynamic("method")(method)
    if (name != null) __obj.updateDynamic("name")(name)
    if (options != null) __obj.updateDynamic("options")(options)
    if (path != null) __obj.updateDynamic("path")(path)
    __obj.asInstanceOf[Parameters]
  }
}

