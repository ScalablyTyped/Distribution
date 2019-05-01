package typings
package tokenizrLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object tokenizrMod {
  type Action = js.ThisFunction3[
    /* this */ ActionContext, 
    /* ctx */ ActionContext, 
    /* found */ stdLib.RegExpExecArray, 
    /* rule */ tokenizrLib.Anon_Action, 
    scala.Unit
  ]
  type RuleAction = js.ThisFunction2[
    /* this */ ActionContext, 
    /* ctx */ ActionContext, 
    /* found */ stdLib.RegExpExecArray, 
    scala.Unit
  ]
}
