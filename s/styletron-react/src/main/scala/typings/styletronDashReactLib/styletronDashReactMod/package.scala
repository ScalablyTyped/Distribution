package typings
package styletronDashReactLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object styletronDashReactMod {
  type CSSFn = js.Function1[
    /* style */ styletronDashStandardLib.styletronDashStandardMod.StyleObject, 
    java.lang.String
  ]
  type Reducer = js.Function2[
    /* style */ styletronDashStandardLib.styletronDashStandardMod.StyleObject, 
    /* props */ js.UndefOr[js.Object], 
    styletronDashStandardLib.styletronDashStandardMod.StyleObject
  ]
  type StackIndex = scala.Double
  type StyletronBase = reactLib.reactMod.ElementType[js.Any]
  type StyletronComponent[Props] = reactLib.reactMod.FC[Props] with styletronDashReactLib.Anon_STYLETRON
  type StyletronDriver = js.Function2[
    /* style */ styletronDashStandardLib.styletronDashStandardMod.StyleObject, 
    /* styletron */ styletronDashStandardLib.styletronDashStandardMod.StandardEngine, 
    java.lang.String
  ]
  type StyletronGetInitialStyle = js.Function0[styletronDashStandardLib.styletronDashStandardMod.StyleObject]
  type StyletronWrapper = js.Function1[/* fc */ reactLib.reactMod.FC[js.Any], reactLib.reactMod.ComponentType[js.Any]]
  type WithTransformFn = js.Function2[
    /* component */ StyletronComponent[js.Any], 
    /* style */ js.Function2[
      /* style */ styletronDashStandardLib.styletronDashStandardMod.StyleObject, 
      /* props */ js.Object, 
      styletronDashStandardLib.styletronDashStandardMod.StyleObject
    ], 
    StyletronComponent[reactLib.reactMod.ComponentProps[StyletronComponent[_]] with js.Object]
  ]
  type WithWrapperFn = js.Function2[
    /* component */ StyletronComponent[js.Any], 
    /* wrapper */ js.Function1[
      /* component */ StyletronComponent[js.Any], 
      reactLib.reactMod.ComponentType[js.Object]
    ], 
    StyletronComponent[reactLib.reactMod.ComponentProps[StyletronComponent[_]] with js.Object]
  ]
}
