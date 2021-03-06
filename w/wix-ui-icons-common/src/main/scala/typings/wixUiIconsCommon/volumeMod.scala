package typings.wixUiIconsCommon

import org.scalablytyped.runtime.Shortcut
import typings.react.mod.SFC
import typings.react.mod.SVGAttributes
import typings.std.SVGElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object volumeMod extends Shortcut {
  
  @JSImport("wix-ui-icons-common/dist/src/general/dist/components/Volume", JSImport.Default)
  @js.native
  val default: SFC[VolumeProps] = js.native
  
  @js.native
  trait VolumeProps extends SVGAttributes[SVGElement] {
    
    var size: js.UndefOr[String] = js.native
  }
  object VolumeProps {
    
    @scala.inline
    def apply(): VolumeProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[VolumeProps]
    }
    
    @scala.inline
    implicit class VolumePropsMutableBuilder[Self <: VolumeProps] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setSize(value: String): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSizeUndefined: Self = StObject.set(x, "size", js.undefined)
    }
  }
  
  type _To = SFC[VolumeProps]
  
  /* This means you don't have to write `default`, but can instead just say `volumeMod.foo` */
  override def _to: SFC[VolumeProps] = default
}
