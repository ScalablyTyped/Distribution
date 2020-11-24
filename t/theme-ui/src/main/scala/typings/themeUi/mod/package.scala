package typings.themeUi

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

package object mod {
  
  type ObjectOrArray[T] = js.Array[T] | (org.scalablytyped.runtime.StringDictionary[
    T | (/* import warning: SimplifyRecursiveTypeAlias.enterTsTypeRef rewrittenOpt applyOrElse Simplified recursive type alias theme-ui.theme-ui.ObjectOrArray<T> */ js.Object)
  ])
  
  type SxComponent[T /* <: typings.themeUi.mod.SxProps */] = typings.react.mod.ComponentClass[T with typings.themeUi.anon.As, typings.react.mod.ComponentState]
  
  type SxStyleProp = typings.styledSystemCss.mod.SystemStyleObject
}
