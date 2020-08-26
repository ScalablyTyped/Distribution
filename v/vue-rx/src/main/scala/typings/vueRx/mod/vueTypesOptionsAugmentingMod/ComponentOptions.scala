package typings.vueRx.mod.vueTypesOptionsAugmentingMod

import typings.std.Record
import typings.vue.vueMod.Vue
import typings.vueRx.mod.Observables
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ComponentOptions[V /* <: Vue */] extends js.Object {
  var domStreams: js.UndefOr[js.Array[String]] = js.native
  var observableMethods: js.UndefOr[js.Array[String] | (Record[String, String])] = js.native
  var subscriptions: js.UndefOr[Observables | (js.ThisFunction0[/* this */ V, Observables])] = js.native
}

object ComponentOptions {
  @scala.inline
  def apply[/* <: typings.vue.vueMod.Vue */ V](): ComponentOptions[V] = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ComponentOptions[V]]
  }
  @scala.inline
  implicit class ComponentOptionsOps[Self <: ComponentOptions[_], /* <: typings.vue.vueMod.Vue */ V] (val x: Self with ComponentOptions[V]) extends AnyVal {
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
    def setDomStreamsVarargs(value: String*): Self = this.set("domStreams", js.Array(value :_*))
    @scala.inline
    def setDomStreams(value: js.Array[String]): Self = this.set("domStreams", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDomStreams: Self = this.set("domStreams", js.undefined)
    @scala.inline
    def setObservableMethodsVarargs(value: String*): Self = this.set("observableMethods", js.Array(value :_*))
    @scala.inline
    def setObservableMethods(value: js.Array[String] | (Record[String, String])): Self = this.set("observableMethods", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteObservableMethods: Self = this.set("observableMethods", js.undefined)
    @scala.inline
    def setSubscriptions(value: Observables | (js.ThisFunction0[/* this */ V, Observables])): Self = this.set("subscriptions", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSubscriptions: Self = this.set("subscriptions", js.undefined)
  }
  
}

