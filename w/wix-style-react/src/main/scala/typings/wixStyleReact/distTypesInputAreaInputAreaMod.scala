package typings.wixStyleReact

import typings.lodash.mod.DebouncedFuncLeading
import typings.propTypes.mod.ReactNodeLike
import typings.propTypes.mod.Requireable
import typings.react.mod.PureComponent
import typings.wixStyleReact.anon.ComputedRows
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distTypesInputAreaInputAreaMod {
  
  /**
    * General inputArea container
    */
  @JSImport("wix-style-react/dist/types/InputArea/InputArea", JSImport.Default)
  @js.native
  open class default protected () extends InputArea {
    def this(props: Any) = this()
    def this(props: Any, context: Any) = this()
  }
  object default {
    
    @JSImport("wix-style-react/dist/types/InputArea/InputArea", JSImport.Default)
    @js.native
    val ^ : js.Any = js.native
    
    /* static member */
    @JSImport("wix-style-react/dist/types/InputArea/InputArea", "default.MIN_ROWS")
    @js.native
    def MIN_ROWS: Double = js.native
    inline def MIN_ROWS_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("MIN_ROWS")(x.asInstanceOf[js.Any])
    
    object defaultProps {
      
      @JSImport("wix-style-react/dist/types/InputArea/InputArea", "default.defaultProps.size")
      @js.native
      val size: String = js.native
    }
    
    @JSImport("wix-style-react/dist/types/InputArea/InputArea", "default.displayName")
    @js.native
    val displayName: String = js.native
    
    object propTypes {
      
      @JSImport("wix-style-react/dist/types/InputArea/InputArea", "default.propTypes.ariaControls")
      @js.native
      val ariaControls: Requireable[String] = js.native
      
      @JSImport("wix-style-react/dist/types/InputArea/InputArea", "default.propTypes.ariaDescribedby")
      @js.native
      val ariaDescribedby: Requireable[String] = js.native
      
      @JSImport("wix-style-react/dist/types/InputArea/InputArea", "default.propTypes.ariaLabel")
      @js.native
      val ariaLabel: Requireable[String] = js.native
      
      @JSImport("wix-style-react/dist/types/InputArea/InputArea", "default.propTypes.autoFocus")
      @js.native
      val autoFocus: Requireable[Boolean] = js.native
      
      @JSImport("wix-style-react/dist/types/InputArea/InputArea", "default.propTypes.autoGrow")
      @js.native
      val autoGrow: Requireable[Boolean] = js.native
      
      @JSImport("wix-style-react/dist/types/InputArea/InputArea", "default.propTypes.autoSelect")
      @js.native
      val autoSelect: Requireable[Boolean] = js.native
      
      @JSImport("wix-style-react/dist/types/InputArea/InputArea", "default.propTypes.children")
      @js.native
      val children: Requireable[js.Function1[/* repeated */ Any, Any]] = js.native
      
      @JSImport("wix-style-react/dist/types/InputArea/InputArea", "default.propTypes.className")
      @js.native
      val className: Requireable[String] = js.native
      
      @JSImport("wix-style-react/dist/types/InputArea/InputArea", "default.propTypes.dataHook")
      @js.native
      val dataHook: Requireable[String] = js.native
      
      @JSImport("wix-style-react/dist/types/InputArea/InputArea", "default.propTypes.defaultValue")
      @js.native
      val defaultValue: Requireable[String] = js.native
      
      @JSImport("wix-style-react/dist/types/InputArea/InputArea", "default.propTypes.disabled")
      @js.native
      val disabled: Requireable[Boolean] = js.native
      
      @JSImport("wix-style-react/dist/types/InputArea/InputArea", "default.propTypes.forceFocus")
      @js.native
      val forceFocus: Requireable[Boolean] = js.native
      
      @JSImport("wix-style-react/dist/types/InputArea/InputArea", "default.propTypes.forceHover")
      @js.native
      val forceHover: Requireable[Boolean] = js.native
      
      @JSImport("wix-style-react/dist/types/InputArea/InputArea", "default.propTypes.hasCounter")
      @js.native
      val hasCounter: Requireable[Boolean] = js.native
      
      @JSImport("wix-style-react/dist/types/InputArea/InputArea", "default.propTypes.id")
      @js.native
      val id: Requireable[String] = js.native
      
      @JSImport("wix-style-react/dist/types/InputArea/InputArea", "default.propTypes.maxHeight")
      @js.native
      val maxHeight: Requireable[String] = js.native
      
      @JSImport("wix-style-react/dist/types/InputArea/InputArea", "default.propTypes.maxLength")
      @js.native
      val maxLength: Requireable[Double] = js.native
      
      @JSImport("wix-style-react/dist/types/InputArea/InputArea", "default.propTypes.minHeight")
      @js.native
      val minHeight: Requireable[String] = js.native
      
      @JSImport("wix-style-react/dist/types/InputArea/InputArea", "default.propTypes.minRowsAutoGrow_1")
      @js.native
      val minRowsAutoGrow1: Requireable[Double] = js.native
      
      @JSImport("wix-style-react/dist/types/InputArea/InputArea", "default.propTypes.name")
      @js.native
      val name: Requireable[String] = js.native
      
      @JSImport("wix-style-react/dist/types/InputArea/InputArea", "default.propTypes.onBlur")
      @js.native
      val onBlur: Requireable[js.Function1[/* repeated */ Any, Any]] = js.native
      
      @JSImport("wix-style-react/dist/types/InputArea/InputArea", "default.propTypes.onChange")
      @js.native
      val onChange: Requireable[js.Function1[/* repeated */ Any, Any]] = js.native
      
      @JSImport("wix-style-react/dist/types/InputArea/InputArea", "default.propTypes.onEnterPressed")
      @js.native
      val onEnterPressed: Requireable[js.Function1[/* repeated */ Any, Any]] = js.native
      
      @JSImport("wix-style-react/dist/types/InputArea/InputArea", "default.propTypes.onEscapePressed")
      @js.native
      val onEscapePressed: Requireable[js.Function1[/* repeated */ Any, Any]] = js.native
      
      @JSImport("wix-style-react/dist/types/InputArea/InputArea", "default.propTypes.onFocus")
      @js.native
      val onFocus: Requireable[js.Function1[/* repeated */ Any, Any]] = js.native
      
      @JSImport("wix-style-react/dist/types/InputArea/InputArea", "default.propTypes.onKeyDown")
      @js.native
      val onKeyDown: Requireable[js.Function1[/* repeated */ Any, Any]] = js.native
      
      @JSImport("wix-style-react/dist/types/InputArea/InputArea", "default.propTypes.onKeyUp")
      @js.native
      val onKeyUp: Requireable[js.Function1[/* repeated */ Any, Any]] = js.native
      
      @JSImport("wix-style-react/dist/types/InputArea/InputArea", "default.propTypes.placeholder")
      @js.native
      val placeholder: Requireable[String] = js.native
      
      @JSImport("wix-style-react/dist/types/InputArea/InputArea", "default.propTypes.readOnly")
      @js.native
      val readOnly: Requireable[Boolean] = js.native
      
      @JSImport("wix-style-react/dist/types/InputArea/InputArea", "default.propTypes.required")
      @js.native
      val required: Requireable[Boolean] = js.native
      
      @JSImport("wix-style-react/dist/types/InputArea/InputArea", "default.propTypes.resizable")
      @js.native
      val resizable: Requireable[Boolean] = js.native
      
      @JSImport("wix-style-react/dist/types/InputArea/InputArea", "default.propTypes.rows")
      @js.native
      val rows: Requireable[Double] = js.native
      
      @JSImport("wix-style-react/dist/types/InputArea/InputArea", "default.propTypes.size_1")
      @js.native
      val size1: Requireable[String] = js.native
      
      @JSImport("wix-style-react/dist/types/InputArea/InputArea", "default.propTypes.status")
      @js.native
      val status: Requireable[String] = js.native
      
      @JSImport("wix-style-react/dist/types/InputArea/InputArea", "default.propTypes.statusMessage")
      @js.native
      val statusMessage: Requireable[ReactNodeLike] = js.native
      
      @JSImport("wix-style-react/dist/types/InputArea/InputArea", "default.propTypes.tabIndex")
      @js.native
      val tabIndex: Requireable[Double] = js.native
      
      @JSImport("wix-style-react/dist/types/InputArea/InputArea", "default.propTypes.tooltipPlacement")
      @js.native
      val tooltipPlacement: Requireable[String] = js.native
      
      @JSImport("wix-style-react/dist/types/InputArea/InputArea", "default.propTypes.value")
      @js.native
      val value: Requireable[String] = js.native
    }
  }
  
  /**
    * General inputArea container
    */
  @js.native
  trait InputArea extends PureComponent[Any, Any, Any] {
    
    def _calculateComputedRows(): Unit = js.native
    
    var _computedStyle: Null = js.native
    
    var _defaultLineHeight: js.UndefOr[Double] = js.native
    
    def _getComputedStyle(): Null = js.native
    
    def _getDataAttr(): js.Object = js.native
    
    def _getDefaultLineHeight(): Double = js.native
    
    def _getRowsCount(): Double = js.native
    
    def _onBlur(e: Any): Unit = js.native
    
    def _onChange(e: Any): Unit = js.native
    
    def _onFocus(e: Any): Unit = js.native
    
    def _onInput(): Unit = js.native
    
    def _onKeyDown(e: Any): Unit = js.native
    
    var _updateComputedStyle: DebouncedFuncLeading[js.Function0[Unit]] = js.native
    
    def blur(): Unit = js.native
    
    @JSName("componentDidMount")
    def componentDidMount_MInputArea(): Unit = js.native
    
    @JSName("componentDidUpdate")
    def componentDidUpdate_MInputArea(prevProps: Any): Unit = js.native
    
    @JSName("componentWillUnmount")
    def componentWillUnmount_MInputArea(): Unit = js.native
    
    def focus(): Unit = js.native
    
    def select(): Unit = js.native
    
    @JSName("state")
    var state_InputArea: ComputedRows = js.native
    
    var textArea: Any = js.native
  }
}
