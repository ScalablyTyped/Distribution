package typings.stylableCore

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

package object selectorUtilsMod {
  
  type Visitor = js.Function3[
    /* node */ typings.stylableCore.selectorUtilsMod.SelectorAstNode, 
    /* index */ scala.Double, 
    /* nodes */ js.Array[typings.stylableCore.selectorUtilsMod.SelectorAstNode], 
    scala.Boolean | scala.Unit
  ]
}
