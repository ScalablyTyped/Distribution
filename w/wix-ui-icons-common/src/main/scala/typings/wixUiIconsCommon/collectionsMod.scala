package typings.wixUiIconsCommon

import org.scalablytyped.runtime.Shortcut
import typings.react.mod.SFC
import typings.react.mod.SVGAttributes
import typings.std.SVGElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object collectionsMod extends Shortcut {
  
  @JSImport("wix-ui-icons-common/dist/src/general/dist/components/Collections", JSImport.Default)
  @js.native
  val default: SFC[CollectionsProps] = js.native
  
  @js.native
  trait CollectionsProps extends SVGAttributes[SVGElement] {
    
    var size: js.UndefOr[String] = js.native
  }
  object CollectionsProps {
    
    @scala.inline
    def apply(): CollectionsProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[CollectionsProps]
    }
    
    @scala.inline
    implicit class CollectionsPropsMutableBuilder[Self <: CollectionsProps] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setSize(value: String): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSizeUndefined: Self = StObject.set(x, "size", js.undefined)
    }
  }
  
  type _To = SFC[CollectionsProps]
  
  /* This means you don't have to write `default`, but can instead just say `collectionsMod.foo` */
  override def _to: SFC[CollectionsProps] = default
}
