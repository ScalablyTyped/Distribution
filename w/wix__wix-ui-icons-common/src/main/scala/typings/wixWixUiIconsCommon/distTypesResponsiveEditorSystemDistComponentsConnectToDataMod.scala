package typings.wixWixUiIconsCommon

import org.scalablytyped.runtime.Shortcut
import typings.react.mod.FC
import typings.react.mod.SVGAttributes
import typings.std.SVGElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distTypesResponsiveEditorSystemDistComponentsConnectToDataMod extends Shortcut {
  
  @JSImport("@wix/wix-ui-icons-common/dist/types/responsive-editor/system/dist/components/ConnectToData", JSImport.Default)
  @js.native
  val default: FC[ConnectToDataProps] = js.native
  
  trait ConnectToDataProps
    extends StObject
       with SVGAttributes[SVGElement] {
    
    var size: js.UndefOr[String | Double] = js.undefined
  }
  object ConnectToDataProps {
    
    inline def apply(): ConnectToDataProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ConnectToDataProps]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: ConnectToDataProps] (val x: Self) extends AnyVal {
      
      inline def setSize(value: String | Double): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
      
      inline def setSizeUndefined: Self = StObject.set(x, "size", js.undefined)
    }
  }
  
  type _To = FC[ConnectToDataProps]
  
  /* This means you don't have to write `default`, but can instead just say `distTypesResponsiveEditorSystemDistComponentsConnectToDataMod.foo` */
  override def _to: FC[ConnectToDataProps] = default
}
