package typings.weixinApp.wx

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ScanCodeData extends StObject {
  
  /**
    * 所扫码的字符集
    */
  var charSet: String
  
  /**
    * 当所扫的码为当前小程序的合法二维码时，会返回此字段，内容为二维码携带的 path
    */
  var path: String
  
  /**
    * 所扫码的内容
    */
  var result: String
  
  /**
    * 所扫码的类型
    */
  var scanType: typings.weixinApp.wx.scanType
}
object ScanCodeData {
  
  inline def apply(charSet: String, path: String, result: String, scanType: scanType): ScanCodeData = {
    val __obj = js.Dynamic.literal(charSet = charSet.asInstanceOf[js.Any], path = path.asInstanceOf[js.Any], result = result.asInstanceOf[js.Any], scanType = scanType.asInstanceOf[js.Any])
    __obj.asInstanceOf[ScanCodeData]
  }
  
  extension [Self <: ScanCodeData](x: Self) {
    
    inline def setCharSet(value: String): Self = StObject.set(x, "charSet", value.asInstanceOf[js.Any])
    
    inline def setPath(value: String): Self = StObject.set(x, "path", value.asInstanceOf[js.Any])
    
    inline def setResult(value: String): Self = StObject.set(x, "result", value.asInstanceOf[js.Any])
    
    inline def setScanType(value: scanType): Self = StObject.set(x, "scanType", value.asInstanceOf[js.Any])
  }
}
