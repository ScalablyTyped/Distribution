package typings.stylableCore.anon

import typings.stylableCore.selectorUtilsMod.SelectorAstNode
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Selector extends StObject {
  
  var selector: String
  
  var selectorAst: SelectorAstNode
}
object Selector {
  
  inline def apply(selector: String, selectorAst: SelectorAstNode): Selector = {
    val __obj = js.Dynamic.literal(selector = selector.asInstanceOf[js.Any], selectorAst = selectorAst.asInstanceOf[js.Any])
    __obj.asInstanceOf[Selector]
  }
  
  extension [Self <: Selector](x: Self) {
    
    inline def setSelector(value: String): Self = StObject.set(x, "selector", value.asInstanceOf[js.Any])
    
    inline def setSelectorAst(value: SelectorAstNode): Self = StObject.set(x, "selectorAst", value.asInstanceOf[js.Any])
  }
}
