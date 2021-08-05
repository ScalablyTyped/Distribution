package typings.wechatMiniprogram.DB

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ServerDate extends StObject {
  
  val options: IServerDateOptions
}
object ServerDate {
  
  inline def apply(options: IServerDateOptions): ServerDate = {
    val __obj = js.Dynamic.literal(options = options.asInstanceOf[js.Any])
    __obj.asInstanceOf[ServerDate]
  }
  
  extension [Self <: ServerDate](x: Self) {
    
    inline def setOptions(value: IServerDateOptions): Self = StObject.set(x, "options", value.asInstanceOf[js.Any])
  }
}
