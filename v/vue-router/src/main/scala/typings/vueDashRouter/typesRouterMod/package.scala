package typings.vueDashRouter

import org.scalablytyped.runtime.StringDictionary
import typings.std.Error
import typings.vue.typesOptionsMod.AsyncComponent
import typings.vue.typesOptionsMod.ComponentOptions
import typings.vue.typesOptionsMod.DefaultComputed
import typings.vue.typesOptionsMod.DefaultData
import typings.vue.typesOptionsMod.DefaultMethods
import typings.vue.typesOptionsMod.DefaultProps
import typings.vue.typesOptionsMod.PropsDefinition
import typings.vue.typesVueMod.Vue
import typings.vue.typesVueMod.VueConstructor
import typings.vueDashRouter.vueDashRouterNumbers.`false`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object typesRouterMod {
  type Component = (ComponentOptions[
    Vue, 
    DefaultData[Vue], 
    DefaultMethods[Vue], 
    DefaultComputed, 
    PropsDefinition[DefaultProps], 
    DefaultProps
  ]) | VueConstructor[Vue] | (AsyncComponent[
    DefaultData[scala.Nothing], 
    DefaultMethods[scala.Nothing], 
    DefaultComputed, 
    DefaultProps
  ])
  type Dictionary[T] = StringDictionary[T]
  type ErrorHandler = js.Function1[/* err */ Error, Unit]
  type NavigationGuard[V /* <: Vue */] = js.Function3[
    /* to */ Route, 
    /* from */ Route, 
    /* next */ js.Function1[
      /* to */ js.UndefOr[RawLocation | `false` | (js.Function1[/* vm */ V, js.Any]) | Unit], 
      Unit
    ], 
    js.Any
  ]
  /* Rewritten from type alias, can be one of: 
    - typings.vueDashRouter.typesRouterMod.Position
    - typings.vueDashRouter.Anon_Offset
    - scala.Unit
  */
  type PositionResult = _PositionResult | Unit
  type RawLocation = String | Location
  type RedirectOption = RawLocation | (js.Function1[/* to */ Route, RawLocation])
  type RoutePropsFunction = js.Function1[/* route */ Route, js.Object]
}
