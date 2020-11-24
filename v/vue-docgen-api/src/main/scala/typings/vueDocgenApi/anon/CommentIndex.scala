package typings.vueDocgenApi.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait CommentIndex extends js.Object {
  
  var commentIndex: js.UndefOr[Double] = js.native
}
object CommentIndex {
  
  @scala.inline
  def apply(): CommentIndex = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CommentIndex]
  }
  
  @scala.inline
  implicit class CommentIndexOps[Self <: CommentIndex] (val x: Self) extends AnyVal {
    
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
    def setCommentIndex(value: Double): Self = this.set("commentIndex", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCommentIndex: Self = this.set("commentIndex", js.undefined)
  }
}
