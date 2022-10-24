package typings.wixStyleReact

import typings.propTypes.mod.InferProps
import typings.propTypes.mod.ReactNodeLike
import typings.propTypes.mod.Requireable
import typings.react.mod.PureComponent
import typings.react.mod.RefObject
import typings.wixStyleReact.anon.EditorStateAny
import typings.wixStyleReact.anon.PrefixSuffix
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distTypesVariableInputVariableInputMod {
  
  /** Input with variables as tags */
  @JSImport("wix-style-react/dist/types/VariableInput/VariableInput", JSImport.Default)
  @js.native
  open class default protected () extends VariableInput {
    def this(props: Any) = this()
  }
  object default {
    
    object defaultProps {
      
      @JSImport("wix-style-react/dist/types/VariableInput/VariableInput", "default.defaultProps")
      @js.native
      val ^ : js.Any = js.native
      
      @JSImport("wix-style-react/dist/types/VariableInput/VariableInput", "default.defaultProps.initialValue_1")
      @js.native
      val initialValue1: String = js.native
      
      @JSImport("wix-style-react/dist/types/VariableInput/VariableInput", "default.defaultProps.multiline_1")
      @js.native
      val multiline1: Boolean = js.native
      
      @JSImport("wix-style-react/dist/types/VariableInput/VariableInput", "default.defaultProps.rows_1")
      @js.native
      val rows1: Double = js.native
      
      @JSImport("wix-style-react/dist/types/VariableInput/VariableInput", "default.defaultProps.size_1")
      @js.native
      val size1: String = js.native
      
      inline def variableParser1(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("variableParser_1")().asInstanceOf[Unit]
      
      object variableTemplate1 {
        
        @JSImport("wix-style-react/dist/types/VariableInput/VariableInput", "default.defaultProps.variableTemplate_1.prefix")
        @js.native
        val prefix: String = js.native
        
        @JSImport("wix-style-react/dist/types/VariableInput/VariableInput", "default.defaultProps.variableTemplate_1.suffix")
        @js.native
        val suffix: String = js.native
      }
    }
    
    @JSImport("wix-style-react/dist/types/VariableInput/VariableInput", "default.displayName")
    @js.native
    val displayName: String = js.native
    
    object propTypes {
      
      @JSImport("wix-style-react/dist/types/VariableInput/VariableInput", "default.propTypes.className")
      @js.native
      val className: Requireable[String] = js.native
      
      @JSImport("wix-style-react/dist/types/VariableInput/VariableInput", "default.propTypes.dataHook")
      @js.native
      val dataHook: Requireable[String] = js.native
      
      @JSImport("wix-style-react/dist/types/VariableInput/VariableInput", "default.propTypes.disabled")
      @js.native
      val disabled: Requireable[Boolean] = js.native
      
      @JSImport("wix-style-react/dist/types/VariableInput/VariableInput", "default.propTypes.initialValue")
      @js.native
      val initialValue: Requireable[String] = js.native
      
      @JSImport("wix-style-react/dist/types/VariableInput/VariableInput", "default.propTypes.multiline")
      @js.native
      val multiline: Requireable[Boolean] = js.native
      
      @JSImport("wix-style-react/dist/types/VariableInput/VariableInput", "default.propTypes.onBlur")
      @js.native
      val onBlur: Requireable[js.Function1[/* repeated */ Any, Any]] = js.native
      
      @JSImport("wix-style-react/dist/types/VariableInput/VariableInput", "default.propTypes.onChange")
      @js.native
      val onChange: Requireable[js.Function1[/* repeated */ Any, Any]] = js.native
      
      @JSImport("wix-style-react/dist/types/VariableInput/VariableInput", "default.propTypes.onFocus")
      @js.native
      val onFocus: Requireable[js.Function1[/* repeated */ Any, Any]] = js.native
      
      @JSImport("wix-style-react/dist/types/VariableInput/VariableInput", "default.propTypes.onSubmit")
      @js.native
      val onSubmit: Requireable[js.Function1[/* repeated */ Any, Any]] = js.native
      
      @JSImport("wix-style-react/dist/types/VariableInput/VariableInput", "default.propTypes.placeholder")
      @js.native
      val placeholder: Requireable[String] = js.native
      
      @JSImport("wix-style-react/dist/types/VariableInput/VariableInput", "default.propTypes.readOnly")
      @js.native
      val readOnly: Requireable[Boolean] = js.native
      
      @JSImport("wix-style-react/dist/types/VariableInput/VariableInput", "default.propTypes.rows")
      @js.native
      val rows: Requireable[Double] = js.native
      
      @JSImport("wix-style-react/dist/types/VariableInput/VariableInput", "default.propTypes.size")
      @js.native
      val size: Requireable[String] = js.native
      
      @JSImport("wix-style-react/dist/types/VariableInput/VariableInput", "default.propTypes.status")
      @js.native
      val status: Requireable[String] = js.native
      
      @JSImport("wix-style-react/dist/types/VariableInput/VariableInput", "default.propTypes.statusMessage")
      @js.native
      val statusMessage: Requireable[ReactNodeLike] = js.native
      
      @JSImport("wix-style-react/dist/types/VariableInput/VariableInput", "default.propTypes.variableParser")
      @js.native
      val variableParser: Requireable[js.Function1[/* repeated */ Any, Any]] = js.native
      
      @JSImport("wix-style-react/dist/types/VariableInput/VariableInput", "default.propTypes.variableTemplate")
      @js.native
      val variableTemplate: Requireable[InferProps[PrefixSuffix]] = js.native
    }
  }
  
  /** Input with variables as tags */
  @js.native
  trait VariableInput extends PureComponent[Any, Any, Any] {
    
    def _handlePastedText(text: Any, html: Any, editorState: Any): Boolean = js.native
    
    def _inputToTagSize(inputSize: Any): Any = js.native
    
    def _isEmpty(): Boolean = js.native
    
    def _onBlur(): Unit = js.native
    
    def _onChange(): Unit = js.native
    
    def _onEditorChange(editorState: Any): Unit = js.native
    
    def _onFocus(): Unit = js.native
    
    def _onSubmit(): Unit = js.native
    
    def _setEditorState(editorState: Any): Unit = js.native
    def _setEditorState(editorState: Any, onStateChanged: js.Function0[Unit]): Unit = js.native
    
    def _setStringValue(str: Any): Unit = js.native
    def _setStringValue(str: Any, afterUpdated: js.Function0[Unit]): Unit = js.native
    
    def _stringToContentState(str: Any): Any = js.native
    
    def _toString(): Any = js.native
    
    @JSName("componentDidMount")
    def componentDidMount_MVariableInput(): Unit = js.native
    
    var editorRef: js.UndefOr[RefObject[Any]] = js.native
    
    /** Insert variable at the input cursor position */
    def insertVariable(value: Any): Unit = js.native
    
    /** Set value to display in the input */
    def setValue(value: Any): Unit = js.native
    
    @JSName("state")
    var state_VariableInput: EditorStateAny = js.native
  }
}
