package typings.tokeyCssSelectorParser.distAstTypesMod

import typings.tokeyCssSelectorParser.anon.First
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Rewritten from type alias, can be one of: 
  - typings.tokeyCssSelectorParser.distAstTypesMod.NamespacedNode
  - typings.tokeyCssSelectorParser.distAstTypesMod.Attribute
  - typings.tokeyCssSelectorParser.distAstTypesMod.Id
  - typings.tokeyCssSelectorParser.distAstTypesMod.Class
  - typings.tokeyCssSelectorParser.distAstTypesMod.PseudoClass
  - typings.tokeyCssSelectorParser.distAstTypesMod.PseudoElement
  - typings.tokeyCssSelectorParser.distAstTypesMod.Nesting
*/
trait FunctionalSelector
  extends StObject
     with _SelectorNode
object FunctionalSelector {
  
  inline def Attribute(end: Double, start: Double, value: String): typings.tokeyCssSelectorParser.distAstTypesMod.Attribute = {
    val __obj = js.Dynamic.literal(end = end.asInstanceOf[js.Any], start = start.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("attribute")
    __obj.asInstanceOf[typings.tokeyCssSelectorParser.distAstTypesMod.Attribute]
  }
  
  inline def Class(dotComments: SelectorNodes, end: Double, start: Double, value: String): typings.tokeyCssSelectorParser.distAstTypesMod.Class = {
    val __obj = js.Dynamic.literal(dotComments = dotComments.asInstanceOf[js.Any], end = end.asInstanceOf[js.Any], start = start.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("class")
    __obj.asInstanceOf[typings.tokeyCssSelectorParser.distAstTypesMod.Class]
  }
  
  inline def Id(end: Double, start: Double, value: String): typings.tokeyCssSelectorParser.distAstTypesMod.Id = {
    val __obj = js.Dynamic.literal(end = end.asInstanceOf[js.Any], start = start.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("id")
    __obj.asInstanceOf[typings.tokeyCssSelectorParser.distAstTypesMod.Id]
  }
  
  inline def Nesting(end: Double, start: Double): typings.tokeyCssSelectorParser.distAstTypesMod.Nesting = {
    val __obj = js.Dynamic.literal(end = end.asInstanceOf[js.Any], start = start.asInstanceOf[js.Any], value = "&")
    __obj.updateDynamic("type")("nesting")
    __obj.asInstanceOf[typings.tokeyCssSelectorParser.distAstTypesMod.Nesting]
  }
  
  inline def PseudoClass(colonComments: js.Array[Comment], end: Double, start: Double, value: String): typings.tokeyCssSelectorParser.distAstTypesMod.PseudoClass = {
    val __obj = js.Dynamic.literal(colonComments = colonComments.asInstanceOf[js.Any], end = end.asInstanceOf[js.Any], start = start.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("pseudo_class")
    __obj.asInstanceOf[typings.tokeyCssSelectorParser.distAstTypesMod.PseudoClass]
  }
  
  inline def PseudoElement(colonComments: First, end: Double, start: Double, value: String): typings.tokeyCssSelectorParser.distAstTypesMod.PseudoElement = {
    val __obj = js.Dynamic.literal(colonComments = colonComments.asInstanceOf[js.Any], end = end.asInstanceOf[js.Any], start = start.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("pseudo_element")
    __obj.asInstanceOf[typings.tokeyCssSelectorParser.distAstTypesMod.PseudoElement]
  }
  
  inline def Type(end: Double, start: Double, value: String): typings.tokeyCssSelectorParser.distAstTypesMod.Type = {
    val __obj = js.Dynamic.literal(end = end.asInstanceOf[js.Any], start = start.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("type")
    __obj.asInstanceOf[typings.tokeyCssSelectorParser.distAstTypesMod.Type]
  }
  
  inline def Universal(end: Double, start: Double, value: String): typings.tokeyCssSelectorParser.distAstTypesMod.Universal = {
    val __obj = js.Dynamic.literal(end = end.asInstanceOf[js.Any], start = start.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("universal")
    __obj.asInstanceOf[typings.tokeyCssSelectorParser.distAstTypesMod.Universal]
  }
}
