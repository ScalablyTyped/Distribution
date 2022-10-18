package typings.wixUiIconsCommon

import org.scalablytyped.runtime.Shortcut
import typings.react.mod.FC
import typings.react.mod.SVGAttributes
import typings.std.SVGElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distSrcOnStageGeneralDistComponentsTagFillSmallMod extends Shortcut {
  
  @JSImport("wix-ui-icons-common/dist/src/on-stage/general/dist/components/TagFillSmall", JSImport.Default)
  @js.native
  val default: FC[TagFillSmallProps] = js.native
  
  trait TagFillSmallProps
    extends StObject
       with SVGAttributes[SVGElement] {
    
    var size: js.UndefOr[String | Double] = js.undefined
  }
  object TagFillSmallProps {
    
    inline def apply(): TagFillSmallProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[TagFillSmallProps]
    }
    
    extension [Self <: TagFillSmallProps](x: Self) {
      
      inline def setSize(value: String | Double): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
      
      inline def setSizeUndefined: Self = StObject.set(x, "size", js.undefined)
    }
  }
  
  type _To = FC[TagFillSmallProps]
  
  /* This means you don't have to write `default`, but can instead just say `distSrcOnStageGeneralDistComponentsTagFillSmallMod.foo` */
  override def _to: FC[TagFillSmallProps] = default
}
