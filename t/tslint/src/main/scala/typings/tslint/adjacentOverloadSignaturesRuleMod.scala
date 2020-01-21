package typings.tslint

import typings.tslint.mod.Rules.AbstractRule
import typings.tslint.ruleMod.IRuleMetadata
import typings.typescript.mod.SignatureDeclaration
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("tslint/lib/rules/adjacentOverloadSignaturesRule", JSImport.Namespace)
@js.native
object adjacentOverloadSignaturesRuleMod extends js.Object {
  @js.native
  class Rule () extends AbstractRule
  
  def getOverloadKey(node: SignatureDeclaration): js.UndefOr[String] = js.native
  /* static members */
  @js.native
  object Rule extends js.Object {
    var metadata: IRuleMetadata = js.native
    def FAILURE_STRING(name: String): String = js.native
  }
  
}

