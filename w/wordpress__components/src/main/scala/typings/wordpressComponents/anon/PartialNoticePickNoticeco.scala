package typings.wordpressComponents.anon

import typings.react.mod.ReactNode
import typings.wordpressNotices.Status
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Partial<@wordpress/components.@wordpress/components/notice/list.default.Notice> & std.Pick<@wordpress/components.@wordpress/components/notice/list.default.Notice, 'content'> */
trait PartialNoticePickNoticeco extends StObject {
  
  var actions: js.UndefOr[js.Array[typings.wordpressComponents.noticeMod.Notice.Action]] = js.undefined
  
  var className: js.UndefOr[String] = js.undefined
  
  var content: js.UndefOr[ReactNode] = js.undefined
  
  var id: js.UndefOr[String] = js.undefined
  
  var isDismissible: js.UndefOr[Boolean] = js.undefined
  
  var status: js.UndefOr[Status] = js.undefined
}
object PartialNoticePickNoticeco {
  
  inline def apply(): PartialNoticePickNoticeco = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PartialNoticePickNoticeco]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: PartialNoticePickNoticeco] (val x: Self) extends AnyVal {
    
    inline def setActions(value: js.Array[typings.wordpressComponents.noticeMod.Notice.Action]): Self = StObject.set(x, "actions", value.asInstanceOf[js.Any])
    
    inline def setActionsUndefined: Self = StObject.set(x, "actions", js.undefined)
    
    inline def setActionsVarargs(value: typings.wordpressComponents.noticeMod.Notice.Action*): Self = StObject.set(x, "actions", js.Array(value*))
    
    inline def setClassName(value: String): Self = StObject.set(x, "className", value.asInstanceOf[js.Any])
    
    inline def setClassNameUndefined: Self = StObject.set(x, "className", js.undefined)
    
    inline def setContent(value: ReactNode): Self = StObject.set(x, "content", value.asInstanceOf[js.Any])
    
    inline def setContentUndefined: Self = StObject.set(x, "content", js.undefined)
    
    inline def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    inline def setIdUndefined: Self = StObject.set(x, "id", js.undefined)
    
    inline def setIsDismissible(value: Boolean): Self = StObject.set(x, "isDismissible", value.asInstanceOf[js.Any])
    
    inline def setIsDismissibleUndefined: Self = StObject.set(x, "isDismissible", js.undefined)
    
    inline def setStatus(value: Status): Self = StObject.set(x, "status", value.asInstanceOf[js.Any])
    
    inline def setStatusUndefined: Self = StObject.set(x, "status", js.undefined)
  }
}
