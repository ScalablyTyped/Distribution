package typings.wixUiIconsCommon

import org.scalablytyped.runtime.Shortcut
import typings.react.mod.FC
import typings.react.mod.SVGAttributes
import typings.std.SVGElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object imageLargeMod extends Shortcut {
  
  @JSImport("wix-ui-icons-common/dist/src/on-stage/system/dist/components/ImageLarge", JSImport.Default)
  @js.native
  val default: FC[ImageLargeProps] = js.native
  
  trait ImageLargeProps
    extends StObject
       with SVGAttributes[SVGElement] {
    
    var size: js.UndefOr[String | Double] = js.undefined
  }
  object ImageLargeProps {
    
    inline def apply(): ImageLargeProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ImageLargeProps]
    }
    
    extension [Self <: ImageLargeProps](x: Self) {
      
      inline def setSize(value: String | Double): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
      
      inline def setSizeUndefined: Self = StObject.set(x, "size", js.undefined)
    }
  }
  
  type _To = FC[ImageLargeProps]
  
  /* This means you don't have to write `default`, but can instead just say `imageLargeMod.foo` */
  override def _to: FC[ImageLargeProps] = default
}
