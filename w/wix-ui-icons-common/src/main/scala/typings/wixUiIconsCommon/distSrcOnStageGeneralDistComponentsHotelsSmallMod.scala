package typings.wixUiIconsCommon

import org.scalablytyped.runtime.Shortcut
import typings.react.mod.FC
import typings.react.mod.SVGAttributes
import typings.std.SVGElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distSrcOnStageGeneralDistComponentsHotelsSmallMod extends Shortcut {
  
  @JSImport("wix-ui-icons-common/dist/src/on-stage/general/dist/components/HotelsSmall", JSImport.Default)
  @js.native
  val default: FC[HotelsSmallProps] = js.native
  
  trait HotelsSmallProps
    extends StObject
       with SVGAttributes[SVGElement] {
    
    var size: js.UndefOr[String | Double] = js.undefined
  }
  object HotelsSmallProps {
    
    inline def apply(): HotelsSmallProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[HotelsSmallProps]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: HotelsSmallProps] (val x: Self) extends AnyVal {
      
      inline def setSize(value: String | Double): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
      
      inline def setSizeUndefined: Self = StObject.set(x, "size", js.undefined)
    }
  }
  
  type _To = FC[HotelsSmallProps]
  
  /* This means you don't have to write `default`, but can instead just say `distSrcOnStageGeneralDistComponentsHotelsSmallMod.foo` */
  override def _to: FC[HotelsSmallProps] = default
}
