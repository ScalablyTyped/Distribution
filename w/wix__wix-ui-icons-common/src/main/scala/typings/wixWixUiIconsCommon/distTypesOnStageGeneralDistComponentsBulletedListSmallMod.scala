package typings.wixWixUiIconsCommon

import org.scalablytyped.runtime.Shortcut
import typings.react.mod.FC
import typings.react.mod.SVGAttributes
import typings.std.SVGElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distTypesOnStageGeneralDistComponentsBulletedListSmallMod extends Shortcut {
  
  @JSImport("@wix/wix-ui-icons-common/dist/types/on-stage/general/dist/components/BulletedListSmall", JSImport.Default)
  @js.native
  val default: FC[BulletedListSmallProps] = js.native
  
  trait BulletedListSmallProps
    extends StObject
       with SVGAttributes[SVGElement] {
    
    var size: js.UndefOr[String | Double] = js.undefined
  }
  object BulletedListSmallProps {
    
    inline def apply(): BulletedListSmallProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[BulletedListSmallProps]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: BulletedListSmallProps] (val x: Self) extends AnyVal {
      
      inline def setSize(value: String | Double): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
      
      inline def setSizeUndefined: Self = StObject.set(x, "size", js.undefined)
    }
  }
  
  type _To = FC[BulletedListSmallProps]
  
  /* This means you don't have to write `default`, but can instead just say `distTypesOnStageGeneralDistComponentsBulletedListSmallMod.foo` */
  override def _to: FC[BulletedListSmallProps] = default
}
