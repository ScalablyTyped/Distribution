package typings.tslint

import typings.tslint.libLanguageRuleRuleMod.IOptions
import typings.tslint.libLanguageRuleRuleMod.IRuleMetadata
import typings.tslint.mod.Rules.AbstractRule
import typings.typescript.mod.Node
import typings.typescript.mod.NodeArray
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libRulesTypedefRuleMod {
  
  @JSImport("tslint/lib/rules/typedefRule", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("tslint/lib/rules/typedefRule", "Rule")
  @js.native
  open class Rule protected () extends AbstractRule {
    def this(options: IOptions) = this()
  }
  /* static members */
  object Rule {
    
    @JSImport("tslint/lib/rules/typedefRule", "Rule")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("tslint/lib/rules/typedefRule", "Rule.metadata")
    @js.native
    def metadata: IRuleMetadata = js.native
    inline def metadata_=(x: IRuleMetadata): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("metadata")(x.asInstanceOf[js.Any])
  }
  
  inline def isNodeArray(nodeOrArray: Node): /* is typescript.typescript.NodeArray<typescript.typescript.Node> */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isNodeArray")(nodeOrArray.asInstanceOf[js.Any]).asInstanceOf[/* is typescript.typescript.NodeArray<typescript.typescript.Node> */ Boolean]
  inline def isNodeArray(nodeOrArray: NodeArray[Node]): /* is typescript.typescript.NodeArray<typescript.typescript.Node> */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isNodeArray")(nodeOrArray.asInstanceOf[js.Any]).asInstanceOf[/* is typescript.typescript.NodeArray<typescript.typescript.Node> */ Boolean]
}
