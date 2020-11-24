package typings.systemLogger.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait FileConfiguration extends js.Object {
  
  var fileRotateMaxSize: js.UndefOr[Double] = js.native
  
  var fileRotateType: js.UndefOr[typings.systemLogger.mod.fileRotateType] = js.native
  
  var isFileRotate: js.UndefOr[Boolean] = js.native
  
  var saveToFileName: js.UndefOr[String] = js.native
}
object FileConfiguration {
  
  @scala.inline
  def apply(): FileConfiguration = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[FileConfiguration]
  }
  
  @scala.inline
  implicit class FileConfigurationOps[Self <: FileConfiguration] (val x: Self) extends AnyVal {
    
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
    def setFileRotateMaxSize(value: Double): Self = this.set("fileRotateMaxSize", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFileRotateMaxSize: Self = this.set("fileRotateMaxSize", js.undefined)
    
    @scala.inline
    def setFileRotateType(value: fileRotateType): Self = this.set("fileRotateType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFileRotateType: Self = this.set("fileRotateType", js.undefined)
    
    @scala.inline
    def setIsFileRotate(value: Boolean): Self = this.set("isFileRotate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteIsFileRotate: Self = this.set("isFileRotate", js.undefined)
    
    @scala.inline
    def setSaveToFileName(value: String): Self = this.set("saveToFileName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSaveToFileName: Self = this.set("saveToFileName", js.undefined)
  }
}
