package typings.wixStyleReact

import typings.propTypes.mod.ReactNodeLike
import typings.propTypes.mod.Requireable
import typings.react.mod.Component
import typings.react.mod.global.JSX.Element
import typings.wixStyleReact.anon.InputHasFocus
import typings.wixStyleReact.anon.IsPlaceholder
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distTypesMultiSelectInputWithTagsMod {
  
  @JSImport("wix-style-react/dist/types/MultiSelect/InputWithTags", JSImport.Default)
  @js.native
  open class default protected () extends InputWithTags {
    def this(props: Any) = this()
  }
  object default {
    
    object defaultProps {
      
      @JSImport("wix-style-react/dist/types/MultiSelect/InputWithTags", "default.defaultProps")
      @js.native
      val ^ : js.Any = js.native
      
      @JSImport("wix-style-react/dist/types/MultiSelect/InputWithTags", "default.defaultProps.delimiters_1")
      @js.native
      val delimiters1: js.Array[scala.Nothing] = js.native
      
      inline def onRemoveTag1(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("onRemoveTag_1")().asInstanceOf[Unit]
      
      @JSImport("wix-style-react/dist/types/MultiSelect/InputWithTags", "default.defaultProps.placeholder_1")
      @js.native
      val placeholder1: String = js.native
      
      @JSImport("wix-style-react/dist/types/MultiSelect/InputWithTags", "default.defaultProps.tags_1")
      @js.native
      val tags1: js.Array[scala.Nothing] = js.native
    }
    
    object propTypes {
      
      @JSImport("wix-style-react/dist/types/MultiSelect/InputWithTags", "default.propTypes.autoFocus")
      @js.native
      val autoFocus: Requireable[Boolean] = js.native
      
      @JSImport("wix-style-react/dist/types/MultiSelect/InputWithTags", "default.propTypes.customSuffix")
      @js.native
      val customSuffix: Requireable[ReactNodeLike] = js.native
      
      @JSImport("wix-style-react/dist/types/MultiSelect/InputWithTags", "default.propTypes.dataHook")
      @js.native
      val dataHook: Requireable[String] = js.native
      
      @JSImport("wix-style-react/dist/types/MultiSelect/InputWithTags", "default.propTypes.delimiters")
      @js.native
      val delimiters: Requireable[js.Array[Any]] = js.native
      
      @JSImport("wix-style-react/dist/types/MultiSelect/InputWithTags", "default.propTypes.disabled")
      @js.native
      val disabled: Requireable[Boolean] = js.native
      
      @JSImport("wix-style-react/dist/types/MultiSelect/InputWithTags", "default.propTypes.hideCustomSuffix")
      @js.native
      val hideCustomSuffix: Requireable[Boolean] = js.native
      
      @JSImport("wix-style-react/dist/types/MultiSelect/InputWithTags", "default.propTypes.maxHeight")
      @js.native
      val maxHeight: Requireable[String] = js.native
      
      @JSImport("wix-style-react/dist/types/MultiSelect/InputWithTags", "default.propTypes.maxNumRows")
      @js.native
      val maxNumRows: Requireable[Double] = js.native
      
      @JSImport("wix-style-react/dist/types/MultiSelect/InputWithTags", "default.propTypes.mode")
      @js.native
      val mode: Requireable[String] = js.native
      
      @JSImport("wix-style-react/dist/types/MultiSelect/InputWithTags", "default.propTypes.onBlur")
      @js.native
      val onBlur: Requireable[js.Function1[/* repeated */ Any, Any]] = js.native
      
      @JSImport("wix-style-react/dist/types/MultiSelect/InputWithTags", "default.propTypes.onFocus")
      @js.native
      val onFocus: Requireable[js.Function1[/* repeated */ Any, Any]] = js.native
      
      @JSImport("wix-style-react/dist/types/MultiSelect/InputWithTags", "default.propTypes.onInputClicked")
      @js.native
      val onInputClicked: Requireable[js.Function1[/* repeated */ Any, Any]] = js.native
      
      @JSImport("wix-style-react/dist/types/MultiSelect/InputWithTags", "default.propTypes.onKeyDown")
      @js.native
      val onKeyDown: Requireable[js.Function1[/* repeated */ Any, Any]] = js.native
      
      @JSImport("wix-style-react/dist/types/MultiSelect/InputWithTags", "default.propTypes.onRemoveTag")
      @js.native
      val onRemoveTag: Requireable[js.Function1[/* repeated */ Any, Any]] = js.native
      
      @JSImport("wix-style-react/dist/types/MultiSelect/InputWithTags", "default.propTypes.onReorder")
      @js.native
      val onReorder: Requireable[js.Function1[/* repeated */ Any, Any]] = js.native
      
      @JSImport("wix-style-react/dist/types/MultiSelect/InputWithTags", "default.propTypes.placeholder")
      @js.native
      val placeholder: Requireable[String] = js.native
      
      @JSImport("wix-style-react/dist/types/MultiSelect/InputWithTags", "default.propTypes.readOnly")
      @js.native
      val readOnly: Requireable[Boolean] = js.native
      
      @JSImport("wix-style-react/dist/types/MultiSelect/InputWithTags", "default.propTypes.status")
      @js.native
      val status: Requireable[String] = js.native
      
      @JSImport("wix-style-react/dist/types/MultiSelect/InputWithTags", "default.propTypes.statusMessage")
      @js.native
      val statusMessage: Requireable[String] = js.native
      
      @JSImport("wix-style-react/dist/types/MultiSelect/InputWithTags", "default.propTypes.tags")
      @js.native
      val tags: Requireable[js.Array[Any]] = js.native
      
      @JSImport("wix-style-react/dist/types/MultiSelect/InputWithTags", "default.propTypes.width")
      @js.native
      val width: Requireable[String] = js.native
    }
  }
  
  @js.native
  trait InputWithTags extends Component[Any, Any, Any] {
    
    def blur(): Unit = js.native
    
    def clear(): Unit = js.native
    
    @JSName("componentDidMount")
    def componentDidMount_MInputWithTags(): Unit = js.native
    
    def focus(): Unit = js.native
    
    def handleClick(e: Any): Unit = js.native
    
    def handleInputBlur(e: Any): Unit = js.native
    
    def handleInputFocus(e: Any): Unit = js.native
    
    var input: js.UndefOr[typings.wixStyleReact.distTypesInputMod.default | Null] = js.native
    
    def renderReorderableTag(param0: IsPlaceholder): Element = js.native
    
    def select(): Unit = js.native
    
    @JSName("state")
    var state_InputWithTags: InputHasFocus = js.native
  }
}
