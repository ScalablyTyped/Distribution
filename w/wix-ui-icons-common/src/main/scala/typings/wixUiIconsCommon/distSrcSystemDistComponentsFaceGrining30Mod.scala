package typings.wixUiIconsCommon

import org.scalablytyped.runtime.Shortcut
import typings.react.mod.FC
import typings.react.mod.SVGAttributes
import typings.std.SVGElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distSrcSystemDistComponentsFaceGrining30Mod extends Shortcut {
  
  @JSImport("wix-ui-icons-common/dist/src/system/dist/components/FaceGrining30", JSImport.Default)
  @js.native
  val default: FC[FaceGrining30Props] = js.native
  
  trait FaceGrining30Props
    extends StObject
       with SVGAttributes[SVGElement] {
    
    var size: js.UndefOr[String | Double] = js.undefined
  }
  object FaceGrining30Props {
    
    inline def apply(): FaceGrining30Props = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[FaceGrining30Props]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: FaceGrining30Props] (val x: Self) extends AnyVal {
      
      inline def setSize(value: String | Double): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
      
      inline def setSizeUndefined: Self = StObject.set(x, "size", js.undefined)
    }
  }
  
  type _To = FC[FaceGrining30Props]
  
  /* This means you don't have to write `default`, but can instead just say `distSrcSystemDistComponentsFaceGrining30Mod.foo` */
  override def _to: FC[FaceGrining30Props] = default
}
