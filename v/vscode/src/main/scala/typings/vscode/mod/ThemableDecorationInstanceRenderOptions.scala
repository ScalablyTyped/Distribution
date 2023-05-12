package typings.vscode.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ThemableDecorationInstanceRenderOptions extends StObject {
  
  /**
  		 * Defines the rendering options of the attachment that is inserted after the decorated text.
  		 */
  var after: js.UndefOr[ThemableDecorationAttachmentRenderOptions] = js.undefined
  
  /**
  		 * Defines the rendering options of the attachment that is inserted before the decorated text.
  		 */
  var before: js.UndefOr[ThemableDecorationAttachmentRenderOptions] = js.undefined
}
object ThemableDecorationInstanceRenderOptions {
  
  inline def apply(): ThemableDecorationInstanceRenderOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ThemableDecorationInstanceRenderOptions]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ThemableDecorationInstanceRenderOptions] (val x: Self) extends AnyVal {
    
    inline def setAfter(value: ThemableDecorationAttachmentRenderOptions): Self = StObject.set(x, "after", value.asInstanceOf[js.Any])
    
    inline def setAfterUndefined: Self = StObject.set(x, "after", js.undefined)
    
    inline def setBefore(value: ThemableDecorationAttachmentRenderOptions): Self = StObject.set(x, "before", value.asInstanceOf[js.Any])
    
    inline def setBeforeUndefined: Self = StObject.set(x, "before", js.undefined)
  }
}
