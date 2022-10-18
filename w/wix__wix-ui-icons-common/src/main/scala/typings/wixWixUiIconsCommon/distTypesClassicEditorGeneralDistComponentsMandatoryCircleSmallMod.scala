package typings.wixWixUiIconsCommon

import org.scalablytyped.runtime.Shortcut
import typings.react.mod.FC
import typings.react.mod.SVGAttributes
import typings.std.SVGElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distTypesClassicEditorGeneralDistComponentsMandatoryCircleSmallMod extends Shortcut {
  
  @JSImport("@wix/wix-ui-icons-common/dist/types/classic-editor/general/dist/components/MandatoryCircleSmall", JSImport.Default)
  @js.native
  val default: FC[MandatoryCircleSmallProps] = js.native
  
  trait MandatoryCircleSmallProps
    extends StObject
       with SVGAttributes[SVGElement] {
    
    var size: js.UndefOr[String | Double] = js.undefined
  }
  object MandatoryCircleSmallProps {
    
    inline def apply(): MandatoryCircleSmallProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[MandatoryCircleSmallProps]
    }
    
    extension [Self <: MandatoryCircleSmallProps](x: Self) {
      
      inline def setSize(value: String | Double): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
      
      inline def setSizeUndefined: Self = StObject.set(x, "size", js.undefined)
    }
  }
  
  type _To = FC[MandatoryCircleSmallProps]
  
  /* This means you don't have to write `default`, but can instead just say `distTypesClassicEditorGeneralDistComponentsMandatoryCircleSmallMod.foo` */
  override def _to: FC[MandatoryCircleSmallProps] = default
}
