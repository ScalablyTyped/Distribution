package typings.themeDashUi

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object themeDashUiMod {
  import org.scalablytyped.runtime.StringDictionary
  import typings.atStyledDashSystemCss.atStyledDashSystemCssMod.SystemStyleObject
  import typings.react.reactMod.ComponentClass
  import typings.react.reactMod.ComponentState
  import typings.std.Exclude
  import typings.std.Pick
  import typings.themeDashUi.Anon_As

  type ObjectOrArray[T] = js.Array[T] | (StringDictionary[
    T | (/* import warning: SimplifyRecursiveTypeAlias.enterTsTypeRef rewrittenOpt $anonfun#applyOrElse Simplified recursive type alias theme-ui.theme-ui.ObjectOrArray<T> */ js.Object)
  ])
  type Omit[T, K] = Pick[T, Exclude[String, K]]
  type SxComponent[T /* <: SxProps */] = ComponentClass[T with Anon_As, ComponentState]
  type SxStyleProp = SystemStyleObject
}
