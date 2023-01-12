package typings.tampermonkey.Tampermonkey

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait OpenTabOptions extends StObject {
  
  /** Decides whether the new tab should be focused */
  var active: js.UndefOr[Boolean] = js.undefined
  
  /** Inserts the new tab after the current one */
  var insert: js.UndefOr[Boolean] = js.undefined
  
  /** Makes the browser re-focus the current tab on close */
  var setParent: js.UndefOr[Boolean] = js.undefined
}
object OpenTabOptions {
  
  inline def apply(): OpenTabOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[OpenTabOptions]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: OpenTabOptions] (val x: Self) extends AnyVal {
    
    inline def setActive(value: Boolean): Self = StObject.set(x, "active", value.asInstanceOf[js.Any])
    
    inline def setActiveUndefined: Self = StObject.set(x, "active", js.undefined)
    
    inline def setInsert(value: Boolean): Self = StObject.set(x, "insert", value.asInstanceOf[js.Any])
    
    inline def setInsertUndefined: Self = StObject.set(x, "insert", js.undefined)
    
    inline def setSetParent(value: Boolean): Self = StObject.set(x, "setParent", value.asInstanceOf[js.Any])
    
    inline def setSetParentUndefined: Self = StObject.set(x, "setParent", js.undefined)
  }
}
