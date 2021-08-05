package typings.wordpressNotices

import typings.wordpressNotices.mod.Action
import typings.wordpressNotices.mod.Notice
import typings.wordpressNotices.mod.Status
import typings.wordpressNotices.wordpressNoticesStrings.default
import typings.wordpressNotices.wordpressNoticesStrings.snackbar
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  /* Inlined std.Partial<@wordpress/notices.@wordpress/notices.Options> */
  trait PartialOptions extends StObject {
    
    var actions: js.UndefOr[js.Array[Action]] = js.undefined
    
    var context: js.UndefOr[String] = js.undefined
    
    var id: js.UndefOr[String] = js.undefined
    
    var isDismissible: js.UndefOr[Boolean] = js.undefined
    
    var speak: js.UndefOr[Boolean] = js.undefined
    
    var `type`: js.UndefOr[default | snackbar] = js.undefined
  }
  object PartialOptions {
    
    inline def apply(): PartialOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[PartialOptions]
    }
    
    extension [Self <: PartialOptions](x: Self) {
      
      inline def setActions(value: js.Array[Action]): Self = StObject.set(x, "actions", value.asInstanceOf[js.Any])
      
      inline def setActionsUndefined: Self = StObject.set(x, "actions", js.undefined)
      
      inline def setActionsVarargs(value: Action*): Self = StObject.set(x, "actions", js.Array(value :_*))
      
      inline def setContext(value: String): Self = StObject.set(x, "context", value.asInstanceOf[js.Any])
      
      inline def setContextUndefined: Self = StObject.set(x, "context", js.undefined)
      
      inline def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
      
      inline def setIdUndefined: Self = StObject.set(x, "id", js.undefined)
      
      inline def setIsDismissible(value: Boolean): Self = StObject.set(x, "isDismissible", value.asInstanceOf[js.Any])
      
      inline def setIsDismissibleUndefined: Self = StObject.set(x, "isDismissible", js.undefined)
      
      inline def setSpeak(value: Boolean): Self = StObject.set(x, "speak", value.asInstanceOf[js.Any])
      
      inline def setSpeakUndefined: Self = StObject.set(x, "speak", js.undefined)
      
      inline def setType(value: default | snackbar): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
      
      inline def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
    }
  }
  
  @js.native
  trait TypeofimportedActions extends StObject {
    
    def createErrorNotice(content: String): Unit = js.native
    def createErrorNotice(content: String, options: PartialOptions): Unit = js.native
    
    def createInfoNotice(content: String): Unit = js.native
    def createInfoNotice(content: String, options: PartialOptions): Unit = js.native
    
    def createNotice(status: Unit, content: String): Unit = js.native
    def createNotice(status: Unit, content: String, options: PartialOptions): Unit = js.native
    def createNotice(status: Status, content: String): Unit = js.native
    def createNotice(status: Status, content: String, options: PartialOptions): Unit = js.native
    
    def createSuccessNotice(content: String): Unit = js.native
    def createSuccessNotice(content: String, options: PartialOptions): Unit = js.native
    
    def createWarningNotice(content: String): Unit = js.native
    def createWarningNotice(content: String, options: PartialOptions): Unit = js.native
    
    def removeNotice(id: String): Unit = js.native
    def removeNotice(id: String, context: String): Unit = js.native
  }
  
  @js.native
  trait TypeofimportedSelectors extends StObject {
    
    def getNotices(): js.Array[Notice] = js.native
    def getNotices(context: String): js.Array[Notice] = js.native
  }
}
