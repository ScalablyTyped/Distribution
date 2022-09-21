package typings.trtcJsSdk.mod

import typings.trtcJsSdk.anon.IsBrowserSupported
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CheckResult extends StObject {
  
  var detail: IsBrowserSupported
  
  /** 检测结果 */
  var result: Boolean
}
object CheckResult {
  
  inline def apply(detail: IsBrowserSupported, result: Boolean): CheckResult = {
    val __obj = js.Dynamic.literal(detail = detail.asInstanceOf[js.Any], result = result.asInstanceOf[js.Any])
    __obj.asInstanceOf[CheckResult]
  }
  
  extension [Self <: CheckResult](x: Self) {
    
    inline def setDetail(value: IsBrowserSupported): Self = StObject.set(x, "detail", value.asInstanceOf[js.Any])
    
    inline def setResult(value: Boolean): Self = StObject.set(x, "result", value.asInstanceOf[js.Any])
  }
}
