package typings.stylenames

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

package object mod {
  
  type StyleValue = js.UndefOr[scala.Null | java.lang.String | typings.stylenames.mod.StyleValueObject]
  
  type StyleValueConditionFunction = js.Function0[js.UndefOr[scala.Boolean | scala.Null]]
  
  type StyleValueObject = typings.std.Record[
    java.lang.String | scala.Double, 
    scala.Boolean | typings.stylenames.mod.StyleValueConditionFunction
  ]
}
