package typings.tokeyCssSelectorParser

import typings.tokeyCore.typesMod.Token
import typings.tokeyCssSelectorParser.anon.PartialParseConfig
import typings.tokeyCssSelectorParser.astTypesMod.Attribute
import typings.tokeyCssSelectorParser.astTypesMod.Class
import typings.tokeyCssSelectorParser.astTypesMod.Combinator
import typings.tokeyCssSelectorParser.astTypesMod.Comment
import typings.tokeyCssSelectorParser.astTypesMod.CompoundSelector
import typings.tokeyCssSelectorParser.astTypesMod.Id
import typings.tokeyCssSelectorParser.astTypesMod.ImmutableNthSelectorList
import typings.tokeyCssSelectorParser.astTypesMod.ImmutableSelector
import typings.tokeyCssSelectorParser.astTypesMod.ImmutableSelectorList
import typings.tokeyCssSelectorParser.astTypesMod.ImmutableSelectorNode
import typings.tokeyCssSelectorParser.astTypesMod.Nesting
import typings.tokeyCssSelectorParser.astTypesMod.Nth
import typings.tokeyCssSelectorParser.astTypesMod.NthBase
import typings.tokeyCssSelectorParser.astTypesMod.PseudoClass
import typings.tokeyCssSelectorParser.astTypesMod.PseudoElement
import typings.tokeyCssSelectorParser.astTypesMod.Selector
import typings.tokeyCssSelectorParser.astTypesMod.SelectorList
import typings.tokeyCssSelectorParser.astTypesMod.SelectorNode
import typings.tokeyCssSelectorParser.astTypesMod.Type
import typings.tokeyCssSelectorParser.astTypesMod.Universal
import typings.tokeyCssSelectorParser.compoundMod.GroupCompoundOptions
import typings.tokeyCssSelectorParser.specificityMod.Specificity
import typings.tokeyCssSelectorParser.tokeyCssSelectorParserInts.`-1`
import typings.tokeyCssSelectorParser.tokeyCssSelectorParserInts.`0`
import typings.tokeyCssSelectorParser.tokeyCssSelectorParserInts.`1`
import typings.tokeyCssSelectorParser.tokeyCssSelectorParserStrings.invalid
import typings.tokeyCssSelectorParser.tokeyCssSelectorParserStrings.nth_dash
import typings.tokeyCssSelectorParser.tokeyCssSelectorParserStrings.nth_of
import typings.tokeyCssSelectorParser.tokeyCssSelectorParserStrings.nth_offset
import typings.tokeyCssSelectorParser.tokeyCssSelectorParserStrings.nth_step
import typings.tokeyCssSelectorParser.walkMod.WalkOptions
import typings.tokeyCssSelectorParser.walkMod.WalkVisitor
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("@tokey/css-selector-parser", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def calcSpecificity(ast: ImmutableSelectorNode): Specificity = ^.asInstanceOf[js.Dynamic].applyDynamic("calcSpecificity")(ast.asInstanceOf[js.Any]).asInstanceOf[Specificity]
  
  inline def compareSpecificity(a: Specificity, b: Specificity): `-1` | `0` | `1` = (^.asInstanceOf[js.Dynamic].applyDynamic("compareSpecificity")(a.asInstanceOf[js.Any], b.asInstanceOf[js.Any])).asInstanceOf[`-1` | `0` | `1`]
  
  inline def groupCompoundSelectors[AST /* <: ImmutableSelectorList */](input: AST): ImmutableSelectorList = ^.asInstanceOf[js.Dynamic].applyDynamic("groupCompoundSelectors")(input.asInstanceOf[js.Any]).asInstanceOf[ImmutableSelectorList]
  inline def groupCompoundSelectors[AST /* <: ImmutableSelectorList */](input: AST, options: GroupCompoundOptions): ImmutableSelectorList = (^.asInstanceOf[js.Dynamic].applyDynamic("groupCompoundSelectors")(input.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[ImmutableSelectorList]
  
  inline def groupCompoundSelectors_AST_ImmutableSelector[AST /* <: ImmutableSelector */](input: AST): ImmutableSelector = ^.asInstanceOf[js.Dynamic].applyDynamic("groupCompoundSelectors")(input.asInstanceOf[js.Any]).asInstanceOf[ImmutableSelector]
  inline def groupCompoundSelectors_AST_ImmutableSelector[AST /* <: ImmutableSelector */](input: AST, options: GroupCompoundOptions): ImmutableSelector = (^.asInstanceOf[js.Dynamic].applyDynamic("groupCompoundSelectors")(input.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[ImmutableSelector]
  
  inline def groupCompoundSelectors_AST_Selector[AST /* <: Selector */](input: AST): Selector = ^.asInstanceOf[js.Dynamic].applyDynamic("groupCompoundSelectors")(input.asInstanceOf[js.Any]).asInstanceOf[Selector]
  inline def groupCompoundSelectors_AST_Selector[AST /* <: Selector */](input: AST, options: GroupCompoundOptions): Selector = (^.asInstanceOf[js.Dynamic].applyDynamic("groupCompoundSelectors")(input.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Selector]
  
  inline def groupCompoundSelectors_AST_SelectorList[AST /* <: SelectorList */](input: AST): SelectorList = ^.asInstanceOf[js.Dynamic].applyDynamic("groupCompoundSelectors")(input.asInstanceOf[js.Any]).asInstanceOf[SelectorList]
  inline def groupCompoundSelectors_AST_SelectorList[AST /* <: SelectorList */](input: AST, options: GroupCompoundOptions): SelectorList = (^.asInstanceOf[js.Dynamic].applyDynamic("groupCompoundSelectors")(input.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[SelectorList]
  
  inline def parseCssSelector(source: String): SelectorList = ^.asInstanceOf[js.Dynamic].applyDynamic("parseCssSelector")(source.asInstanceOf[js.Any]).asInstanceOf[SelectorList]
  inline def parseCssSelector(source: String, options: PartialParseConfig): SelectorList = (^.asInstanceOf[js.Dynamic].applyDynamic("parseCssSelector")(source.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[SelectorList]
  
  inline def splitCompoundSelectors[AST /* <: ImmutableSelectorList */](input: AST): ImmutableSelectorList = ^.asInstanceOf[js.Dynamic].applyDynamic("splitCompoundSelectors")(input.asInstanceOf[js.Any]).asInstanceOf[ImmutableSelectorList]
  
  inline def splitCompoundSelectors_AST_ImmutableSelector[AST /* <: ImmutableSelector */](input: AST): ImmutableSelector = ^.asInstanceOf[js.Dynamic].applyDynamic("splitCompoundSelectors")(input.asInstanceOf[js.Any]).asInstanceOf[ImmutableSelector]
  
  inline def splitCompoundSelectors_AST_Selector[AST /* <: Selector */](input: AST): Selector = ^.asInstanceOf[js.Dynamic].applyDynamic("splitCompoundSelectors")(input.asInstanceOf[js.Any]).asInstanceOf[Selector]
  
  inline def splitCompoundSelectors_AST_SelectorList[AST /* <: SelectorList */](input: AST): SelectorList = ^.asInstanceOf[js.Dynamic].applyDynamic("splitCompoundSelectors")(input.asInstanceOf[js.Any]).asInstanceOf[SelectorList]
  
  inline def stringifySelectorAst(value: ImmutableSelectorList | ImmutableSelectorNode): String = ^.asInstanceOf[js.Dynamic].applyDynamic("stringifySelectorAst")(value.asInstanceOf[js.Any]).asInstanceOf[String]
  inline def stringifySelectorAst(value: ImmutableNthSelectorList): String = ^.asInstanceOf[js.Dynamic].applyDynamic("stringifySelectorAst")(value.asInstanceOf[js.Any]).asInstanceOf[String]
  
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
    
    @JSImport("@tokey/css-selector-parser", "walk")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("@tokey/css-selector-parser", "walk.skipCurrentSelector")
    @js.native
    def skipCurrentSelector: `1` = js.native
    inline def skipCurrentSelector_=(x: `1`): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("skipCurrentSelector")(x.asInstanceOf[js.Any])
    
    @JSImport("@tokey/css-selector-parser", "walk.skipNested")
    @js.native
    def skipNested: `0` = js.native
    inline def skipNested_=(x: `0`): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("skipNested")(x.asInstanceOf[js.Any])
    
    @JSImport("@tokey/css-selector-parser", "walk.stopAll")
    @js.native
    def stopAll: Double = js.native
    inline def stopAll_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("stopAll")(x.asInstanceOf[js.Any])
  }
}
