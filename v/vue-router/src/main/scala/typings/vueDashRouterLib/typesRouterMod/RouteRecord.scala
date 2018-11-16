package typings
package vueDashRouterLib.typesRouterMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._


trait RouteRecord extends js.Object {
  var beforeEnter: js.UndefOr[
    js.Function3[
      /* route */ Route, 
      /* redirect */ js.Function1[/* location */ RawLocation, scala.Unit], 
      /* next */ js.Function0[scala.Unit], 
      _
    ]
  ] = js.undefined
  var components: Dictionary[Component]
  var instances: Dictionary[vueLib.typesVueMod.Vue]
  var matchAs: js.UndefOr[java.lang.String] = js.undefined
  var meta: js.Any
  var name: js.UndefOr[java.lang.String] = js.undefined
  var parent: js.UndefOr[RouteRecord] = js.undefined
  var path: java.lang.String
  var props: scala.Boolean | js.Object | RoutePropsFunction | (Dictionary[scala.Boolean | js.Object | RoutePropsFunction])
  var redirect: js.UndefOr[RedirectOption] = js.undefined
  var regex: stdLib.RegExp
}

