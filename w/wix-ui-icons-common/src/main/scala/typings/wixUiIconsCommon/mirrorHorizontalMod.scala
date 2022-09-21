package typings.wixUiIconsCommon

import org.scalablytyped.runtime.Shortcut
import typings.react.mod.FC
import typings.react.mod.SVGAttributes
import typings.std.SVGElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mirrorHorizontalMod extends Shortcut {
  
  @JSImport("wix-ui-icons-common/dist/src/general/dist/components/MirrorHorizontal", JSImport.Default)
  @js.native
  val default: FC[MirrorHorizontalProps] = js.native
  
  trait MirrorHorizontalProps
    extends StObject
       with SVGAttributes[SVGElement] {
    
    var size: js.UndefOr[String | Double] = js.undefined
  }
  object MirrorHorizontalProps {
    
    inline def apply(): MirrorHorizontalProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[MirrorHorizontalProps]
    }
    
    extension [Self <: MirrorHorizontalProps](x: Self) {
      
      inline def setSize(value: String | Double): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
      
      inline def setSizeUndefined: Self = StObject.set(x, "size", js.undefined)
    }
  }
  
  type _To = FC[MirrorHorizontalProps]
  
  /* This means you don't have to write `default`, but can instead just say `mirrorHorizontalMod.foo` */
  override def _to: FC[MirrorHorizontalProps] = default
}
