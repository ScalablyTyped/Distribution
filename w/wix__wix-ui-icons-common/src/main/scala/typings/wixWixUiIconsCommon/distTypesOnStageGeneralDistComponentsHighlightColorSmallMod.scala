package typings.wixWixUiIconsCommon

import org.scalablytyped.runtime.Shortcut
import typings.react.mod.FC
import typings.react.mod.SVGAttributes
import typings.std.SVGElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distTypesOnStageGeneralDistComponentsHighlightColorSmallMod extends Shortcut {
  
  @JSImport("@wix/wix-ui-icons-common/dist/types/on-stage/general/dist/components/HighlightColorSmall", JSImport.Default)
  @js.native
  val default: FC[HighlightColorSmallProps] = js.native
  
  trait HighlightColorSmallProps
    extends StObject
       with SVGAttributes[SVGElement] {
    
    var size: js.UndefOr[String | Double] = js.undefined
  }
  object HighlightColorSmallProps {
    
    inline def apply(): HighlightColorSmallProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[HighlightColorSmallProps]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: HighlightColorSmallProps] (val x: Self) extends AnyVal {
      
      inline def setSize(value: String | Double): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
      
      inline def setSizeUndefined: Self = StObject.set(x, "size", js.undefined)
    }
  }
  
  type _To = FC[HighlightColorSmallProps]
  
  /* This means you don't have to write `default`, but can instead just say `distTypesOnStageGeneralDistComponentsHighlightColorSmallMod.foo` */
  override def _to: FC[HighlightColorSmallProps] = default
}
