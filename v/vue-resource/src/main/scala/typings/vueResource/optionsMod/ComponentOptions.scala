package typings.vueResource.optionsMod

import typings.vue.vueMod.Vue
import typings.vueResource.anon.Dictkey
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ComponentOptions[V /* <: Vue */] extends js.Object {
  var http: js.UndefOr[
    Dictkey with (/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify HttpOptions */ js.Any)
  ] = js.undefined
}

object ComponentOptions {
  @scala.inline
  def apply[/* <: typings.vue.vueMod.Vue */ V](
    http: Dictkey with (/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify HttpOptions */ js.Any) = null
  ): ComponentOptions[V] = {
    val __obj = js.Dynamic.literal()
    if (http != null) __obj.updateDynamic("http")(http.asInstanceOf[js.Any])
    __obj.asInstanceOf[ComponentOptions[V]]
  }
}

