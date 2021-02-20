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
import scala.scalajs.js.`|`
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
  
  @js.native
  trait CSSVarSymbol extends StylableSymbol {
    
    var _kind: cssVar = js.native
    
    var global: js.UndefOr[Boolean] = js.native
    
    var name: String = js.native
  }
  object CSSVarSymbol {
    
    @scala.inline
    def apply(_kind: cssVar, name: String): CSSVarSymbol = {
      val __obj = js.Dynamic.literal(_kind = _kind.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
      __obj.asInstanceOf[CSSVarSymbol]
    }
    
    @scala.inline
    implicit class CSSVarSymbolMutableBuilder[Self <: CSSVarSymbol] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setGlobal(value: Boolean): Self = StObject.set(x, "global", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setGlobalUndefined: Self = StObject.set(x, "global", js.undefined)
      
      @scala.inline
      def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      @scala.inline
      def set_kind(value: cssVar): Self = StObject.set(x, "_kind", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait ClassSymbol
    extends StylableDirectives
       with StylableSymbol {
    
    var _kind: `class` = js.native
    
    var alias: js.UndefOr[ImportSymbol] = js.native
    
    var name: String = js.native
    
    var scoped: js.UndefOr[String] = js.native
  }
  object ClassSymbol {
    
    @scala.inline
    def apply(_kind: `class`, name: String): ClassSymbol = {
      val __obj = js.Dynamic.literal(_kind = _kind.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
      __obj.asInstanceOf[ClassSymbol]
    }
    
    @scala.inline
    implicit class ClassSymbolMutableBuilder[Self <: ClassSymbol] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAlias(value: ImportSymbol): Self = StObject.set(x, "alias", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAliasUndefined: Self = StObject.set(x, "alias", js.undefined)
      
      @scala.inline
      def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setScoped(value: String): Self = StObject.set(x, "scoped", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setScopedUndefined: Self = StObject.set(x, "scoped", js.undefined)
      
      @scala.inline
      def set_kind(value: `class`): Self = StObject.set(x, "_kind", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait ElementSymbol
    extends StylableDirectives
       with StylableSymbol {
    
    var _kind: element = js.native
    
    var alias: js.UndefOr[ImportSymbol] = js.native
    
    var name: String = js.native
  }
  object ElementSymbol {
    
    @scala.inline
    def apply(_kind: element, name: String): ElementSymbol = {
      val __obj = js.Dynamic.literal(_kind = _kind.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
      __obj.asInstanceOf[ElementSymbol]
    }
    
    @scala.inline
    implicit class ElementSymbolMutableBuilder[Self <: ElementSymbol] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAlias(value: ImportSymbol): Self = StObject.set(x, "alias", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAliasUndefined: Self = StObject.set(x, "alias", js.undefined)
      
      @scala.inline
      def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      @scala.inline
      def set_kind(value: element): Self = StObject.set(x, "_kind", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait ImportSymbol extends StylableSymbol {
    
    var _kind: `import` = js.native
    
    var context: String = js.native
    
    var `import`: Imported = js.native
    
    var name: String = js.native
    
    var `type`: named | default = js.native
  }
  object ImportSymbol {
    
    @scala.inline
    def apply(_kind: `import`, context: String, `import`: Imported, name: String, `type`: named | default): ImportSymbol = {
      val __obj = js.Dynamic.literal(_kind = _kind.asInstanceOf[js.Any], context = context.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
      __obj.updateDynamic("import")(`import`.asInstanceOf[js.Any])
      __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
      __obj.asInstanceOf[ImportSymbol]
    }
    
    @scala.inline
    implicit class ImportSymbolMutableBuilder[Self <: ImportSymbol] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setContext(value: String): Self = StObject.set(x, "context", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setImport(value: Imported): Self = StObject.set(x, "import", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setType(value: named | default): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
      
      @scala.inline
      def set_kind(value: `import`): Self = StObject.set(x, "_kind", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait Imported extends StObject {
    
    var context: String = js.native
    
    var defaultExport: String = js.native
    
    var from: String = js.native
    
    var fromRelative: String = js.native
    
    var keyframes: Record[String, String] = js.native
    
    var named: Record[String, String] = js.native
    
    var rule: Rule_ = js.native
  }
  object Imported {
    
    @scala.inline
    def apply(
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
    
    @scala.inline
    implicit class ImportedMutableBuilder[Self <: Imported] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setContext(value: String): Self = StObject.set(x, "context", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDefaultExport(value: String): Self = StObject.set(x, "defaultExport", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFrom(value: String): Self = StObject.set(x, "from", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFromRelative(value: String): Self = StObject.set(x, "fromRelative", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setKeyframes(value: Record[String, String]): Self = StObject.set(x, "keyframes", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setNamed(value: Record[String, String]): Self = StObject.set(x, "named", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRule(value: Rule_): Self = StObject.set(x, "rule", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait KeyframesSymbol extends StylableSymbol {
    
    var _kind: keyframes = js.native
    
    var alias: String = js.native
    
    var `import`: js.UndefOr[Imported] = js.native
    
    var name: String = js.native
  }
  object KeyframesSymbol {
    
    @scala.inline
    def apply(_kind: keyframes, alias: String, name: String): KeyframesSymbol = {
      val __obj = js.Dynamic.literal(_kind = _kind.asInstanceOf[js.Any], alias = alias.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
      __obj.asInstanceOf[KeyframesSymbol]
    }
    
    @scala.inline
    implicit class KeyframesSymbolMutableBuilder[Self <: KeyframesSymbol] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAlias(value: String): Self = StObject.set(x, "alias", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setImport(value: Imported): Self = StObject.set(x, "import", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setImportUndefined: Self = StObject.set(x, "import", js.undefined)
      
      @scala.inline
      def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      @scala.inline
      def set_kind(value: keyframes): Self = StObject.set(x, "_kind", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait RefedMixin extends StObject {
    
    var mixin: MixinValue = js.native
    
    var ref: ImportSymbol | ClassSymbol = js.native
  }
  object RefedMixin {
    
    @scala.inline
    def apply(mixin: MixinValue, ref: ImportSymbol | ClassSymbol): RefedMixin = {
      val __obj = js.Dynamic.literal(mixin = mixin.asInstanceOf[js.Any], ref = ref.asInstanceOf[js.Any])
      __obj.asInstanceOf[RefedMixin]
    }
    
    @scala.inline
    implicit class RefedMixinMutableBuilder[Self <: RefedMixin] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setMixin(value: MixinValue): Self = StObject.set(x, "mixin", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRef(value: ImportSymbol | ClassSymbol): Self = StObject.set(x, "ref", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait SimpleSelector extends StObject {
    
    var node: Rule_ | Root_ = js.native
    
    var symbol: ClassSymbol | ElementSymbol = js.native
  }
  object SimpleSelector {
    
    @scala.inline
    def apply(node: Rule_ | Root_, symbol: ClassSymbol | ElementSymbol): SimpleSelector = {
      val __obj = js.Dynamic.literal(node = node.asInstanceOf[js.Any], symbol = symbol.asInstanceOf[js.Any])
      __obj.asInstanceOf[SimpleSelector]
    }
    
    @scala.inline
    implicit class SimpleSelectorMutableBuilder[Self <: SimpleSelector] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setNode(value: Rule_ | Root_): Self = StObject.set(x, "node", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSymbol(value: ClassSymbol | ElementSymbol): Self = StObject.set(x, "symbol", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait StylableDirectives extends StObject {
    
    var `-st-extends`: js.UndefOr[ImportSymbol | ClassSymbol | ElementSymbol] = js.native
    
    var `-st-global`: js.UndefOr[js.Array[SelectorAstNode]] = js.native
    
    var `-st-root`: js.UndefOr[Boolean] = js.native
    
    var `-st-states`: js.UndefOr[MappedStates] = js.native
  }
  object StylableDirectives {
    
    @scala.inline
    def apply(): StylableDirectives = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[StylableDirectives]
    }
    
    @scala.inline
    implicit class StylableDirectivesMutableBuilder[Self <: StylableDirectives] (val x: Self) extends AnyVal {
      
      @scala.inline
      def `set-st-extends`(value: ImportSymbol | ClassSymbol | ElementSymbol): Self = StObject.set(x, "-st-extends", value.asInstanceOf[js.Any])
      
      @scala.inline
      def `set-st-extendsUndefined`: Self = StObject.set(x, "-st-extends", js.undefined)
      
      @scala.inline
      def `set-st-global`(value: js.Array[SelectorAstNode]): Self = StObject.set(x, "-st-global", value.asInstanceOf[js.Any])
      
      @scala.inline
      def `set-st-globalUndefined`: Self = StObject.set(x, "-st-global", js.undefined)
      
      @scala.inline
      def `set-st-globalVarargs`(value: SelectorAstNode*): Self = StObject.set(x, "-st-global", js.Array(value :_*))
      
      @scala.inline
      def `set-st-root`(value: Boolean): Self = StObject.set(x, "-st-root", value.asInstanceOf[js.Any])
      
      @scala.inline
      def `set-st-rootUndefined`: Self = StObject.set(x, "-st-root", js.undefined)
      
      @scala.inline
      def `set-st-states`(value: MappedStates): Self = StObject.set(x, "-st-states", value.asInstanceOf[js.Any])
      
      @scala.inline
      def `set-st-statesUndefined`: Self = StObject.set(x, "-st-states", js.undefined)
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
    
    @scala.inline
    def CSSVarSymbol(_kind: cssVar, name: String): typings.stylableCore.stylableMetaMod.CSSVarSymbol = {
      val __obj = js.Dynamic.literal(_kind = _kind.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
      __obj.asInstanceOf[typings.stylableCore.stylableMetaMod.CSSVarSymbol]
    }
    
    @scala.inline
    def ClassSymbol(_kind: `class`, name: String): typings.stylableCore.stylableMetaMod.ClassSymbol = {
      val __obj = js.Dynamic.literal(_kind = _kind.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
      __obj.asInstanceOf[typings.stylableCore.stylableMetaMod.ClassSymbol]
    }
    
    @scala.inline
    def ElementSymbol(_kind: element, name: String): typings.stylableCore.stylableMetaMod.ElementSymbol = {
      val __obj = js.Dynamic.literal(_kind = _kind.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
      __obj.asInstanceOf[typings.stylableCore.stylableMetaMod.ElementSymbol]
    }
    
    @scala.inline
    def ImportSymbol(_kind: `import`, context: String, `import`: Imported, name: String, `type`: named | default): typings.stylableCore.stylableMetaMod.ImportSymbol = {
      val __obj = js.Dynamic.literal(_kind = _kind.asInstanceOf[js.Any], context = context.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
      __obj.updateDynamic("import")(`import`.asInstanceOf[js.Any])
      __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
      __obj.asInstanceOf[typings.stylableCore.stylableMetaMod.ImportSymbol]
    }
    
    @scala.inline
    def KeyframesSymbol(_kind: keyframes, alias: String, name: String): typings.stylableCore.stylableMetaMod.KeyframesSymbol = {
      val __obj = js.Dynamic.literal(_kind = _kind.asInstanceOf[js.Any], alias = alias.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
      __obj.asInstanceOf[typings.stylableCore.stylableMetaMod.KeyframesSymbol]
    }
    
    @scala.inline
    def VarSymbol(_kind: `var`, name: String, node: Node, text: String, value: String): typings.stylableCore.stylableMetaMod.VarSymbol = {
      val __obj = js.Dynamic.literal(_kind = _kind.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], node = node.asInstanceOf[js.Any], text = text.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
      __obj.asInstanceOf[typings.stylableCore.stylableMetaMod.VarSymbol]
    }
  }
  
  @js.native
  trait VarSymbol extends StylableSymbol {
    
    var _kind: `var` = js.native
    
    var name: String = js.native
    
    var node: Node = js.native
    
    var text: String = js.native
    
    var value: String = js.native
    
    var valueType: String | Null = js.native
  }
  object VarSymbol {
    
    @scala.inline
    def apply(_kind: `var`, name: String, node: Node, text: String, value: String): VarSymbol = {
      val __obj = js.Dynamic.literal(_kind = _kind.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], node = node.asInstanceOf[js.Any], text = text.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
      __obj.asInstanceOf[VarSymbol]
    }
    
    @scala.inline
    implicit class VarSymbolMutableBuilder[Self <: VarSymbol] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setNode(value: Node): Self = StObject.set(x, "node", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setText(value: String): Self = StObject.set(x, "text", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setValue(value: String): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setValueType(value: String): Self = StObject.set(x, "valueType", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setValueTypeNull: Self = StObject.set(x, "valueType", null)
      
      @scala.inline
      def set_kind(value: `var`): Self = StObject.set(x, "_kind", value.asInstanceOf[js.Any])
    }
  }
}
