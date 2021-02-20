package typings.wordpressComponents.anon

import typings.react.mod.ReactNode
import typings.wordpressNotices.mod.Status
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Partial<@wordpress/components.@wordpress/components/notice/list.default.Notice> & std.Pick<@wordpress/components.@wordpress/components/notice/list.default.Notice, 'content'> */
@js.native
trait PartialNoticePickNoticeco extends StObject {
  
  var actions: js.UndefOr[js.Array[typings.wordpressComponents.noticeMod.Notice.Action]] = js.native
  
  var className: js.UndefOr[String] = js.native
  
  var content: js.UndefOr[ReactNode] with ReactNode = js.native
  
  var id: js.UndefOr[String] = js.native
  
  var isDismissible: js.UndefOr[Boolean] = js.native
  
  var status: js.UndefOr[Status] = js.native
}
object PartialNoticePickNoticeco {
  
  @scala.inline
  def apply(): PartialNoticePickNoticeco = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PartialNoticePickNoticeco]
  }
  
  @scala.inline
  implicit class PartialNoticePickNoticecoMutableBuilder[Self <: PartialNoticePickNoticeco] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setActions(value: js.Array[typings.wordpressComponents.noticeMod.Notice.Action]): Self = StObject.set(x, "actions", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setActionsUndefined: Self = StObject.set(x, "actions", js.undefined)
    
    @scala.inline
    def setActionsVarargs(value: typings.wordpressComponents.noticeMod.Notice.Action*): Self = StObject.set(x, "actions", js.Array(value :_*))
    
    @scala.inline
    def setClassName(value: String): Self = StObject.set(x, "className", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setClassNameUndefined: Self = StObject.set(x, "className", js.undefined)
    
    @scala.inline
    def setContent(value: js.UndefOr[ReactNode] with ReactNode): Self = StObject.set(x, "content", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setContentUndefined: Self = StObject.set(x, "content", js.undefined)
    
    @scala.inline
    def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIdUndefined: Self = StObject.set(x, "id", js.undefined)
    
    @scala.inline
    def setIsDismissible(value: Boolean): Self = StObject.set(x, "isDismissible", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIsDismissibleUndefined: Self = StObject.set(x, "isDismissible", js.undefined)
    
    @scala.inline
    def setStatus(value: Status): Self = StObject.set(x, "status", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStatusUndefined: Self = StObject.set(x, "status", js.undefined)
  }
}
