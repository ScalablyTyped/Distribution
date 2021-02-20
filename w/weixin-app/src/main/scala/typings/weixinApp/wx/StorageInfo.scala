package typings.weixinApp.wx

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait StorageInfo extends StObject {
  
  /**
    * 当前占用的空间大小, 单位kb
    */
  var currentSize: Double = js.native
  
  /**
    * 当前storage中所有的key
    */
  var keys: js.Array[String] = js.native
  
  /**
    * 限制的空间大小，单位kb
    */
  var limitSize: Double = js.native
}
object StorageInfo {
  
  @scala.inline
  def apply(currentSize: Double, keys: js.Array[String], limitSize: Double): StorageInfo = {
    val __obj = js.Dynamic.literal(currentSize = currentSize.asInstanceOf[js.Any], keys = keys.asInstanceOf[js.Any], limitSize = limitSize.asInstanceOf[js.Any])
    __obj.asInstanceOf[StorageInfo]
  }
  
  @scala.inline
  implicit class StorageInfoMutableBuilder[Self <: StorageInfo] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCurrentSize(value: Double): Self = StObject.set(x, "currentSize", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setKeys(value: js.Array[String]): Self = StObject.set(x, "keys", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setKeysVarargs(value: String*): Self = StObject.set(x, "keys", js.Array(value :_*))
    
    @scala.inline
    def setLimitSize(value: Double): Self = StObject.set(x, "limitSize", value.asInstanceOf[js.Any])
  }
}
