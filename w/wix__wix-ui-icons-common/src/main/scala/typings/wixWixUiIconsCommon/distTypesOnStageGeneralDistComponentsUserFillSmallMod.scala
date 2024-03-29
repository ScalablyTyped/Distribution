package typings.wixWixUiIconsCommon

import org.scalablytyped.runtime.Shortcut
import typings.react.mod.FC
import typings.react.mod.SVGAttributes
import typings.std.SVGElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distTypesOnStageGeneralDistComponentsUserFillSmallMod extends Shortcut {
  
  @JSImport("@wix/wix-ui-icons-common/dist/types/on-stage/general/dist/components/UserFillSmall", JSImport.Default)
  @js.native
  val default: FC[UserFillSmallProps] = js.native
  
  trait UserFillSmallProps
    extends StObject
       with SVGAttributes[SVGElement] {
    
    var size: js.UndefOr[String | Double] = js.undefined
  }
  object UserFillSmallProps {
    
    inline def apply(): UserFillSmallProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[UserFillSmallProps]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: UserFillSmallProps] (val x: Self) extends AnyVal {
      
      inline def setSize(value: String | Double): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
      
      inline def setSizeUndefined: Self = StObject.set(x, "size", js.undefined)
    }
  }
  
  type _To = FC[UserFillSmallProps]
  
  /* This means you don't have to write `default`, but can instead just say `distTypesOnStageGeneralDistComponentsUserFillSmallMod.foo` */
  override def _to: FC[UserFillSmallProps] = default
}
