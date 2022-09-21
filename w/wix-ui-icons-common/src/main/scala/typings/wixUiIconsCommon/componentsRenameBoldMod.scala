package typings.wixUiIconsCommon

import org.scalablytyped.runtime.Shortcut
import typings.react.mod.FC
import typings.react.mod.SVGAttributes
import typings.std.SVGElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object componentsRenameBoldMod extends Shortcut {
  
  @JSImport("wix-ui-icons-common/dist/src/classic-editor/general/dist/components/RenameBold", JSImport.Default)
  @js.native
  val default: FC[RenameBoldProps] = js.native
  
  trait RenameBoldProps
    extends StObject
       with SVGAttributes[SVGElement] {
    
    var size: js.UndefOr[String | Double] = js.undefined
  }
  object RenameBoldProps {
    
    inline def apply(): RenameBoldProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[RenameBoldProps]
    }
    
    extension [Self <: RenameBoldProps](x: Self) {
      
      inline def setSize(value: String | Double): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
      
      inline def setSizeUndefined: Self = StObject.set(x, "size", js.undefined)
    }
  }
  
  type _To = FC[RenameBoldProps]
  
  /* This means you don't have to write `default`, but can instead just say `componentsRenameBoldMod.foo` */
  override def _to: FC[RenameBoldProps] = default
}
