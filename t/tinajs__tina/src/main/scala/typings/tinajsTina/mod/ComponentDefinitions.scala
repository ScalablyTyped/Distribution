package typings.tinajsTina.mod

import org.scalablytyped.runtime.StringDictionary
import typings.tinajsTina.anon.PartialComponentDefinitio
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ComponentDefinitions extends ComponentLifecycles {
  var data: StringDictionary[js.Any] = js.native
  var methods: StringDictionary[js.ThisFunction1[/* this */ Component, /* repeated */ js.Any, _]] = js.native
  var mixins: js.Array[PartialComponentDefinitio] = js.native
  var properties: ComponentProperties = js.native
  def compute(data: StringDictionary[js.Any]): StringDictionary[js.Any] = js.native
}

object ComponentDefinitions {
  @scala.inline
  def apply(
    attached: () => Unit,
    compute: StringDictionary[js.Any] => StringDictionary[js.Any],
    created: () => Unit,
    data: StringDictionary[js.Any],
    detached: () => Unit,
    methods: StringDictionary[js.ThisFunction1[/* this */ Component, /* repeated */ js.Any, _]],
    mixins: js.Array[PartialComponentDefinitio],
    moved: () => Unit,
    properties: ComponentProperties,
    ready: () => Unit
  ): ComponentDefinitions = {
    val __obj = js.Dynamic.literal(attached = js.Any.fromFunction0(attached), compute = js.Any.fromFunction1(compute), created = js.Any.fromFunction0(created), data = data.asInstanceOf[js.Any], detached = js.Any.fromFunction0(detached), methods = methods.asInstanceOf[js.Any], mixins = mixins.asInstanceOf[js.Any], moved = js.Any.fromFunction0(moved), properties = properties.asInstanceOf[js.Any], ready = js.Any.fromFunction0(ready))
    __obj.asInstanceOf[ComponentDefinitions]
  }
  @scala.inline
  implicit class ComponentDefinitionsOps[Self <: ComponentDefinitions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setCompute(value: StringDictionary[js.Any] => StringDictionary[js.Any]): Self = this.set("compute", js.Any.fromFunction1(value))
    @scala.inline
    def setData(value: StringDictionary[js.Any]): Self = this.set("data", value.asInstanceOf[js.Any])
    @scala.inline
    def setMethods(value: StringDictionary[js.ThisFunction1[/* this */ Component, /* repeated */ js.Any, _]]): Self = this.set("methods", value.asInstanceOf[js.Any])
    @scala.inline
    def setMixinsVarargs(value: PartialComponentDefinitio*): Self = this.set("mixins", js.Array(value :_*))
    @scala.inline
    def setMixins(value: js.Array[PartialComponentDefinitio]): Self = this.set("mixins", value.asInstanceOf[js.Any])
    @scala.inline
    def setProperties(value: ComponentProperties): Self = this.set("properties", value.asInstanceOf[js.Any])
  }
  
}

