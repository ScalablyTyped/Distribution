package typings.wixWixUiIconsCommon

import org.scalablytyped.runtime.Shortcut
import typings.react.mod.FC
import typings.react.mod.SVGAttributes
import typings.std.SVGElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distTypesResponsiveEditorGeneralDistComponentsStripFullWidthMod extends Shortcut {
  
  @JSImport("@wix/wix-ui-icons-common/dist/types/responsive-editor/general/dist/components/StripFullWidth", JSImport.Default)
  @js.native
  val default: FC[StripFullWidthProps] = js.native
  
  trait StripFullWidthProps
    extends StObject
       with SVGAttributes[SVGElement] {
    
    var size: js.UndefOr[String | Double] = js.undefined
  }
  object StripFullWidthProps {
    
    inline def apply(): StripFullWidthProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[StripFullWidthProps]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: StripFullWidthProps] (val x: Self) extends AnyVal {
      
      inline def setSize(value: String | Double): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
      
      inline def setSizeUndefined: Self = StObject.set(x, "size", js.undefined)
    }
  }
  
  type _To = FC[StripFullWidthProps]
  
  /* This means you don't have to write `default`, but can instead just say `distTypesResponsiveEditorGeneralDistComponentsStripFullWidthMod.foo` */
  override def _to: FC[StripFullWidthProps] = default
}
