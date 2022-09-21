package typings.wixUiIconsCommon

import org.scalablytyped.runtime.Shortcut
import typings.react.mod.FC
import typings.react.mod.SVGAttributes
import typings.std.SVGElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object snippetSmallMod extends Shortcut {
  
  @JSImport("wix-ui-icons-common/dist/src/on-stage/general/dist/components/SnippetSmall", JSImport.Default)
  @js.native
  val default: FC[SnippetSmallProps] = js.native
  
  trait SnippetSmallProps
    extends StObject
       with SVGAttributes[SVGElement] {
    
    var size: js.UndefOr[String | Double] = js.undefined
  }
  object SnippetSmallProps {
    
    inline def apply(): SnippetSmallProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[SnippetSmallProps]
    }
    
    extension [Self <: SnippetSmallProps](x: Self) {
      
      inline def setSize(value: String | Double): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
      
      inline def setSizeUndefined: Self = StObject.set(x, "size", js.undefined)
    }
  }
  
  type _To = FC[SnippetSmallProps]
  
  /* This means you don't have to write `default`, but can instead just say `snippetSmallMod.foo` */
  override def _to: FC[SnippetSmallProps] = default
}
