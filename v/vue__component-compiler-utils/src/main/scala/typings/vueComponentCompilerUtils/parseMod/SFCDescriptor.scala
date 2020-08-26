package typings.vueComponentCompilerUtils.parseMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SFCDescriptor extends js.Object {
  var customBlocks: js.Array[SFCCustomBlock] = js.native
  var script: SFCBlock | Null = js.native
  var styles: js.Array[SFCBlock] = js.native
  var template: SFCBlock | Null = js.native
}

object SFCDescriptor {
  @scala.inline
  def apply(customBlocks: js.Array[SFCCustomBlock], styles: js.Array[SFCBlock]): SFCDescriptor = {
    val __obj = js.Dynamic.literal(customBlocks = customBlocks.asInstanceOf[js.Any], styles = styles.asInstanceOf[js.Any])
    __obj.asInstanceOf[SFCDescriptor]
  }
  @scala.inline
  implicit class SFCDescriptorOps[Self <: SFCDescriptor] (val x: Self) extends AnyVal {
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
    def setCustomBlocksVarargs(value: SFCCustomBlock*): Self = this.set("customBlocks", js.Array(value :_*))
    @scala.inline
    def setCustomBlocks(value: js.Array[SFCCustomBlock]): Self = this.set("customBlocks", value.asInstanceOf[js.Any])
    @scala.inline
    def setStylesVarargs(value: SFCBlock*): Self = this.set("styles", js.Array(value :_*))
    @scala.inline
    def setStyles(value: js.Array[SFCBlock]): Self = this.set("styles", value.asInstanceOf[js.Any])
    @scala.inline
    def setScript(value: SFCBlock): Self = this.set("script", value.asInstanceOf[js.Any])
    @scala.inline
    def setScriptNull: Self = this.set("script", null)
    @scala.inline
    def setTemplate(value: SFCBlock): Self = this.set("template", value.asInstanceOf[js.Any])
    @scala.inline
    def setTemplateNull: Self = this.set("template", null)
  }
  
}

