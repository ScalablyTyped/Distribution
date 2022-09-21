package typings.wixWixUiIconsCommon

import org.scalablytyped.runtime.Shortcut
import typings.react.mod.FC
import typings.react.mod.SVGAttributes
import typings.std.SVGElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object propertiesMod extends Shortcut {
  
  @JSImport("@wix/wix-ui-icons-common/dist/types/classic-editor/system/dist/components/Properties", JSImport.Default)
  @js.native
  val default: FC[PropertiesProps] = js.native
  
  trait PropertiesProps
    extends StObject
       with SVGAttributes[SVGElement] {
    
    var size: js.UndefOr[String | Double] = js.undefined
  }
  object PropertiesProps {
    
    inline def apply(): PropertiesProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[PropertiesProps]
    }
    
    extension [Self <: PropertiesProps](x: Self) {
      
      inline def setSize(value: String | Double): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
      
      inline def setSizeUndefined: Self = StObject.set(x, "size", js.undefined)
    }
  }
  
  type _To = FC[PropertiesProps]
  
  /* This means you don't have to write `default`, but can instead just say `propertiesMod.foo` */
  override def _to: FC[PropertiesProps] = default
}
