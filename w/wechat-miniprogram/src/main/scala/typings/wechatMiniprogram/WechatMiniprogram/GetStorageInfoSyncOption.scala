package typings.wechatMiniprogram.WechatMiniprogram

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GetStorageInfoSyncOption extends js.Object {
  
  /** 当前占用的空间大小, 单位 KB */
  var currentSize: Double = js.native
  
  /** 当前 storage 中所有的 key */
  var keys: js.Array[String] = js.native
  
  /** 限制的空间大小，单位 KB */
  var limitSize: Double = js.native
}
object GetStorageInfoSyncOption {
  
  @scala.inline
  def apply(currentSize: Double, keys: js.Array[String], limitSize: Double): GetStorageInfoSyncOption = {
    val __obj = js.Dynamic.literal(currentSize = currentSize.asInstanceOf[js.Any], keys = keys.asInstanceOf[js.Any], limitSize = limitSize.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetStorageInfoSyncOption]
  }
  
  @scala.inline
  implicit class GetStorageInfoSyncOptionOps[Self <: GetStorageInfoSyncOption] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setCurrentSize(value: Double): Self = this.set("currentSize", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setKeysVarargs(value: String*): Self = this.set("keys", js.Array(value :_*))
    
    @scala.inline
    def setKeys(value: js.Array[String]): Self = this.set("keys", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLimitSize(value: Double): Self = this.set("limitSize", value.asInstanceOf[js.Any])
  }
}
