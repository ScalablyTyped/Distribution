package typings.tokeyCssSelectorParser

import typings.tokeyCssSelectorParser.distAstTypesMod.ImmutableSelectorNode
import typings.tokeyCssSelectorParser.tokeyCssSelectorParserInts.`-1`
import typings.tokeyCssSelectorParser.tokeyCssSelectorParserInts.`0`
import typings.tokeyCssSelectorParser.tokeyCssSelectorParserInts.`1`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distAstToolsSpecificityMod {
  
  @JSImport("@tokey/css-selector-parser/dist/ast-tools/specificity", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def calcSpecificity(ast: ImmutableSelectorNode): Specificity = ^.asInstanceOf[js.Dynamic].applyDynamic("calcSpecificity")(ast.asInstanceOf[js.Any]).asInstanceOf[Specificity]
  
  inline def compareSpecificity(a: Specificity, b: Specificity): `-1` | `0` | `1` = (^.asInstanceOf[js.Dynamic].applyDynamic("compareSpecificity")(a.asInstanceOf[js.Any], b.asInstanceOf[js.Any])).asInstanceOf[`-1` | `0` | `1`]
  
  type Specificity = js.Tuple4[
    /* inlineLevel */ Double, 
    /* idLevel */ Double, 
    /* classOrAttributeLevel */ Double, 
    /* typeOrElementLevel */ Double
  ]
}
