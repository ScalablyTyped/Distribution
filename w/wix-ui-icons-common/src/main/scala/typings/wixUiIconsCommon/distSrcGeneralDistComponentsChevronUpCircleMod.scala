package typings.wixUiIconsCommon

import org.scalablytyped.runtime.Shortcut
import typings.react.mod.FC
import typings.react.mod.SVGAttributes
import typings.std.SVGElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distSrcGeneralDistComponentsChevronUpCircleMod extends Shortcut {
  
  @JSImport("wix-ui-icons-common/dist/src/general/dist/components/ChevronUpCircle", JSImport.Default)
  @js.native
  val default: FC[ChevronUpCircleProps] = js.native
  
  trait ChevronUpCircleProps
    extends StObject
       with SVGAttributes[SVGElement] {
    
    var size: js.UndefOr[String | Double] = js.undefined
  }
  object ChevronUpCircleProps {
    
    inline def apply(): ChevronUpCircleProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ChevronUpCircleProps]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: ChevronUpCircleProps] (val x: Self) extends AnyVal {
      
      inline def setSize(value: String | Double): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
      
      inline def setSizeUndefined: Self = StObject.set(x, "size", js.undefined)
    }
  }
  
  type _To = FC[ChevronUpCircleProps]
  
  /* This means you don't have to write `default`, but can instead just say `distSrcGeneralDistComponentsChevronUpCircleMod.foo` */
  override def _to: FC[ChevronUpCircleProps] = default
}
