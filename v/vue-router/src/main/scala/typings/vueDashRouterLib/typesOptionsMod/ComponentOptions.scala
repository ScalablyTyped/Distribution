package typings
package vueDashRouterLib.typesOptionsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._


trait ComponentOptions[V /* <: vueLib.typesVueMod.Vue */] extends js.Object {
  var beforeRouteEnter: js.UndefOr[vueDashRouterLib.typesRouterMod.NavigationGuard] = js.undefined
  var beforeRouteLeave: js.UndefOr[vueDashRouterLib.typesRouterMod.NavigationGuard] = js.undefined
  var beforeRouteUpdate: js.UndefOr[vueDashRouterLib.typesRouterMod.NavigationGuard] = js.undefined
  var router: js.UndefOr[vueDashRouterLib.typesMod.default] = js.undefined
}

