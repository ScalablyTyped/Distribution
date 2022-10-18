package typings.tokeyCssSelectorParser.distAstTypesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Rewritten from type alias, can be one of: 
  - typings.tokeyCssSelectorParser.distAstTypesMod.Type
  - typings.tokeyCssSelectorParser.distAstTypesMod.Universal
  - typings.tokeyCssSelectorParser.distAstTypesMod.Attribute
  - typings.tokeyCssSelectorParser.distAstTypesMod.Class
  - typings.tokeyCssSelectorParser.distAstTypesMod.Id
  - typings.tokeyCssSelectorParser.distAstTypesMod.PseudoClass
*/
trait SimpleSelector extends StObject
object SimpleSelector {
  
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
  
  inline def PseudoClass(colonComments: js.Array[Comment], end: Double, start: Double, value: String): typings.tokeyCssSelectorParser.distAstTypesMod.PseudoClass = {
    val __obj = js.Dynamic.literal(colonComments = colonComments.asInstanceOf[js.Any], end = end.asInstanceOf[js.Any], start = start.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("pseudo_class")
    __obj.asInstanceOf[typings.tokeyCssSelectorParser.distAstTypesMod.PseudoClass]
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
