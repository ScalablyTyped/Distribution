package typings.wixWixUiIconsCommon

import org.scalablytyped.runtime.Shortcut
import typings.react.mod.FC
import typings.react.mod.SVGAttributes
import typings.std.SVGElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distTypesResponsiveEditorGeneralDistComponentsGridLayoutThreeOnThreeMod extends Shortcut {
  
  @JSImport("@wix/wix-ui-icons-common/dist/types/responsive-editor/general/dist/components/GridLayoutThreeOnThree", JSImport.Default)
  @js.native
  val default: FC[GridLayoutThreeOnThreeProps] = js.native
  
  trait GridLayoutThreeOnThreeProps
    extends StObject
       with SVGAttributes[SVGElement] {
    
    var size: js.UndefOr[String | Double] = js.undefined
  }
  object GridLayoutThreeOnThreeProps {
    
    inline def apply(): GridLayoutThreeOnThreeProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[GridLayoutThreeOnThreeProps]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: GridLayoutThreeOnThreeProps] (val x: Self) extends AnyVal {
      
      inline def setSize(value: String | Double): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
      
      inline def setSizeUndefined: Self = StObject.set(x, "size", js.undefined)
    }
  }
  
  type _To = FC[GridLayoutThreeOnThreeProps]
  
  /* This means you don't have to write `default`, but can instead just say `distTypesResponsiveEditorGeneralDistComponentsGridLayoutThreeOnThreeMod.foo` */
  override def _to: FC[GridLayoutThreeOnThreeProps] = default
}
