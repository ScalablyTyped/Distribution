package typings.wordpressComponents

import typings.react.mod.ComponentType
import typings.react.mod.ReactNode
import typings.std.Omit
import typings.wordpressComponents.anon.CreateErrorNotice
import typings.wordpressComponents.listMod.NoticeList.Notice
import typings.wordpressComponents.wordpressComponentsStrings.noticeList
import typings.wordpressComponents.wordpressComponentsStrings.noticeOperations
import typings.wordpressComponents.wordpressComponentsStrings.noticeUI
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object withNoticesMod {
  
  object default {
    
    // prettier-ignore
    @JSImport("@wordpress/components/higher-order/with-notices", JSImport.Default)
    @js.native
    def apply[T /* <: ComponentType[_] */](wrapped: T): ComponentType[Omit[_, noticeList | noticeOperations | noticeUI]] = js.native
  }
  
  object withNotices {
    
    @js.native
    trait Props extends StObject {
      
      var noticeList: js.Array[Notice] = js.native
      
      var noticeOperations: CreateErrorNotice = js.native
      
      var noticeUI: ReactNode = js.native
    }
    object Props {
      
      @scala.inline
      def apply(noticeList: js.Array[Notice], noticeOperations: CreateErrorNotice): Props = {
        val __obj = js.Dynamic.literal(noticeList = noticeList.asInstanceOf[js.Any], noticeOperations = noticeOperations.asInstanceOf[js.Any])
        __obj.asInstanceOf[Props]
      }
      
      @scala.inline
      implicit class PropsMutableBuilder[Self <: Props] (val x: Self) extends AnyVal {
        
        @scala.inline
        def setNoticeList(value: js.Array[Notice]): Self = StObject.set(x, "noticeList", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setNoticeListVarargs(value: Notice*): Self = StObject.set(x, "noticeList", js.Array(value :_*))
        
        @scala.inline
        def setNoticeOperations(value: CreateErrorNotice): Self = StObject.set(x, "noticeOperations", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setNoticeUI(value: ReactNode): Self = StObject.set(x, "noticeUI", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setNoticeUIUndefined: Self = StObject.set(x, "noticeUI", js.undefined)
      }
    }
  }
}
