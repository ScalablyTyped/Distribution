package typings.wixWixUiIconsCommon

import org.scalablytyped.runtime.Shortcut
import typings.react.mod.FC
import typings.react.mod.SVGAttributes
import typings.std.SVGElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object businessAppsMod extends Shortcut {
  
  @JSImport("@wix/wix-ui-icons-common/dist/types/classic-editor/system/dist/components/BusinessApps", JSImport.Default)
  @js.native
  val default: FC[BusinessAppsProps] = js.native
  
  trait BusinessAppsProps
    extends StObject
       with SVGAttributes[SVGElement] {
    
    var size: js.UndefOr[String | Double] = js.undefined
  }
  object BusinessAppsProps {
    
    inline def apply(): BusinessAppsProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[BusinessAppsProps]
    }
    
    extension [Self <: BusinessAppsProps](x: Self) {
      
      inline def setSize(value: String | Double): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
      
      inline def setSizeUndefined: Self = StObject.set(x, "size", js.undefined)
    }
  }
  
  type _To = FC[BusinessAppsProps]
  
  /* This means you don't have to write `default`, but can instead just say `businessAppsMod.foo` */
  override def _to: FC[BusinessAppsProps] = default
}
