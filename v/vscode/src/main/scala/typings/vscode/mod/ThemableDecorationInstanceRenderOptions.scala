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
  
  @scala.inline
  def apply(): ThemableDecorationInstanceRenderOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ThemableDecorationInstanceRenderOptions]
  }
  
  @scala.inline
  implicit class ThemableDecorationInstanceRenderOptionsMutableBuilder[Self <: ThemableDecorationInstanceRenderOptions] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAfter(value: ThemableDecorationAttachmentRenderOptions): Self = StObject.set(x, "after", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAfterUndefined: Self = StObject.set(x, "after", js.undefined)
    
    @scala.inline
    def setBefore(value: ThemableDecorationAttachmentRenderOptions): Self = StObject.set(x, "before", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBeforeUndefined: Self = StObject.set(x, "before", js.undefined)
  }
}
