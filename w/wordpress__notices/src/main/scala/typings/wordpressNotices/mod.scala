package typings.wordpressNotices

import typings.wordpressNotices.anon.TypeofimportedActions
import typings.wordpressNotices.anon.TypeofimportedSelectors
import typings.wordpressNotices.wordpressNoticesStrings.coreSlashnotices
import typings.wordpressNotices.wordpressNoticesStrings.default
import typings.wordpressNotices.wordpressNoticesStrings.snackbar
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  /* augmented module */
  object wordpressDataAugmentingMod {
    
    @JSImport("@wordpress/data", JSImport.Namespace)
    @js.native
    val ^ : js.Any = js.native
    
    @scala.inline
    def dispatch_corenotices(key: coreSlashnotices): TypeofimportedActions = ^.asInstanceOf[js.Dynamic].applyDynamic("dispatch")(key.asInstanceOf[js.Any]).asInstanceOf[TypeofimportedActions]
    
    @scala.inline
    def select_corenotices(key: coreSlashnotices): TypeofimportedSelectors = ^.asInstanceOf[js.Dynamic].applyDynamic("select")(key.asInstanceOf[js.Any]).asInstanceOf[TypeofimportedSelectors]
  }
  
  /* Rewritten from type alias, can be one of: 
    - typings.wordpressNotices.mod.URLAction
    - typings.wordpressNotices.mod.CallbackAction
  */
  trait Action extends StObject
  object Action {
    
    @scala.inline
    def CallbackAction(callback: () => Unit, label: String): typings.wordpressNotices.mod.CallbackAction = {
      val __obj = js.Dynamic.literal(callback = js.Any.fromFunction0(callback), label = label.asInstanceOf[js.Any])
      __obj.asInstanceOf[typings.wordpressNotices.mod.CallbackAction]
    }
    
    @scala.inline
    def URLAction(label: String, url: String): typings.wordpressNotices.mod.URLAction = {
      val __obj = js.Dynamic.literal(label = label.asInstanceOf[js.Any], url = url.asInstanceOf[js.Any])
      __obj.asInstanceOf[typings.wordpressNotices.mod.URLAction]
    }
  }
  
  trait CallbackAction
    extends StObject
       with Action {
    
    def callback(): Unit
    
    var label: String
  }
  object CallbackAction {
    
    @scala.inline
    def apply(callback: () => Unit, label: String): CallbackAction = {
      val __obj = js.Dynamic.literal(callback = js.Any.fromFunction0(callback), label = label.asInstanceOf[js.Any])
      __obj.asInstanceOf[CallbackAction]
    }
    
    @scala.inline
    implicit class CallbackActionMutableBuilder[Self <: CallbackAction] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setCallback(value: () => Unit): Self = StObject.set(x, "callback", js.Any.fromFunction0(value))
      
      @scala.inline
      def setLabel(value: String): Self = StObject.set(x, "label", value.asInstanceOf[js.Any])
    }
  }
  
  trait Notice extends StObject {
    
    var actions: js.Array[Action]
    
    var content: String
    
    var id: String
    
    var isDismissible: Boolean
    
    var status: Status
  }
  object Notice {
    
    @scala.inline
    def apply(actions: js.Array[Action], content: String, id: String, isDismissible: Boolean, status: Status): Notice = {
      val __obj = js.Dynamic.literal(actions = actions.asInstanceOf[js.Any], content = content.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], isDismissible = isDismissible.asInstanceOf[js.Any], status = status.asInstanceOf[js.Any])
      __obj.asInstanceOf[Notice]
    }
    
    @scala.inline
    implicit class NoticeMutableBuilder[Self <: Notice] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setActions(value: js.Array[Action]): Self = StObject.set(x, "actions", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setActionsVarargs(value: Action*): Self = StObject.set(x, "actions", js.Array(value :_*))
      
      @scala.inline
      def setContent(value: String): Self = StObject.set(x, "content", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIsDismissible(value: Boolean): Self = StObject.set(x, "isDismissible", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStatus(value: Status): Self = StObject.set(x, "status", value.asInstanceOf[js.Any])
    }
  }
  
  trait Options extends StObject {
    
    /**
      * User actions to be presented with notice.
      */
    var actions: js.Array[Action]
    
    /**
      * Context under which to group notice.
      * @defaultValue `'global'`
      */
    var context: String
    
    /**
      * Identifier for notice. Automatically assigned if not specified.
      */
    var id: String
    
    /**
      * Whether the notice can be dismissed by user.
      * @defaultValue `true`
      */
    var isDismissible: Boolean
    
    /**
      * Whether the notice content should be announced to screen readers.
      * @defaultValue `true`
      */
    var speak: Boolean
    
    /**
      * The type of notice.
      * @defaultValue `'default'`
      */
    var `type`: default | snackbar
  }
  object Options {
    
    @scala.inline
    def apply(
      actions: js.Array[Action],
      context: String,
      id: String,
      isDismissible: Boolean,
      speak: Boolean,
      `type`: default | snackbar
    ): Options = {
      val __obj = js.Dynamic.literal(actions = actions.asInstanceOf[js.Any], context = context.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], isDismissible = isDismissible.asInstanceOf[js.Any], speak = speak.asInstanceOf[js.Any])
      __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
      __obj.asInstanceOf[Options]
    }
    
    @scala.inline
    implicit class OptionsMutableBuilder[Self <: Options] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setActions(value: js.Array[Action]): Self = StObject.set(x, "actions", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setActionsVarargs(value: Action*): Self = StObject.set(x, "actions", js.Array(value :_*))
      
      @scala.inline
      def setContext(value: String): Self = StObject.set(x, "context", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIsDismissible(value: Boolean): Self = StObject.set(x, "isDismissible", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSpeak(value: Boolean): Self = StObject.set(x, "speak", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setType(value: default | snackbar): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    }
  }
  
  /* Rewritten from type alias, can be one of: 
    - typings.wordpressNotices.wordpressNoticesStrings.error
    - typings.wordpressNotices.wordpressNoticesStrings.info
    - typings.wordpressNotices.wordpressNoticesStrings.success
    - typings.wordpressNotices.wordpressNoticesStrings.warning
  */
  trait Status extends StObject
  object Status {
    
    @scala.inline
    def error: typings.wordpressNotices.wordpressNoticesStrings.error = "error".asInstanceOf[typings.wordpressNotices.wordpressNoticesStrings.error]
    
    @scala.inline
    def info: typings.wordpressNotices.wordpressNoticesStrings.info = "info".asInstanceOf[typings.wordpressNotices.wordpressNoticesStrings.info]
    
    @scala.inline
    def success: typings.wordpressNotices.wordpressNoticesStrings.success = "success".asInstanceOf[typings.wordpressNotices.wordpressNoticesStrings.success]
    
    @scala.inline
    def warning: typings.wordpressNotices.wordpressNoticesStrings.warning = "warning".asInstanceOf[typings.wordpressNotices.wordpressNoticesStrings.warning]
  }
  
  trait URLAction
    extends StObject
       with Action {
    
    var label: String
    
    var url: String
  }
  object URLAction {
    
    @scala.inline
    def apply(label: String, url: String): URLAction = {
      val __obj = js.Dynamic.literal(label = label.asInstanceOf[js.Any], url = url.asInstanceOf[js.Any])
      __obj.asInstanceOf[URLAction]
    }
    
    @scala.inline
    implicit class URLActionMutableBuilder[Self <: URLAction] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setLabel(value: String): Self = StObject.set(x, "label", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setUrl(value: String): Self = StObject.set(x, "url", value.asInstanceOf[js.Any])
    }
  }
}
