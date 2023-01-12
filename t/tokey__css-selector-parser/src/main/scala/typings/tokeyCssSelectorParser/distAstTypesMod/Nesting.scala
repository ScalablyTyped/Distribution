package typings.tokeyCssSelectorParser.distAstTypesMod

import typings.tokeyCore.distTypesMod.Token
import typings.tokeyCssSelectorParser.tokeyCssSelectorParserStrings.Ampersand
import typings.tokeyCssSelectorParser.tokeyCssSelectorParserStrings.nesting
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Nesting
  extends StObject
     with Token[nesting]
     with FunctionalSelector {
  
  var nodes: js.UndefOr[SelectorList] = js.undefined
  
  @JSName("value")
  var value_Nesting: Ampersand
}
object Nesting {
  
  inline def apply(end: Double, start: Double): Nesting = {
    val __obj = js.Dynamic.literal(end = end.asInstanceOf[js.Any], start = start.asInstanceOf[js.Any], value = "&")
    __obj.updateDynamic("type")("nesting")
    __obj.asInstanceOf[Nesting]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Nesting] (val x: Self) extends AnyVal {
    
    inline def setNodes(value: SelectorList): Self = StObject.set(x, "nodes", value.asInstanceOf[js.Any])
    
    inline def setNodesUndefined: Self = StObject.set(x, "nodes", js.undefined)
    
    inline def setNodesVarargs(value: Selector*): Self = StObject.set(x, "nodes", js.Array(value*))
    
    inline def setValue(value: Ampersand): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
  }
}
