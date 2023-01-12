package typings.videoReact.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ShortcutProps extends StObject {
  
  /**
    * Allow click to play/pause, default: `true`
    */
  var clickable: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Allow double click to toggle fullscreen state, default: `true`
    */
  var dblclickable: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Add your own shortcuts
    */
  var shortcuts: js.UndefOr[js.Array[ShortcutItem]] = js.undefined
}
object ShortcutProps {
  
  inline def apply(): ShortcutProps = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ShortcutProps]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ShortcutProps] (val x: Self) extends AnyVal {
    
    inline def setClickable(value: Boolean): Self = StObject.set(x, "clickable", value.asInstanceOf[js.Any])
    
    inline def setClickableUndefined: Self = StObject.set(x, "clickable", js.undefined)
    
    inline def setDblclickable(value: Boolean): Self = StObject.set(x, "dblclickable", value.asInstanceOf[js.Any])
    
    inline def setDblclickableUndefined: Self = StObject.set(x, "dblclickable", js.undefined)
    
    inline def setShortcuts(value: js.Array[ShortcutItem]): Self = StObject.set(x, "shortcuts", value.asInstanceOf[js.Any])
    
    inline def setShortcutsUndefined: Self = StObject.set(x, "shortcuts", js.undefined)
    
    inline def setShortcutsVarargs(value: ShortcutItem*): Self = StObject.set(x, "shortcuts", js.Array(value*))
  }
}
