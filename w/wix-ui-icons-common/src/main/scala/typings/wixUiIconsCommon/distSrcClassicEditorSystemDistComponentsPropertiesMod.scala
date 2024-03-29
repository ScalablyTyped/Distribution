package typings.wixUiIconsCommon

import org.scalablytyped.runtime.Shortcut
import typings.react.mod.FC
import typings.react.mod.SVGAttributes
import typings.std.SVGElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distSrcClassicEditorSystemDistComponentsPropertiesMod extends Shortcut {
  
  @JSImport("wix-ui-icons-common/dist/src/classic-editor/system/dist/components/Properties", JSImport.Default)
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
    
    @scala.inline
    implicit open class MutableBuilder[Self <: PropertiesProps] (val x: Self) extends AnyVal {
      
      inline def setSize(value: String | Double): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
      
      inline def setSizeUndefined: Self = StObject.set(x, "size", js.undefined)
    }
  }
  
  type _To = FC[PropertiesProps]
  
  /* This means you don't have to write `default`, but can instead just say `distSrcClassicEditorSystemDistComponentsPropertiesMod.foo` */
  override def _to: FC[PropertiesProps] = default
}
