package typings.wixWixUiIconsCommon

import org.scalablytyped.runtime.Shortcut
import typings.react.mod.FC
import typings.react.mod.SVGAttributes
import typings.std.SVGElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distTypesClassicEditorSystemDistComponentsMaskMod extends Shortcut {
  
  @JSImport("@wix/wix-ui-icons-common/dist/types/classic-editor/system/dist/components/Mask", JSImport.Default)
  @js.native
  val default: FC[MaskProps] = js.native
  
  trait MaskProps
    extends StObject
       with SVGAttributes[SVGElement] {
    
    var size: js.UndefOr[String | Double] = js.undefined
  }
  object MaskProps {
    
    inline def apply(): MaskProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[MaskProps]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: MaskProps] (val x: Self) extends AnyVal {
      
      inline def setSize(value: String | Double): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
      
      inline def setSizeUndefined: Self = StObject.set(x, "size", js.undefined)
    }
  }
  
  type _To = FC[MaskProps]
  
  /* This means you don't have to write `default`, but can instead just say `distTypesClassicEditorSystemDistComponentsMaskMod.foo` */
  override def _to: FC[MaskProps] = default
}
