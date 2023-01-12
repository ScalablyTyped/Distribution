package typings.wixUiIconsCommon

import org.scalablytyped.runtime.Shortcut
import typings.react.mod.FC
import typings.react.mod.SVGAttributes
import typings.std.SVGElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distSrcGeneralDistComponentsRelatedAppsMod extends Shortcut {
  
  @JSImport("wix-ui-icons-common/dist/src/general/dist/components/RelatedApps", JSImport.Default)
  @js.native
  val default: FC[RelatedAppsProps] = js.native
  
  trait RelatedAppsProps
    extends StObject
       with SVGAttributes[SVGElement] {
    
    var size: js.UndefOr[String | Double] = js.undefined
  }
  object RelatedAppsProps {
    
    inline def apply(): RelatedAppsProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[RelatedAppsProps]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: RelatedAppsProps] (val x: Self) extends AnyVal {
      
      inline def setSize(value: String | Double): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
      
      inline def setSizeUndefined: Self = StObject.set(x, "size", js.undefined)
    }
  }
  
  type _To = FC[RelatedAppsProps]
  
  /* This means you don't have to write `default`, but can instead just say `distSrcGeneralDistComponentsRelatedAppsMod.foo` */
  override def _to: FC[RelatedAppsProps] = default
}
