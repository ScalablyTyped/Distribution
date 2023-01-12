package typings.wixUiIconsCommon

import org.scalablytyped.runtime.Shortcut
import typings.react.mod.FC
import typings.react.mod.SVGAttributes
import typings.std.SVGElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distSrcOnStageGeneralDistComponentsTextStyleSmallMod extends Shortcut {
  
  @JSImport("wix-ui-icons-common/dist/src/on-stage/general/dist/components/TextStyleSmall", JSImport.Default)
  @js.native
  val default: FC[TextStyleSmallProps] = js.native
  
  trait TextStyleSmallProps
    extends StObject
       with SVGAttributes[SVGElement] {
    
    var size: js.UndefOr[String | Double] = js.undefined
  }
  object TextStyleSmallProps {
    
    inline def apply(): TextStyleSmallProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[TextStyleSmallProps]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: TextStyleSmallProps] (val x: Self) extends AnyVal {
      
      inline def setSize(value: String | Double): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
      
      inline def setSizeUndefined: Self = StObject.set(x, "size", js.undefined)
    }
  }
  
  type _To = FC[TextStyleSmallProps]
  
  /* This means you don't have to write `default`, but can instead just say `distSrcOnStageGeneralDistComponentsTextStyleSmallMod.foo` */
  override def _to: FC[TextStyleSmallProps] = default
}
