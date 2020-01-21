package typings.vue2Editor.mod

import typings.std.Event_
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait VueEditorMethods extends js.Object {
  def checkForCustomImageHandler(): Unit
  def customImageHandler(image: js.Any, callback: js.Any): Unit
  def emitImageInfo($event: Event_): Unit
  def handleInitialContent(): Unit
  def handleSelectionChange(range: js.Any, oldRange: js.Any): Unit
  def handleTextChange(): Unit
  def initializeEditor(): Unit
  def listenForEditorEvent(`type`: js.Any): Unit
  def prepareEditorConfig(editorConfig: js.Any): Unit
  def registerEditorEventListeners(): Unit
  def registerPrototypes(): Unit
  def setModules(): Unit
  def setupCustomImageHandler(): Unit
  def setupQuillEditor(): Unit
}

object VueEditorMethods {
  @scala.inline
  def apply(
    checkForCustomImageHandler: () => Unit,
    customImageHandler: (js.Any, js.Any) => Unit,
    emitImageInfo: Event_ => Unit,
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
}

