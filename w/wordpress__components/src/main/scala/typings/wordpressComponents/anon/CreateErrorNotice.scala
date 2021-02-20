package typings.wordpressComponents.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait CreateErrorNotice extends StObject {
  
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
  implicit class CreateErrorNoticeMutableBuilder[Self <: CreateErrorNotice] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCreateErrorNotice(value: String => Unit): Self = StObject.set(x, "createErrorNotice", js.Any.fromFunction1(value))
    
    @scala.inline
    def setCreateNotice(value: PartialNoticePickNoticeco => Unit): Self = StObject.set(x, "createNotice", js.Any.fromFunction1(value))
    
    @scala.inline
    def setRemoveAllNotices(value: () => Unit): Self = StObject.set(x, "removeAllNotices", js.Any.fromFunction0(value))
    
    @scala.inline
    def setRemoveNotice(value: String => Unit): Self = StObject.set(x, "removeNotice", js.Any.fromFunction1(value))
  }
}
