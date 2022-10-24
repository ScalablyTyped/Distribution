package typings.wixStyleReact

import typings.propTypes.mod.InferProps
import typings.propTypes.mod.ReactNodeLike
import typings.propTypes.mod.Requireable
import typings.react.mod.PureComponent
import typings.react.mod.global.JSX.Element
import typings.wixStyleReact.anon.AddedToContainerId
import typings.wixStyleReact.anon.Columns
import typings.wixStyleReact.anon.Droppable
import typings.wixStyleReact.anon.IsPlaceholderItem
import typings.wixStyleReact.anon.ItemAny
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distTypesTimeTableTimeTableMod {
  
  @JSImport("wix-style-react/dist/types/TimeTable/TimeTable", JSImport.Default)
  @js.native
  open class default protected () extends TimeTable {
    def this(props: Any) = this()
    def this(props: Any, context: Any) = this()
  }
  object default {
    
    @JSImport("wix-style-react/dist/types/TimeTable/TimeTable", JSImport.Default)
    @js.native
    val ^ : js.Any = js.native
    
    /* static member */
    object defaultProps {
      
      @JSImport("wix-style-react/dist/types/TimeTable/TimeTable", "default.defaultProps")
      @js.native
      val ^ : js.Any = js.native
      
      @JSImport("wix-style-react/dist/types/TimeTable/TimeTable", "default.defaultProps.columns")
      @js.native
      def columns: js.Array[scala.Nothing] = js.native
      inline def columns_=(x: js.Array[scala.Nothing]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("columns")(x.asInstanceOf[js.Any])
      
      @JSImport("wix-style-react/dist/types/TimeTable/TimeTable", "default.defaultProps.height")
      @js.native
      def height: String = js.native
      inline def height_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("height")(x.asInstanceOf[js.Any])
      
      @JSImport("wix-style-react/dist/types/TimeTable/TimeTable", "default.defaultProps.insertPosition")
      @js.native
      def insertPosition: String = js.native
      inline def insertPosition_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("insertPosition")(x.asInstanceOf[js.Any])
    }
    
    /* static member */
    @JSImport("wix-style-react/dist/types/TimeTable/TimeTable", "default.displayName")
    @js.native
    def displayName: String = js.native
    inline def displayName_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("displayName")(x.asInstanceOf[js.Any])
    
    /* static member */
    inline def getDerivedStateFromProps(nextProps: Any, prevState: Any): Any = (^.asInstanceOf[js.Dynamic].applyDynamic("getDerivedStateFromProps")(nextProps.asInstanceOf[js.Any], prevState.asInstanceOf[js.Any])).asInstanceOf[Any]
    
    /* static member */
    object propTypes {
      
      @JSImport("wix-style-react/dist/types/TimeTable/TimeTable", "default.propTypes")
      @js.native
      val ^ : js.Any = js.native
      
      /** Title of add button. */
      @JSImport("wix-style-react/dist/types/TimeTable/TimeTable", "default.propTypes.addItemButtonLabel")
      @js.native
      def addItemButtonLabel: Requireable[ReactNodeLike] = js.native
      inline def addItemButtonLabel_=(x: Requireable[ReactNodeLike]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("addItemButtonLabel")(x.asInstanceOf[js.Any])
      
      /**
        * Column data configuration. Item content is provided as a simple node or a
        * render function with `content` property. When render function is used the
        * signature is:
        * `({ Item, draggable, disabled }) => {}`:
        * - `Item` - component used to provide default item visual representation.
        * You should render `<Item draggable={draggable} disabled={disabled}>...</Item>`
        * - `draggable` - item is draggable.
        * - `disabled` - item is disabled.
        */
      @JSImport("wix-style-react/dist/types/TimeTable/TimeTable", "default.propTypes.columns")
      @js.native
      def columns: Requireable[js.Array[js.UndefOr[InferProps[Droppable] | Null]]] = js.native
      inline def columns_=(x: Requireable[js.Array[js.UndefOr[InferProps[Droppable] | Null]]]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("columns")(x.asInstanceOf[js.Any])
      
      /** Hook for testing purposes. */
      @JSImport("wix-style-react/dist/types/TimeTable/TimeTable", "default.propTypes.dataHook")
      @js.native
      def dataHook: Requireable[String] = js.native
      inline def dataHook_=(x: Requireable[String]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("dataHook")(x.asInstanceOf[js.Any])
      
      /** Custom table height. */
      @JSImport("wix-style-react/dist/types/TimeTable/TimeTable", "default.propTypes.height")
      @js.native
      def height: Requireable[String | Double] = js.native
      inline def height_=(x: Requireable[String | Double]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("height")(x.asInstanceOf[js.Any])
      
      /**
        * Position where dragged items will be inserted. Using `any` value will
        * allow the items to be re-ordered within the same column.
        */
      @JSImport("wix-style-react/dist/types/TimeTable/TimeTable", "default.propTypes.insertPosition")
      @js.native
      def insertPosition: Requireable[String] = js.native
      inline def insertPosition_=(x: Requireable[String]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("insertPosition")(x.asInstanceOf[js.Any])
      
      /**
        * Event triggered on add button click: `onAdd(columnIndex)`.
        * When not provided the button will be hidden.
        */
      @JSImport("wix-style-react/dist/types/TimeTable/TimeTable", "default.propTypes.onAdd")
      @js.native
      def onAdd: Requireable[js.Function1[/* repeated */ Any, Any]] = js.native
      inline def onAdd_=(x: Requireable[js.Function1[/* repeated */ Any, Any]]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("onAdd")(x.asInstanceOf[js.Any])
      
      /**
        * Event triggered on column data change:
        * `onChange(columns, { addedToColumnIndex, removedFromColumnIndex, addedItemIndex, removedItemIndex })`
        */
      @JSImport("wix-style-react/dist/types/TimeTable/TimeTable", "default.propTypes.onChange")
      @js.native
      def onChange: Requireable[js.Function1[/* repeated */ Any, Any]] = js.native
      inline def onChange_=(x: Requireable[js.Function1[/* repeated */ Any, Any]]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("onChange")(x.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait TimeTable extends PureComponent[Any, Any, Any] {
    
    def _handleCanDrag(param0: ItemAny): Boolean = js.native
    
    def _handleDragEnd(): Unit = js.native
    
    def _handleDragStart(): Unit = js.native
    
    def _handleDrop(param0: AddedToContainerId): Unit = js.native
    
    def _handleMouseEnter(columnIndex: Any): Unit = js.native
    
    def _handleMouseLeave(): Unit = js.native
    
    def _renderActions(columnIndex: Any): Element | Null = js.native
    
    def _renderAddItemButton(columnIndex: Any): Element = js.native
    
    def _renderContent(): Element = js.native
    
    def _renderHeader(): Element = js.native
    
    def _renderItem(param0: IsPlaceholderItem): Element = js.native
    
    @JSName("state")
    var state_TimeTable: Columns = js.native
  }
}
