package typings.wixUiIconsCommon

import org.scalablytyped.runtime.Shortcut
import typings.react.mod.FC
import typings.react.mod.SVGAttributes
import typings.std.SVGElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distSrcClassicEditorGeneralDistComponentsTestTubeSmallMod extends Shortcut {
  
  @JSImport("wix-ui-icons-common/dist/src/classic-editor/general/dist/components/TestTubeSmall", JSImport.Default)
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
    
    @scala.inline
    implicit open class MutableBuilder[Self <: TestTubeSmallProps] (val x: Self) extends AnyVal {
      
      inline def setSize(value: String | Double): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
      
      inline def setSizeUndefined: Self = StObject.set(x, "size", js.undefined)
    }
  }
  
  type _To = FC[TestTubeSmallProps]
  
  /* This means you don't have to write `default`, but can instead just say `distSrcClassicEditorGeneralDistComponentsTestTubeSmallMod.foo` */
  override def _to: FC[TestTubeSmallProps] = default
}
