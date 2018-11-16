package typings
package vueDashRouterLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object typesRouterMod {
  type Component = (vueLib.typesOptionsMod.ComponentOptions[
    vueLib.typesVueMod.Vue, 
    vueLib.typesOptionsMod.DefaultData[vueLib.typesVueMod.Vue], 
    vueLib.typesOptionsMod.DefaultMethods[vueLib.typesVueMod.Vue], 
    vueLib.typesOptionsMod.DefaultComputed, 
    vueLib.typesOptionsMod.PropsDefinition[vueLib.typesOptionsMod.DefaultProps], 
    vueLib.typesOptionsMod.DefaultProps
  ]) | vueLib.typesVueMod.VueConstructor[vueLib.typesVueMod.Vue] | (vueLib.typesOptionsMod.AsyncComponent[
    vueLib.typesOptionsMod.DefaultData[scala.Nothing], 
    vueLib.typesOptionsMod.DefaultMethods[scala.Nothing], 
    vueLib.typesOptionsMod.DefaultComputed, 
    vueLib.typesOptionsMod.DefaultProps
  ])
  type NavigationGuard = js.Function3[
    /* to */ Route, 
    /* from */ Route, 
    /* next */ js.Function1[
      /* to */ js.UndefOr[
        RawLocation | vueDashRouterLib.vueDashRouterLibNumbers.`false` | (js.Function1[/* vm */ vueLib.typesVueMod.Vue, js.Any]) | scala.Unit
      ], 
      scala.Unit
    ], 
    js.Any
  ]
  type PositionResult = Position | vueDashRouterLib.Anon_Offset | scala.Unit
  type RawLocation = java.lang.String | Location
  type RedirectOption = RawLocation | (js.Function1[/* to */ Route, RawLocation])
  type RoutePropsFunction = js.Function1[/* route */ Route, js.Object]
  type RouterMode = vueDashRouterLib.vueDashRouterLibStrings.hash | vueDashRouterLib.vueDashRouterLibStrings.history | vueDashRouterLib.vueDashRouterLibStrings.`abstract`
}
