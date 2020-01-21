package typings.tokenizr

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object mod {
  type Action = js.ThisFunction3[
    /* this */ typings.tokenizr.mod.ActionContext, 
    /* ctx */ typings.tokenizr.mod.ActionContext, 
    /* found */ typings.std.RegExpExecArray, 
    /* rule */ typings.tokenizr.AnonAction, 
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
