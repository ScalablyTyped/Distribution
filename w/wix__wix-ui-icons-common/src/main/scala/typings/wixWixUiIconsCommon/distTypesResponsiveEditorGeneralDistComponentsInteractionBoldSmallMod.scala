package typings.wixWixUiIconsCommon

import org.scalablytyped.runtime.Shortcut
import typings.react.mod.FC
import typings.react.mod.SVGAttributes
import typings.std.SVGElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distTypesResponsiveEditorGeneralDistComponentsInteractionBoldSmallMod extends Shortcut {
  
  @JSImport("@wix/wix-ui-icons-common/dist/types/responsive-editor/general/dist/components/InteractionBoldSmall", JSImport.Default)
  @js.native
  val default: FC[InteractionBoldSmallProps] = js.native
  
  trait InteractionBoldSmallProps
    extends StObject
       with SVGAttributes[SVGElement] {
    
    var size: js.UndefOr[String | Double] = js.undefined
  }
  object InteractionBoldSmallProps {
    
    inline def apply(): InteractionBoldSmallProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[InteractionBoldSmallProps]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: InteractionBoldSmallProps] (val x: Self) extends AnyVal {
      
      inline def setSize(value: String | Double): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
      
      inline def setSizeUndefined: Self = StObject.set(x, "size", js.undefined)
    }
  }
  
  type _To = FC[InteractionBoldSmallProps]
  
  /* This means you don't have to write `default`, but can instead just say `distTypesResponsiveEditorGeneralDistComponentsInteractionBoldSmallMod.foo` */
  override def _to: FC[InteractionBoldSmallProps] = default
}
