package typings.wixUiIconsCommon

import org.scalablytyped.runtime.Shortcut
import typings.react.mod.FC
import typings.react.mod.SVGAttributes
import typings.std.SVGElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distSrcOnStageSystemDistComponentsSpoilerAlertLargeMod extends Shortcut {
  
  @JSImport("wix-ui-icons-common/dist/src/on-stage/system/dist/components/SpoilerAlertLarge", JSImport.Default)
  @js.native
  val default: FC[SpoilerAlertLargeProps] = js.native
  
  trait SpoilerAlertLargeProps
    extends StObject
       with SVGAttributes[SVGElement] {
    
    var size: js.UndefOr[String | Double] = js.undefined
  }
  object SpoilerAlertLargeProps {
    
    inline def apply(): SpoilerAlertLargeProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[SpoilerAlertLargeProps]
    }
    
    extension [Self <: SpoilerAlertLargeProps](x: Self) {
      
      inline def setSize(value: String | Double): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
      
      inline def setSizeUndefined: Self = StObject.set(x, "size", js.undefined)
    }
  }
  
  type _To = FC[SpoilerAlertLargeProps]
  
  /* This means you don't have to write `default`, but can instead just say `distSrcOnStageSystemDistComponentsSpoilerAlertLargeMod.foo` */
  override def _to: FC[SpoilerAlertLargeProps] = default
}
