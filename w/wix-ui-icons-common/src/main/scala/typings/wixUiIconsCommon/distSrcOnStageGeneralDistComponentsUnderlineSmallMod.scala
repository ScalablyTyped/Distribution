package typings.wixUiIconsCommon

import org.scalablytyped.runtime.Shortcut
import typings.react.mod.FC
import typings.react.mod.SVGAttributes
import typings.std.SVGElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distSrcOnStageGeneralDistComponentsUnderlineSmallMod extends Shortcut {
  
  @JSImport("wix-ui-icons-common/dist/src/on-stage/general/dist/components/UnderlineSmall", JSImport.Default)
  @js.native
  val default: FC[UnderlineSmallProps] = js.native
  
  trait UnderlineSmallProps
    extends StObject
       with SVGAttributes[SVGElement] {
    
    var size: js.UndefOr[String | Double] = js.undefined
  }
  object UnderlineSmallProps {
    
    inline def apply(): UnderlineSmallProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[UnderlineSmallProps]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: UnderlineSmallProps] (val x: Self) extends AnyVal {
      
      inline def setSize(value: String | Double): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
      
      inline def setSizeUndefined: Self = StObject.set(x, "size", js.undefined)
    }
  }
  
  type _To = FC[UnderlineSmallProps]
  
  /* This means you don't have to write `default`, but can instead just say `distSrcOnStageGeneralDistComponentsUnderlineSmallMod.foo` */
  override def _to: FC[UnderlineSmallProps] = default
}
