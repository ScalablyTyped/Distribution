package typings.tslint

import typings.std.Set
import typings.tslint.mod.Rules.AbstractRule
import typings.tslint.ruleMod.IOptions
import typings.tslint.ruleMod.IRuleMetadata
import typings.typescript.mod.SyntaxKind
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object noMagicNumbersRuleMod {
  
  @JSImport("tslint/lib/rules/noMagicNumbersRule", "Rule")
  @js.native
  class Rule protected () extends AbstractRule {
    def this(options: IOptions) = this()
  }
  /* static members */
  object Rule {
    
    @JSImport("tslint/lib/rules/noMagicNumbersRule", "Rule")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("tslint/lib/rules/noMagicNumbersRule", "Rule.ALLOWED_NODES")
    @js.native
    def ALLOWED_NODES: Set[SyntaxKind] = js.native
    @scala.inline
    def ALLOWED_NODES_=(x: Set[SyntaxKind]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("ALLOWED_NODES")(x.asInstanceOf[js.Any])
    
    @JSImport("tslint/lib/rules/noMagicNumbersRule", "Rule.DEFAULT_ALLOWED")
    @js.native
    def DEFAULT_ALLOWED: js.Array[Double] = js.native
    @scala.inline
    def DEFAULT_ALLOWED_=(x: js.Array[Double]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("DEFAULT_ALLOWED")(x.asInstanceOf[js.Any])
    
    @JSImport("tslint/lib/rules/noMagicNumbersRule", "Rule.FAILURE_STRING")
    @js.native
    def FAILURE_STRING(num: String): String = js.native
    
    @JSImport("tslint/lib/rules/noMagicNumbersRule", "Rule.metadata")
    @js.native
    def metadata: IRuleMetadata = js.native
    @scala.inline
    def metadata_=(x: IRuleMetadata): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("metadata")(x.asInstanceOf[js.Any])
  }
}
