package typings.webpack.mod

import typings.webpack.webpackStrings.expression
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ExpressionExpressionInfo extends StObject {
  
  def getMembers(): js.Array[String]
  
  def getMembersOptionals(): js.Array[Boolean]
  
  var name: String
  
  var rootInfo: String | VariableInfo
  
  var `type`: expression
}
object ExpressionExpressionInfo {
  
  inline def apply(
    getMembers: () => js.Array[String],
    getMembersOptionals: () => js.Array[Boolean],
    name: String,
    rootInfo: String | VariableInfo
  ): ExpressionExpressionInfo = {
    val __obj = js.Dynamic.literal(getMembers = js.Any.fromFunction0(getMembers), getMembersOptionals = js.Any.fromFunction0(getMembersOptionals), name = name.asInstanceOf[js.Any], rootInfo = rootInfo.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("expression")
    __obj.asInstanceOf[ExpressionExpressionInfo]
  }
  
  extension [Self <: ExpressionExpressionInfo](x: Self) {
    
    inline def setGetMembers(value: () => js.Array[String]): Self = StObject.set(x, "getMembers", js.Any.fromFunction0(value))
    
    inline def setGetMembersOptionals(value: () => js.Array[Boolean]): Self = StObject.set(x, "getMembersOptionals", js.Any.fromFunction0(value))
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setRootInfo(value: String | VariableInfo): Self = StObject.set(x, "rootInfo", value.asInstanceOf[js.Any])
    
    inline def setType(value: expression): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
