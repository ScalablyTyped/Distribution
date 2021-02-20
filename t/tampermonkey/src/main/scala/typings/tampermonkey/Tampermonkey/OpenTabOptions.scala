package typings.tampermonkey.Tampermonkey

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait OpenTabOptions extends StObject {
  
  /** Decides whether the new tab should be focused */
  var active: js.UndefOr[Boolean] = js.native
  
  /** Inserts the new tab after the current one */
  var insert: js.UndefOr[Boolean] = js.native
  
  /** Makes the browser re-focus the current tab on close */
  var setParent: js.UndefOr[Boolean] = js.native
}
object OpenTabOptions {
  
  @scala.inline
  def apply(): OpenTabOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[OpenTabOptions]
  }
  
  @scala.inline
  implicit class OpenTabOptionsMutableBuilder[Self <: OpenTabOptions] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setActive(value: Boolean): Self = StObject.set(x, "active", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setActiveUndefined: Self = StObject.set(x, "active", js.undefined)
    
    @scala.inline
    def setInsert(value: Boolean): Self = StObject.set(x, "insert", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setInsertUndefined: Self = StObject.set(x, "insert", js.undefined)
    
    @scala.inline
    def setSetParent(value: Boolean): Self = StObject.set(x, "setParent", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSetParentUndefined: Self = StObject.set(x, "setParent", js.undefined)
  }
}
