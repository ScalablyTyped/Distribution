package typings.tinajsTina.anon

import org.scalablytyped.runtime.StringDictionary
import typings.std.Partial
import typings.tinajsTina.mod.Component
import typings.tinajsTina.mod.ComponentDefinitions
import typings.tinajsTina.mod.ComponentProperties
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined std.Partial<@tinajs/tina.@tinajs/tina.ComponentDefinitions> */
@js.native
trait PartialComponentDefinitio extends js.Object {
  var attached: js.UndefOr[js.Function0[Unit]] = js.native
  var compute: js.UndefOr[js.Function1[/* data */ StringDictionary[js.Any], StringDictionary[_]]] = js.native
  var created: js.UndefOr[js.Function0[Unit]] = js.native
  var data: js.UndefOr[StringDictionary[js.Any]] = js.native
  var detached: js.UndefOr[js.Function0[Unit]] = js.native
  var methods: js.UndefOr[
    StringDictionary[js.ThisFunction1[/* this */ Component, /* repeated */ js.Any, _]]
  ] = js.native
  var mixins: js.UndefOr[js.Array[Partial[ComponentDefinitions]]] = js.native
  var moved: js.UndefOr[js.Function0[Unit]] = js.native
  var properties: js.UndefOr[ComponentProperties] = js.native
  var ready: js.UndefOr[js.Function0[Unit]] = js.native
}

object PartialComponentDefinitio {
  @scala.inline
  def apply(): PartialComponentDefinitio = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PartialComponentDefinitio]
  }
  @scala.inline
  implicit class PartialComponentDefinitioOps[Self <: PartialComponentDefinitio] (val x: Self) extends AnyVal {
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
    def setAttached(value: () => Unit): Self = this.set("attached", js.Any.fromFunction0(value))
    @scala.inline
    def deleteAttached: Self = this.set("attached", js.undefined)
    @scala.inline
    def setCompute(value: /* data */ StringDictionary[js.Any] => StringDictionary[_]): Self = this.set("compute", js.Any.fromFunction1(value))
    @scala.inline
    def deleteCompute: Self = this.set("compute", js.undefined)
    @scala.inline
    def setCreated(value: () => Unit): Self = this.set("created", js.Any.fromFunction0(value))
    @scala.inline
    def deleteCreated: Self = this.set("created", js.undefined)
    @scala.inline
    def setData(value: StringDictionary[js.Any]): Self = this.set("data", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteData: Self = this.set("data", js.undefined)
    @scala.inline
    def setDetached(value: () => Unit): Self = this.set("detached", js.Any.fromFunction0(value))
    @scala.inline
    def deleteDetached: Self = this.set("detached", js.undefined)
    @scala.inline
    def setMethods(value: StringDictionary[js.ThisFunction1[/* this */ Component, /* repeated */ js.Any, _]]): Self = this.set("methods", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMethods: Self = this.set("methods", js.undefined)
    @scala.inline
    def setMixinsVarargs(value: Partial[ComponentDefinitions]*): Self = this.set("mixins", js.Array(value :_*))
    @scala.inline
    def setMixins(value: js.Array[Partial[ComponentDefinitions]]): Self = this.set("mixins", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMixins: Self = this.set("mixins", js.undefined)
    @scala.inline
    def setMoved(value: () => Unit): Self = this.set("moved", js.Any.fromFunction0(value))
    @scala.inline
    def deleteMoved: Self = this.set("moved", js.undefined)
    @scala.inline
    def setProperties(value: ComponentProperties): Self = this.set("properties", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteProperties: Self = this.set("properties", js.undefined)
    @scala.inline
    def setReady(value: () => Unit): Self = this.set("ready", js.Any.fromFunction0(value))
    @scala.inline
    def deleteReady: Self = this.set("ready", js.undefined)
  }
  
}

