package typings.wixWixUiIconsCommon

import org.scalablytyped.runtime.Shortcut
import typings.react.mod.FC
import typings.react.mod.SVGAttributes
import typings.std.SVGElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distTypesOnStageSystemDistComponentsPlayButtonLargeMod extends Shortcut {
  
  @JSImport("@wix/wix-ui-icons-common/dist/types/on-stage/system/dist/components/PlayButtonLarge", JSImport.Default)
  @js.native
  val default: FC[PlayButtonLargeProps] = js.native
  
  trait PlayButtonLargeProps
    extends StObject
       with SVGAttributes[SVGElement] {
    
    var size: js.UndefOr[String | Double] = js.undefined
  }
  object PlayButtonLargeProps {
    
    inline def apply(): PlayButtonLargeProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[PlayButtonLargeProps]
    }
    
    extension [Self <: PlayButtonLargeProps](x: Self) {
      
      inline def setSize(value: String | Double): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
      
      inline def setSizeUndefined: Self = StObject.set(x, "size", js.undefined)
    }
  }
  
  type _To = FC[PlayButtonLargeProps]
  
  /* This means you don't have to write `default`, but can instead just say `distTypesOnStageSystemDistComponentsPlayButtonLargeMod.foo` */
  override def _to: FC[PlayButtonLargeProps] = default
}
