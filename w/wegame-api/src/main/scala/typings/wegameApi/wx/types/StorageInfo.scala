package typings.wegameApi.wx.types

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait StorageInfo extends StObject {
  
  /**
    * 当前占用的空间大小, 单位 KB
    */
  var currentSize: Double
  
  /**
    * 当前 storage 中所有的 key
    */
  var keys: js.Array[String]
  
  /**
    * 限制的空间大小，单位 KB
    */
  var limitSize: Double
}
object StorageInfo {
  
  inline def apply(currentSize: Double, keys: js.Array[String], limitSize: Double): StorageInfo = {
    val __obj = js.Dynamic.literal(currentSize = currentSize.asInstanceOf[js.Any], keys = keys.asInstanceOf[js.Any], limitSize = limitSize.asInstanceOf[js.Any])
    __obj.asInstanceOf[StorageInfo]
  }
  
  extension [Self <: StorageInfo](x: Self) {
    
    inline def setCurrentSize(value: Double): Self = StObject.set(x, "currentSize", value.asInstanceOf[js.Any])
    
    inline def setKeys(value: js.Array[String]): Self = StObject.set(x, "keys", value.asInstanceOf[js.Any])
    
    inline def setKeysVarargs(value: String*): Self = StObject.set(x, "keys", js.Array(value :_*))
    
    inline def setLimitSize(value: Double): Self = StObject.set(x, "limitSize", value.asInstanceOf[js.Any])
  }
}
