package typings.wixWixUiIconsCommon

import org.scalablytyped.runtime.Shortcut
import typings.react.mod.FC
import typings.react.mod.SVGAttributes
import typings.std.SVGElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distTypesClassicEditorSystemDistComponentsDecreaseFontMod extends Shortcut {
  
  @JSImport("@wix/wix-ui-icons-common/dist/types/classic-editor/system/dist/components/DecreaseFont", JSImport.Default)
  @js.native
  val default: FC[DecreaseFontProps] = js.native
  
  trait DecreaseFontProps
    extends StObject
       with SVGAttributes[SVGElement] {
    
    var size: js.UndefOr[String | Double] = js.undefined
  }
  object DecreaseFontProps {
    
    inline def apply(): DecreaseFontProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[DecreaseFontProps]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: DecreaseFontProps] (val x: Self) extends AnyVal {
      
      inline def setSize(value: String | Double): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
      
      inline def setSizeUndefined: Self = StObject.set(x, "size", js.undefined)
    }
  }
  
  type _To = FC[DecreaseFontProps]
  
  /* This means you don't have to write `default`, but can instead just say `distTypesClassicEditorSystemDistComponentsDecreaseFontMod.foo` */
  override def _to: FC[DecreaseFontProps] = default
}
