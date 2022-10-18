package typings.wixUiIconsCommon

import org.scalablytyped.runtime.Shortcut
import typings.react.mod.FC
import typings.react.mod.SVGAttributes
import typings.std.SVGElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distSrcClassicEditorGeneralDistComponentsUserPreviewBoldMod extends Shortcut {
  
  @JSImport("wix-ui-icons-common/dist/src/classic-editor/general/dist/components/UserPreviewBold", JSImport.Default)
  @js.native
  val default: FC[UserPreviewBoldProps] = js.native
  
  trait UserPreviewBoldProps
    extends StObject
       with SVGAttributes[SVGElement] {
    
    var size: js.UndefOr[String | Double] = js.undefined
  }
  object UserPreviewBoldProps {
    
    inline def apply(): UserPreviewBoldProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[UserPreviewBoldProps]
    }
    
    extension [Self <: UserPreviewBoldProps](x: Self) {
      
      inline def setSize(value: String | Double): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
      
      inline def setSizeUndefined: Self = StObject.set(x, "size", js.undefined)
    }
  }
  
  type _To = FC[UserPreviewBoldProps]
  
  /* This means you don't have to write `default`, but can instead just say `distSrcClassicEditorGeneralDistComponentsUserPreviewBoldMod.foo` */
  override def _to: FC[UserPreviewBoldProps] = default
}
