package typings.styletronReact

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object mod {
  type CSSFn = js.Function1[/* style */ typings.styletronStandard.mod.StyleObject, java.lang.String]
  type Reducer = js.Function2[
    /* style */ typings.styletronStandard.mod.StyleObject, 
    /* props */ js.UndefOr[js.Object], 
    typings.styletronStandard.mod.StyleObject
  ]
  type StackIndex = scala.Double
  type StyleObjectFn[P /* <: js.Object */] = js.Function1[/* props */ P, typings.styletronStandard.mod.StyleObject]
  type StyleProp[P /* <: js.Object */] = typings.styletronStandard.mod.StyleObject | typings.styletronReact.mod.StyleObjectFn[P]
  type StyletronBase = typings.react.mod.ElementType[js.Any]
  type StyletronComponent[P /* <: js.Object */] = (typings.react.mod.FC[P with typings.styletronReact.mod.StyletronComponentInjectedProps[P]]) with typings.styletronReact.AnonSTYLETRON
  type StyletronDriver = js.Function2[
    /* style */ typings.styletronStandard.mod.StyleObject, 
    /* styletron */ typings.styletronStandard.mod.StandardEngine, 
    java.lang.String
  ]
  type StyletronGetInitialStyle = js.Function0[typings.styletronStandard.mod.StyleObject]
  type StyletronWrapper = js.Function1[/* fc */ typings.react.mod.FC[js.Any], typings.react.mod.ComponentType[js.Any]]
  type WithTransformFn = js.Function2[
    /* component */ typings.styletronReact.mod.StyletronComponent[js.Any], 
    /* style */ js.Function2[
      /* style */ typings.styletronStandard.mod.StyleObject, 
      /* props */ js.Object, 
      typings.styletronStandard.mod.StyleObject
    ], 
    typings.styletronReact.mod.StyletronComponent[
      typings.react.mod.ComponentProps[typings.styletronReact.mod.StyletronComponent[_]] with js.Object
    ]
  ]
  type WithWrapperFn = js.Function2[
    /* component */ typings.styletronReact.mod.StyletronComponent[js.Any], 
    /* wrapper */ js.Function1[
      /* component */ typings.styletronReact.mod.StyletronComponent[js.Any], 
      typings.react.mod.ComponentType[js.Object]
    ], 
    typings.styletronReact.mod.StyletronComponent[
      typings.react.mod.ComponentProps[typings.styletronReact.mod.StyletronComponent[_]] with js.Object
    ]
  ]
}
