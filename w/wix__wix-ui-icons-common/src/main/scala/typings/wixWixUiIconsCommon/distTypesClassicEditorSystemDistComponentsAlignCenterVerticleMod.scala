package typings.wixWixUiIconsCommon

import org.scalablytyped.runtime.Shortcut
import typings.react.mod.FC
import typings.react.mod.SVGAttributes
import typings.std.SVGElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distTypesClassicEditorSystemDistComponentsAlignCenterVerticleMod extends Shortcut {
  
  @JSImport("@wix/wix-ui-icons-common/dist/types/classic-editor/system/dist/components/AlignCenterVerticle", JSImport.Default)
  @js.native
  val default: FC[AlignCenterVerticleProps] = js.native
  
  trait AlignCenterVerticleProps
    extends StObject
       with SVGAttributes[SVGElement] {
    
    var size: js.UndefOr[String | Double] = js.undefined
  }
  object AlignCenterVerticleProps {
    
    inline def apply(): AlignCenterVerticleProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[AlignCenterVerticleProps]
    }
    
    extension [Self <: AlignCenterVerticleProps](x: Self) {
      
      inline def setSize(value: String | Double): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
      
      inline def setSizeUndefined: Self = StObject.set(x, "size", js.undefined)
    }
  }
  
  type _To = FC[AlignCenterVerticleProps]
  
  /* This means you don't have to write `default`, but can instead just say `distTypesClassicEditorSystemDistComponentsAlignCenterVerticleMod.foo` */
  override def _to: FC[AlignCenterVerticleProps] = default
}
