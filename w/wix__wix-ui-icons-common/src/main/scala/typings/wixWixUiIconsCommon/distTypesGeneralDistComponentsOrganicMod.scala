package typings.wixWixUiIconsCommon

import org.scalablytyped.runtime.Shortcut
import typings.react.mod.FC
import typings.react.mod.SVGAttributes
import typings.std.SVGElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distTypesGeneralDistComponentsOrganicMod extends Shortcut {
  
  @JSImport("@wix/wix-ui-icons-common/dist/types/general/dist/components/Organic", JSImport.Default)
  @js.native
  val default: FC[OrganicProps] = js.native
  
  trait OrganicProps
    extends StObject
       with SVGAttributes[SVGElement] {
    
    var size: js.UndefOr[String | Double] = js.undefined
  }
  object OrganicProps {
    
    inline def apply(): OrganicProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[OrganicProps]
    }
    
    extension [Self <: OrganicProps](x: Self) {
      
      inline def setSize(value: String | Double): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
      
      inline def setSizeUndefined: Self = StObject.set(x, "size", js.undefined)
    }
  }
  
  type _To = FC[OrganicProps]
  
  /* This means you don't have to write `default`, but can instead just say `distTypesGeneralDistComponentsOrganicMod.foo` */
  override def _to: FC[OrganicProps] = default
}
