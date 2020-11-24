package typings.tokenizr

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

package object mod {
  
  type Action = js.ThisFunction3[
    /* this */ typings.tokenizr.mod.ActionContext, 
    /* ctx */ typings.tokenizr.mod.ActionContext, 
    /* found */ typings.std.RegExpExecArray, 
    /* rule */ typings.tokenizr.anon.Action, 
    scala.Unit
  ]
  
  type IToken[T] = typings.tokenizr.mod.Token[T]
  
  type RuleAction = js.ThisFunction2[
    /* this */ typings.tokenizr.mod.ActionContext, 
    /* ctx */ typings.tokenizr.mod.ActionContext, 
    /* found */ typings.std.RegExpExecArray, 
    scala.Unit
  ]
}
