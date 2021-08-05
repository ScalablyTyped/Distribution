package typings.stylableCore

import typings.postcss.mod.AtRule_
import typings.postcss.mod.Node
import typings.postcss.mod.Root_
import typings.postcss.mod.Rule_
import typings.std.Record
import typings.stylableCore.diagnosticsMod.Diagnostics
import typings.stylableCore.selectorUtilsMod.SelectorAstNode
import typings.stylableCore.selectorUtilsMod.SelectorChunk2
import typings.stylableCore.stylableCoreStrings.`class`
import typings.stylableCore.stylableCoreStrings.`import`
import typings.stylableCore.stylableCoreStrings.`var`
import typings.stylableCore.stylableCoreStrings.cssVar
import typings.stylableCore.stylableCoreStrings.default
import typings.stylableCore.stylableCoreStrings.element
import typings.stylableCore.stylableCoreStrings.keyframes
import typings.stylableCore.stylableCoreStrings.named
import typings.stylableCore.stylableValueParsersMod.MappedStates
import typings.stylableCore.stylableValueParsersMod.MixinValue
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object stylableMetaMod {
  
  @JSImport("@stylable/core/cjs/stylable-meta", "RESERVED_ROOT_NAME")
  @js.native
  val RESERVED_ROOT_NAME: /* "root" */ String = js.native
  
  @JSImport("@stylable/core/cjs/stylable-meta", "StylableMeta")
  @js.native
  class StylableMeta protected () extends StObject {
    def this(ast: Root_, diagnostics: Diagnostics) = this()
    
    var ast: Root_ = js.native
    
    var classes: Record[String, ClassSymbol] = js.native
    
    var cssVars: Record[String, CSSVarSymbol] = js.native
    
    var customSelectors: Record[String, String] = js.native
    
    var diagnostics: Diagnostics = js.native
    
    var elements: Record[String, ElementSymbol] = js.native
    
    var globals: Record[String, Boolean] = js.native
    
    var imports: js.Array[Imported] = js.native
    
    var keyframes: js.Array[AtRule_] = js.native
    
    var mappedKeyframes: Record[String, KeyframesSymbol] = js.native
    
    var mappedSymbols: Record[String, StylableSymbol] = js.native
    
    var mixins: js.Array[RefedMixin] = js.native
    
    var namespace: String = js.native
    
    var outputAst: js.UndefOr[Root_] = js.native
    
    var parent: js.UndefOr[StylableMeta] = js.native
    
    var rawAst: Root_ = js.native
    
    var root: typings.stylableCore.stylableCoreStrings.root = js.native
    
    var scopes: js.Array[AtRule_] = js.native
    
    var simpleSelectors: Record[String, SimpleSelector] = js.native
    
    var source: String = js.native
    
    var transformDiagnostics: Diagnostics | Null = js.native
    
    var transformedScopes: (Record[String, js.Array[js.Array[SelectorChunk2]]]) | Null = js.native
    
    var urls: js.Array[String] = js.native
    
    var vars: js.Array[VarSymbol] = js.native
  }
  
  trait CSSVarSymbol
    extends StObject
       with StylableSymbol {
    
    var _kind: cssVar
    
    var global: js.UndefOr[Boolean] = js.undefined
    
    var name: String
  }
  object CSSVarSymbol {
    
    inline def apply(name: String): CSSVarSymbol = {
      val __obj = js.Dynamic.literal(_kind = "cssVar", name = name.asInstanceOf[js.Any])
      __obj.asInstanceOf[CSSVarSymbol]
    }
    
    extension [Self <: CSSVarSymbol](x: Self) {
      
      inline def setGlobal(value: Boolean): Self = StObject.set(x, "global", value.asInstanceOf[js.Any])
      
      inline def setGlobalUndefined: Self = StObject.set(x, "global", js.undefined)
      
      inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      inline def set_kind(value: cssVar): Self = StObject.set(x, "_kind", value.asInstanceOf[js.Any])
    }
  }
  
  trait ClassSymbol
    extends StObject
       with StylableDirectives
       with StylableSymbol {
    
    var _kind: `class`
    
    var alias: js.UndefOr[ImportSymbol] = js.undefined
    
    var name: String
    
    var scoped: js.UndefOr[String] = js.undefined
  }
  object ClassSymbol {
    
    inline def apply(name: String): ClassSymbol = {
      val __obj = js.Dynamic.literal(_kind = "class", name = name.asInstanceOf[js.Any])
      __obj.asInstanceOf[ClassSymbol]
    }
    
    extension [Self <: ClassSymbol](x: Self) {
      
      inline def setAlias(value: ImportSymbol): Self = StObject.set(x, "alias", value.asInstanceOf[js.Any])
      
      inline def setAliasUndefined: Self = StObject.set(x, "alias", js.undefined)
      
      inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      inline def setScoped(value: String): Self = StObject.set(x, "scoped", value.asInstanceOf[js.Any])
      
      inline def setScopedUndefined: Self = StObject.set(x, "scoped", js.undefined)
      
      inline def set_kind(value: `class`): Self = StObject.set(x, "_kind", value.asInstanceOf[js.Any])
    }
  }
  
  trait ElementSymbol
    extends StObject
       with StylableDirectives
       with StylableSymbol {
    
    var _kind: element
    
    var alias: js.UndefOr[ImportSymbol] = js.undefined
    
    var name: String
  }
  object ElementSymbol {
    
    inline def apply(name: String): ElementSymbol = {
      val __obj = js.Dynamic.literal(_kind = "element", name = name.asInstanceOf[js.Any])
      __obj.asInstanceOf[ElementSymbol]
    }
    
    extension [Self <: ElementSymbol](x: Self) {
      
      inline def setAlias(value: ImportSymbol): Self = StObject.set(x, "alias", value.asInstanceOf[js.Any])
      
      inline def setAliasUndefined: Self = StObject.set(x, "alias", js.undefined)
      
      inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      inline def set_kind(value: element): Self = StObject.set(x, "_kind", value.asInstanceOf[js.Any])
    }
  }
  
  trait ImportSymbol
    extends StObject
       with StylableSymbol {
    
    var _kind: `import`
    
    var context: String
    
    var `import`: Imported
    
    var name: String
    
    var `type`: named | default
  }
  object ImportSymbol {
    
    inline def apply(context: String, `import`: Imported, name: String, `type`: named | default): ImportSymbol = {
      val __obj = js.Dynamic.literal(_kind = "import", context = context.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
      __obj.updateDynamic("import")(`import`.asInstanceOf[js.Any])
      __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
      __obj.asInstanceOf[ImportSymbol]
    }
    
    extension [Self <: ImportSymbol](x: Self) {
      
      inline def setContext(value: String): Self = StObject.set(x, "context", value.asInstanceOf[js.Any])
      
      inline def setImport(value: Imported): Self = StObject.set(x, "import", value.asInstanceOf[js.Any])
      
      inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      inline def setType(value: named | default): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
      
      inline def set_kind(value: `import`): Self = StObject.set(x, "_kind", value.asInstanceOf[js.Any])
    }
  }
  
  trait Imported extends StObject {
    
    var context: String
    
    var defaultExport: String
    
    var from: String
    
    var fromRelative: String
    
    var keyframes: Record[String, String]
    
    var named: Record[String, String]
    
    var rule: Rule_
  }
  object Imported {
    
    inline def apply(
      context: String,
      defaultExport: String,
      from: String,
      fromRelative: String,
      keyframes: Record[String, String],
      named: Record[String, String],
      rule: Rule_
    ): Imported = {
      val __obj = js.Dynamic.literal(context = context.asInstanceOf[js.Any], defaultExport = defaultExport.asInstanceOf[js.Any], from = from.asInstanceOf[js.Any], fromRelative = fromRelative.asInstanceOf[js.Any], keyframes = keyframes.asInstanceOf[js.Any], named = named.asInstanceOf[js.Any], rule = rule.asInstanceOf[js.Any])
      __obj.asInstanceOf[Imported]
    }
    
    extension [Self <: Imported](x: Self) {
      
      inline def setContext(value: String): Self = StObject.set(x, "context", value.asInstanceOf[js.Any])
      
      inline def setDefaultExport(value: String): Self = StObject.set(x, "defaultExport", value.asInstanceOf[js.Any])
      
      inline def setFrom(value: String): Self = StObject.set(x, "from", value.asInstanceOf[js.Any])
      
      inline def setFromRelative(value: String): Self = StObject.set(x, "fromRelative", value.asInstanceOf[js.Any])
      
      inline def setKeyframes(value: Record[String, String]): Self = StObject.set(x, "keyframes", value.asInstanceOf[js.Any])
      
      inline def setNamed(value: Record[String, String]): Self = StObject.set(x, "named", value.asInstanceOf[js.Any])
      
      inline def setRule(value: Rule_): Self = StObject.set(x, "rule", value.asInstanceOf[js.Any])
    }
  }
  
  trait KeyframesSymbol
    extends StObject
       with StylableSymbol {
    
    var _kind: keyframes
    
    var alias: String
    
    var `import`: js.UndefOr[Imported] = js.undefined
    
    var name: String
  }
  object KeyframesSymbol {
    
    inline def apply(alias: String, name: String): KeyframesSymbol = {
      val __obj = js.Dynamic.literal(_kind = "keyframes", alias = alias.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
      __obj.asInstanceOf[KeyframesSymbol]
    }
    
    extension [Self <: KeyframesSymbol](x: Self) {
      
      inline def setAlias(value: String): Self = StObject.set(x, "alias", value.asInstanceOf[js.Any])
      
      inline def setImport(value: Imported): Self = StObject.set(x, "import", value.asInstanceOf[js.Any])
      
      inline def setImportUndefined: Self = StObject.set(x, "import", js.undefined)
      
      inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      inline def set_kind(value: keyframes): Self = StObject.set(x, "_kind", value.asInstanceOf[js.Any])
    }
  }
  
  trait RefedMixin extends StObject {
    
    var mixin: MixinValue
    
    var ref: ImportSymbol | ClassSymbol
  }
  object RefedMixin {
    
    inline def apply(mixin: MixinValue, ref: ImportSymbol | ClassSymbol): RefedMixin = {
      val __obj = js.Dynamic.literal(mixin = mixin.asInstanceOf[js.Any], ref = ref.asInstanceOf[js.Any])
      __obj.asInstanceOf[RefedMixin]
    }
    
    extension [Self <: RefedMixin](x: Self) {
      
      inline def setMixin(value: MixinValue): Self = StObject.set(x, "mixin", value.asInstanceOf[js.Any])
      
      inline def setRef(value: ImportSymbol | ClassSymbol): Self = StObject.set(x, "ref", value.asInstanceOf[js.Any])
    }
  }
  
  trait SimpleSelector extends StObject {
    
    var node: Rule_ | Root_
    
    var symbol: ClassSymbol | ElementSymbol
  }
  object SimpleSelector {
    
    inline def apply(node: Rule_ | Root_, symbol: ClassSymbol | ElementSymbol): SimpleSelector = {
      val __obj = js.Dynamic.literal(node = node.asInstanceOf[js.Any], symbol = symbol.asInstanceOf[js.Any])
      __obj.asInstanceOf[SimpleSelector]
    }
    
    extension [Self <: SimpleSelector](x: Self) {
      
      inline def setNode(value: Rule_ | Root_): Self = StObject.set(x, "node", value.asInstanceOf[js.Any])
      
      inline def setSymbol(value: ClassSymbol | ElementSymbol): Self = StObject.set(x, "symbol", value.asInstanceOf[js.Any])
    }
  }
  
  trait StylableDirectives extends StObject {
    
    var `-st-extends`: js.UndefOr[ImportSymbol | ClassSymbol | ElementSymbol] = js.undefined
    
    var `-st-global`: js.UndefOr[js.Array[SelectorAstNode]] = js.undefined
    
    var `-st-root`: js.UndefOr[Boolean] = js.undefined
    
    var `-st-states`: js.UndefOr[MappedStates] = js.undefined
  }
  object StylableDirectives {
    
    inline def apply(): StylableDirectives = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[StylableDirectives]
    }
    
    extension [Self <: StylableDirectives](x: Self) {
      
      inline def `set-st-extends`(value: ImportSymbol | ClassSymbol | ElementSymbol): Self = StObject.set(x, "-st-extends", value.asInstanceOf[js.Any])
      
      inline def `set-st-extendsUndefined`: Self = StObject.set(x, "-st-extends", js.undefined)
      
      inline def `set-st-global`(value: js.Array[SelectorAstNode]): Self = StObject.set(x, "-st-global", value.asInstanceOf[js.Any])
      
      inline def `set-st-globalUndefined`: Self = StObject.set(x, "-st-global", js.undefined)
      
      inline def `set-st-globalVarargs`(value: SelectorAstNode*): Self = StObject.set(x, "-st-global", js.Array(value :_*))
      
      inline def `set-st-root`(value: Boolean): Self = StObject.set(x, "-st-root", value.asInstanceOf[js.Any])
      
      inline def `set-st-rootUndefined`: Self = StObject.set(x, "-st-root", js.undefined)
      
      inline def `set-st-states`(value: MappedStates): Self = StObject.set(x, "-st-states", value.asInstanceOf[js.Any])
      
      inline def `set-st-statesUndefined`: Self = StObject.set(x, "-st-states", js.undefined)
    }
  }
  
  /* Rewritten from type alias, can be one of: 
    - typings.stylableCore.stylableMetaMod.ImportSymbol
    - typings.stylableCore.stylableMetaMod.VarSymbol
    - typings.stylableCore.stylableMetaMod.ClassSymbol
    - typings.stylableCore.stylableMetaMod.ElementSymbol
    - typings.stylableCore.stylableMetaMod.CSSVarSymbol
    - typings.stylableCore.stylableMetaMod.KeyframesSymbol
  */
  trait StylableSymbol extends StObject
  object StylableSymbol {
    
    inline def CSSVarSymbol(name: String): typings.stylableCore.stylableMetaMod.CSSVarSymbol = {
      val __obj = js.Dynamic.literal(_kind = "cssVar", name = name.asInstanceOf[js.Any])
      __obj.asInstanceOf[typings.stylableCore.stylableMetaMod.CSSVarSymbol]
    }
    
    inline def ClassSymbol(name: String): typings.stylableCore.stylableMetaMod.ClassSymbol = {
      val __obj = js.Dynamic.literal(_kind = "class", name = name.asInstanceOf[js.Any])
      __obj.asInstanceOf[typings.stylableCore.stylableMetaMod.ClassSymbol]
    }
    
    inline def ElementSymbol(name: String): typings.stylableCore.stylableMetaMod.ElementSymbol = {
      val __obj = js.Dynamic.literal(_kind = "element", name = name.asInstanceOf[js.Any])
      __obj.asInstanceOf[typings.stylableCore.stylableMetaMod.ElementSymbol]
    }
    
    inline def ImportSymbol(context: String, `import`: Imported, name: String, `type`: named | default): typings.stylableCore.stylableMetaMod.ImportSymbol = {
      val __obj = js.Dynamic.literal(_kind = "import", context = context.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
      __obj.updateDynamic("import")(`import`.asInstanceOf[js.Any])
      __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
      __obj.asInstanceOf[typings.stylableCore.stylableMetaMod.ImportSymbol]
    }
    
    inline def KeyframesSymbol(alias: String, name: String): typings.stylableCore.stylableMetaMod.KeyframesSymbol = {
      val __obj = js.Dynamic.literal(_kind = "keyframes", alias = alias.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
      __obj.asInstanceOf[typings.stylableCore.stylableMetaMod.KeyframesSymbol]
    }
    
    inline def VarSymbol(name: String, node: Node, text: String, value: String): typings.stylableCore.stylableMetaMod.VarSymbol = {
      val __obj = js.Dynamic.literal(_kind = "var", name = name.asInstanceOf[js.Any], node = node.asInstanceOf[js.Any], text = text.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any], valueType = null)
      __obj.asInstanceOf[typings.stylableCore.stylableMetaMod.VarSymbol]
    }
  }
  
  trait VarSymbol
    extends StObject
       with StylableSymbol {
    
    var _kind: `var`
    
    var name: String
    
    var node: Node
    
    var text: String
    
    var value: String
    
    var valueType: String | Null
  }
  object VarSymbol {
    
    inline def apply(name: String, node: Node, text: String, value: String): VarSymbol = {
      val __obj = js.Dynamic.literal(_kind = "var", name = name.asInstanceOf[js.Any], node = node.asInstanceOf[js.Any], text = text.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any], valueType = null)
      __obj.asInstanceOf[VarSymbol]
    }
    
    extension [Self <: VarSymbol](x: Self) {
      
      inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      inline def setNode(value: Node): Self = StObject.set(x, "node", value.asInstanceOf[js.Any])
      
      inline def setText(value: String): Self = StObject.set(x, "text", value.asInstanceOf[js.Any])
      
      inline def setValue(value: String): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
      
      inline def setValueType(value: String): Self = StObject.set(x, "valueType", value.asInstanceOf[js.Any])
      
      inline def setValueTypeNull: Self = StObject.set(x, "valueType", null)
      
      inline def set_kind(value: `var`): Self = StObject.set(x, "_kind", value.asInstanceOf[js.Any])
    }
  }
}
