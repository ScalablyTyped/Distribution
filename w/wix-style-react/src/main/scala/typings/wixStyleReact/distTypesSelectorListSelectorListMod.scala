package typings.wixStyleReact

import typings.react.mod.PureComponent
import typings.react.mod.global.JSX.Element
import typings.wixStyleReact.anon.DataSource
import typings.wixStyleReact.anon.ImageShape
import typings.wixStyleReact.anon.IsEmpty
import typings.wixStyleReact.anon.SearchValue
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distTypesSelectorListSelectorListMod {
  
  @JSImport("wix-style-react/dist/types/SelectorList/SelectorList", JSImport.Default)
  @js.native
  open class default protected () extends SelectorList {
    def this(props: Any) = this()
    def this(props: Any, context: Any) = this()
  }
  /* static members */
  object default {
    
    @JSImport("wix-style-react/dist/types/SelectorList/SelectorList", JSImport.Default)
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("wix-style-react/dist/types/SelectorList/SelectorList", "default.defaultProps")
    @js.native
    def defaultProps: ImageShape = js.native
    inline def defaultProps_=(x: ImageShape): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("defaultProps")(x.asInstanceOf[js.Any])
    
    @JSImport("wix-style-react/dist/types/SelectorList/SelectorList", "default.displayName")
    @js.native
    def displayName: String = js.native
    inline def displayName_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("displayName")(x.asInstanceOf[js.Any])
    
    @JSImport("wix-style-react/dist/types/SelectorList/SelectorList", "default.propTypes")
    @js.native
    def propTypes: DataSource = js.native
    inline def propTypes_=(x: DataSource): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("propTypes")(x.asInstanceOf[js.Any])
  }
  
  @js.native
  trait SelectorList extends PureComponent[Any, Any, Any] {
    
    def _checkIsSelected(item: Any): Boolean = js.native
    
    def _deselectAll(): Unit = js.native
    
    def _getEnabledItems(items: Any): Any = js.native
    
    def _getInitialData(): Any = js.native
    def _getInitialData(searchValue: String): Any = js.native
    
    def _hasMore(): Boolean = js.native
    
    def _loadInitialItems(): Unit = js.native
    def _loadInitialItems(searchValue: String): Unit = js.native
    
    def _loadMore(): Unit = js.native
    
    def _onClear(): Unit = js.native
    
    def _onSearchChange(event: Any): Unit = js.native
    
    def _onToggle(item: Any): Unit = js.native
    
    def _renderList(): Element = js.native
    
    def _renderSubheader(): Element = js.native
    
    def _renderToggleAllCheckbox(): Element = js.native
    
    def _selectAll(): Unit = js.native
    
    def _toggleItem(item: Any): Unit = js.native
    
    def _updateItems(param0: SearchValue): Unit = js.native
    
    def _updateSearchValue(searchValue: Any): Unit = js.native
    
    @JSName("componentDidMount")
    def componentDidMount_MSelectorList(): Unit = js.native
    
    /** Resets list items and loads first page from dataSource while persisting searchValue */
    def reloadInitialItems(): Unit = js.native
    
    @JSName("state")
    var state_SelectorList: IsEmpty = js.native
  }
}
