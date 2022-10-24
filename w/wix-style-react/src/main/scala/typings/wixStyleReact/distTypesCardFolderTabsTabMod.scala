package typings.wixStyleReact

import typings.react.mod.PureComponent
import typings.react.mod.ReactNode
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distTypesCardFolderTabsTabMod {
  
  @JSImport("wix-style-react/dist/types/CardFolderTabs/Tab", JSImport.Default)
  @js.native
  open class default ()
    extends PureComponent[CardFolderTabProps, js.Object, Any]
  
  type CardFolderTab = PureComponent[CardFolderTabProps, js.Object, Any]
  
  trait CardFolderTabProps extends StObject {
    
    var children: ReactNode
    
    var disabled: js.UndefOr[Boolean] = js.undefined
    
    var id: String
    
    var name: ReactNode
  }
  object CardFolderTabProps {
    
    inline def apply(id: String): CardFolderTabProps = {
      val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any])
      __obj.asInstanceOf[CardFolderTabProps]
    }
    
    extension [Self <: CardFolderTabProps](x: Self) {
      
      inline def setChildren(value: ReactNode): Self = StObject.set(x, "children", value.asInstanceOf[js.Any])
      
      inline def setChildrenUndefined: Self = StObject.set(x, "children", js.undefined)
      
      inline def setDisabled(value: Boolean): Self = StObject.set(x, "disabled", value.asInstanceOf[js.Any])
      
      inline def setDisabledUndefined: Self = StObject.set(x, "disabled", js.undefined)
      
      inline def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
      
      inline def setName(value: ReactNode): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    }
  }
}
