package typings.tslint

import typings.tslint.libLanguageRuleRuleMod.IOptions
import typings.tslint.libLanguageWalkerRuleWalkerMod.RuleWalker
import typings.typescript.mod.Node
import typings.typescript.mod.SourceFile
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libLanguageWalkerScopeAwareRuleWalkerMod {
  
  /* note: abstract class */ @JSImport("tslint/lib/language/walker/scopeAwareRuleWalker", "ScopeAwareRuleWalker")
  @js.native
  open class ScopeAwareRuleWalker[T] protected () extends RuleWalker {
    def this(sourceFile: SourceFile, options: IOptions) = this()
    
    def createScope(node: Node): T = js.native
    
    def getAllScopes(): js.Array[T] = js.native
    
    def getCurrentDepth(): Double = js.native
    
    def getCurrentScope(): T = js.native
    
    /* protected */ def isScopeBoundary(node: Node): Boolean = js.native
    
    def onScopeEnd(): Unit = js.native
    
    def onScopeStart(): Unit = js.native
    
    /* private */ val scopeStack: Any = js.native
  }
}
