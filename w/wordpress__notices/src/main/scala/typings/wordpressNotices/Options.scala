package typings.wordpressNotices

import typings.react.mod.global.JSX.Element
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

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
    * Whether the notice includes
    * an explict dismiss button and
    * can't be dismissed by clicking
    * the body of the notice.
    * @defaultValue `false`
    */
  var explicitDismiss: Boolean
  
  /**
    *  An icon displayed with the notice.
    * @defaultValue `null`
    */
  var icon: Null | Element
  
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
    *  Called when the notice is dismissed.
    */
  def onDismiss(): Unit
  
  /**
    * Whether the notice content should be announced to screen readers.
    * @defaultValue `true`
    */
  var speak: Boolean
  
  /**
    * The type of notice.
    * @defaultValue `'default'`
    */
  var `type`: NoticeType
}
object Options {
  
  inline def apply(
    actions: js.Array[Action],
    context: String,
    explicitDismiss: Boolean,
    id: String,
    isDismissible: Boolean,
    onDismiss: () => Unit,
    speak: Boolean,
    `type`: NoticeType
  ): Options = {
    val __obj = js.Dynamic.literal(actions = actions.asInstanceOf[js.Any], context = context.asInstanceOf[js.Any], explicitDismiss = explicitDismiss.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], isDismissible = isDismissible.asInstanceOf[js.Any], onDismiss = js.Any.fromFunction0(onDismiss), speak = speak.asInstanceOf[js.Any], icon = null)
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Options]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Options] (val x: Self) extends AnyVal {
    
    inline def setActions(value: js.Array[Action]): Self = StObject.set(x, "actions", value.asInstanceOf[js.Any])
    
    inline def setActionsVarargs(value: Action*): Self = StObject.set(x, "actions", js.Array(value*))
    
    inline def setContext(value: String): Self = StObject.set(x, "context", value.asInstanceOf[js.Any])
    
    inline def setExplicitDismiss(value: Boolean): Self = StObject.set(x, "explicitDismiss", value.asInstanceOf[js.Any])
    
    inline def setIcon(value: Element): Self = StObject.set(x, "icon", value.asInstanceOf[js.Any])
    
    inline def setIconNull: Self = StObject.set(x, "icon", null)
    
    inline def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    inline def setIsDismissible(value: Boolean): Self = StObject.set(x, "isDismissible", value.asInstanceOf[js.Any])
    
    inline def setOnDismiss(value: () => Unit): Self = StObject.set(x, "onDismiss", js.Any.fromFunction0(value))
    
    inline def setSpeak(value: Boolean): Self = StObject.set(x, "speak", value.asInstanceOf[js.Any])
    
    inline def setType(value: NoticeType): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
