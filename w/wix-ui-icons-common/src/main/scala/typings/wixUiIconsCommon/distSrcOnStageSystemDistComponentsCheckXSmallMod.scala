package typings.wixUiIconsCommon

import org.scalablytyped.runtime.Shortcut
import typings.react.mod.FC
import typings.react.mod.SVGAttributes
import typings.std.SVGElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distSrcOnStageSystemDistComponentsCheckXSmallMod extends Shortcut {
  
  @JSImport("wix-ui-icons-common/dist/src/on-stage/system/dist/components/CheckXSmall", JSImport.Default)
  @js.native
  val default: FC[CheckXSmallProps] = js.native
  
  trait CheckXSmallProps
    extends StObject
       with SVGAttributes[SVGElement] {
    
    var size: js.UndefOr[String | Double] = js.undefined
  }
  object CheckXSmallProps {
    
    inline def apply(): CheckXSmallProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[CheckXSmallProps]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: CheckXSmallProps] (val x: Self) extends AnyVal {
      
      inline def setSize(value: String | Double): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
      
      inline def setSizeUndefined: Self = StObject.set(x, "size", js.undefined)
    }
  }
  
  type _To = FC[CheckXSmallProps]
  
  /* This means you don't have to write `default`, but can instead just say `distSrcOnStageSystemDistComponentsCheckXSmallMod.foo` */
  override def _to: FC[CheckXSmallProps] = default
}
