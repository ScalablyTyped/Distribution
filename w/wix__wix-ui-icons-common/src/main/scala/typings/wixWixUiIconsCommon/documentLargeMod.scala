package typings.wixWixUiIconsCommon

import org.scalablytyped.runtime.Shortcut
import typings.react.mod.FC
import typings.react.mod.SVGAttributes
import typings.std.SVGElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object documentLargeMod extends Shortcut {
  
  @JSImport("@wix/wix-ui-icons-common/dist/types/on-stage/system/dist/components/DocumentLarge", JSImport.Default)
  @js.native
  val default: FC[DocumentLargeProps] = js.native
  
  trait DocumentLargeProps
    extends StObject
       with SVGAttributes[SVGElement] {
    
    var size: js.UndefOr[String | Double] = js.undefined
  }
  object DocumentLargeProps {
    
    inline def apply(): DocumentLargeProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[DocumentLargeProps]
    }
    
    extension [Self <: DocumentLargeProps](x: Self) {
      
      inline def setSize(value: String | Double): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
      
      inline def setSizeUndefined: Self = StObject.set(x, "size", js.undefined)
    }
  }
  
  type _To = FC[DocumentLargeProps]
  
  /* This means you don't have to write `default`, but can instead just say `documentLargeMod.foo` */
  override def _to: FC[DocumentLargeProps] = default
}
