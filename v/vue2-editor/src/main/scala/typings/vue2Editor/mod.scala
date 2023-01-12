package typings.vue2Editor

import org.scalablytyped.runtime.Shortcut
import typings.std.Event
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod extends Shortcut {
  
  @JSImport("vue2-editor", JSImport.Default)
  @js.native
  val default: VueEditorConstructor = js.native
  
  @JSImport("vue2-editor", "VueEditor")
  @js.native
  val VueEditor: VueEditorConstructor = js.native
  
  /* import warning: RemoveDifficultInheritance.summarizeChanges 
  - Dropped / * import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify VueConstructor * / any */ trait VueEditorConstructor extends StObject {
    
    def data(): VueEditorData
    
    var methods: VueEditorMethods
    
    var props: VueEditorProps
    
    var watch: VueEditorWatch
  }
  object VueEditorConstructor {
    
    inline def apply(data: () => VueEditorData, methods: VueEditorMethods, props: VueEditorProps, watch: VueEditorWatch): VueEditorConstructor = {
      val __obj = js.Dynamic.literal(data = js.Any.fromFunction0(data), methods = methods.asInstanceOf[js.Any], props = props.asInstanceOf[js.Any], watch = watch.asInstanceOf[js.Any])
      __obj.asInstanceOf[VueEditorConstructor]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: VueEditorConstructor] (val x: Self) extends AnyVal {
      
      inline def setData(value: () => VueEditorData): Self = StObject.set(x, "data", js.Any.fromFunction0(value))
      
      inline def setMethods(value: VueEditorMethods): Self = StObject.set(x, "methods", value.asInstanceOf[js.Any])
      
      inline def setProps(value: VueEditorProps): Self = StObject.set(x, "props", value.asInstanceOf[js.Any])
      
      inline def setWatch(value: VueEditorWatch): Self = StObject.set(x, "watch", value.asInstanceOf[js.Any])
    }
  }
  
  trait VueEditorData extends StObject {
    
    var quill: Any
  }
  object VueEditorData {
    
    inline def apply(quill: Any): VueEditorData = {
      val __obj = js.Dynamic.literal(quill = quill.asInstanceOf[js.Any])
      __obj.asInstanceOf[VueEditorData]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: VueEditorData] (val x: Self) extends AnyVal {
      
      inline def setQuill(value: Any): Self = StObject.set(x, "quill", value.asInstanceOf[js.Any])
    }
  }
  
  trait VueEditorMethods extends StObject {
    
    def checkForCustomImageHandler(): Unit
    
    def customImageHandler(image: Any, callback: Any): Unit
    
    def emitImageInfo($event: Event): Unit
    
    def handleInitialContent(): Unit
    
    def handleSelectionChange(range: Any, oldRange: Any): Unit
    
    def handleTextChange(): Unit
    
    def initializeEditor(): Unit
    
    def listenForEditorEvent(`type`: Any): Unit
    
    def prepareEditorConfig(editorConfig: Any): Unit
    
    def registerEditorEventListeners(): Unit
    
    def registerPrototypes(): Unit
    
    def setModules(): Unit
    
    def setupCustomImageHandler(): Unit
    
    def setupQuillEditor(): Unit
  }
  object VueEditorMethods {
    
    inline def apply(
      checkForCustomImageHandler: () => Unit,
      customImageHandler: (Any, Any) => Unit,
      emitImageInfo: Event => Unit,
      handleInitialContent: () => Unit,
      handleSelectionChange: (Any, Any) => Unit,
      handleTextChange: () => Unit,
      initializeEditor: () => Unit,
      listenForEditorEvent: Any => Unit,
      prepareEditorConfig: Any => Unit,
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
    implicit open class MutableBuilder[Self <: VueEditorMethods] (val x: Self) extends AnyVal {
      
      inline def setCheckForCustomImageHandler(value: () => Unit): Self = StObject.set(x, "checkForCustomImageHandler", js.Any.fromFunction0(value))
      
      inline def setCustomImageHandler(value: (Any, Any) => Unit): Self = StObject.set(x, "customImageHandler", js.Any.fromFunction2(value))
      
      inline def setEmitImageInfo(value: Event => Unit): Self = StObject.set(x, "emitImageInfo", js.Any.fromFunction1(value))
      
      inline def setHandleInitialContent(value: () => Unit): Self = StObject.set(x, "handleInitialContent", js.Any.fromFunction0(value))
      
      inline def setHandleSelectionChange(value: (Any, Any) => Unit): Self = StObject.set(x, "handleSelectionChange", js.Any.fromFunction2(value))
      
      inline def setHandleTextChange(value: () => Unit): Self = StObject.set(x, "handleTextChange", js.Any.fromFunction0(value))
      
      inline def setInitializeEditor(value: () => Unit): Self = StObject.set(x, "initializeEditor", js.Any.fromFunction0(value))
      
      inline def setListenForEditorEvent(value: Any => Unit): Self = StObject.set(x, "listenForEditorEvent", js.Any.fromFunction1(value))
      
      inline def setPrepareEditorConfig(value: Any => Unit): Self = StObject.set(x, "prepareEditorConfig", js.Any.fromFunction1(value))
      
      inline def setRegisterEditorEventListeners(value: () => Unit): Self = StObject.set(x, "registerEditorEventListeners", js.Any.fromFunction0(value))
      
      inline def setRegisterPrototypes(value: () => Unit): Self = StObject.set(x, "registerPrototypes", js.Any.fromFunction0(value))
      
      inline def setSetModules(value: () => Unit): Self = StObject.set(x, "setModules", js.Any.fromFunction0(value))
      
      inline def setSetupCustomImageHandler(value: () => Unit): Self = StObject.set(x, "setupCustomImageHandler", js.Any.fromFunction0(value))
      
      inline def setSetupQuillEditor(value: () => Unit): Self = StObject.set(x, "setupQuillEditor", js.Any.fromFunction0(value))
    }
  }
  
  trait VueEditorProps extends StObject {
    
    var disabled: Boolean
    
    var editorOptions: Any
    
    var editorToolbar: js.Array[Any]
    
    var id: String
    
    var placeholder: String
    
    var useCustomImageHandler: Any
    
    var useMarkdownShortcuts: Boolean
    
    var value: String
  }
  object VueEditorProps {
    
    inline def apply(
      disabled: Boolean,
      editorOptions: Any,
      editorToolbar: js.Array[Any],
      id: String,
      placeholder: String,
      useCustomImageHandler: Any,
      useMarkdownShortcuts: Boolean,
      value: String
    ): VueEditorProps = {
      val __obj = js.Dynamic.literal(disabled = disabled.asInstanceOf[js.Any], editorOptions = editorOptions.asInstanceOf[js.Any], editorToolbar = editorToolbar.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], placeholder = placeholder.asInstanceOf[js.Any], useCustomImageHandler = useCustomImageHandler.asInstanceOf[js.Any], useMarkdownShortcuts = useMarkdownShortcuts.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
      __obj.asInstanceOf[VueEditorProps]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: VueEditorProps] (val x: Self) extends AnyVal {
      
      inline def setDisabled(value: Boolean): Self = StObject.set(x, "disabled", value.asInstanceOf[js.Any])
      
      inline def setEditorOptions(value: Any): Self = StObject.set(x, "editorOptions", value.asInstanceOf[js.Any])
      
      inline def setEditorToolbar(value: js.Array[Any]): Self = StObject.set(x, "editorToolbar", value.asInstanceOf[js.Any])
      
      inline def setEditorToolbarVarargs(value: Any*): Self = StObject.set(x, "editorToolbar", js.Array(value*))
      
      inline def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
      
      inline def setPlaceholder(value: String): Self = StObject.set(x, "placeholder", value.asInstanceOf[js.Any])
      
      inline def setUseCustomImageHandler(value: Any): Self = StObject.set(x, "useCustomImageHandler", value.asInstanceOf[js.Any])
      
      inline def setUseMarkdownShortcuts(value: Boolean): Self = StObject.set(x, "useMarkdownShortcuts", value.asInstanceOf[js.Any])
      
      inline def setValue(value: String): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
    }
  }
  
  trait VueEditorWatch extends StObject {
    
    def disabled(status: Boolean): Unit
    
    def value(`val`: Any): Unit
  }
  object VueEditorWatch {
    
    inline def apply(disabled: Boolean => Unit, value: Any => Unit): VueEditorWatch = {
      val __obj = js.Dynamic.literal(disabled = js.Any.fromFunction1(disabled), value = js.Any.fromFunction1(value))
      __obj.asInstanceOf[VueEditorWatch]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: VueEditorWatch] (val x: Self) extends AnyVal {
      
      inline def setDisabled(value: Boolean => Unit): Self = StObject.set(x, "disabled", js.Any.fromFunction1(value))
      
      inline def setValue(value: Any => Unit): Self = StObject.set(x, "value", js.Any.fromFunction1(value))
    }
  }
  
  type _To = VueEditorConstructor
  
  /* This means you don't have to write `default`, but can instead just say `mod.foo` */
  override def _to: VueEditorConstructor = default
}
