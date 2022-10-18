package typings.wixWixUiIconsCommon

import org.scalablytyped.runtime.Shortcut
import typings.react.mod.FC
import typings.react.mod.SVGAttributes
import typings.std.SVGElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distTypesClassicEditorGeneralDistComponentsTestTubeSmallMod extends Shortcut {
  
  @JSImport("@wix/wix-ui-icons-common/dist/types/classic-editor/general/dist/components/TestTubeSmall", JSImport.Default)
  @js.native
  val default: FC[TestTubeSmallProps] = js.native
  
  trait TestTubeSmallProps
    extends StObject
       with SVGAttributes[SVGElement] {
    
    var size: js.UndefOr[String | Double] = js.undefined
  }
  object TestTubeSmallProps {
    
    inline def apply(): TestTubeSmallProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[TestTubeSmallProps]
    }
    
    extension [Self <: TestTubeSmallProps](x: Self) {
      
      inline def setSize(value: String | Double): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
      
      inline def setSizeUndefined: Self = StObject.set(x, "size", js.undefined)
    }
  }
  
  type _To = FC[TestTubeSmallProps]
  
  /* This means you don't have to write `default`, but can instead just say `distTypesClassicEditorGeneralDistComponentsTestTubeSmallMod.foo` */
  override def _to: FC[TestTubeSmallProps] = default
}
