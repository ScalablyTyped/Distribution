package typings.wordpressComponents.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait CreateErrorNotice extends js.Object {
  
  def createErrorNotice(message: String): Unit = js.native
  
  def createNotice(notice: PartialNoticePickNoticeco): Unit = js.native
  
  def removeAllNotices(): Unit = js.native
  
  def removeNotice(noticeId: String): Unit = js.native
}
object CreateErrorNotice {
  
  @scala.inline
  def apply(
    createErrorNotice: String => Unit,
    createNotice: PartialNoticePickNoticeco => Unit,
    removeAllNotices: () => Unit,
    removeNotice: String => Unit
  ): CreateErrorNotice = {
    val __obj = js.Dynamic.literal(createErrorNotice = js.Any.fromFunction1(createErrorNotice), createNotice = js.Any.fromFunction1(createNotice), removeAllNotices = js.Any.fromFunction0(removeAllNotices), removeNotice = js.Any.fromFunction1(removeNotice))
    __obj.asInstanceOf[CreateErrorNotice]
  }
  
  @scala.inline
  implicit class CreateErrorNoticeOps[Self <: CreateErrorNotice] (val x: Self) extends AnyVal {
    
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
    def setCreateErrorNotice(value: String => Unit): Self = this.set("createErrorNotice", js.Any.fromFunction1(value))
    
    @scala.inline
    def setCreateNotice(value: PartialNoticePickNoticeco => Unit): Self = this.set("createNotice", js.Any.fromFunction1(value))
    
    @scala.inline
    def setRemoveAllNotices(value: () => Unit): Self = this.set("removeAllNotices", js.Any.fromFunction0(value))
    
    @scala.inline
    def setRemoveNotice(value: String => Unit): Self = this.set("removeNotice", js.Any.fromFunction1(value))
  }
}
