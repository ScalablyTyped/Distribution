package typings.wixUiIconsCommon

import org.scalablytyped.runtime.Shortcut
import typings.react.mod.FC
import typings.react.mod.SVGAttributes
import typings.std.SVGElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distSrcOnStageSystemDistComponentsSettingsLargeMod extends Shortcut {
  
  @JSImport("wix-ui-icons-common/dist/src/on-stage/system/dist/components/SettingsLarge", JSImport.Default)
  @js.native
  val default: FC[SettingsLargeProps] = js.native
  
  trait SettingsLargeProps
    extends StObject
       with SVGAttributes[SVGElement] {
    
    var size: js.UndefOr[String | Double] = js.undefined
  }
  object SettingsLargeProps {
    
    inline def apply(): SettingsLargeProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[SettingsLargeProps]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: SettingsLargeProps] (val x: Self) extends AnyVal {
      
      inline def setSize(value: String | Double): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
      
      inline def setSizeUndefined: Self = StObject.set(x, "size", js.undefined)
    }
  }
  
  type _To = FC[SettingsLargeProps]
  
  /* This means you don't have to write `default`, but can instead just say `distSrcOnStageSystemDistComponentsSettingsLargeMod.foo` */
  override def _to: FC[SettingsLargeProps] = default
}
