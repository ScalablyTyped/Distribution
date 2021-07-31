package typings.vueRouter.routerMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}


type Component = (typings.vue.optionsMod.ComponentOptions[
typings.vue.vueMod.Vue, 
typings.vue.optionsMod.DefaultData[typings.vue.vueMod.Vue], 
typings.vue.optionsMod.DefaultMethods[typings.vue.vueMod.Vue], 
typings.vue.optionsMod.DefaultComputed, 
typings.vue.optionsMod.PropsDefinition[typings.vue.optionsMod.DefaultProps], 
typings.vue.optionsMod.DefaultProps]) | typings.vue.vueMod.VueConstructor[typings.vue.vueMod.Vue] | (typings.vue.optionsMod.AsyncComponent[
typings.vue.optionsMod.DefaultData[scala.Nothing], 
typings.vue.optionsMod.DefaultMethods[scala.Nothing], 
typings.vue.optionsMod.DefaultComputed, 
typings.vue.optionsMod.DefaultProps])

type Dictionary[T] = org.scalablytyped.runtime.StringDictionary[T]

type ErrorHandler = js.Function1[/* err */ typings.std.Error, scala.Unit]

type NavigationGuard[V /* <: typings.vue.vueMod.Vue */] = js.Function3[
/* to */ typings.vueRouter.routerMod.Route, 
/* from */ typings.vueRouter.routerMod.Route, 
/* next */ typings.vueRouter.routerMod.NavigationGuardNext[V], 
js.Any]

type NavigationGuardNext[V /* <: typings.vue.vueMod.Vue */] = js.Function1[
/* to */ js.UndefOr[
  typings.vueRouter.routerMod.RawLocation | typings.vueRouter.vueRouterBooleans.`false` | (js.Function1[/* vm */ V, js.Any]) | scala.Unit
], 
scala.Unit]

/* Rewritten from type alias, can be one of: 
  - typings.vueRouter.routerMod.Position
  - typings.vueRouter.anon.Behavior
  - scala.Unit
*/
type PositionResult = typings.vueRouter.routerMod._PositionResult | scala.Unit

type RawLocation = java.lang.String | typings.vueRouter.routerMod.Location

type RedirectOption = typings.vueRouter.routerMod.RawLocation | (js.Function1[
/* to */ typings.vueRouter.routerMod.Route, 
typings.vueRouter.routerMod.RawLocation])

type RoutePropsFunction = js.Function1[/* route */ typings.vueRouter.routerMod.Route, js.Object]
