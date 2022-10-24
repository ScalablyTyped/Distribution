package typings.wixStyleReact

import typings.propTypes.mod.InferProps
import typings.propTypes.mod.Requireable
import typings.react.mod.PureComponent
import typings.react.mod.global.JSX.Element
import typings.wixStyleReact.anon.AddItemLabel
import typings.wixStyleReact.anon.Backup
import typings.wixStyleReact.anon.IsLastChild
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distTypesNestableListNestableListMod {
  
  /** A styled list with drag and drop and nesting capabilities. */
  @JSImport("wix-style-react/dist/types/NestableList/NestableList", JSImport.Default)
  @js.native
  open class default protected () extends NestableList {
    def this(props: Any) = this()
    def this(props: Any, context: Any) = this()
  }
  object default {
    
    @JSImport("wix-style-react/dist/types/NestableList/NestableList", JSImport.Default)
    @js.native
    val ^ : js.Any = js.native
    
    object defaultProps {
      
      @JSImport("wix-style-react/dist/types/NestableList/NestableList", "default.defaultProps")
      @js.native
      val ^ : js.Any = js.native
      
      @JSImport("wix-style-react/dist/types/NestableList/NestableList", "default.defaultProps.items_1")
      @js.native
      val items1: js.Array[scala.Nothing] = js.native
      
      @JSImport("wix-style-react/dist/types/NestableList/NestableList", "default.defaultProps.maxDepth_1")
      @js.native
      val maxDepth1: Double = js.native
      
      inline def onAddItem1(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("onAddItem_1")().asInstanceOf[Unit]
      
      @JSImport("wix-style-react/dist/types/NestableList/NestableList", "default.defaultProps.preventChangeDepth_1")
      @js.native
      val preventChangeDepth1: Boolean = js.native
      
      @JSImport("wix-style-react/dist/types/NestableList/NestableList", "default.defaultProps.withBottomBorder_1")
      @js.native
      val withBottomBorder1: Boolean = js.native
    }
    
    @JSImport("wix-style-react/dist/types/NestableList/NestableList", "default.displayName")
    @js.native
    val displayName: String = js.native
    
    /* static member */
    inline def getDerivedStateFromProps(props: Any, state: Any): Any = (^.asInstanceOf[js.Dynamic].applyDynamic("getDerivedStateFromProps")(props.asInstanceOf[js.Any], state.asInstanceOf[js.Any])).asInstanceOf[Any]
    
    object propTypes {
      
      @JSImport("wix-style-react/dist/types/NestableList/NestableList", "default.propTypes.addItemLabel")
      @js.native
      val addItemLabel: Requireable[String] = js.native
      
      @JSImport("wix-style-react/dist/types/NestableList/NestableList", "default.propTypes.className")
      @js.native
      val className: Requireable[String] = js.native
      
      @JSImport("wix-style-react/dist/types/NestableList/NestableList", "default.propTypes.dataHook")
      @js.native
      val dataHook: Requireable[String] = js.native
      
      @JSImport("wix-style-react/dist/types/NestableList/NestableList", "default.propTypes.items")
      @js.native
      val items: Requireable[js.Array[js.UndefOr[InferProps[AddItemLabel] | Null]]] = js.native
      
      @JSImport("wix-style-react/dist/types/NestableList/NestableList", "default.propTypes.maxDepth")
      @js.native
      val maxDepth: Requireable[Double] = js.native
      
      @JSImport("wix-style-react/dist/types/NestableList/NestableList", "default.propTypes.onAddItem")
      @js.native
      val onAddItem: Requireable[js.Function1[/* repeated */ Any, Any]] = js.native
      
      @JSImport("wix-style-react/dist/types/NestableList/NestableList", "default.propTypes.onChange")
      @js.native
      val onChange: Requireable[js.Function1[/* repeated */ Any, Any]] = js.native
      
      @JSImport("wix-style-react/dist/types/NestableList/NestableList", "default.propTypes.preventChangeDepth")
      @js.native
      val preventChangeDepth: Requireable[Boolean] = js.native
      
      @JSImport("wix-style-react/dist/types/NestableList/NestableList", "default.propTypes.readOnly")
      @js.native
      val readOnly: Requireable[Boolean] = js.native
      
      @JSImport("wix-style-react/dist/types/NestableList/NestableList", "default.propTypes.withBottomBorder")
      @js.native
      val withBottomBorder: Requireable[Boolean] = js.native
      
      @JSImport("wix-style-react/dist/types/NestableList/NestableList", "default.propTypes.zIndex")
      @js.native
      val zIndex: Requireable[Double] = js.native
    }
  }
  
  /** A styled list with drag and drop and nesting capabilities. */
  @js.native
  trait NestableList extends PureComponent[Any, Any, Any] {
    
    def _moveItemViaKeyboard(e: Any, itemOptions: Any): Unit = js.native
    
    def _onBlur(): Unit = js.native
    
    def _onDragEnd(): Unit = js.native
    
    def _onDragStart(): Unit = js.native
    
    def _releaseItems(): Unit = js.native
    
    def _renderAction(data: Any): js.UndefOr[Element] = js.native
    
    def _renderActions(data: Any): Element | Null = js.native
    
    def _renderActionsFactory(args: Any*): js.UndefOr[Element | Null] = js.native
    
    def _renderArrow(): Element = js.native
    def _renderArrow(param0: IsLastChild): Element = js.native
    
    def _renderItem(options: Any): Element = js.native
    
    def _renderPrefix(data: Any): Element | Null = js.native
    
    def _setStateDecorator(state: Any): Unit = js.native
    
    @JSName("state")
    var state_NestableList: Backup = js.native
  }
}
