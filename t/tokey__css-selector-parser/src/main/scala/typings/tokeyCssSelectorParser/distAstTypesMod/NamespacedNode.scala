package typings.tokeyCssSelectorParser.distAstTypesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Rewritten from type alias, can be one of: 
  - typings.tokeyCssSelectorParser.distAstTypesMod.Type
  - typings.tokeyCssSelectorParser.distAstTypesMod.Universal
*/
trait NamespacedNode
  extends StObject
     with FunctionalSelector
object NamespacedNode {
  
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
