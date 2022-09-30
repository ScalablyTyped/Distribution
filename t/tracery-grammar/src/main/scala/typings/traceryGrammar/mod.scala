package typings.traceryGrammar

import org.scalablytyped.runtime.Instantiable1
import org.scalablytyped.runtime.Instantiable2
import org.scalablytyped.runtime.Instantiable3
import typings.std.Array
import typings.std.Partial
import typings.std.Record
import typings.traceryGrammar.anon.A
import typings.traceryGrammar.anon.Node
import typings.traceryGrammar.traceryGrammarInts.`0`
import typings.traceryGrammar.traceryGrammarInts.`1`
import typings.traceryGrammar.traceryGrammarInts.`2`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("tracery-grammar", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  /* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
  @JSImport("tracery-grammar", "Grammar")
  @js.native
  open class Grammar protected ()
    extends StObject
       with TraceryGrammar {
    def this(raw: Record[String, String | js.Array[String]]) = this()
  }
  @JSImport("tracery-grammar", "Grammar")
  @js.native
  def Grammar: Instantiable1[/* raw */ Record[String, String | js.Array[String]], TraceryGrammar] = js.native
  inline def Grammar_=(x: Instantiable1[/* raw */ Record[String, String | js.Array[String]], TraceryGrammar]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("Grammar")(x.asInstanceOf[js.Any])
  
  /* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
  @JSImport("tracery-grammar", "RuleSet")
  @js.native
  open class RuleSet protected ()
    extends StObject
       with TraceryRuleSet {
    def this(grammar: TraceryGrammar, raw: String) = this()
    def this(grammar: TraceryGrammar, raw: js.Array[String]) = this()
  }
  @JSImport("tracery-grammar", "RuleSet")
  @js.native
  def RuleSet: Instantiable2[/* grammar */ TraceryGrammar, /* raw */ String | js.Array[String], TraceryRuleSet] = js.native
  inline def RuleSet_=(
    x: Instantiable2[/* grammar */ TraceryGrammar, /* raw */ String | js.Array[String], TraceryRuleSet]
  ): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("RuleSet")(x.asInstanceOf[js.Any])
  
  /* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
  @JSImport("tracery-grammar", "Symbol")
  @js.native
  open class Symbol protected ()
    extends StObject
       with TracerySymbol {
    def this(
      grammar: TraceryGrammar,
      key: String,
      rawRules: /* import warning: importer.ImportType#apply Failed type conversion: std.ConstructorParameters<typeof TraceryRuleSet>[1] */ js.Any
    ) = this()
  }
  @JSImport("tracery-grammar", "Symbol")
  @js.native
  val Symbol: Instantiable3[
    /* grammar */ TraceryGrammar, 
    /* key */ String, 
    /* import warning: importer.ImportType#apply Failed type conversion: std.ConstructorParameters<typeof TraceryRuleSet>[1] */ /* rawRules */ js.Any, 
    TracerySymbol
  ] = js.native
  
  @js.native
  trait TraceryNode extends StObject {
    
    var action: js.UndefOr[TraceryNodeAction] = js.native
    
    var childIndex: Double = js.native
    
    var childRule: String = js.native
    
    var children: js.Array[TraceryNode] = js.native
    
    def clearEscapeChars(): Unit = js.native
    
    var depth: Double = js.native
    
    var errors: js.Array[String] = js.native
    
    def expand(): Unit = js.native
    def expand(preventRecursion: Boolean): Unit = js.native
    
    def expandChildren(childRule: String, preventRecursion: Boolean): Unit = js.native
    
    var expansionErrors: js.Array[String] = js.native
    
    var finishedText: js.UndefOr[String] = js.native
    
    var grammar: TraceryGrammar = js.native
    
    var isExpanded: Boolean = js.native
    
    var modifiers: js.Array[String] = js.native
    
    var parent: TraceryNode | Null = js.native
    
    var postactions: js.Array[TraceryNodeAction] = js.native
    
    var preactions: js.Array[TraceryNodeAction] = js.native
    
    var raw: js.UndefOr[String] = js.native
    
    var symbol: String = js.native
    
    var `type`: js.UndefOr[Double] = js.native
  }
  @JSImport("tracery-grammar", "TraceryNode")
  @js.native
  def TraceryNode: Instantiable3[
    /* parent */ TraceryNode | TraceryGrammar | Null, 
    /* childIndex */ Double, 
    /* settings */ Settings, 
    TraceryNode
  ] = js.native
  
  /* This class was inferred from a value with a constructor, it was renamed because a distinct type already exists with the same name. */
  @JSImport("tracery-grammar", "TraceryNode")
  @js.native
  open class TraceryNodeCls protected ()
    extends StObject
       with TraceryNode {
    def this(parent: Null, childIndex: Double, settings: Settings) = this()
    def this(parent: TraceryGrammar, childIndex: Double, settings: Settings) = this()
    def this(parent: TraceryNode, childIndex: Double, settings: Settings) = this()
  }
  
  inline def TraceryNode_=(
    x: Instantiable3[
      /* parent */ TraceryNode | TraceryGrammar | Null, 
      /* childIndex */ Double, 
      /* settings */ Settings, 
      TraceryNode
    ]
  ): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("TraceryNode")(x.asInstanceOf[js.Any])
  
  @JSImport("tracery-grammar", "baseEngModifiers")
  @js.native
  def baseEngModifiers: A = js.native
  inline def baseEngModifiers_=(x: A): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("baseEngModifiers")(x.asInstanceOf[js.Any])
  
  inline def createGrammar_0(
    raw: /* import warning: importer.ImportType#apply Failed type conversion: std.ConstructorParameters<new (raw : std.Record<string, string | std.Array<string>>): tracery-grammar.tracery-grammar.TraceryGrammar>[0] */ js.Any
  ): TraceryGrammar = ^.asInstanceOf[js.Dynamic].applyDynamic("createGrammar")(raw.asInstanceOf[js.Any]).asInstanceOf[TraceryGrammar]
  
  inline def parse(): ArrayWithErrors[Settings] = ^.asInstanceOf[js.Dynamic].applyDynamic("parse")().asInstanceOf[ArrayWithErrors[Settings]]
  inline def parse(rule: String): ArrayWithErrors[Settings] = ^.asInstanceOf[js.Dynamic].applyDynamic("parse")(rule.asInstanceOf[js.Any]).asInstanceOf[ArrayWithErrors[Settings]]
  
  inline def parseTag(): typings.traceryGrammar.anon.Modifiers = ^.asInstanceOf[js.Dynamic].applyDynamic("parseTag")().asInstanceOf[typings.traceryGrammar.anon.Modifiers]
  inline def parseTag(tagContents: String): typings.traceryGrammar.anon.Modifiers = ^.asInstanceOf[js.Dynamic].applyDynamic("parseTag")(tagContents.asInstanceOf[js.Any]).asInstanceOf[typings.traceryGrammar.anon.Modifiers]
  
  @js.native
  trait ArrayWithErrors[T]
    extends StObject
       with Array[T] {
    
    var errors: js.Array[String] = js.native
  }
  
  type Modifiers = Record[String, js.Function2[/* s */ String, /* params */ js.Array[String], String]]
  
  trait Settings extends StObject {
    
    var raw: js.UndefOr[String] = js.undefined
    
    var `type`: js.UndefOr[Double] = js.undefined
  }
  object Settings {
    
    inline def apply(): Settings = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Settings]
    }
    
    extension [Self <: Settings](x: Self) {
      
      inline def setRaw(value: String): Self = StObject.set(x, "raw", value.asInstanceOf[js.Any])
      
      inline def setRawUndefined: Self = StObject.set(x, "raw", js.undefined)
      
      inline def setType(value: Double): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
      
      inline def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
    }
  }
  
  @js.native
  trait TraceryGrammar extends StObject {
    
    def addModifiers(mods: Modifiers): Unit = js.native
    
    def clearState(): Unit = js.native
    
    def createRoot(rule: String): TraceryNode = js.native
    
    var errors: js.UndefOr[js.Array[String]] = js.native
    
    def expand(rule: String): TraceryNode = js.native
    def expand(rule: String, allowEscapeChars: Boolean): TraceryNode = js.native
    
    def flatten(rule: String): String = js.native
    def flatten(rule: String, allowEscapeChars: Boolean): String = js.native
    
    def loadFromRawObj(raw: Record[String, String | js.Array[String]]): Unit = js.native
    
    var modifiers: Modifiers = js.native
    
    def popRules(key: String): Unit = js.native
    
    def pushRules(
      key: String,
      rawRules: /* import warning: importer.ImportType#apply Failed type conversion: std.ConstructorParameters<new (grammar : tracery-grammar.tracery-grammar.TraceryGrammar, key : string, rawRules : std.ConstructorParameters<typeof TraceryRuleSet>[1]): tracery-grammar.tracery-grammar.TracerySymbol>[2] */ js.Any
    ): Unit = js.native
    def pushRules(
      key: String,
      rawRules: /* import warning: importer.ImportType#apply Failed type conversion: std.ConstructorParameters<new (grammar : tracery-grammar.tracery-grammar.TraceryGrammar, key : string, rawRules : std.ConstructorParameters<typeof TraceryRuleSet>[1]): tracery-grammar.tracery-grammar.TracerySymbol>[2] */ js.Any,
      sourceAction: Boolean
    ): Unit = js.native
    
    var raw: Record[String, String | js.Array[String]] = js.native
    
    def selectRule(key: String, node: TraceryNode, errors: js.Array[String]): Any = js.native
    
    var subgrammars: js.Array[TraceryGrammar] = js.native
    
    var symbols: Partial[Record[String, TracerySymbol]] = js.native
    
    def toJSON(): String = js.native
  }
  
  trait TraceryNodeAction extends StObject {
    
    def activate(): Unit
    
    def createUndo(): TraceryNodeAction
    
    var finishedRules: js.Array[String]
    
    var node: TraceryNode
    
    var rule: String
    
    var ruleSections: js.Array[String]
    
    var target: String
    
    def toText(): String
    
    var `type`: `0` | `1` | `2`
  }
  object TraceryNodeAction {
    
    inline def apply(
      activate: () => Unit,
      createUndo: () => TraceryNodeAction,
      finishedRules: js.Array[String],
      node: TraceryNode,
      rule: String,
      ruleSections: js.Array[String],
      target: String,
      toText: () => String,
      `type`: `0` | `1` | `2`
    ): TraceryNodeAction = {
      val __obj = js.Dynamic.literal(activate = js.Any.fromFunction0(activate), createUndo = js.Any.fromFunction0(createUndo), finishedRules = finishedRules.asInstanceOf[js.Any], node = node.asInstanceOf[js.Any], rule = rule.asInstanceOf[js.Any], ruleSections = ruleSections.asInstanceOf[js.Any], target = target.asInstanceOf[js.Any], toText = js.Any.fromFunction0(toText))
      __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
      __obj.asInstanceOf[TraceryNodeAction]
    }
    
    extension [Self <: TraceryNodeAction](x: Self) {
      
      inline def setActivate(value: () => Unit): Self = StObject.set(x, "activate", js.Any.fromFunction0(value))
      
      inline def setCreateUndo(value: () => TraceryNodeAction): Self = StObject.set(x, "createUndo", js.Any.fromFunction0(value))
      
      inline def setFinishedRules(value: js.Array[String]): Self = StObject.set(x, "finishedRules", value.asInstanceOf[js.Any])
      
      inline def setFinishedRulesVarargs(value: String*): Self = StObject.set(x, "finishedRules", js.Array(value*))
      
      inline def setNode(value: TraceryNode): Self = StObject.set(x, "node", value.asInstanceOf[js.Any])
      
      inline def setRule(value: String): Self = StObject.set(x, "rule", value.asInstanceOf[js.Any])
      
      inline def setRuleSections(value: js.Array[String]): Self = StObject.set(x, "ruleSections", value.asInstanceOf[js.Any])
      
      inline def setRuleSectionsVarargs(value: String*): Self = StObject.set(x, "ruleSections", js.Array(value*))
      
      inline def setTarget(value: String): Self = StObject.set(x, "target", value.asInstanceOf[js.Any])
      
      inline def setToText(value: () => String): Self = StObject.set(x, "toText", js.Any.fromFunction0(value))
      
      inline def setType(value: `0` | `1` | `2`): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait TraceryRuleSet extends StObject {
    
    def clearState(): Unit = js.native
    
    var conditionalRule: js.UndefOr[String] = js.native
    
    var conditionalValues: js.UndefOr[js.Array[TraceryRuleSet]] = js.native
    
    var defaultRules: js.Array[String] = js.native
    
    var defaultUses: js.UndefOr[js.Array[Double]] = js.native
    
    var falloff: Double = js.native
    
    var grammar: TraceryGrammar = js.native
    
    var raw: String | js.Array[String] = js.native
    
    def selectRule(): Any = js.native
    def selectRule(errors: js.Array[String]): Any = js.native
    
    var shuffledDeck: js.UndefOr[js.Array[Double]] = js.native
  }
  
  @js.native
  trait TracerySymbol extends StObject {
    
    var baseRules: TraceryRuleSet = js.native
    
    def clearState(): Unit = js.native
    
    def getActiveRules(): Any = js.native
    
    var grammar: TraceryGrammar = js.native
    
    var isDynamic: js.UndefOr[Boolean] = js.native
    
    var key: String = js.native
    
    def popRules(): Unit = js.native
    
    @JSName("pushRules")
    def pushRules_1(
      rawRules: /* import warning: importer.ImportType#apply Failed type conversion: std.ConstructorParameters<new (grammar : tracery-grammar.tracery-grammar.TraceryGrammar, raw : string | std.Array<string>): tracery-grammar.tracery-grammar.TraceryRuleSet>[1] */ js.Any
    ): Unit = js.native
    
    var rawRules: /* import warning: importer.ImportType#apply Failed type conversion: std.ConstructorParameters<new (grammar : tracery-grammar.tracery-grammar.TraceryGrammar, raw : string | std.Array<string>): tracery-grammar.tracery-grammar.TraceryRuleSet>[1] */ js.Any = js.native
    
    def rulesToJSON(): String = js.native
    
    def selectRule(): Any = js.native
    def selectRule(node: Unit, errors: js.Array[String]): Any = js.native
    def selectRule(node: TraceryNode): Any = js.native
    def selectRule(node: TraceryNode, errors: js.Array[String]): Any = js.native
    
    var stack: js.UndefOr[js.Array[TraceryRuleSet]] = js.native
    
    var uses: js.UndefOr[js.Array[Node]] = js.native
  }
}
