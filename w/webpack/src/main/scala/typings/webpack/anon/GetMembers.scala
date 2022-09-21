package typings.webpack.anon

import typings.webpack.mod.ExportedVariableInfo
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetMembers extends StObject {
  
  def getMembers(): js.Array[String]
  
  var name: String
  
  var rootInfo: ExportedVariableInfo
}
object GetMembers {
  
  inline def apply(getMembers: () => js.Array[String], name: String, rootInfo: ExportedVariableInfo): GetMembers = {
    val __obj = js.Dynamic.literal(getMembers = js.Any.fromFunction0(getMembers), name = name.asInstanceOf[js.Any], rootInfo = rootInfo.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetMembers]
  }
  
  extension [Self <: GetMembers](x: Self) {
    
    inline def setGetMembers(value: () => js.Array[String]): Self = StObject.set(x, "getMembers", js.Any.fromFunction0(value))
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setRootInfo(value: ExportedVariableInfo): Self = StObject.set(x, "rootInfo", value.asInstanceOf[js.Any])
  }
}
