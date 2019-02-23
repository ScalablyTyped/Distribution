package typings

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object tokenizrLib {
  type Action = js.ThisFunction3[
    /* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify ActionContext */ /* this */ js.Any, 
    /* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify ActionContext */ /* ctx */ js.Any, 
    /* found */ stdLib.RegExpExecArray, 
    /* rule */ Anon_Action, 
    scala.Unit
  ]
  type RuleAction = js.ThisFunction2[
    /* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify ActionContext */ /* this */ js.Any, 
    /* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify ActionContext */ /* ctx */ js.Any, 
    /* found */ stdLib.RegExpExecArray, 
    scala.Unit
  ]
}
