package typings.wixWixUiIconsCommon

import org.scalablytyped.runtime.Shortcut
import typings.react.mod.FC
import typings.react.mod.SVGAttributes
import typings.std.SVGElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object playCircleMod extends Shortcut {
  
  @JSImport("@wix/wix-ui-icons-common/dist/types/classic-editor/general/dist/components/PlayCircle", JSImport.Default)
  @js.native
  val default: FC[PlayCircleProps] = js.native
  
  trait PlayCircleProps
    extends StObject
       with SVGAttributes[SVGElement] {
    
    var size: js.UndefOr[String | Double] = js.undefined
  }
  object PlayCircleProps {
    
    inline def apply(): PlayCircleProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[PlayCircleProps]
    }
    
    extension [Self <: PlayCircleProps](x: Self) {
      
      inline def setSize(value: String | Double): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
      
      inline def setSizeUndefined: Self = StObject.set(x, "size", js.undefined)
    }
  }
  
  type _To = FC[PlayCircleProps]
  
  /* This means you don't have to write `default`, but can instead just say `playCircleMod.foo` */
  override def _to: FC[PlayCircleProps] = default
}
