package typings.wixUiIconsCommon

import org.scalablytyped.runtime.Shortcut
import typings.react.mod.FC
import typings.react.mod.SVGAttributes
import typings.std.SVGElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distSrcClassicEditorGeneralDistComponentsChevronRightSmallMod extends Shortcut {
  
  @JSImport("wix-ui-icons-common/dist/src/classic-editor/general/dist/components/ChevronRightSmall", JSImport.Default)
  @js.native
  val default: FC[ChevronRightSmallProps] = js.native
  
  trait ChevronRightSmallProps
    extends StObject
       with SVGAttributes[SVGElement] {
    
    var size: js.UndefOr[String | Double] = js.undefined
  }
  object ChevronRightSmallProps {
    
    inline def apply(): ChevronRightSmallProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ChevronRightSmallProps]
    }
    
    extension [Self <: ChevronRightSmallProps](x: Self) {
      
      inline def setSize(value: String | Double): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
      
      inline def setSizeUndefined: Self = StObject.set(x, "size", js.undefined)
    }
  }
  
  type _To = FC[ChevronRightSmallProps]
  
  /* This means you don't have to write `default`, but can instead just say `distSrcClassicEditorGeneralDistComponentsChevronRightSmallMod.foo` */
  override def _to: FC[ChevronRightSmallProps] = default
}
