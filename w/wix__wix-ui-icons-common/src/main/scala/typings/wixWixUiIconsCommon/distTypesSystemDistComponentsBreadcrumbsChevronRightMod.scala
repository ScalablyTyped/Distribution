package typings.wixWixUiIconsCommon

import org.scalablytyped.runtime.Shortcut
import typings.react.mod.FC
import typings.react.mod.SVGAttributes
import typings.std.SVGElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distTypesSystemDistComponentsBreadcrumbsChevronRightMod extends Shortcut {
  
  @JSImport("@wix/wix-ui-icons-common/dist/types/system/dist/components/BreadcrumbsChevronRight", JSImport.Default)
  @js.native
  val default: FC[BreadcrumbsChevronRightProps] = js.native
  
  trait BreadcrumbsChevronRightProps
    extends StObject
       with SVGAttributes[SVGElement] {
    
    var size: js.UndefOr[String | Double] = js.undefined
  }
  object BreadcrumbsChevronRightProps {
    
    inline def apply(): BreadcrumbsChevronRightProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[BreadcrumbsChevronRightProps]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: BreadcrumbsChevronRightProps] (val x: Self) extends AnyVal {
      
      inline def setSize(value: String | Double): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
      
      inline def setSizeUndefined: Self = StObject.set(x, "size", js.undefined)
    }
  }
  
  type _To = FC[BreadcrumbsChevronRightProps]
  
  /* This means you don't have to write `default`, but can instead just say `distTypesSystemDistComponentsBreadcrumbsChevronRightMod.foo` */
  override def _to: FC[BreadcrumbsChevronRightProps] = default
}
