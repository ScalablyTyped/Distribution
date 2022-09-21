package typings.tokeyCssSelectorParser

import typings.tokeyCssSelectorParser.astTypesMod.ImmutableSelector
import typings.tokeyCssSelectorParser.astTypesMod.ImmutableSelectorList
import typings.tokeyCssSelectorParser.astTypesMod.Selector
import typings.tokeyCssSelectorParser.astTypesMod.SelectorList
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object compoundMod {
  
  @JSImport("@tokey/css-selector-parser/dist/ast-tools/compound", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def groupCompoundSelectors[AST /* <: ImmutableSelector */](input: AST): ImmutableSelector = ^.asInstanceOf[js.Dynamic].applyDynamic("groupCompoundSelectors")(input.asInstanceOf[js.Any]).asInstanceOf[ImmutableSelector]
  inline def groupCompoundSelectors[AST /* <: ImmutableSelector */](input: AST, options: GroupCompoundOptions): ImmutableSelector = (^.asInstanceOf[js.Dynamic].applyDynamic("groupCompoundSelectors")(input.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[ImmutableSelector]
  
  inline def groupCompoundSelectors_AST_ImmutableSelectorList_ImmutableSelectorList[AST /* <: ImmutableSelectorList */](input: AST): ImmutableSelectorList = ^.asInstanceOf[js.Dynamic].applyDynamic("groupCompoundSelectors")(input.asInstanceOf[js.Any]).asInstanceOf[ImmutableSelectorList]
  inline def groupCompoundSelectors_AST_ImmutableSelectorList_ImmutableSelectorList[AST /* <: ImmutableSelectorList */](input: AST, options: GroupCompoundOptions): ImmutableSelectorList = (^.asInstanceOf[js.Dynamic].applyDynamic("groupCompoundSelectors")(input.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[ImmutableSelectorList]
  
  inline def groupCompoundSelectors_AST_SelectorList_SelectorList[AST /* <: SelectorList */](input: AST): SelectorList = ^.asInstanceOf[js.Dynamic].applyDynamic("groupCompoundSelectors")(input.asInstanceOf[js.Any]).asInstanceOf[SelectorList]
  inline def groupCompoundSelectors_AST_SelectorList_SelectorList[AST /* <: SelectorList */](input: AST, options: GroupCompoundOptions): SelectorList = (^.asInstanceOf[js.Dynamic].applyDynamic("groupCompoundSelectors")(input.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[SelectorList]
  
  inline def groupCompoundSelectors_AST_Selector_Selector[AST /* <: Selector */](input: AST): Selector = ^.asInstanceOf[js.Dynamic].applyDynamic("groupCompoundSelectors")(input.asInstanceOf[js.Any]).asInstanceOf[Selector]
  inline def groupCompoundSelectors_AST_Selector_Selector[AST /* <: Selector */](input: AST, options: GroupCompoundOptions): Selector = (^.asInstanceOf[js.Dynamic].applyDynamic("groupCompoundSelectors")(input.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Selector]
  
  inline def splitCompoundSelectors[AST /* <: ImmutableSelector */](input: AST): ImmutableSelector = ^.asInstanceOf[js.Dynamic].applyDynamic("splitCompoundSelectors")(input.asInstanceOf[js.Any]).asInstanceOf[ImmutableSelector]
  
  inline def splitCompoundSelectors_AST_ImmutableSelectorList_ImmutableSelectorList[AST /* <: ImmutableSelectorList */](input: AST): ImmutableSelectorList = ^.asInstanceOf[js.Dynamic].applyDynamic("splitCompoundSelectors")(input.asInstanceOf[js.Any]).asInstanceOf[ImmutableSelectorList]
  
  inline def splitCompoundSelectors_AST_SelectorList_SelectorList[AST /* <: SelectorList */](input: AST): SelectorList = ^.asInstanceOf[js.Dynamic].applyDynamic("splitCompoundSelectors")(input.asInstanceOf[js.Any]).asInstanceOf[SelectorList]
  
  inline def splitCompoundSelectors_AST_Selector_Selector[AST /* <: Selector */](input: AST): Selector = ^.asInstanceOf[js.Dynamic].applyDynamic("splitCompoundSelectors")(input.asInstanceOf[js.Any]).asInstanceOf[Selector]
  
  trait GroupCompoundOptions extends StObject {
    
    var deep: js.UndefOr[Boolean] = js.undefined
    
    var splitPseudoElements: js.UndefOr[Boolean] = js.undefined
  }
  object GroupCompoundOptions {
    
    inline def apply(): GroupCompoundOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[GroupCompoundOptions]
    }
    
    extension [Self <: GroupCompoundOptions](x: Self) {
      
      inline def setDeep(value: Boolean): Self = StObject.set(x, "deep", value.asInstanceOf[js.Any])
      
      inline def setDeepUndefined: Self = StObject.set(x, "deep", js.undefined)
      
      inline def setSplitPseudoElements(value: Boolean): Self = StObject.set(x, "splitPseudoElements", value.asInstanceOf[js.Any])
      
      inline def setSplitPseudoElementsUndefined: Self = StObject.set(x, "splitPseudoElements", js.undefined)
    }
  }
}
