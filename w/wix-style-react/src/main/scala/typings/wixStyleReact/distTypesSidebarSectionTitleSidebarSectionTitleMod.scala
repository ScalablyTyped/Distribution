package typings.wixStyleReact

import typings.propTypes.mod.ReactElementLike
import typings.propTypes.mod.ReactNodeArray
import typings.propTypes.mod.Requireable
import typings.propTypes.mod.Validator
import typings.react.mod.PureComponent
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distTypesSidebarSectionTitleSidebarSectionTitleMod {
  
  /** A title for the section within the sidebar */
  @JSImport("wix-style-react/dist/types/SidebarSectionTitle/SidebarSectionTitle", JSImport.Default)
  @js.native
  open class default protected () extends SidebarSectionTitle {
    def this(props: Any) = this()
    def this(props: Any, context: Any) = this()
  }
  object default {
    
    @JSImport("wix-style-react/dist/types/SidebarSectionTitle/SidebarSectionTitle", JSImport.Default)
    @js.native
    val ^ : js.Any = js.native
    
    /* static member */
    @JSImport("wix-style-react/dist/types/SidebarSectionTitle/SidebarSectionTitle", "default.displayName")
    @js.native
    def displayName: String = js.native
    inline def displayName_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("displayName")(x.asInstanceOf[js.Any])
    
    /* static member */
    object propTypes {
      
      @JSImport("wix-style-react/dist/types/SidebarSectionTitle/SidebarSectionTitle", "default.propTypes")
      @js.native
      val ^ : js.Any = js.native
      
      /** Usually plain text, but could be any renderable node */
      @JSImport("wix-style-react/dist/types/SidebarSectionTitle/SidebarSectionTitle", "default.propTypes.children")
      @js.native
      def children: Validator[String | Double | Boolean | ReactElementLike | ReactNodeArray] = js.native
      inline def children_=(x: Validator[String | Double | Boolean | ReactElementLike | ReactNodeArray]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("children")(x.asInstanceOf[js.Any])
      
      /** Applied as data-hook HTML attribute that can be used in the tests */
      @JSImport("wix-style-react/dist/types/SidebarSectionTitle/SidebarSectionTitle", "default.propTypes.dataHook")
      @js.native
      def dataHook: Requireable[String] = js.native
      inline def dataHook_=(x: Requireable[String]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("dataHook")(x.asInstanceOf[js.Any])
    }
  }
  
  /** A title for the section within the sidebar */
  @js.native
  trait SidebarSectionTitle extends PureComponent[Any, Any, Any]
}
