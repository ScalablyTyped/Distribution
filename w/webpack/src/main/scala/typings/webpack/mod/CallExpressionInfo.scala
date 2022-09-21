package typings.webpack.mod

import typings.webpack.webpackStrings.call
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CallExpressionInfo extends StObject {
  
  var call: CallExpression
  
  var calleeName: String
  
  def getCalleeMembers(): js.Array[String]
  
  def getMembers(): js.Array[String]
  
  def getMembersOptionals(): js.Array[Boolean]
  
  var name: String
  
  var rootInfo: String | VariableInfo
  
  var `type`: call
}
object CallExpressionInfo {
  
  inline def apply(
    call: CallExpression,
    calleeName: String,
    getCalleeMembers: () => js.Array[String],
    getMembers: () => js.Array[String],
    getMembersOptionals: () => js.Array[Boolean],
    name: String,
    rootInfo: String | VariableInfo
  ): CallExpressionInfo = {
    val __obj = js.Dynamic.literal(call = call.asInstanceOf[js.Any], calleeName = calleeName.asInstanceOf[js.Any], getCalleeMembers = js.Any.fromFunction0(getCalleeMembers), getMembers = js.Any.fromFunction0(getMembers), getMembersOptionals = js.Any.fromFunction0(getMembersOptionals), name = name.asInstanceOf[js.Any], rootInfo = rootInfo.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("call")
    __obj.asInstanceOf[CallExpressionInfo]
  }
  
  extension [Self <: CallExpressionInfo](x: Self) {
    
    inline def setCall(value: CallExpression): Self = StObject.set(x, "call", value.asInstanceOf[js.Any])
    
    inline def setCalleeName(value: String): Self = StObject.set(x, "calleeName", value.asInstanceOf[js.Any])
    
    inline def setGetCalleeMembers(value: () => js.Array[String]): Self = StObject.set(x, "getCalleeMembers", js.Any.fromFunction0(value))
    
    inline def setGetMembers(value: () => js.Array[String]): Self = StObject.set(x, "getMembers", js.Any.fromFunction0(value))
    
    inline def setGetMembersOptionals(value: () => js.Array[Boolean]): Self = StObject.set(x, "getMembersOptionals", js.Any.fromFunction0(value))
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setRootInfo(value: String | VariableInfo): Self = StObject.set(x, "rootInfo", value.asInstanceOf[js.Any])
    
    inline def setType(value: call): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
