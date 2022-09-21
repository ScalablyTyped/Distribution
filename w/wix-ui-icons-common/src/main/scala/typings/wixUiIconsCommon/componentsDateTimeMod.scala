package typings.wixUiIconsCommon

import org.scalablytyped.runtime.Shortcut
import typings.react.mod.FC
import typings.react.mod.SVGAttributes
import typings.std.SVGElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object componentsDateTimeMod extends Shortcut {
  
  @JSImport("wix-ui-icons-common/dist/src/classic-editor/general/dist/components/DateTime", JSImport.Default)
  @js.native
  val default: FC[DateTimeProps] = js.native
  
  trait DateTimeProps
    extends StObject
       with SVGAttributes[SVGElement] {
    
    var size: js.UndefOr[String | Double] = js.undefined
  }
  object DateTimeProps {
    
    inline def apply(): DateTimeProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[DateTimeProps]
    }
    
    extension [Self <: DateTimeProps](x: Self) {
      
      inline def setSize(value: String | Double): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
      
      inline def setSizeUndefined: Self = StObject.set(x, "size", js.undefined)
    }
  }
  
  type _To = FC[DateTimeProps]
  
  /* This means you don't have to write `default`, but can instead just say `componentsDateTimeMod.foo` */
  override def _to: FC[DateTimeProps] = default
}
