package typings.wixWixUiIconsCommon

import org.scalablytyped.runtime.Shortcut
import typings.react.mod.FC
import typings.react.mod.SVGAttributes
import typings.std.SVGElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distTypesClassicEditorSystemDistComponentsHiddenElementsMod extends Shortcut {
  
  @JSImport("@wix/wix-ui-icons-common/dist/types/classic-editor/system/dist/components/HiddenElements", JSImport.Default)
  @js.native
  val default: FC[HiddenElementsProps] = js.native
  
  trait HiddenElementsProps
    extends StObject
       with SVGAttributes[SVGElement] {
    
    var size: js.UndefOr[String | Double] = js.undefined
  }
  object HiddenElementsProps {
    
    inline def apply(): HiddenElementsProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[HiddenElementsProps]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: HiddenElementsProps] (val x: Self) extends AnyVal {
      
      inline def setSize(value: String | Double): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
      
      inline def setSizeUndefined: Self = StObject.set(x, "size", js.undefined)
    }
  }
  
  type _To = FC[HiddenElementsProps]
  
  /* This means you don't have to write `default`, but can instead just say `distTypesClassicEditorSystemDistComponentsHiddenElementsMod.foo` */
  override def _to: FC[HiddenElementsProps] = default
}
