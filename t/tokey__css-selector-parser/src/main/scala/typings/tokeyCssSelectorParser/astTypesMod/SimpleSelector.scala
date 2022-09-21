package typings.tokeyCssSelectorParser.astTypesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Rewritten from type alias, can be one of: 
  - typings.tokeyCssSelectorParser.astTypesMod.Type
  - typings.tokeyCssSelectorParser.astTypesMod.Universal
  - typings.tokeyCssSelectorParser.astTypesMod.Attribute
  - typings.tokeyCssSelectorParser.astTypesMod.Class
  - typings.tokeyCssSelectorParser.astTypesMod.Id
  - typings.tokeyCssSelectorParser.astTypesMod.PseudoClass
*/
trait SimpleSelector extends StObject
object SimpleSelector {
  
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
  
  inline def PseudoClass(colonComments: js.Array[Comment], end: Double, start: Double, value: String): typings.tokeyCssSelectorParser.astTypesMod.PseudoClass = {
    val __obj = js.Dynamic.literal(colonComments = colonComments.asInstanceOf[js.Any], end = end.asInstanceOf[js.Any], start = start.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("pseudo_class")
    __obj.asInstanceOf[typings.tokeyCssSelectorParser.astTypesMod.PseudoClass]
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
