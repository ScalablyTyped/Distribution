package typings.wixUiIconsCommon

import org.scalablytyped.runtime.Shortcut
import typings.react.mod.FC
import typings.react.mod.SVGAttributes
import typings.std.SVGElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distSrcClassicEditorGeneralDistComponentsHideSmallMod extends Shortcut {
  
  @JSImport("wix-ui-icons-common/dist/src/classic-editor/general/dist/components/HideSmall", JSImport.Default)
  @js.native
  val default: FC[HideSmallProps] = js.native
  
  trait HideSmallProps
    extends StObject
       with SVGAttributes[SVGElement] {
    
    var size: js.UndefOr[String | Double] = js.undefined
  }
  object HideSmallProps {
    
    inline def apply(): HideSmallProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[HideSmallProps]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: HideSmallProps] (val x: Self) extends AnyVal {
      
      inline def setSize(value: String | Double): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
      
      inline def setSizeUndefined: Self = StObject.set(x, "size", js.undefined)
    }
  }
  
  type _To = FC[HideSmallProps]
  
  /* This means you don't have to write `default`, but can instead just say `distSrcClassicEditorGeneralDistComponentsHideSmallMod.foo` */
  override def _to: FC[HideSmallProps] = default
}
