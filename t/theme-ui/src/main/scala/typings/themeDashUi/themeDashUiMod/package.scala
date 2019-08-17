package typings.themeDashUi

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object themeDashUiMod {
  import org.scalablytyped.runtime.StringDictionary
  import typings.atStyledDashSystemCss.atStyledDashSystemCssMod.ResponsiveStyleValue
  import typings.atStyledDashSystemCss.atStyledDashSystemCssMod.SystemStyleObject
  import typings.csstype.csstypeMod.ColorProperty
  import typings.react.reactMod.ComponentClass
  import typings.react.reactMod.ComponentState
  import typings.std.Record
  import typings.themeDashUi.Anon_As

  type ObjectOrArray[T] = js.Array[T] | (StringDictionary[
    T | (/* import warning: SimplifyRecursiveTypeAlias.enterTsTypeRef rewrittenOpt $anonfun#applyOrElse Simplified recursive type alias theme-ui.theme-ui.ObjectOrArray<T> */ js.Object)
  ])
  type SSColors = js.UndefOr[typings.styledDashSystem.styledDashSystemMod.ObjectOrArray[ColorProperty]]
  type SxComponent[T /* <: SxProps */] = ComponentClass[T with Anon_As, ComponentState]
  type SxStyleProp = SystemStyleObject with (Record[
    String, 
    SystemStyleObject | (ResponsiveStyleValue[Double | String]) | (Record[String, SystemStyleObject | (ResponsiveStyleValue[Double | String])])
  ])
}
