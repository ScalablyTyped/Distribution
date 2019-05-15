package typings
package vue2DashEditorLib.vue2DashEditorMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait VueEditorMethods extends js.Object {
  def checkForCustomImageHandler(): scala.Unit
  def customImageHandler(image: js.Any, callback: js.Any): scala.Unit
  def emitImageInfo($event: stdLib.Event): scala.Unit
  def handleInitialContent(): scala.Unit
  def handleSelectionChange(range: js.Any, oldRange: js.Any): scala.Unit
  def handleTextChange(): scala.Unit
  def initializeEditor(): scala.Unit
  def listenForEditorEvent(`type`: js.Any): scala.Unit
  def prepareEditorConfig(editorConfig: js.Any): scala.Unit
  def registerEditorEventListeners(): scala.Unit
  def registerPrototypes(): scala.Unit
  def setModules(): scala.Unit
  def setupCustomImageHandler(): scala.Unit
  def setupQuillEditor(): scala.Unit
}

object VueEditorMethods {
  @scala.inline
  def apply(
    checkForCustomImageHandler: () => scala.Unit,
    customImageHandler: (js.Any, js.Any) => scala.Unit,
    emitImageInfo: stdLib.Event => scala.Unit,
    handleInitialContent: () => scala.Unit,
    handleSelectionChange: (js.Any, js.Any) => scala.Unit,
    handleTextChange: () => scala.Unit,
    initializeEditor: () => scala.Unit,
    listenForEditorEvent: js.Any => scala.Unit,
    prepareEditorConfig: js.Any => scala.Unit,
    registerEditorEventListeners: () => scala.Unit,
    registerPrototypes: () => scala.Unit,
    setModules: () => scala.Unit,
    setupCustomImageHandler: () => scala.Unit,
    setupQuillEditor: () => scala.Unit
  ): VueEditorMethods = {
    val __obj = js.Dynamic.literal(checkForCustomImageHandler = js.Any.fromFunction0(checkForCustomImageHandler), customImageHandler = js.Any.fromFunction2(customImageHandler), emitImageInfo = js.Any.fromFunction1(emitImageInfo), handleInitialContent = js.Any.fromFunction0(handleInitialContent), handleSelectionChange = js.Any.fromFunction2(handleSelectionChange), handleTextChange = js.Any.fromFunction0(handleTextChange), initializeEditor = js.Any.fromFunction0(initializeEditor), listenForEditorEvent = js.Any.fromFunction1(listenForEditorEvent), prepareEditorConfig = js.Any.fromFunction1(prepareEditorConfig), registerEditorEventListeners = js.Any.fromFunction0(registerEditorEventListeners), registerPrototypes = js.Any.fromFunction0(registerPrototypes), setModules = js.Any.fromFunction0(setModules), setupCustomImageHandler = js.Any.fromFunction0(setupCustomImageHandler), setupQuillEditor = js.Any.fromFunction0(setupQuillEditor))
  
    __obj.asInstanceOf[VueEditorMethods]
  }
}

