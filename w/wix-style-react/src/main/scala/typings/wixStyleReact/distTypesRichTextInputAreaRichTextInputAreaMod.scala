package typings.wixStyleReact

import typings.propTypes.mod.InferProps
import typings.propTypes.mod.Requireable
import typings.react.mod.PureComponent
import typings.react.mod.RefObject
import typings.wixStyleReact.anon.EditorState
import typings.wixStyleReact.anon.ToolbarButtons
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distTypesRichTextInputAreaRichTextInputAreaMod {
  
  @JSImport("wix-style-react/dist/types/RichTextInputArea/RichTextInputArea", JSImport.Default)
  @js.native
  open class default protected () extends RichTextInputArea {
    def this(props: Any) = this()
  }
  object default {
    
    object defaultProps {
      
      @JSImport("wix-style-react/dist/types/RichTextInputArea/RichTextInputArea", "default.defaultProps.disabled_1")
      @js.native
      val disabled1: Boolean = js.native
      
      @JSImport("wix-style-react/dist/types/RichTextInputArea/RichTextInputArea", "default.defaultProps.initialValue_1")
      @js.native
      val initialValue1: String = js.native
    }
    
    @JSImport("wix-style-react/dist/types/RichTextInputArea/RichTextInputArea", "default.displayName")
    @js.native
    val displayName: String = js.native
    
    object propTypes {
      
      @JSImport("wix-style-react/dist/types/RichTextInputArea/RichTextInputArea", "default.propTypes.className")
      @js.native
      val className: Requireable[String] = js.native
      
      @JSImport("wix-style-react/dist/types/RichTextInputArea/RichTextInputArea", "default.propTypes.dataHook")
      @js.native
      val dataHook: Requireable[String] = js.native
      
      @JSImport("wix-style-react/dist/types/RichTextInputArea/RichTextInputArea", "default.propTypes.disabled")
      @js.native
      val disabled: Requireable[Boolean] = js.native
      
      @JSImport("wix-style-react/dist/types/RichTextInputArea/RichTextInputArea", "default.propTypes.initialValue")
      @js.native
      val initialValue: Requireable[String] = js.native
      
      @JSImport("wix-style-react/dist/types/RichTextInputArea/RichTextInputArea", "default.propTypes.maxHeight")
      @js.native
      val maxHeight: Requireable[String] = js.native
      
      @JSImport("wix-style-react/dist/types/RichTextInputArea/RichTextInputArea", "default.propTypes.minHeight")
      @js.native
      val minHeight: Requireable[String] = js.native
      
      @JSImport("wix-style-react/dist/types/RichTextInputArea/RichTextInputArea", "default.propTypes.onChange")
      @js.native
      val onChange: Requireable[js.Function1[/* repeated */ Any, Any]] = js.native
      
      @JSImport("wix-style-react/dist/types/RichTextInputArea/RichTextInputArea", "default.propTypes.placeholder")
      @js.native
      val placeholder: Requireable[String] = js.native
      
      @JSImport("wix-style-react/dist/types/RichTextInputArea/RichTextInputArea", "default.propTypes.spellCheck")
      @js.native
      val spellCheck: Requireable[Boolean] = js.native
      
      @JSImport("wix-style-react/dist/types/RichTextInputArea/RichTextInputArea", "default.propTypes.status")
      @js.native
      val status: Requireable[String] = js.native
      
      @JSImport("wix-style-react/dist/types/RichTextInputArea/RichTextInputArea", "default.propTypes.statusMessage")
      @js.native
      val statusMessage: Requireable[String] = js.native
      
      @JSImport("wix-style-react/dist/types/RichTextInputArea/RichTextInputArea", "default.propTypes.texts")
      @js.native
      val texts: Requireable[InferProps[ToolbarButtons]] = js.native
    }
  }
  
  @js.native
  trait RichTextInputArea extends PureComponent[Any, Any, Any] {
    
    def _setEditorState(newEditorState: Any): Unit = js.native
    def _setEditorState(newEditorState: Any, onStateChanged: js.Function0[Unit]): Unit = js.native
    
    def _updateContentByValue(value: Any): Unit = js.native
    
    @JSName("componentDidMount")
    def componentDidMount_MRichTextInputArea(): Unit = js.native
    
    var editorRef: js.UndefOr[RefObject[Any]] = js.native
    
    /** Set value to display in the editor */
    def setValue(value: Any): Unit = js.native
    
    @JSName("state")
    var state_RichTextInputArea: EditorState = js.native
  }
}
