package typings.wixStyleReact

import typings.react.mod.PureComponent
import typings.react.mod.ReactNode
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object tabMod {
  
  @JSImport("wix-style-react/dist/es/src/CardFolderTabs/Tab", JSImport.Default)
  @js.native
  class default ()
    extends PureComponent[CardFolderTabProps, js.Object, js.Any]
  
  type CardFolderTab = PureComponent[CardFolderTabProps, js.Object, js.Any]
  
  trait CardFolderTabProps extends StObject {
    
    var children: ReactNode
    
    var disabled: js.UndefOr[Boolean] = js.undefined
    
    var id: String
    
    var name: String
  }
  object CardFolderTabProps {
    
    @scala.inline
    def apply(id: String, name: String): CardFolderTabProps = {
      val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
      __obj.asInstanceOf[CardFolderTabProps]
    }
    
    @scala.inline
    implicit class CardFolderTabPropsMutableBuilder[Self <: CardFolderTabProps] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setChildren(value: ReactNode): Self = StObject.set(x, "children", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setChildrenUndefined: Self = StObject.set(x, "children", js.undefined)
      
      @scala.inline
      def setDisabled(value: Boolean): Self = StObject.set(x, "disabled", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDisabledUndefined: Self = StObject.set(x, "disabled", js.undefined)
      
      @scala.inline
      def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    }
  }
}
