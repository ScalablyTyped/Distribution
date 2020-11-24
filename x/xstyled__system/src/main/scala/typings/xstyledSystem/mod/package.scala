package typings.xstyledSystem

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

package object mod {
  
  type AliasKey = java.lang.String
  
  type BreakPointsRules = org.scalablytyped.runtime.StringDictionary[js.Any]
  
  type ObjectOrArray[T] = js.Array[T] | (org.scalablytyped.runtime.StringDictionary[
    T | (/* import warning: SimplifyRecursiveTypeAlias.enterTsTypeRef rewrittenOpt applyOrElse Simplified recursive type alias @xstyled/system.@xstyled/system.ObjectOrArray<T> */ js.Object)
  ])
  
  type ResponsiveValue[T] = T | js.Array[T] | org.scalablytyped.runtime.StringDictionary[T]
  
  type StyledSystemLength = java.lang.String | scala.Double
  
  type ThemeGetterFunc = js.Function1[/* props */ js.Any, js.Any]
  
  type ThemeGetterValue = java.lang.String | scala.Double
}
