package typings.wixStyleReact

import typings.propTypes.mod.ReactNodeLike
import typings.propTypes.mod.Requireable
import typings.react.mod.Component
import typings.wixStyleReact.anon.BackClicked
import typings.wixStyleReact.anon.CollapsibleOnScreenChildren
import typings.wixStyleReact.anon.DrivenInChildren
import typings.wixStyleReact.anon.DrivenOutChildren
import typings.wixStyleReact.anon.ExpandedInnerMenu
import typings.wixStyleReact.anon.LastSelectedKey
import typings.wixStyleReact.anon.SelectedKey
import typings.wixStyleReact.distTypesSidebarSidebarBackButtonMod.SidebarBackButton
import typings.wixStyleReact.distTypesSidebarSidebarItemMod.SidebarItem
import typings.wixStyleReact.distTypesSidebarSidebarPersistentFooterMod.SidebarPersistentFooter
import typings.wixStyleReact.distTypesSidebarSidebarPersistentHeaderMod.SidebarPersistentHeader
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distTypesSidebarSidebarMod {
  
  /** A sidebar navigation component  */
  @JSImport("wix-style-react/dist/types/Sidebar/Sidebar", JSImport.Default)
  @js.native
  open class default protected () extends Sidebar {
    def this(props: Any) = this()
  }
  object default {
    
    @JSImport("wix-style-react/dist/types/Sidebar/Sidebar", JSImport.Default)
    @js.native
    val ^ : js.Any = js.native
    
    /* was `typeof SidebarBackButton` */
    @JSImport("wix-style-react/dist/types/Sidebar/Sidebar", "default.BackButton")
    @js.native
    open class BackButton protected () extends SidebarBackButton {
      def this(props: Any) = this()
      def this(props: Any, context: Any) = this()
    }
    
    /* was `typeof SidebarItem` */
    @JSImport("wix-style-react/dist/types/Sidebar/Sidebar", "default.Item")
    @js.native
    open class Item protected () extends SidebarItem {
      def this(props: Any) = this()
      def this(props: Any, context: Any) = this()
    }
    
    /* was `typeof SidebarPersistentFooter` */
    @JSImport("wix-style-react/dist/types/Sidebar/Sidebar", "default.PersistentFooter")
    @js.native
    open class PersistentFooter protected () extends SidebarPersistentFooter {
      def this(props: Any) = this()
      def this(props: Any, context: Any) = this()
    }
    
    /* was `typeof SidebarPersistentHeader` */
    @JSImport("wix-style-react/dist/types/Sidebar/Sidebar", "default.PersistentHeader")
    @js.native
    open class PersistentHeader protected () extends SidebarPersistentHeader {
      def this(props: Any) = this()
      def this(props: Any, context: Any) = this()
    }
    
    /* static member */
    object defaultProps {
      
      @JSImport("wix-style-react/dist/types/Sidebar/Sidebar", "default.defaultProps")
      @js.native
      val ^ : js.Any = js.native
      
      @JSImport("wix-style-react/dist/types/Sidebar/Sidebar", "default.defaultProps.isHidden")
      @js.native
      def isHidden: Boolean = js.native
      inline def isHidden_=(x: Boolean): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("isHidden")(x.asInstanceOf[js.Any])
      
      @JSImport("wix-style-react/dist/types/Sidebar/Sidebar", "default.defaultProps.skin")
      @js.native
      def skin: String = js.native
      inline def skin_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("skin")(x.asInstanceOf[js.Any])
    }
    
    /* static member */
    @JSImport("wix-style-react/dist/types/Sidebar/Sidebar", "default.displayName")
    @js.native
    def displayName: String = js.native
    inline def displayName_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("displayName")(x.asInstanceOf[js.Any])
    
    /* static member */
    object propTypes {
      
      @JSImport("wix-style-react/dist/types/Sidebar/Sidebar", "default.propTypes")
      @js.native
      val ^ : js.Any = js.native
      
      /**  Sidebar menu children */
      @JSImport("wix-style-react/dist/types/Sidebar/Sidebar", "default.propTypes.children")
      @js.native
      def children: Requireable[ReactNodeLike] = js.native
      inline def children_=(x: Requireable[ReactNodeLike]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("children")(x.asInstanceOf[js.Any])
      
      /** classNames overrides  */
      @JSImport("wix-style-react/dist/types/Sidebar/Sidebar", "default.propTypes.classNames")
      @js.native
      def classNames: Requireable[String] = js.native
      inline def classNames_=(x: Requireable[String]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("classNames")(x.asInstanceOf[js.Any])
      
      /** The dataHook of the Sidebar */
      @JSImport("wix-style-react/dist/types/Sidebar/Sidebar", "default.propTypes.dataHook")
      @js.native
      def dataHook: Requireable[String] = js.native
      inline def dataHook_=(x: Requireable[String]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("dataHook")(x.asInstanceOf[js.Any])
      
      /**  Sidebar indicator for animating out or in */
      @JSImport("wix-style-react/dist/types/Sidebar/Sidebar", "default.propTypes.isHidden")
      @js.native
      def isHidden: Requireable[Boolean] = js.native
      inline def isHidden_=(x: Requireable[Boolean]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("isHidden")(x.asInstanceOf[js.Any])
      
      /** Sets the skin of the Sidebar */
      @JSImport("wix-style-react/dist/types/Sidebar/Sidebar", "default.propTypes.skin")
      @js.native
      def skin: Requireable[String] = js.native
      inline def skin_=(x: Requireable[String]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("skin")(x.asInstanceOf[js.Any])
    }
  }
  
  /** A sidebar navigation component  */
  @js.native
  trait Sidebar extends Component[Any, Any, Any] {
    
    @JSName("UNSAFE_componentWillMount")
    def UNSAFE_componentWillMount_MSidebar(): Unit = js.native
    
    @JSName("UNSAFE_componentWillReceiveProps")
    def UNSAFE_componentWillReceiveProps_MSidebar(props: Any): Unit = js.native
    
    def _closeInnerMenu(itemKey: Any): Unit = js.native
    
    def _getChildrenWithKeys(child: Any): Any = js.native
    
    def _getInnerChildSelectedState(itemKey: Any): DrivenInChildren | SelectedKey = js.native
    
    def _getInnerMenuCloseState(itemKey: Any, updateCollapsibleOnlyOnChange: Any): LastSelectedKey = js.native
    
    def _getInnerMenuCollapsibleState(options: Any): ExpandedInnerMenu = js.native
    
    def _getInnerMenuOpenState(itemKey: Any): DrivenOutChildren = js.native
    
    def _getItemToCloseKey(itemKey: Any): Any = js.native
    
    def _getItemToOpenKey(parentKey: Any, itemKey: Any): Any = js.native
    
    def _getItemWithKey(item: Any, itemKey: Any): Any = js.native
    
    def _getSidebarContext(): BackClicked = js.native
    
    def _isAlreadyClosed(selected: Any, menuToClose: Any): Boolean = js.native
    
    def _isAlreadyOpen(menuToOpen: Any): Boolean = js.native
    
    def _isChild(itemKey: Any): Any = js.native
    
    def _isParent(itemKey: Any): Any = js.native
    
    def _navigateTo(itemKey: Any): Unit = js.native
    
    def _openInnerMenu(itemKey: Any): Unit = js.native
    
    def _selectItem(itemKey: Any): Unit = js.native
    
    def _setInnerMenus(props: Any): Unit = js.native
    
    def _shouldCollapseInnerMenu(itemKey: Any): Boolean = js.native
    
    def _shouldExpandInnerMenu(parentKey: Any, itemKey: Any): Boolean = js.native
    
    var firstLevelItems: js.Array[Any] = js.native
    
    var sidebarContext: BackClicked = js.native
    
    @JSName("state")
    var state_Sidebar: CollapsibleOnScreenChildren = js.native
  }
  object Sidebar {
    
    /* was `typeof SidebarBackButton` */
    type BackButton = SidebarBackButton
    
    /* was `typeof SidebarItem` */
    type Item = SidebarItem
    
    /* was `typeof SidebarPersistentFooter` */
    type PersistentFooter = SidebarPersistentFooter
    
    /* was `typeof SidebarPersistentHeader` */
    type PersistentHeader = SidebarPersistentHeader
  }
}
