package typings.atXstyledSystem

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object atXstyledSystemMod {
  import org.scalablytyped.runtime.StringDictionary

  type AliasKey = String
  type BreakPointsRules = StringDictionary[js.Any]
  type ObjectOrArray[T] = js.Array[T] | (StringDictionary[
    T | (/* import warning: SimplifyRecursiveTypeAlias.enterTsTypeRef rewrittenOpt applyOrElse Simplified recursive type alias @xstyled/system.@xstyled/system.ObjectOrArray<T> */ js.Object)
  ])
  type ResponsiveValue[T] = T | StringDictionary[T]
  type StyledSystemLength = String | Double
  type ThemeGetterFunc = js.Function1[/* props */ js.Any, js.Any]
  type ThemeGetterValue = String | Double
}
