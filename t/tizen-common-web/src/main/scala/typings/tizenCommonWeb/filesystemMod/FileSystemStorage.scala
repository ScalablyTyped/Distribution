package typings.tizenCommonWeb.filesystemMod

import typings.tizenCommonWeb.tizenCommonWebStrings.EXTERNAL
import typings.tizenCommonWeb.tizenCommonWebStrings.INTERNAL
import typings.tizenCommonWeb.tizenCommonWebStrings.MOUNTED
import typings.tizenCommonWeb.tizenCommonWebStrings.REMOVED
import typings.tizenCommonWeb.tizenCommonWebStrings.UNMOUNTABLE
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait FileSystemStorage extends js.Object {
  
  /**
    * The storage name.
    * This attribute is used as an input for methods such as getStorage() and also used as `location` parameter for File.resolve() and FileSystemManager.resolve().
    */
  val label: String = js.native
  
  /**
    * The storage state as mounted or not.
    */
  val state: FileSystemStorageState | MOUNTED | REMOVED | UNMOUNTABLE = js.native
  
  /**
    * The storage type as internal or external.
    */
  val `type`: FileSystemStorageType | INTERNAL | EXTERNAL = js.native
}
object FileSystemStorage {
  
  @scala.inline
  def apply(
    label: String,
    state: FileSystemStorageState | MOUNTED | REMOVED | UNMOUNTABLE,
    `type`: FileSystemStorageType | INTERNAL | EXTERNAL
  ): FileSystemStorage = {
    val __obj = js.Dynamic.literal(label = label.asInstanceOf[js.Any], state = state.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[FileSystemStorage]
  }
  
  @scala.inline
  implicit class FileSystemStorageOps[Self <: FileSystemStorage] (val x: Self) extends AnyVal {
    
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
    def setLabel(value: String): Self = this.set("label", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setState(value: FileSystemStorageState | MOUNTED | REMOVED | UNMOUNTABLE): Self = this.set("state", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setType(value: FileSystemStorageType | INTERNAL | EXTERNAL): Self = this.set("type", value.asInstanceOf[js.Any])
  }
}
