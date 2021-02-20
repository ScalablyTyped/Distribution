package typings.tslint

import typings.tslint.abstractRuleMod.AbstractRule
import typings.tslint.ruleMod.IOptions
import typings.tslint.ruleMod.ITypedRule
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object optionallyTypedRuleMod {
  
  @JSImport("tslint/lib/language/rule/optionallyTypedRule", "OptionallyTypedRule")
  @js.native
  abstract class OptionallyTypedRule protected ()
    extends AbstractRule
       with ITypedRule {
    def this(options: IOptions) = this()
  }
}
