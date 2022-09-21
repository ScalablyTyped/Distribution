package typings.wegameApi.wx.types

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

// --启动参数
trait LaunchOption extends StObject {
  
  /**
    * 当前小游戏是否被显示在聊天顶部
    */
  var isSticky: Boolean
  
  /**
    * 启动参数
    */
  var query: Any
  
  /**
    * 场景值
    */
  var scene: Double
  
  /**
    * 票据
    */
  var shareTicket: String
}
object LaunchOption {
  
  inline def apply(isSticky: Boolean, query: Any, scene: Double, shareTicket: String): LaunchOption = {
    val __obj = js.Dynamic.literal(isSticky = isSticky.asInstanceOf[js.Any], query = query.asInstanceOf[js.Any], scene = scene.asInstanceOf[js.Any], shareTicket = shareTicket.asInstanceOf[js.Any])
    __obj.asInstanceOf[LaunchOption]
  }
  
  extension [Self <: LaunchOption](x: Self) {
    
    inline def setIsSticky(value: Boolean): Self = StObject.set(x, "isSticky", value.asInstanceOf[js.Any])
    
    inline def setQuery(value: Any): Self = StObject.set(x, "query", value.asInstanceOf[js.Any])
    
    inline def setScene(value: Double): Self = StObject.set(x, "scene", value.asInstanceOf[js.Any])
    
    inline def setShareTicket(value: String): Self = StObject.set(x, "shareTicket", value.asInstanceOf[js.Any])
  }
}
