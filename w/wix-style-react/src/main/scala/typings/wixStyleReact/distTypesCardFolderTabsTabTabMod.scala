package typings.wixStyleReact

import typings.propTypes.mod.ReactElementLike
import typings.propTypes.mod.ReactNodeArray
import typings.propTypes.mod.Requireable
import typings.propTypes.mod.Validator
import typings.react.mod.PureComponent
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distTypesCardFolderTabsTabTabMod {
  
  @JSImport("wix-style-react/dist/types/CardFolderTabs/Tab/Tab", JSImport.Default)
  @js.native
  open class default protected () extends Tab {
    def this(props: Any) = this()
    def this(props: Any, context: Any) = this()
  }
  object default {
    
    /* static member */
    object propTypes {
      
      @JSImport("wix-style-react/dist/types/CardFolderTabs/Tab/Tab", "default.propTypes")
      @js.native
      val ^ : js.Any = js.native
      
      /** Renders any content inside of a tab. */
      @JSImport("wix-style-react/dist/types/CardFolderTabs/Tab/Tab", "default.propTypes.children")
      @js.native
      def children: Validator[String | Double | Boolean | ReactElementLike | ReactNodeArray] = js.native
      inline def children_=(x: Validator[String | Double | Boolean | ReactElementLike | ReactNodeArray]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("children")(x.asInstanceOf[js.Any])
      
      /** Specifies whether the tab button is disabled. */
      @JSImport("wix-style-react/dist/types/CardFolderTabs/Tab/Tab", "default.propTypes.disabled")
      @js.native
      def disabled: Requireable[Boolean] = js.native
      inline def disabled_=(x: Requireable[Boolean]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("disabled")(x.asInstanceOf[js.Any])
      
      /** Specifies an unique id for a tab button. Use it to differentiate between tabs */
      @JSImport("wix-style-react/dist/types/CardFolderTabs/Tab/Tab", "default.propTypes.id")
      @js.native
      def id: Validator[String] = js.native
      inline def id_=(x: Validator[String]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("id")(x.asInstanceOf[js.Any])
      
      /** Defines the title of the tab. */
      @JSImport("wix-style-react/dist/types/CardFolderTabs/Tab/Tab", "default.propTypes.name")
      @js.native
      def name: Validator[String | Double | Boolean | ReactElementLike | ReactNodeArray] = js.native
      inline def name_=(x: Validator[String | Double | Boolean | ReactElementLike | ReactNodeArray]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("name")(x.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait Tab extends PureComponent[Any, Any, Any]
}
