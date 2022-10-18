package typings.wixUiIconsCommon

import org.scalablytyped.runtime.Shortcut
import typings.react.mod.FC
import typings.react.mod.SVGAttributes
import typings.std.SVGElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distSrcGeneralDistComponentsTimeMod extends Shortcut {
  
  @JSImport("wix-ui-icons-common/dist/src/general/dist/components/Time", JSImport.Default)
  @js.native
  val default: FC[TimeProps] = js.native
  
  trait TimeProps
    extends StObject
       with SVGAttributes[SVGElement] {
    
    var size: js.UndefOr[String | Double] = js.undefined
  }
  object TimeProps {
    
    inline def apply(): TimeProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[TimeProps]
    }
    
    extension [Self <: TimeProps](x: Self) {
      
      inline def setSize(value: String | Double): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
      
      inline def setSizeUndefined: Self = StObject.set(x, "size", js.undefined)
    }
  }
  
  type _To = FC[TimeProps]
  
  /* This means you don't have to write `default`, but can instead just say `distSrcGeneralDistComponentsTimeMod.foo` */
  override def _to: FC[TimeProps] = default
}
