package typings.tinajsTina

import org.scalablytyped.runtime.StringDictionary
import typings.tinajsTina.mod.Component
import typings.tinajsTina.mod.ComponentProperties
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined std.Partial<@tinajs/tina.@tinajs/tina.ComponentDefinitions> */
trait PartialComponentDefinitioAttached extends js.Object {
  var attached: js.UndefOr[js.Function0[Unit]] = js.undefined
  var compute: js.UndefOr[js.Function1[/* data */ StringDictionary[js.Any], StringDictionary[_]]] = js.undefined
  var created: js.UndefOr[js.Function0[Unit]] = js.undefined
  var data: js.UndefOr[StringDictionary[js.Any]] = js.undefined
  var detached: js.UndefOr[js.Function0[Unit]] = js.undefined
  var methods: js.UndefOr[
    StringDictionary[js.ThisFunction1[/* this */ Component, /* repeated */ js.Any, _]]
  ] = js.undefined
  var mixins: js.UndefOr[js.Array[PartialComponentDefinitio]] = js.undefined
  var moved: js.UndefOr[js.Function0[Unit]] = js.undefined
  var properties: js.UndefOr[ComponentProperties] = js.undefined
  var ready: js.UndefOr[js.Function0[Unit]] = js.undefined
}

object PartialComponentDefinitioAttached {
  @scala.inline
  def apply(
    attached: () => Unit = null,
    compute: /* data */ StringDictionary[js.Any] => StringDictionary[_] = null,
    created: () => Unit = null,
    data: StringDictionary[js.Any] = null,
    detached: () => Unit = null,
    methods: StringDictionary[js.ThisFunction1[/* this */ Component, /* repeated */ js.Any, _]] = null,
    mixins: js.Array[PartialComponentDefinitio] = null,
    moved: () => Unit = null,
    properties: ComponentProperties = null,
    ready: () => Unit = null
  ): PartialComponentDefinitioAttached = {
    val __obj = js.Dynamic.literal()
    if (attached != null) __obj.updateDynamic("attached")(js.Any.fromFunction0(attached))
    if (compute != null) __obj.updateDynamic("compute")(js.Any.fromFunction1(compute))
    if (created != null) __obj.updateDynamic("created")(js.Any.fromFunction0(created))
    if (data != null) __obj.updateDynamic("data")(data.asInstanceOf[js.Any])
    if (detached != null) __obj.updateDynamic("detached")(js.Any.fromFunction0(detached))
    if (methods != null) __obj.updateDynamic("methods")(methods.asInstanceOf[js.Any])
    if (mixins != null) __obj.updateDynamic("mixins")(mixins.asInstanceOf[js.Any])
    if (moved != null) __obj.updateDynamic("moved")(js.Any.fromFunction0(moved))
    if (properties != null) __obj.updateDynamic("properties")(properties.asInstanceOf[js.Any])
    if (ready != null) __obj.updateDynamic("ready")(js.Any.fromFunction0(ready))
    __obj.asInstanceOf[PartialComponentDefinitioAttached]
  }
}

