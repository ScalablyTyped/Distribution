package typings.wixWixUiIconsCommon

import org.scalablytyped.runtime.Shortcut
import typings.react.mod.FC
import typings.react.mod.SVGAttributes
import typings.std.SVGElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distTypesGeneralDistComponentsDataCollectionSmallMod extends Shortcut {
  
  @JSImport("@wix/wix-ui-icons-common/dist/types/general/dist/components/DataCollectionSmall", JSImport.Default)
  @js.native
  val default: FC[DataCollectionSmallProps] = js.native
  
  trait DataCollectionSmallProps
    extends StObject
       with SVGAttributes[SVGElement] {
    
    var size: js.UndefOr[String | Double] = js.undefined
  }
  object DataCollectionSmallProps {
    
    inline def apply(): DataCollectionSmallProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[DataCollectionSmallProps]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: DataCollectionSmallProps] (val x: Self) extends AnyVal {
      
      inline def setSize(value: String | Double): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
      
      inline def setSizeUndefined: Self = StObject.set(x, "size", js.undefined)
    }
  }
  
  type _To = FC[DataCollectionSmallProps]
  
  /* This means you don't have to write `default`, but can instead just say `distTypesGeneralDistComponentsDataCollectionSmallMod.foo` */
  override def _to: FC[DataCollectionSmallProps] = default
}
