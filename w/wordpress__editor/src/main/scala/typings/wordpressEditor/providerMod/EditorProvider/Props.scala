package typings.wordpressEditor.providerMod.EditorProvider

import org.scalablytyped.runtime.StringDictionary
import typings.react.mod.ReactNode
import typings.std.Record
import typings.wordpressBlocks.mod.BlockInstance
import typings.wordpressEditor.anon.PartialEditorSettings
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Props extends js.Object {
  
  var blocks: js.UndefOr[js.Array[BlockInstance[StringDictionary[_]]]] = js.native
  
  var children: ReactNode = js.native
  
  var initialEdits: js.UndefOr[js.Object] = js.native
  
  var post: Record[String, _] = js.native
  
  var settings: js.UndefOr[PartialEditorSettings] = js.native
  
  var useSubRegistry: js.UndefOr[Boolean] = js.native
}
object Props {
  
  @scala.inline
  def apply(post: Record[String, _]): Props = {
    val __obj = js.Dynamic.literal(post = post.asInstanceOf[js.Any])
    __obj.asInstanceOf[Props]
  }
  
  @scala.inline
  implicit class PropsOps[Self <: Props] (val x: Self) extends AnyVal {
    
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
    def setPost(value: Record[String, _]): Self = this.set("post", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBlocksVarargs(value: BlockInstance[StringDictionary[js.Any]]*): Self = this.set("blocks", js.Array(value :_*))
    
    @scala.inline
    def setBlocks(value: js.Array[BlockInstance[StringDictionary[_]]]): Self = this.set("blocks", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteBlocks: Self = this.set("blocks", js.undefined)
    
    @scala.inline
    def setChildren(value: ReactNode): Self = this.set("children", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteChildren: Self = this.set("children", js.undefined)
    
    @scala.inline
    def setInitialEdits(value: js.Object): Self = this.set("initialEdits", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteInitialEdits: Self = this.set("initialEdits", js.undefined)
    
    @scala.inline
    def setSettings(value: PartialEditorSettings): Self = this.set("settings", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSettings: Self = this.set("settings", js.undefined)
    
    @scala.inline
    def setUseSubRegistry(value: Boolean): Self = this.set("useSubRegistry", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteUseSubRegistry: Self = this.set("useSubRegistry", js.undefined)
  }
}
