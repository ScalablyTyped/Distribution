package typings.tokeyCssSelectorParser.distAstTypesMod

import typings.tokeyCssSelectorParser.tokeyCssSelectorParserStrings._empty
import typings.tokeyCssSelectorParser.tokeyCssSelectorParserStrings.namespace
import typings.tokeyCssSelectorParser.tokeyCssSelectorParserStrings.namespaceCommatarget
import typings.tokeyCssSelectorParser.tokeyCssSelectorParserStrings.target
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Namespace extends StObject {
  
  var afterComments: js.Array[Comment]
  
  var beforeComments: js.Array[Comment]
  
  var invalid: js.UndefOr[namespace | target | namespaceCommatarget | _empty] = js.undefined
  
  var value: String
}
object Namespace {
  
  inline def apply(afterComments: js.Array[Comment], beforeComments: js.Array[Comment], value: String): Namespace = {
    val __obj = js.Dynamic.literal(afterComments = afterComments.asInstanceOf[js.Any], beforeComments = beforeComments.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
    __obj.asInstanceOf[Namespace]
  }
  
  extension [Self <: Namespace](x: Self) {
    
    inline def setAfterComments(value: js.Array[Comment]): Self = StObject.set(x, "afterComments", value.asInstanceOf[js.Any])
    
    inline def setAfterCommentsVarargs(value: Comment*): Self = StObject.set(x, "afterComments", js.Array(value*))
    
    inline def setBeforeComments(value: js.Array[Comment]): Self = StObject.set(x, "beforeComments", value.asInstanceOf[js.Any])
    
    inline def setBeforeCommentsVarargs(value: Comment*): Self = StObject.set(x, "beforeComments", js.Array(value*))
    
    inline def setInvalid(value: namespace | target | namespaceCommatarget | _empty): Self = StObject.set(x, "invalid", value.asInstanceOf[js.Any])
    
    inline def setInvalidUndefined: Self = StObject.set(x, "invalid", js.undefined)
    
    inline def setValue(value: String): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
  }
}
