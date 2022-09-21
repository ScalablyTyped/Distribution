package typings.wixUiIconsCommon

import org.scalablytyped.runtime.Shortcut
import typings.react.mod.FC
import typings.react.mod.SVGAttributes
import typings.std.SVGElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object playButtonMod extends Shortcut {
  
  @JSImport("wix-ui-icons-common/dist/src/on-stage/general/dist/components/PlayButton", JSImport.Default)
  @js.native
  val default: FC[PlayButtonProps] = js.native
  
  trait PlayButtonProps
    extends StObject
       with SVGAttributes[SVGElement] {
    
    var size: js.UndefOr[String | Double] = js.undefined
  }
  object PlayButtonProps {
    
    inline def apply(): PlayButtonProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[PlayButtonProps]
    }
    
    extension [Self <: PlayButtonProps](x: Self) {
      
      inline def setSize(value: String | Double): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
      
      inline def setSizeUndefined: Self = StObject.set(x, "size", js.undefined)
    }
  }
  
  type _To = FC[PlayButtonProps]
  
  /* This means you don't have to write `default`, but can instead just say `playButtonMod.foo` */
  override def _to: FC[PlayButtonProps] = default
}
