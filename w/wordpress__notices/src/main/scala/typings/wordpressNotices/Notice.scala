package typings.wordpressNotices

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Notice extends StObject {
  
  /**
    * Notice message as raw HTML. Intended to serve primarily for compatibility of server-rendered notices, and SHOULD
    * NOT be used for notices. It is subject to removal without notice.
    */
  var __unstableHTML: String
  
  /**
    * User actions to present with notice.
    */
  var actions: js.Array[Action]
  
  /**
    * Notice message.
    */
  var content: String
  
  /**
    * Unique identifier of notice.
    */
  var id: String
  
  /**
    * Whether the notice can be dismissed by user. Defaults to `true`
    */
  var isDismissible: Boolean
  
  /**
    * Whether the notice content should be announced to screen readers. Defaults to `true`.
    */
  var speak: Boolean
  
  /**
    * Audibly announced message text used by assistive technologies.
    */
  var spokenMessage: String
  
  /**
    * Status of notice, one of `success`, `info`, `error`, or `warning`. Defaults to `info`.
    */
  var status: Status
  
  /**
    * Type of notice, one of `default`, or `snackbar`. Defaults to `default`.
    * @defaultValue `'global'`
    */
  var `type`: NoticeType
}
object Notice {
  
  inline def apply(
    __unstableHTML: String,
    actions: js.Array[Action],
    content: String,
    id: String,
    isDismissible: Boolean,
    speak: Boolean,
    spokenMessage: String,
    status: Status,
    `type`: NoticeType
  ): Notice = {
    val __obj = js.Dynamic.literal(__unstableHTML = __unstableHTML.asInstanceOf[js.Any], actions = actions.asInstanceOf[js.Any], content = content.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], isDismissible = isDismissible.asInstanceOf[js.Any], speak = speak.asInstanceOf[js.Any], spokenMessage = spokenMessage.asInstanceOf[js.Any], status = status.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Notice]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Notice] (val x: Self) extends AnyVal {
    
    inline def setActions(value: js.Array[Action]): Self = StObject.set(x, "actions", value.asInstanceOf[js.Any])
    
    inline def setActionsVarargs(value: Action*): Self = StObject.set(x, "actions", js.Array(value*))
    
    inline def setContent(value: String): Self = StObject.set(x, "content", value.asInstanceOf[js.Any])
    
    inline def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    inline def setIsDismissible(value: Boolean): Self = StObject.set(x, "isDismissible", value.asInstanceOf[js.Any])
    
    inline def setSpeak(value: Boolean): Self = StObject.set(x, "speak", value.asInstanceOf[js.Any])
    
    inline def setSpokenMessage(value: String): Self = StObject.set(x, "spokenMessage", value.asInstanceOf[js.Any])
    
    inline def setStatus(value: Status): Self = StObject.set(x, "status", value.asInstanceOf[js.Any])
    
    inline def setType(value: NoticeType): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    inline def set__unstableHTML(value: String): Self = StObject.set(x, "__unstableHTML", value.asInstanceOf[js.Any])
  }
}
