package typings.tslint

import typings.tslint.abstractRuleMod.AbstractRule
import typings.tslint.ruleMod.IOptions
import typings.tslint.ruleMod.ITypedRule
import typings.tslint.ruleMod.RuleFailure
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object typedRuleMod {
  
  @JSImport("tslint/lib/language/rule/typedRule", "TypedRule")
  @js.native
  abstract class TypedRule protected ()
    extends AbstractRule
       with ITypedRule {
    def this(options: IOptions) = this()
    
    @JSName("apply")
    def apply(): js.Array[RuleFailure] = js.native
  }
}
