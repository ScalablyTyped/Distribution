package typings.tokeyCssSelectorParser

import typings.tokeyCore.distTypesMod.Token
import typings.tokeyCssSelectorParser.distAstTypesMod.Attribute
import typings.tokeyCssSelectorParser.distAstTypesMod.Class
import typings.tokeyCssSelectorParser.distAstTypesMod.Combinator
import typings.tokeyCssSelectorParser.distAstTypesMod.Comment
import typings.tokeyCssSelectorParser.distAstTypesMod.CompoundSelector
import typings.tokeyCssSelectorParser.distAstTypesMod.Id
import typings.tokeyCssSelectorParser.distAstTypesMod.ImmutableSelectorList
import typings.tokeyCssSelectorParser.distAstTypesMod.ImmutableSelectorNode
import typings.tokeyCssSelectorParser.distAstTypesMod.Nesting
import typings.tokeyCssSelectorParser.distAstTypesMod.Nth
import typings.tokeyCssSelectorParser.distAstTypesMod.NthBase
import typings.tokeyCssSelectorParser.distAstTypesMod.PseudoClass
import typings.tokeyCssSelectorParser.distAstTypesMod.PseudoElement
import typings.tokeyCssSelectorParser.distAstTypesMod.Selector
import typings.tokeyCssSelectorParser.distAstTypesMod.SelectorNode
import typings.tokeyCssSelectorParser.distAstTypesMod.Type
import typings.tokeyCssSelectorParser.distAstTypesMod.Universal
import typings.tokeyCssSelectorParser.tokeyCssSelectorParserInts.`0`
import typings.tokeyCssSelectorParser.tokeyCssSelectorParserInts.`1`
import typings.tokeyCssSelectorParser.tokeyCssSelectorParserStrings.`class`
import typings.tokeyCssSelectorParser.tokeyCssSelectorParserStrings.`type`
import typings.tokeyCssSelectorParser.tokeyCssSelectorParserStrings.attribute
import typings.tokeyCssSelectorParser.tokeyCssSelectorParserStrings.combinator
import typings.tokeyCssSelectorParser.tokeyCssSelectorParserStrings.comment
import typings.tokeyCssSelectorParser.tokeyCssSelectorParserStrings.compound_selector
import typings.tokeyCssSelectorParser.tokeyCssSelectorParserStrings.id
import typings.tokeyCssSelectorParser.tokeyCssSelectorParserStrings.invalid
import typings.tokeyCssSelectorParser.tokeyCssSelectorParserStrings.nesting
import typings.tokeyCssSelectorParser.tokeyCssSelectorParserStrings.nth
import typings.tokeyCssSelectorParser.tokeyCssSelectorParserStrings.nth_dash
import typings.tokeyCssSelectorParser.tokeyCssSelectorParserStrings.nth_of
import typings.tokeyCssSelectorParser.tokeyCssSelectorParserStrings.nth_offset
import typings.tokeyCssSelectorParser.tokeyCssSelectorParserStrings.nth_step
import typings.tokeyCssSelectorParser.tokeyCssSelectorParserStrings.pseudo_class
import typings.tokeyCssSelectorParser.tokeyCssSelectorParserStrings.pseudo_element
import typings.tokeyCssSelectorParser.tokeyCssSelectorParserStrings.selector
import typings.tokeyCssSelectorParser.tokeyCssSelectorParserStrings.universal
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distAstToolsWalkMod {
  
  object walk {
    
    inline def apply(topNode: js.Array[Selector], visit: WalkVisitor[SelectorNode]): Unit = (^.asInstanceOf[js.Dynamic].apply(topNode.asInstanceOf[js.Any], visit.asInstanceOf[js.Any])).asInstanceOf[Unit]
    inline def apply(topNode: js.Array[Selector], visit: WalkVisitor[SelectorNode], options: WalkOptions): Unit = (^.asInstanceOf[js.Dynamic].apply(topNode.asInstanceOf[js.Any], visit.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
    inline def apply(topNode: Token[invalid], visit: WalkVisitor[SelectorNode]): Unit = (^.asInstanceOf[js.Dynamic].apply(topNode.asInstanceOf[js.Any], visit.asInstanceOf[js.Any])).asInstanceOf[Unit]
    inline def apply(topNode: Token[invalid], visit: WalkVisitor[SelectorNode], options: WalkOptions): Unit = (^.asInstanceOf[js.Dynamic].apply(topNode.asInstanceOf[js.Any], visit.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
    inline def apply(topNode: Attribute, visit: WalkVisitor[SelectorNode]): Unit = (^.asInstanceOf[js.Dynamic].apply(topNode.asInstanceOf[js.Any], visit.asInstanceOf[js.Any])).asInstanceOf[Unit]
    inline def apply(topNode: Attribute, visit: WalkVisitor[SelectorNode], options: WalkOptions): Unit = (^.asInstanceOf[js.Dynamic].apply(topNode.asInstanceOf[js.Any], visit.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
    inline def apply(topNode: Class, visit: WalkVisitor[SelectorNode]): Unit = (^.asInstanceOf[js.Dynamic].apply(topNode.asInstanceOf[js.Any], visit.asInstanceOf[js.Any])).asInstanceOf[Unit]
    inline def apply(topNode: Class, visit: WalkVisitor[SelectorNode], options: WalkOptions): Unit = (^.asInstanceOf[js.Dynamic].apply(topNode.asInstanceOf[js.Any], visit.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
    inline def apply(topNode: Combinator, visit: WalkVisitor[SelectorNode]): Unit = (^.asInstanceOf[js.Dynamic].apply(topNode.asInstanceOf[js.Any], visit.asInstanceOf[js.Any])).asInstanceOf[Unit]
    inline def apply(topNode: Combinator, visit: WalkVisitor[SelectorNode], options: WalkOptions): Unit = (^.asInstanceOf[js.Dynamic].apply(topNode.asInstanceOf[js.Any], visit.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
    inline def apply(topNode: Comment, visit: WalkVisitor[SelectorNode]): Unit = (^.asInstanceOf[js.Dynamic].apply(topNode.asInstanceOf[js.Any], visit.asInstanceOf[js.Any])).asInstanceOf[Unit]
    inline def apply(topNode: Comment, visit: WalkVisitor[SelectorNode], options: WalkOptions): Unit = (^.asInstanceOf[js.Dynamic].apply(topNode.asInstanceOf[js.Any], visit.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
    inline def apply(topNode: CompoundSelector, visit: WalkVisitor[SelectorNode]): Unit = (^.asInstanceOf[js.Dynamic].apply(topNode.asInstanceOf[js.Any], visit.asInstanceOf[js.Any])).asInstanceOf[Unit]
    inline def apply(topNode: CompoundSelector, visit: WalkVisitor[SelectorNode], options: WalkOptions): Unit = (^.asInstanceOf[js.Dynamic].apply(topNode.asInstanceOf[js.Any], visit.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
    inline def apply(topNode: Id, visit: WalkVisitor[SelectorNode]): Unit = (^.asInstanceOf[js.Dynamic].apply(topNode.asInstanceOf[js.Any], visit.asInstanceOf[js.Any])).asInstanceOf[Unit]
    inline def apply(topNode: Id, visit: WalkVisitor[SelectorNode], options: WalkOptions): Unit = (^.asInstanceOf[js.Dynamic].apply(topNode.asInstanceOf[js.Any], visit.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
    inline def apply(topNode: Nesting, visit: WalkVisitor[SelectorNode]): Unit = (^.asInstanceOf[js.Dynamic].apply(topNode.asInstanceOf[js.Any], visit.asInstanceOf[js.Any])).asInstanceOf[Unit]
    inline def apply(topNode: Nesting, visit: WalkVisitor[SelectorNode], options: WalkOptions): Unit = (^.asInstanceOf[js.Dynamic].apply(topNode.asInstanceOf[js.Any], visit.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
    inline def apply(topNode: NthBase[nth_dash | nth_of | nth_offset | nth_step], visit: WalkVisitor[SelectorNode]): Unit = (^.asInstanceOf[js.Dynamic].apply(topNode.asInstanceOf[js.Any], visit.asInstanceOf[js.Any])).asInstanceOf[Unit]
    inline def apply(
      topNode: NthBase[nth_dash | nth_of | nth_offset | nth_step],
      visit: WalkVisitor[SelectorNode],
      options: WalkOptions
    ): Unit = (^.asInstanceOf[js.Dynamic].apply(topNode.asInstanceOf[js.Any], visit.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
    inline def apply(topNode: Nth, visit: WalkVisitor[SelectorNode]): Unit = (^.asInstanceOf[js.Dynamic].apply(topNode.asInstanceOf[js.Any], visit.asInstanceOf[js.Any])).asInstanceOf[Unit]
    inline def apply(topNode: Nth, visit: WalkVisitor[SelectorNode], options: WalkOptions): Unit = (^.asInstanceOf[js.Dynamic].apply(topNode.asInstanceOf[js.Any], visit.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
    inline def apply(topNode: PseudoClass, visit: WalkVisitor[SelectorNode]): Unit = (^.asInstanceOf[js.Dynamic].apply(topNode.asInstanceOf[js.Any], visit.asInstanceOf[js.Any])).asInstanceOf[Unit]
    inline def apply(topNode: PseudoClass, visit: WalkVisitor[SelectorNode], options: WalkOptions): Unit = (^.asInstanceOf[js.Dynamic].apply(topNode.asInstanceOf[js.Any], visit.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
    inline def apply(topNode: PseudoElement, visit: WalkVisitor[SelectorNode]): Unit = (^.asInstanceOf[js.Dynamic].apply(topNode.asInstanceOf[js.Any], visit.asInstanceOf[js.Any])).asInstanceOf[Unit]
    inline def apply(topNode: PseudoElement, visit: WalkVisitor[SelectorNode], options: WalkOptions): Unit = (^.asInstanceOf[js.Dynamic].apply(topNode.asInstanceOf[js.Any], visit.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
    inline def apply(topNode: Selector, visit: WalkVisitor[SelectorNode]): Unit = (^.asInstanceOf[js.Dynamic].apply(topNode.asInstanceOf[js.Any], visit.asInstanceOf[js.Any])).asInstanceOf[Unit]
    inline def apply(topNode: Selector, visit: WalkVisitor[SelectorNode], options: WalkOptions): Unit = (^.asInstanceOf[js.Dynamic].apply(topNode.asInstanceOf[js.Any], visit.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
    inline def apply(topNode: Type, visit: WalkVisitor[SelectorNode]): Unit = (^.asInstanceOf[js.Dynamic].apply(topNode.asInstanceOf[js.Any], visit.asInstanceOf[js.Any])).asInstanceOf[Unit]
    inline def apply(topNode: Type, visit: WalkVisitor[SelectorNode], options: WalkOptions): Unit = (^.asInstanceOf[js.Dynamic].apply(topNode.asInstanceOf[js.Any], visit.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
    inline def apply(topNode: Universal, visit: WalkVisitor[SelectorNode]): Unit = (^.asInstanceOf[js.Dynamic].apply(topNode.asInstanceOf[js.Any], visit.asInstanceOf[js.Any])).asInstanceOf[Unit]
    inline def apply(topNode: Universal, visit: WalkVisitor[SelectorNode], options: WalkOptions): Unit = (^.asInstanceOf[js.Dynamic].apply(topNode.asInstanceOf[js.Any], visit.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
    inline def apply[AST /* <: ImmutableSelectorNode | ImmutableSelectorList */](topNode: AST, visit: WalkVisitor[ImmutableSelectorNode]): Unit = (^.asInstanceOf[js.Dynamic].apply(topNode.asInstanceOf[js.Any], visit.asInstanceOf[js.Any])).asInstanceOf[Unit]
    inline def apply[AST /* <: ImmutableSelectorNode | ImmutableSelectorList */](topNode: AST, visit: WalkVisitor[ImmutableSelectorNode], options: WalkOptions): Unit = (^.asInstanceOf[js.Dynamic].apply(topNode.asInstanceOf[js.Any], visit.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
    
    @JSImport("@tokey/css-selector-parser/dist/ast-tools/walk", "walk")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("@tokey/css-selector-parser/dist/ast-tools/walk", "walk.skipCurrentSelector")
    @js.native
    def skipCurrentSelector: `1` = js.native
    inline def skipCurrentSelector_=(x: `1`): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("skipCurrentSelector")(x.asInstanceOf[js.Any])
    
    @JSImport("@tokey/css-selector-parser/dist/ast-tools/walk", "walk.skipNested")
    @js.native
    def skipNested: `0` = js.native
    inline def skipNested_=(x: `0`): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("skipNested")(x.asInstanceOf[js.Any])
    
    @JSImport("@tokey/css-selector-parser/dist/ast-tools/walk", "walk.stopAll")
    @js.native
    def stopAll: Double = js.native
    inline def stopAll_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("stopAll")(x.asInstanceOf[js.Any])
  }
  
  trait WalkOptions extends StObject {
    
    var ignoreList: js.UndefOr[
        js.Array[
          `type` | universal | attribute | id | `class` | pseudo_class | pseudo_element | nesting | selector | compound_selector | combinator | comment | invalid | nth | nth_step | nth_dash | nth_offset | nth_of
        ]
      ] = js.undefined
    
    var visitList: js.UndefOr[
        js.Array[
          `type` | universal | attribute | id | `class` | pseudo_class | pseudo_element | nesting | selector | compound_selector | combinator | comment | invalid | nth | nth_step | nth_dash | nth_offset | nth_of
        ]
      ] = js.undefined
  }
  object WalkOptions {
    
    inline def apply(): WalkOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[WalkOptions]
    }
    
    extension [Self <: WalkOptions](x: Self) {
      
      inline def setIgnoreList(
        value: js.Array[
              `type` | universal | attribute | id | `class` | pseudo_class | pseudo_element | nesting | selector | compound_selector | combinator | comment | invalid | nth | nth_step | nth_dash | nth_offset | nth_of
            ]
      ): Self = StObject.set(x, "ignoreList", value.asInstanceOf[js.Any])
      
      inline def setIgnoreListUndefined: Self = StObject.set(x, "ignoreList", js.undefined)
      
      inline def setIgnoreListVarargs(
        value: (`type` | universal | attribute | id | `class` | pseudo_class | pseudo_element | nesting | selector | compound_selector | combinator | comment | invalid | nth | nth_step | nth_dash | nth_offset | nth_of)*
      ): Self = StObject.set(x, "ignoreList", js.Array(value*))
      
      inline def setVisitList(
        value: js.Array[
              `type` | universal | attribute | id | `class` | pseudo_class | pseudo_element | nesting | selector | compound_selector | combinator | comment | invalid | nth | nth_step | nth_dash | nth_offset | nth_of
            ]
      ): Self = StObject.set(x, "visitList", value.asInstanceOf[js.Any])
      
      inline def setVisitListUndefined: Self = StObject.set(x, "visitList", js.undefined)
      
      inline def setVisitListVarargs(
        value: (`type` | universal | attribute | id | `class` | pseudo_class | pseudo_element | nesting | selector | compound_selector | combinator | comment | invalid | nth | nth_step | nth_dash | nth_offset | nth_of)*
      ): Self = StObject.set(x, "visitList", js.Array(value*))
    }
  }
  
  type WalkVisitor[AST /* <: SelectorNode | ImmutableSelectorNode */] = js.Function4[
    /* node */ AST, 
    /* index */ Double, 
    /* nodes */ js.Array[AST], 
    /* parents */ js.Array[AST], 
    js.UndefOr[Double | Unit]
  ]
}
