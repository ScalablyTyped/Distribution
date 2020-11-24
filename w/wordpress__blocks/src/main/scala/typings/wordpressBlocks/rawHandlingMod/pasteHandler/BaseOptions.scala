package typings.wordpressBlocks.rawHandlingMod.pasteHandler

import typings.wordpressBlocks.wordpressBlocksStrings.AUTO
import typings.wordpressBlocks.wordpressBlocksStrings.BLOCKS
import typings.wordpressBlocks.wordpressBlocksStrings.INLINE
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait BaseOptions extends js.Object {
  
  /**
    * Whether or not the user can use unfiltered HTML.
    */
  var canUserUseUnfilteredHTML: js.UndefOr[Boolean] = js.native
  
  /**
    * Handle content as blocks or inline content.
    *  - `AUTO`: Decide based on the content passed.
    *  - `INLINE`: Always handle as inline content, and return string.
    *  - `BLOCKS`: Always handle as blocks, and return array of blocks.
    */
  var mode: js.UndefOr[AUTO | INLINE | BLOCKS] = js.native
  
  /**
    * The tag into which content will be inserted.
    */
  var tagName: js.UndefOr[
    /* import warning: LimitUnionLength.leaveTypeRef Was union type with length 120 */ js.Any
  ] = js.native
}
object BaseOptions {
  
  @scala.inline
  def apply(): BaseOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[BaseOptions]
  }
  
  @scala.inline
  implicit class BaseOptionsOps[Self <: BaseOptions] (val x: Self) extends AnyVal {
    
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
    def setCanUserUseUnfilteredHTML(value: Boolean): Self = this.set("canUserUseUnfilteredHTML", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCanUserUseUnfilteredHTML: Self = this.set("canUserUseUnfilteredHTML", js.undefined)
    
    @scala.inline
    def setMode(value: AUTO | INLINE | BLOCKS): Self = this.set("mode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMode: Self = this.set("mode", js.undefined)
    
    @scala.inline
    def setTagName(value: /* import warning: LimitUnionLength.leaveTypeRef Was union type with length 120 */ js.Any): Self = this.set("tagName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTagName: Self = this.set("tagName", js.undefined)
  }
}
