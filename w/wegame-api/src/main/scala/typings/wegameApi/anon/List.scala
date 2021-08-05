package typings.wegameApi.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait List extends StObject {
  
  /**
    * 可能对游戏感兴趣的未注册好友名单
    */
  var list: js.Array[AvatarUrl]
}
object List {
  
  inline def apply(list: js.Array[AvatarUrl]): List = {
    val __obj = js.Dynamic.literal(list = list.asInstanceOf[js.Any])
    __obj.asInstanceOf[List]
  }
  
  extension [Self <: List](x: Self) {
    
    inline def setList(value: js.Array[AvatarUrl]): Self = StObject.set(x, "list", value.asInstanceOf[js.Any])
    
    inline def setListVarargs(value: AvatarUrl*): Self = StObject.set(x, "list", js.Array(value :_*))
  }
}
