package typings.wixUiIconsCommon

import org.scalablytyped.runtime.Shortcut
import typings.react.mod.FC
import typings.react.mod.SVGAttributes
import typings.std.SVGElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distSrcGeneralDistComponentsVolumeMod extends Shortcut {
  
  @JSImport("wix-ui-icons-common/dist/src/general/dist/components/Volume", JSImport.Default)
  @js.native
  val default: FC[VolumeProps] = js.native
  
  trait VolumeProps
    extends StObject
       with SVGAttributes[SVGElement] {
    
    var size: js.UndefOr[String | Double] = js.undefined
  }
  object VolumeProps {
    
    inline def apply(): VolumeProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[VolumeProps]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: VolumeProps] (val x: Self) extends AnyVal {
      
      inline def setSize(value: String | Double): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
      
      inline def setSizeUndefined: Self = StObject.set(x, "size", js.undefined)
    }
  }
  
  type _To = FC[VolumeProps]
  
  /* This means you don't have to write `default`, but can instead just say `distSrcGeneralDistComponentsVolumeMod.foo` */
  override def _to: FC[VolumeProps] = default
}
