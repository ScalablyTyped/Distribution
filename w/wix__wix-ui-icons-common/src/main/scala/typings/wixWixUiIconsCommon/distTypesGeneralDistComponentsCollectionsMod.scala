package typings.wixWixUiIconsCommon

import org.scalablytyped.runtime.Shortcut
import typings.react.mod.FC
import typings.react.mod.SVGAttributes
import typings.std.SVGElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distTypesGeneralDistComponentsCollectionsMod extends Shortcut {
  
  @JSImport("@wix/wix-ui-icons-common/dist/types/general/dist/components/Collections", JSImport.Default)
  @js.native
  val default: FC[CollectionsProps] = js.native
  
  trait CollectionsProps
    extends StObject
       with SVGAttributes[SVGElement] {
    
    var size: js.UndefOr[String | Double] = js.undefined
  }
  object CollectionsProps {
    
    inline def apply(): CollectionsProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[CollectionsProps]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: CollectionsProps] (val x: Self) extends AnyVal {
      
      inline def setSize(value: String | Double): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
      
      inline def setSizeUndefined: Self = StObject.set(x, "size", js.undefined)
    }
  }
  
  type _To = FC[CollectionsProps]
  
  /* This means you don't have to write `default`, but can instead just say `distTypesGeneralDistComponentsCollectionsMod.foo` */
  override def _to: FC[CollectionsProps] = default
}
