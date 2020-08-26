package typings.wordpressBlockEditor.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait EditorBlockListSettings extends js.Object {
  var allowedBlocks: js.UndefOr[js.Array[String]] = js.native
  var templateLock: js.UndefOr[EditorTemplateLock] = js.native
}

object EditorBlockListSettings {
  @scala.inline
  def apply(): EditorBlockListSettings = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[EditorBlockListSettings]
  }
  @scala.inline
  implicit class EditorBlockListSettingsOps[Self <: EditorBlockListSettings] (val x: Self) extends AnyVal {
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
    def setAllowedBlocksVarargs(value: String*): Self = this.set("allowedBlocks", js.Array(value :_*))
    @scala.inline
    def setAllowedBlocks(value: js.Array[String]): Self = this.set("allowedBlocks", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAllowedBlocks: Self = this.set("allowedBlocks", js.undefined)
    @scala.inline
    def setTemplateLock(value: EditorTemplateLock): Self = this.set("templateLock", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTemplateLock: Self = this.set("templateLock", js.undefined)
  }
  
}

