package typings.wixUiIconsCommon

import org.scalablytyped.runtime.Shortcut
import typings.react.mod.FC
import typings.react.mod.SVGAttributes
import typings.std.SVGElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distSrcGeneralDistComponentsFaceNeutralMod extends Shortcut {
  
  @JSImport("wix-ui-icons-common/dist/src/general/dist/components/FaceNeutral", JSImport.Default)
  @js.native
  val default: FC[FaceNeutralProps] = js.native
  
  trait FaceNeutralProps
    extends StObject
       with SVGAttributes[SVGElement] {
    
    var size: js.UndefOr[String | Double] = js.undefined
  }
  object FaceNeutralProps {
    
    inline def apply(): FaceNeutralProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[FaceNeutralProps]
    }
    
    extension [Self <: FaceNeutralProps](x: Self) {
      
      inline def setSize(value: String | Double): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
      
      inline def setSizeUndefined: Self = StObject.set(x, "size", js.undefined)
    }
  }
  
  type _To = FC[FaceNeutralProps]
  
  /* This means you don't have to write `default`, but can instead just say `distSrcGeneralDistComponentsFaceNeutralMod.foo` */
  override def _to: FC[FaceNeutralProps] = default
}
