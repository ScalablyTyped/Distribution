package typings.yeomanGenerator.storageMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Provides options for the `Storage` class.
  */
@js.native
trait StorageOptions extends js.Object {
  
  /**
    * A value indicating whether json object cache should be disabled.
    */
  var disableCache: Boolean = js.native
  
  /**
    * A value indicating whether the cache should not be cleaned after each fs change.
    */
  var disableCacheByFile: Boolean = js.native
  
  /**
    * A value indicating whether the name should be treated as a lodash path.
    */
  var lodashPath: Boolean = js.native
}
object StorageOptions {
  
  @scala.inline
  def apply(disableCache: Boolean, disableCacheByFile: Boolean, lodashPath: Boolean): StorageOptions = {
    val __obj = js.Dynamic.literal(disableCache = disableCache.asInstanceOf[js.Any], disableCacheByFile = disableCacheByFile.asInstanceOf[js.Any], lodashPath = lodashPath.asInstanceOf[js.Any])
    __obj.asInstanceOf[StorageOptions]
  }
  
  @scala.inline
  implicit class StorageOptionsOps[Self <: StorageOptions] (val x: Self) extends AnyVal {
    
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
    def setDisableCache(value: Boolean): Self = this.set("disableCache", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDisableCacheByFile(value: Boolean): Self = this.set("disableCacheByFile", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLodashPath(value: Boolean): Self = this.set("lodashPath", value.asInstanceOf[js.Any])
  }
}
