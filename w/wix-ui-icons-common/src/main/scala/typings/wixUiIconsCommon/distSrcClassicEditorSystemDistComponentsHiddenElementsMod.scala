package typings.wixUiIconsCommon

import org.scalablytyped.runtime.Shortcut
import typings.react.mod.FC
import typings.react.mod.SVGAttributes
import typings.std.SVGElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distSrcClassicEditorSystemDistComponentsHiddenElementsMod extends Shortcut {
  
  @JSImport("wix-ui-icons-common/dist/src/classic-editor/system/dist/components/HiddenElements", JSImport.Default)
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
    
    extension [Self <: HiddenElementsProps](x: Self) {
      
      inline def setSize(value: String | Double): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
      
      inline def setSizeUndefined: Self = StObject.set(x, "size", js.undefined)
    }
  }
  
  type _To = FC[HiddenElementsProps]
  
  /* This means you don't have to write `default`, but can instead just say `distSrcClassicEditorSystemDistComponentsHiddenElementsMod.foo` */
  override def _to: FC[HiddenElementsProps] = default
}
