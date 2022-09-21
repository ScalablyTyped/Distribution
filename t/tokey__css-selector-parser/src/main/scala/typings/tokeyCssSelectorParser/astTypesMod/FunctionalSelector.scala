package typings.tokeyCssSelectorParser.astTypesMod

import typings.tokeyCssSelectorParser.anon.First
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Rewritten from type alias, can be one of: 
  - typings.tokeyCssSelectorParser.astTypesMod.NamespacedNode
  - typings.tokeyCssSelectorParser.astTypesMod.Attribute
  - typings.tokeyCssSelectorParser.astTypesMod.Id
  - typings.tokeyCssSelectorParser.astTypesMod.Class
  - typings.tokeyCssSelectorParser.astTypesMod.PseudoClass
  - typings.tokeyCssSelectorParser.astTypesMod.PseudoElement
  - typings.tokeyCssSelectorParser.astTypesMod.Nesting
*/
trait FunctionalSelector
  extends StObject
     with _SelectorNode
object FunctionalSelector {
  
  inline def Attribute(end: Double, start: Double, value: String): typings.tokeyCssSelectorParser.astTypesMod.Attribute = {
    val __obj = js.Dynamic.literal(end = end.asInstanceOf[js.Any], start = start.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("attribute")
    __obj.asInstanceOf[typings.tokeyCssSelectorParser.astTypesMod.Attribute]
  }
  
  inline def Class(dotComments: SelectorNodes, end: Double, start: Double, value: String): typings.tokeyCssSelectorParser.astTypesMod.Class = {
    val __obj = js.Dynamic.literal(dotComments = dotComments.asInstanceOf[js.Any], end = end.asInstanceOf[js.Any], start = start.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("class")
    __obj.asInstanceOf[typings.tokeyCssSelectorParser.astTypesMod.Class]
  }
  
  inline def Id(end: Double, start: Double, value: String): typings.tokeyCssSelectorParser.astTypesMod.Id = {
    val __obj = js.Dynamic.literal(end = end.asInstanceOf[js.Any], start = start.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("id")
    __obj.asInstanceOf[typings.tokeyCssSelectorParser.astTypesMod.Id]
  }
  
  inline def Nesting(end: Double, start: Double): typings.tokeyCssSelectorParser.astTypesMod.Nesting = {
    val __obj = js.Dynamic.literal(end = end.asInstanceOf[js.Any], start = start.asInstanceOf[js.Any], value = "&")
    __obj.updateDynamic("type")("nesting")
    __obj.asInstanceOf[typings.tokeyCssSelectorParser.astTypesMod.Nesting]
  }
  
  inline def PseudoClass(colonComments: js.Array[Comment], end: Double, start: Double, value: String): typings.tokeyCssSelectorParser.astTypesMod.PseudoClass = {
    val __obj = js.Dynamic.literal(colonComments = colonComments.asInstanceOf[js.Any], end = end.asInstanceOf[js.Any], start = start.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("pseudo_class")
    __obj.asInstanceOf[typings.tokeyCssSelectorParser.astTypesMod.PseudoClass]
  }
  
  inline def PseudoElement(colonComments: First, end: Double, start: Double, value: String): typings.tokeyCssSelectorParser.astTypesMod.PseudoElement = {
    val __obj = js.Dynamic.literal(colonComments = colonComments.asInstanceOf[js.Any], end = end.asInstanceOf[js.Any], start = start.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("pseudo_element")
    __obj.asInstanceOf[typings.tokeyCssSelectorParser.astTypesMod.PseudoElement]
  }
  
  inline def Type(end: Double, start: Double, value: String): typings.tokeyCssSelectorParser.astTypesMod.Type = {
    val __obj = js.Dynamic.literal(end = end.asInstanceOf[js.Any], start = start.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("type")
    __obj.asInstanceOf[typings.tokeyCssSelectorParser.astTypesMod.Type]
  }
  
  inline def Universal(end: Double, start: Double, value: String): typings.tokeyCssSelectorParser.astTypesMod.Universal = {
    val __obj = js.Dynamic.literal(end = end.asInstanceOf[js.Any], start = start.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("universal")
    __obj.asInstanceOf[typings.tokeyCssSelectorParser.astTypesMod.Universal]
  }
}
