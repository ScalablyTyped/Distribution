package typings.wixWixUiIconsCommon

import org.scalablytyped.runtime.Shortcut
import typings.react.mod.FC
import typings.react.mod.SVGAttributes
import typings.std.SVGElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distTypesOnStageGeneralDistComponentsPlayButtonSmallMod extends Shortcut {
  
  @JSImport("@wix/wix-ui-icons-common/dist/types/on-stage/general/dist/components/PlayButtonSmall", JSImport.Default)
  @js.native
  val default: FC[PlayButtonSmallProps] = js.native
  
  trait PlayButtonSmallProps
    extends StObject
       with SVGAttributes[SVGElement] {
    
    var size: js.UndefOr[String | Double] = js.undefined
  }
  object PlayButtonSmallProps {
    
    inline def apply(): PlayButtonSmallProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[PlayButtonSmallProps]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: PlayButtonSmallProps] (val x: Self) extends AnyVal {
      
      inline def setSize(value: String | Double): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
      
      inline def setSizeUndefined: Self = StObject.set(x, "size", js.undefined)
    }
  }
  
  type _To = FC[PlayButtonSmallProps]
  
  /* This means you don't have to write `default`, but can instead just say `distTypesOnStageGeneralDistComponentsPlayButtonSmallMod.foo` */
  override def _to: FC[PlayButtonSmallProps] = default
}
