package typings.vue2Editor.mod

import typings.std.Event
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait VueEditorMethods extends js.Object {
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
  implicit class VueEditorMethodsOps[Self <: VueEditorMethods] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setCheckForCustomImageHandler(value: () => Unit): Self = this.set("checkForCustomImageHandler", js.Any.fromFunction0(value))
    @scala.inline
    def setCustomImageHandler(value: (js.Any, js.Any) => Unit): Self = this.set("customImageHandler", js.Any.fromFunction2(value))
    @scala.inline
    def setEmitImageInfo(value: Event => Unit): Self = this.set("emitImageInfo", js.Any.fromFunction1(value))
    @scala.inline
    def setHandleInitialContent(value: () => Unit): Self = this.set("handleInitialContent", js.Any.fromFunction0(value))
    @scala.inline
    def setHandleSelectionChange(value: (js.Any, js.Any) => Unit): Self = this.set("handleSelectionChange", js.Any.fromFunction2(value))
    @scala.inline
    def setHandleTextChange(value: () => Unit): Self = this.set("handleTextChange", js.Any.fromFunction0(value))
    @scala.inline
    def setInitializeEditor(value: () => Unit): Self = this.set("initializeEditor", js.Any.fromFunction0(value))
    @scala.inline
    def setListenForEditorEvent(value: js.Any => Unit): Self = this.set("listenForEditorEvent", js.Any.fromFunction1(value))
    @scala.inline
    def setPrepareEditorConfig(value: js.Any => Unit): Self = this.set("prepareEditorConfig", js.Any.fromFunction1(value))
    @scala.inline
    def setRegisterEditorEventListeners(value: () => Unit): Self = this.set("registerEditorEventListeners", js.Any.fromFunction0(value))
    @scala.inline
    def setRegisterPrototypes(value: () => Unit): Self = this.set("registerPrototypes", js.Any.fromFunction0(value))
    @scala.inline
    def setSetModules(value: () => Unit): Self = this.set("setModules", js.Any.fromFunction0(value))
    @scala.inline
    def setSetupCustomImageHandler(value: () => Unit): Self = this.set("setupCustomImageHandler", js.Any.fromFunction0(value))
    @scala.inline
    def setSetupQuillEditor(value: () => Unit): Self = this.set("setupQuillEditor", js.Any.fromFunction0(value))
  }
  
}

