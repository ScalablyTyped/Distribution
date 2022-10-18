package typings.wixWixUiIconsCommon

import org.scalablytyped.runtime.Shortcut
import typings.react.mod.FC
import typings.react.mod.SVGAttributes
import typings.std.SVGElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distTypesClassicEditorSystemDistComponentsCustomizeDesignMod extends Shortcut {
  
  @JSImport("@wix/wix-ui-icons-common/dist/types/classic-editor/system/dist/components/CustomizeDesign", JSImport.Default)
  @js.native
  val default: FC[CustomizeDesignProps] = js.native
  
  trait CustomizeDesignProps
    extends StObject
       with SVGAttributes[SVGElement] {
    
    var size: js.UndefOr[String | Double] = js.undefined
  }
  object CustomizeDesignProps {
    
    inline def apply(): CustomizeDesignProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[CustomizeDesignProps]
    }
    
    extension [Self <: CustomizeDesignProps](x: Self) {
      
      inline def setSize(value: String | Double): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
      
      inline def setSizeUndefined: Self = StObject.set(x, "size", js.undefined)
    }
  }
  
  type _To = FC[CustomizeDesignProps]
  
  /* This means you don't have to write `default`, but can instead just say `distTypesClassicEditorSystemDistComponentsCustomizeDesignMod.foo` */
  override def _to: FC[CustomizeDesignProps] = default
}
