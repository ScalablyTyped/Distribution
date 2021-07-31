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
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object withNoticesMod {
  
  object default {
    
    // prettier-ignore
    @scala.inline
    def apply[T /* <: ComponentType[js.Any] */](wrapped: T): ComponentType[Omit[js.Any, noticeList | noticeOperations | noticeUI]] = ^.asInstanceOf[js.Dynamic].apply(wrapped.asInstanceOf[js.Any]).asInstanceOf[ComponentType[Omit[js.Any, noticeList | noticeOperations | noticeUI]]]
    
    @JSImport("@wordpress/components/higher-order/with-notices", JSImport.Default)
    @js.native
    val ^ : js.Any = js.native
  }
  
  object withNotices {
    
    trait Props extends StObject {
      
      var noticeList: js.Array[Notice]
      
      var noticeOperations: CreateErrorNotice
      
      var noticeUI: ReactNode
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
