package typings.wechatMiniprogram.DB

import typings.wechatMiniprogram.IAPISuccessParam
import typings.wechatMiniprogram.anon.Removed
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IRemoveResult
  extends StObject
     with IAPISuccessParam {
  
  var stats: Removed
}
object IRemoveResult {
  
  inline def apply(errMsg: String, stats: Removed): IRemoveResult = {
    val __obj = js.Dynamic.literal(errMsg = errMsg.asInstanceOf[js.Any], stats = stats.asInstanceOf[js.Any])
    __obj.asInstanceOf[IRemoveResult]
  }
  
  extension [Self <: IRemoveResult](x: Self) {
    
    inline def setStats(value: Removed): Self = StObject.set(x, "stats", value.asInstanceOf[js.Any])
  }
}
