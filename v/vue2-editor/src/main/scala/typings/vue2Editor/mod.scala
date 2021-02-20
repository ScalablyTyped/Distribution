package typings.vue2Editor

import org.scalablytyped.runtime.Shortcut
import typings.std.Event
import typings.vue.vueMod.Vue
import typings.vue.vueMod.VueConstructor
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod extends Shortcut {
  
  @JSImport("vue2-editor", JSImport.Default)
  @js.native
  val default: VueEditorConstructor = js.native
  
  @JSImport("vue2-editor", "VueEditor")
  @js.native
  val VueEditor: VueEditorConstructor = js.native
  
  @js.native
  trait VueEditorConstructor extends VueConstructor[Vue] {
    
    def data(): VueEditorData = js.native
    
    var methods: VueEditorMethods = js.native
    
    var props: VueEditorProps = js.native
    
    var watch: VueEditorWatch = js.native
  }
  
  @js.native
  trait VueEditorData extends StObject {
    
    var quill: js.Any = js.native
  }
  object VueEditorData {
    
    @scala.inline
    def apply(quill: js.Any): VueEditorData = {
      val __obj = js.Dynamic.literal(quill = quill.asInstanceOf[js.Any])
      __obj.asInstanceOf[VueEditorData]
    }
    
    @scala.inline
    implicit class VueEditorDataMutableBuilder[Self <: VueEditorData] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setQuill(value: js.Any): Self = StObject.set(x, "quill", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait VueEditorMethods extends StObject {
    
    def checkForCustomImageHandler(): Unit = js.native
    
    def customImageHandler(image: js.Any, callback: js.Any): Unit = js.native
    
    def emitImageInfo($event: Event): Unit = js.native
    
    def handleInitialContent(): Unit = js.native
    
    def handleSelectionChange(range: js.Any, oldRange: js.Any): Unit = js.native
    
    def handleTextChange(): Unit = js.native
    
    def initializeEditor(): Unit = js.native
    
    def listenForEditorEvent(`type`: js.Any): Unit = js.native
    
    def prepareEditorConfig(editorConfig: js.Any): Unit = js.native
    
    def registerEditorEventListeners(): Unit = js.native
    
    def registerPrototypes(): Unit = js.native
    
    def setModules(): Unit = js.native
    
    def setupCustomImageHandler(): Unit = js.native
    
    def setupQuillEditor(): Unit = js.native
  }
  object VueEditorMethods {
    
    @scala.inline
    def apply(
      checkForCustomImageHandler: () => Unit,
      customImageHandler: (js.Any, js.Any) => Unit,
      emitImageInfo: Event => Unit,
      handleInitialContent: () => Unit,
      handleSelectionChange: (js.Any, js.Any) => Unit,
      handleTextChange: () => Unit,
      initializeEditor: () => Unit,
      listenForEditorEvent: js.Any => Unit,
      prepareEditorConfig: js.Any => Unit,
      registerEditorEventListeners: () => Unit,
      registerPrototypes: () => Unit,
      setModules: () => Unit,
      setupCustomImageHandler: () => Unit,
      setupQuillEditor: () => Unit
    ): VueEditorMethods = {
      val __obj = js.Dynamic.literal(checkForCustomImageHandler = js.Any.fromFunction0(checkForCustomImageHandler), customImageHandler = js.Any.fromFunction2(customImageHandler), emitImageInfo = js.Any.fromFunction1(emitImageInfo), handleInitialContent = js.Any.fromFunction0(handleInitialContent), handleSelectionChange = js.Any.fromFunction2(handleSelectionChange), handleTextChange = js.Any.fromFunction0(handleTextChange), initializeEditor = js.Any.fromFunction0(initializeEditor), listenForEditorEvent = js.Any.fromFunction1(listenForEditorEvent), prepareEditorConfig = js.Any.fromFunction1(prepareEditorConfig), registerEditorEventListeners = js.Any.fromFunction0(registerEditorEventListeners), registerPrototypes = js.Any.fromFunction0(registerPrototypes), setModules = js.Any.fromFunction0(setModules), setupCustomImageHandler = js.Any.fromFunction0(setupCustomImageHandler), setupQuillEditor = js.Any.fromFunction0(setupQuillEditor))
      __obj.asInstanceOf[VueEditorMethods]
    }
    
    @scala.inline
    implicit class VueEditorMethodsMutableBuilder[Self <: VueEditorMethods] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setCheckForCustomImageHandler(value: () => Unit): Self = StObject.set(x, "checkForCustomImageHandler", js.Any.fromFunction0(value))
      
      @scala.inline
      def setCustomImageHandler(value: (js.Any, js.Any) => Unit): Self = StObject.set(x, "customImageHandler", js.Any.fromFunction2(value))
      
      @scala.inline
      def setEmitImageInfo(value: Event => Unit): Self = StObject.set(x, "emitImageInfo", js.Any.fromFunction1(value))
      
      @scala.inline
      def setHandleInitialContent(value: () => Unit): Self = StObject.set(x, "handleInitialContent", js.Any.fromFunction0(value))
      
      @scala.inline
      def setHandleSelectionChange(value: (js.Any, js.Any) => Unit): Self = StObject.set(x, "handleSelectionChange", js.Any.fromFunction2(value))
      
      @scala.inline
      def setHandleTextChange(value: () => Unit): Self = StObject.set(x, "handleTextChange", js.Any.fromFunction0(value))
      
      @scala.inline
      def setInitializeEditor(value: () => Unit): Self = StObject.set(x, "initializeEditor", js.Any.fromFunction0(value))
      
      @scala.inline
      def setListenForEditorEvent(value: js.Any => Unit): Self = StObject.set(x, "listenForEditorEvent", js.Any.fromFunction1(value))
      
      @scala.inline
      def setPrepareEditorConfig(value: js.Any => Unit): Self = StObject.set(x, "prepareEditorConfig", js.Any.fromFunction1(value))
      
      @scala.inline
      def setRegisterEditorEventListeners(value: () => Unit): Self = StObject.set(x, "registerEditorEventListeners", js.Any.fromFunction0(value))
      
      @scala.inline
      def setRegisterPrototypes(value: () => Unit): Self = StObject.set(x, "registerPrototypes", js.Any.fromFunction0(value))
      
      @scala.inline
      def setSetModules(value: () => Unit): Self = StObject.set(x, "setModules", js.Any.fromFunction0(value))
      
      @scala.inline
      def setSetupCustomImageHandler(value: () => Unit): Self = StObject.set(x, "setupCustomImageHandler", js.Any.fromFunction0(value))
      
      @scala.inline
      def setSetupQuillEditor(value: () => Unit): Self = StObject.set(x, "setupQuillEditor", js.Any.fromFunction0(value))
    }
  }
  
  @js.native
  trait VueEditorProps extends StObject {
    
    var disabled: Boolean = js.native
    
    var editorOptions: js.Any = js.native
    
    var editorToolbar: js.Array[_] = js.native
    
    var id: String = js.native
    
    var placeholder: String = js.native
    
    var useCustomImageHandler: js.Any = js.native
    
    var useMarkdownShortcuts: Boolean = js.native
    
    var value: String = js.native
  }
  object VueEditorProps {
    
    @scala.inline
    def apply(
      disabled: Boolean,
      editorOptions: js.Any,
      editorToolbar: js.Array[_],
      id: String,
      placeholder: String,
      useCustomImageHandler: js.Any,
      useMarkdownShortcuts: Boolean,
      value: String
    ): VueEditorProps = {
      val __obj = js.Dynamic.literal(disabled = disabled.asInstanceOf[js.Any], editorOptions = editorOptions.asInstanceOf[js.Any], editorToolbar = editorToolbar.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], placeholder = placeholder.asInstanceOf[js.Any], useCustomImageHandler = useCustomImageHandler.asInstanceOf[js.Any], useMarkdownShortcuts = useMarkdownShortcuts.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
      __obj.asInstanceOf[VueEditorProps]
    }
    
    @scala.inline
    implicit class VueEditorPropsMutableBuilder[Self <: VueEditorProps] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setDisabled(value: Boolean): Self = StObject.set(x, "disabled", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setEditorOptions(value: js.Any): Self = StObject.set(x, "editorOptions", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setEditorToolbar(value: js.Array[_]): Self = StObject.set(x, "editorToolbar", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setEditorToolbarVarargs(value: js.Any*): Self = StObject.set(x, "editorToolbar", js.Array(value :_*))
      
      @scala.inline
      def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPlaceholder(value: String): Self = StObject.set(x, "placeholder", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setUseCustomImageHandler(value: js.Any): Self = StObject.set(x, "useCustomImageHandler", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setUseMarkdownShortcuts(value: Boolean): Self = StObject.set(x, "useMarkdownShortcuts", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setValue(value: String): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait VueEditorWatch extends StObject {
    
    def disabled(status: Boolean): Unit = js.native
    
    def value(`val`: js.Any): Unit = js.native
  }
  object VueEditorWatch {
    
    @scala.inline
    def apply(disabled: Boolean => Unit, value: js.Any => Unit): VueEditorWatch = {
      val __obj = js.Dynamic.literal(disabled = js.Any.fromFunction1(disabled), value = js.Any.fromFunction1(value))
      __obj.asInstanceOf[VueEditorWatch]
    }
    
    @scala.inline
    implicit class VueEditorWatchMutableBuilder[Self <: VueEditorWatch] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setDisabled(value: Boolean => Unit): Self = StObject.set(x, "disabled", js.Any.fromFunction1(value))
      
      @scala.inline
      def setValue(value: js.Any => Unit): Self = StObject.set(x, "value", js.Any.fromFunction1(value))
    }
  }
  
  type _To = VueEditorConstructor
  
  /* This means you don't have to write `default`, but can instead just say `mod.foo` */
  override def _to: VueEditorConstructor = default
}
