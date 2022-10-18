package typings.wordpressComponents

import typings.react.mod.ComponentType
import typings.react.mod.ReactNode
import typings.wordpressComponents.anon.CreateErrorNotice
import typings.wordpressComponents.noticeListMod.NoticeList.Notice
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object higherOrderWithNoticesMod {
  
  object default {
    
    // prettier-ignore
    inline def apply[T /* <: ComponentType[Any] */](wrapped: T): /* import warning: importer.ImportType#apply Failed type conversion: T extends react.react.ComponentType<infer U> ? react.react.ComponentType<std.Omit<U, 'noticeList' | 'noticeOperations' | 'noticeUI'>> : never */ js.Any = ^.asInstanceOf[js.Dynamic].apply(wrapped.asInstanceOf[js.Any]).asInstanceOf[/* import warning: importer.ImportType#apply Failed type conversion: T extends react.react.ComponentType<infer U> ? react.react.ComponentType<std.Omit<U, 'noticeList' | 'noticeOperations' | 'noticeUI'>> : never */ js.Any]
    
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
      
      inline def apply(noticeList: js.Array[Notice], noticeOperations: CreateErrorNotice): Props = {
        val __obj = js.Dynamic.literal(noticeList = noticeList.asInstanceOf[js.Any], noticeOperations = noticeOperations.asInstanceOf[js.Any])
        __obj.asInstanceOf[Props]
      }
      
      extension [Self <: Props](x: Self) {
        
        inline def setNoticeList(value: js.Array[Notice]): Self = StObject.set(x, "noticeList", value.asInstanceOf[js.Any])
        
        inline def setNoticeListVarargs(value: Notice*): Self = StObject.set(x, "noticeList", js.Array(value*))
        
        inline def setNoticeOperations(value: CreateErrorNotice): Self = StObject.set(x, "noticeOperations", value.asInstanceOf[js.Any])
        
        inline def setNoticeUI(value: ReactNode): Self = StObject.set(x, "noticeUI", value.asInstanceOf[js.Any])
        
        inline def setNoticeUIUndefined: Self = StObject.set(x, "noticeUI", js.undefined)
      }
    }
  }
}
