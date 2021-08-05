package typings.tslint

import typings.tslint.mod.Rules.AbstractRule
import typings.tslint.ruleMod.IOptions
import typings.tslint.ruleMod.IRuleMetadata
import typings.typescript.mod.SignatureDeclaration
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object adjacentOverloadSignaturesRuleMod {
  
  @JSImport("tslint/lib/rules/adjacentOverloadSignaturesRule", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("tslint/lib/rules/adjacentOverloadSignaturesRule", "Rule")
  @js.native
  class Rule protected () extends AbstractRule {
    def this(options: IOptions) = this()
  }
  /* static members */
  object Rule {
    
    @JSImport("tslint/lib/rules/adjacentOverloadSignaturesRule", "Rule")
    @js.native
    val ^ : js.Any = js.native
    
    inline def FAILURE_STRING(name: String): String = ^.asInstanceOf[js.Dynamic].applyDynamic("FAILURE_STRING")(name.asInstanceOf[js.Any]).asInstanceOf[String]
    
    @JSImport("tslint/lib/rules/adjacentOverloadSignaturesRule", "Rule.metadata")
    @js.native
    def metadata: IRuleMetadata = js.native
    inline def metadata_=(x: IRuleMetadata): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("metadata")(x.asInstanceOf[js.Any])
  }
  
  inline def getOverloadKey(node: SignatureDeclaration): js.UndefOr[String] = ^.asInstanceOf[js.Dynamic].applyDynamic("getOverloadKey")(node.asInstanceOf[js.Any]).asInstanceOf[js.UndefOr[String]]
}
