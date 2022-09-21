package typings.wixUiIconsCommon

import org.scalablytyped.runtime.Shortcut
import typings.react.mod.FC
import typings.react.mod.SVGAttributes
import typings.std.SVGElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object componentsSearchBoldMod extends Shortcut {
  
  @JSImport("wix-ui-icons-common/dist/src/classic-editor/general/dist/components/SearchBold", JSImport.Default)
  @js.native
  val default: FC[SearchBoldProps] = js.native
  
  trait SearchBoldProps
    extends StObject
       with SVGAttributes[SVGElement] {
    
    var size: js.UndefOr[String | Double] = js.undefined
  }
  object SearchBoldProps {
    
    inline def apply(): SearchBoldProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[SearchBoldProps]
    }
    
    extension [Self <: SearchBoldProps](x: Self) {
      
      inline def setSize(value: String | Double): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
      
      inline def setSizeUndefined: Self = StObject.set(x, "size", js.undefined)
    }
  }
  
  type _To = FC[SearchBoldProps]
  
  /* This means you don't have to write `default`, but can instead just say `componentsSearchBoldMod.foo` */
  override def _to: FC[SearchBoldProps] = default
}
