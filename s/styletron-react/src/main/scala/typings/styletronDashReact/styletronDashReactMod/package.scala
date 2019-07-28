package typings.styletronDashReact

import typings.react.reactMod.ComponentProps
import typings.react.reactMod.ComponentType
import typings.react.reactMod.ElementType
import typings.react.reactMod.FC
import typings.styletronDashReact.Anon_STYLETRON
import typings.styletronDashStandard.styletronDashStandardMod.StandardEngine
import typings.styletronDashStandard.styletronDashStandardMod.StyleObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object styletronDashReactMod {
  type $StyleProp[P /* <: js.Object */] = StyleObject | StyleObjectFn[P]
  type CSSFn = js.Function1[/* style */ StyleObject, String]
  type Reducer = js.Function2[/* style */ StyleObject, /* props */ js.UndefOr[js.Object], StyleObject]
  type StackIndex = Double
  type StyleObjectFn[P /* <: js.Object */] = js.Function1[/* props */ P, StyleObject]
  type StyletronBase = ElementType[js.Any]
  type StyletronComponent[P /* <: js.Object */] = (FC[P with StyletronComponentInjectedProps[P]]) with Anon_STYLETRON
  type StyletronDriver = js.Function2[/* style */ StyleObject, /* styletron */ StandardEngine, String]
  type StyletronGetInitialStyle = js.Function0[StyleObject]
  type StyletronWrapper = js.Function1[/* fc */ FC[js.Any], ComponentType[js.Any]]
  type WithTransformFn = js.Function2[
    /* component */ StyletronComponent[js.Any], 
    /* style */ js.Function2[/* style */ StyleObject, /* props */ js.Object, StyleObject], 
    StyletronComponent[ComponentProps[StyletronComponent[_]] with js.Object]
  ]
  type WithWrapperFn = js.Function2[
    /* component */ StyletronComponent[js.Any], 
    /* wrapper */ js.Function1[/* component */ StyletronComponent[js.Any], ComponentType[js.Object]], 
    StyletronComponent[ComponentProps[StyletronComponent[_]] with js.Object]
  ]
}
