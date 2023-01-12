package typings.wixWixUiIconsCommon

import org.scalablytyped.runtime.Shortcut
import typings.react.mod.FC
import typings.react.mod.SVGAttributes
import typings.std.SVGElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distTypesSystemDistComponentsFaceNeutral30Mod extends Shortcut {
  
  @JSImport("@wix/wix-ui-icons-common/dist/types/system/dist/components/FaceNeutral30", JSImport.Default)
  @js.native
  val default: FC[FaceNeutral30Props] = js.native
  
  trait FaceNeutral30Props
    extends StObject
       with SVGAttributes[SVGElement] {
    
    var size: js.UndefOr[String | Double] = js.undefined
  }
  object FaceNeutral30Props {
    
    inline def apply(): FaceNeutral30Props = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[FaceNeutral30Props]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: FaceNeutral30Props] (val x: Self) extends AnyVal {
      
      inline def setSize(value: String | Double): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
      
      inline def setSizeUndefined: Self = StObject.set(x, "size", js.undefined)
    }
  }
  
  type _To = FC[FaceNeutral30Props]
  
  /* This means you don't have to write `default`, but can instead just say `distTypesSystemDistComponentsFaceNeutral30Mod.foo` */
  override def _to: FC[FaceNeutral30Props] = default
}
