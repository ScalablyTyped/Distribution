package typings.tokenizr

import typings.std.RegExpExecArray
import typings.tokenizr.Anon_Action
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object tokenizrMod {
  type Action = js.ThisFunction3[
    /* this */ ActionContext, 
    /* ctx */ ActionContext, 
    /* found */ RegExpExecArray, 
    /* rule */ Anon_Action, 
    Unit
  ]
  type IToken[T] = Token[T]
  type RuleAction = js.ThisFunction2[/* this */ ActionContext, /* ctx */ ActionContext, /* found */ RegExpExecArray, Unit]
}
