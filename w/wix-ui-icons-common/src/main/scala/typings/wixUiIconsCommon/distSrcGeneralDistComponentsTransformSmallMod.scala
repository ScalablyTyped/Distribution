package typings.wixUiIconsCommon

import org.scalablytyped.runtime.Shortcut
import typings.react.mod.FC
import typings.react.mod.SVGAttributes
import typings.std.SVGElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distSrcGeneralDistComponentsTransformSmallMod extends Shortcut {
  
  @JSImport("wix-ui-icons-common/dist/src/general/dist/components/TransformSmall", JSImport.Default)
  @js.native
  val default: FC[TransformSmallProps] = js.native
  
  trait TransformSmallProps
    extends StObject
       with SVGAttributes[SVGElement] {
    
    var size: js.UndefOr[String | Double] = js.undefined
  }
  object TransformSmallProps {
    
    inline def apply(): TransformSmallProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[TransformSmallProps]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: TransformSmallProps] (val x: Self) extends AnyVal {
      
      inline def setSize(value: String | Double): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
      
      inline def setSizeUndefined: Self = StObject.set(x, "size", js.undefined)
    }
  }
  
  type _To = FC[TransformSmallProps]
  
  /* This means you don't have to write `default`, but can instead just say `distSrcGeneralDistComponentsTransformSmallMod.foo` */
  override def _to: FC[TransformSmallProps] = default
}
