package typings.wixUiCore

import typings.react.mod.Component
import typings.react.mod.ReactNode
import typings.std.File
import typings.wixUiCore.anon.Disabled
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object componentsFilePickerButtonFilePickerButtonMod {
  
  @JSImport("wix-ui-core/dist/standalone/src/components/file-picker-button/FilePickerButton", "FilePickerButton")
  @js.native
  class FilePickerButton protected ()
    extends Component[FilePickerButtonProps, FilePickerButtonState, js.Any] {
    def this(props: js.Any) = this()
    
    def blur(): Unit = js.native
    
    val chooseFileButtonRef: js.Any = js.native
    
    val fileInputRef: js.Any = js.native
    
    def focus(): Unit = js.native
    
    val handleChooseFileButtonBlur: js.Any = js.native
    
    val handleChooseFileButtonClick: js.Any = js.native
    
    val handleChooseFileButtonFocus: js.Any = js.native
    
    val handleFileInputChange: js.Any = js.native
    
    def reset(): Unit = js.native
  }
  /* static members */
  object FilePickerButton {
    
    @JSImport("wix-ui-core/dist/standalone/src/components/file-picker-button/FilePickerButton", "FilePickerButton")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("wix-ui-core/dist/standalone/src/components/file-picker-button/FilePickerButton", "FilePickerButton.defaultProps")
    @js.native
    def defaultProps: Disabled = js.native
    @scala.inline
    def defaultProps_=(x: Disabled): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("defaultProps")(x.asInstanceOf[js.Any])
    
    @JSImport("wix-ui-core/dist/standalone/src/components/file-picker-button/FilePickerButton", "FilePickerButton.displayName")
    @js.native
    def displayName: String = js.native
    @scala.inline
    def displayName_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("displayName")(x.asInstanceOf[js.Any])
  }
  
  trait FilePickerButtonProps extends StObject {
    
    /** A string that defines the file types the file input should accept. */
    var accept: js.UndefOr[String] = js.undefined
    
    /** Elements to render inside the button. */
    var children: js.UndefOr[ReactNode] = js.undefined
    
    /** Allows overriding the component's styles. */
    var className: js.UndefOr[String] = js.undefined
    
    /** hook for testing purposes */
    var `data-hook`: js.UndefOr[String] = js.undefined
    
    var disabled: js.UndefOr[Boolean] = js.undefined
    
    var id: js.UndefOr[String] = js.undefined
    
    var onBlur: js.UndefOr[js.Function] = js.undefined
    
    /** Triggered when the user finishes selecting files through a native OS file picker dialog. */
    var onChange: js.UndefOr[js.Function1[/* files */ js.Array[File], Unit]] = js.undefined
    
    var onFocus: js.UndefOr[js.Function] = js.undefined
    
    var required: js.UndefOr[Boolean] = js.undefined
  }
  object FilePickerButtonProps {
    
    @scala.inline
    def apply(): FilePickerButtonProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[FilePickerButtonProps]
    }
    
    @scala.inline
    implicit class FilePickerButtonPropsMutableBuilder[Self <: FilePickerButtonProps] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAccept(value: String): Self = StObject.set(x, "accept", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAcceptUndefined: Self = StObject.set(x, "accept", js.undefined)
      
      @scala.inline
      def setChildren(value: ReactNode): Self = StObject.set(x, "children", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setChildrenUndefined: Self = StObject.set(x, "children", js.undefined)
      
      @scala.inline
      def setClassName(value: String): Self = StObject.set(x, "className", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setClassNameUndefined: Self = StObject.set(x, "className", js.undefined)
      
      @scala.inline
      def `setData-hook`(value: String): Self = StObject.set(x, "data-hook", value.asInstanceOf[js.Any])
      
      @scala.inline
      def `setData-hookUndefined`: Self = StObject.set(x, "data-hook", js.undefined)
      
      @scala.inline
      def setDisabled(value: Boolean): Self = StObject.set(x, "disabled", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDisabledUndefined: Self = StObject.set(x, "disabled", js.undefined)
      
      @scala.inline
      def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIdUndefined: Self = StObject.set(x, "id", js.undefined)
      
      @scala.inline
      def setOnBlur(value: js.Function): Self = StObject.set(x, "onBlur", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOnBlurUndefined: Self = StObject.set(x, "onBlur", js.undefined)
      
      @scala.inline
      def setOnChange(value: /* files */ js.Array[File] => Unit): Self = StObject.set(x, "onChange", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnChangeUndefined: Self = StObject.set(x, "onChange", js.undefined)
      
      @scala.inline
      def setOnFocus(value: js.Function): Self = StObject.set(x, "onFocus", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOnFocusUndefined: Self = StObject.set(x, "onFocus", js.undefined)
      
      @scala.inline
      def setRequired(value: Boolean): Self = StObject.set(x, "required", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRequiredUndefined: Self = StObject.set(x, "required", js.undefined)
    }
  }
  
  trait FilePickerButtonState extends StObject {
    
    var selectedFiles: js.Array[File]
  }
  object FilePickerButtonState {
    
    @scala.inline
    def apply(selectedFiles: js.Array[File]): FilePickerButtonState = {
      val __obj = js.Dynamic.literal(selectedFiles = selectedFiles.asInstanceOf[js.Any])
      __obj.asInstanceOf[FilePickerButtonState]
    }
    
    @scala.inline
    implicit class FilePickerButtonStateMutableBuilder[Self <: FilePickerButtonState] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setSelectedFiles(value: js.Array[File]): Self = StObject.set(x, "selectedFiles", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSelectedFilesVarargs(value: File*): Self = StObject.set(x, "selectedFiles", js.Array(value :_*))
    }
  }
}
