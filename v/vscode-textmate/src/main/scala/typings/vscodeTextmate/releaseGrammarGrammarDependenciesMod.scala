package typings.vscodeTextmate

import typings.std.Set
import typings.vscodeTextmate.releaseGrammarGrammarMod.IGrammarRepository
import typings.vscodeTextmate.releaseRawGrammarMod.IRawRule
import typings.vscodeTextmate.releaseThemeMod.ScopeName
import typings.vscodeTextmate.vscodeTextmateInts.`0`
import typings.vscodeTextmate.vscodeTextmateInts.`1`
import typings.vscodeTextmate.vscodeTextmateInts.`2`
import typings.vscodeTextmate.vscodeTextmateInts.`3`
import typings.vscodeTextmate.vscodeTextmateInts.`4`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object releaseGrammarGrammarDependenciesMod {
  
  @JSImport("vscode-textmate/release/grammar/grammarDependencies", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("vscode-textmate/release/grammar/grammarDependencies", "BaseReference")
  @js.native
  open class BaseReference ()
    extends StObject
       with IncludeReference {
    
    val kind: String | Double = js.native
  }
  
  @JSImport("vscode-textmate/release/grammar/grammarDependencies", "ExternalReferenceCollector")
  @js.native
  open class ExternalReferenceCollector () extends StObject {
    
    /* private */ val _references: Any = js.native
    
    /* private */ val _seenReferenceKeys: Any = js.native
    
    def add(reference: AbsoluteRuleReference): Unit = js.native
    
    def references: js.Array[AbsoluteRuleReference] = js.native
    
    val visitedRule: Set[IRawRule] = js.native
  }
  
  @JSImport("vscode-textmate/release/grammar/grammarDependencies", "RelativeReference")
  @js.native
  open class RelativeReference protected ()
    extends StObject
       with IncludeReference {
    def this(ruleName: String) = this()
    
    val kind: String | Double = js.native
    
    val ruleName: String = js.native
  }
  
  @JSImport("vscode-textmate/release/grammar/grammarDependencies", "ScopeDependencyProcessor")
  @js.native
  open class ScopeDependencyProcessor protected () extends StObject {
    def this(repo: IGrammarRepository, initialScopeName: ScopeName) = this()
    
    var Q: js.Array[AbsoluteRuleReference] = js.native
    
    val initialScopeName: ScopeName = js.native
    
    def processQueue(): Unit = js.native
    
    val repo: IGrammarRepository = js.native
    
    val seenFullScopeRequests: Set[String] = js.native
    
    val seenPartialScopeRequests: Set[String] = js.native
  }
  
  @JSImport("vscode-textmate/release/grammar/grammarDependencies", "SelfReference")
  @js.native
  open class SelfReference ()
    extends StObject
       with IncludeReference {
    
    val kind: String | Double = js.native
  }
  
  @JSImport("vscode-textmate/release/grammar/grammarDependencies", "TopLevelReference")
  @js.native
  open class TopLevelReference protected ()
    extends StObject
       with IncludeReference {
    def this(scopeName: ScopeName) = this()
    
    val kind: String | Double = js.native
    
    val scopeName: ScopeName = js.native
  }
  
  @JSImport("vscode-textmate/release/grammar/grammarDependencies", "TopLevelRepositoryReference")
  @js.native
  open class TopLevelRepositoryReference protected ()
    extends StObject
       with IncludeReference {
    def this(scopeName: ScopeName, ruleName: String) = this()
    
    val kind: String | Double = js.native
    
    val ruleName: String = js.native
    
    val scopeName: ScopeName = js.native
  }
  
  @JSImport("vscode-textmate/release/grammar/grammarDependencies", "TopLevelRepositoryRuleReference")
  @js.native
  open class TopLevelRepositoryRuleReference protected ()
    extends StObject
       with AbsoluteRuleReference {
    def this(scopeName: ScopeName, ruleName: String) = this()
    
    val ruleName: String = js.native
    
    val scopeName: ScopeName = js.native
    
    def toKey(): String = js.native
  }
  
  @JSImport("vscode-textmate/release/grammar/grammarDependencies", "TopLevelRuleReference")
  @js.native
  open class TopLevelRuleReference protected ()
    extends StObject
       with AbsoluteRuleReference {
    def this(scopeName: ScopeName) = this()
    
    val scopeName: ScopeName = js.native
    
    def toKey(): String = js.native
  }
  
  inline def parseInclude(include: String): IncludeReference = ^.asInstanceOf[js.Dynamic].applyDynamic("parseInclude")(include.asInstanceOf[js.Any]).asInstanceOf[IncludeReference]
  
  /* Rewritten from type alias, can be one of: 
    - typings.vscodeTextmate.releaseGrammarGrammarDependenciesMod.TopLevelRuleReference
    - typings.vscodeTextmate.releaseGrammarGrammarDependenciesMod.TopLevelRepositoryRuleReference
  */
  trait AbsoluteRuleReference extends StObject
  
  /* Rewritten from type alias, can be one of: 
    - typings.vscodeTextmate.releaseGrammarGrammarDependenciesMod.BaseReference
    - typings.vscodeTextmate.releaseGrammarGrammarDependenciesMod.SelfReference
    - typings.vscodeTextmate.releaseGrammarGrammarDependenciesMod.RelativeReference
    - typings.vscodeTextmate.releaseGrammarGrammarDependenciesMod.TopLevelReference
    - typings.vscodeTextmate.releaseGrammarGrammarDependenciesMod.TopLevelRepositoryReference
  */
  trait IncludeReference extends StObject
  
  /* Rewritten from type alias, can be one of: 
    - typings.vscodeTextmate.vscodeTextmateInts.`0`
    - typings.vscodeTextmate.vscodeTextmateInts.`1`
    - typings.vscodeTextmate.vscodeTextmateInts.`2`
    - typings.vscodeTextmate.vscodeTextmateInts.`3`
    - typings.vscodeTextmate.vscodeTextmateInts.`4`
  */
  trait IncludeReferenceKind extends StObject
  object IncludeReferenceKind {
    
    inline def Base: `0` = 0.asInstanceOf[`0`]
    
    inline def RelativeReference: `2` = 2.asInstanceOf[`2`]
    
    inline def Self: `1` = 1.asInstanceOf[`1`]
    
    inline def TopLevelReference: `3` = 3.asInstanceOf[`3`]
    
    inline def TopLevelRepositoryReference: `4` = 4.asInstanceOf[`4`]
  }
}
