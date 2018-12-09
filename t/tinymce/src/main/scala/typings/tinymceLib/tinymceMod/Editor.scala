package typings
package tinymceLib.tinymceMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("tinymce", "Editor")
@js.native
class Editor protected ()
  extends tinymceLib.tinymceMod.utilNs.Observable {
  def this(id: java.lang.String, settings: Settings, editorManager: EditorManager) = this()
  @JSName("$")
  var $: tinymceLib.tinymceMod.domNs.DomQuery = js.native
  var baseURI: tinymceLib.tinymceMod.utilNs.URI = js.native
  var contentCSS: js.Array[java.lang.String] = js.native
  var contentStyles: js.Array[java.lang.String] = js.native
  var documentBaseURI: tinymceLib.tinymceMod.utilNs.URI = js.native
  var dom: tinymceLib.tinymceMod.domNs.DOMUtils = js.native
  var formatter: Formatter = js.native
  var id: java.lang.String = js.native
  var initialized: scala.Boolean = js.native
  var notificationManager: notificationManager = js.native
  var parser: tinymceLib.tinymceMod.htmlNs.DomParser = js.native
  var schema: tinymceLib.tinymceMod.htmlNs.Schema = js.native
  var selection: tinymceLib.tinymceMod.domNs.Selection = js.native
  var serializer: tinymceLib.tinymceMod.domNs.Serializer = js.native
  var settings: Settings = js.native
  var theme: Theme = js.native
  var undoManager: UndoManager = js.native
  var windowManager: WindowManager = js.native
  def addButton(name: java.lang.String, settings: js.Object): scala.Unit = js.native
  def addCommand(
    name: java.lang.String,
    callback: js.Function2[/* ui */ scala.Boolean, /* value */ js.Object, scala.Boolean]
  ): scala.Unit = js.native
  def addCommand(
    name: java.lang.String,
    callback: js.Function2[/* ui */ scala.Boolean, /* value */ js.Object, scala.Boolean],
    scope: js.Object
  ): scala.Unit = js.native
  def addContextToolbar(predicate: js.Function0[scala.Unit], items: java.lang.String): scala.Unit = js.native
  def addMenuItem(name: java.lang.String, settings: js.Object): scala.Unit = js.native
  def addQueryStateHandler(name: java.lang.String, callback: js.Function0[scala.Boolean]): scala.Unit = js.native
  def addQueryStateHandler(name: java.lang.String, callback: js.Function0[scala.Boolean], scope: js.Object): scala.Unit = js.native
  def addQueryValueHandler(name: java.lang.String, callback: js.Function0[js.Object]): scala.Unit = js.native
  def addQueryValueHandler(name: java.lang.String, callback: js.Function0[js.Object], scope: js.Object): scala.Unit = js.native
  def addShortcut(pattern: java.lang.String, desc: java.lang.String, cmdFunc: java.lang.String): scala.Boolean = js.native
  def addShortcut(pattern: java.lang.String, desc: java.lang.String, cmdFunc: java.lang.String, sc: js.Object): scala.Boolean = js.native
  def addSidebar(name: java.lang.String, settings: js.Object): scala.Unit = js.native
  def addVisual(): scala.Unit = js.native
  def addVisual(elm: stdLib.Element): scala.Unit = js.native
  def convertURL(url: java.lang.String, name: java.lang.String, elm: java.lang.String): java.lang.String = js.native
  def destroy(): scala.Unit = js.native
  def destroy(automatic: scala.Boolean): scala.Unit = js.native
  def execCallback(name: java.lang.String): js.Object = js.native
  def execCommand(cmd: java.lang.String, ui: scala.Boolean): scala.Unit = js.native
  def execCommand(cmd: java.lang.String, ui: scala.Boolean, value: js.Any): scala.Unit = js.native
  def execCommand(cmd: java.lang.String, ui: scala.Boolean, value: js.Any, args: js.Object): scala.Unit = js.native
  def focus(skipFocus: scala.Boolean): scala.Unit = js.native
  def getBody(): stdLib.HTMLBodyElement = js.native
  def getContainer(): stdLib.Element = js.native
  def getContent(): java.lang.String = js.native
  def getContent(args: js.Object): java.lang.String = js.native
  def getContentAreaContainer(): stdLib.Element = js.native
  def getDoc(): stdLib.Document = js.native
  def getElement(): stdLib.Element = js.native
  def getLang(name: java.lang.String): scala.Unit = js.native
  def getLang(name: java.lang.String, defaultVal: java.lang.String): scala.Unit = js.native
  def getParam(name: java.lang.String): java.lang.String = js.native
  def getParam(name: java.lang.String, defaultVal: java.lang.String): java.lang.String = js.native
  def getParam(name: java.lang.String, defaultVal: java.lang.String, `type`: java.lang.String): java.lang.String = js.native
  def getWin(): stdLib.Window = js.native
  def hide(): scala.Unit = js.native
  def init(): scala.Unit = js.native
  def insertContent(content: java.lang.String): scala.Unit = js.native
  def insertContent(content: java.lang.String, args: js.Object): scala.Unit = js.native
  def isDirty(): scala.Boolean = js.native
  def isHidden(): scala.Boolean = js.native
  def load(): java.lang.String = js.native
  def load(args: js.Object): java.lang.String = js.native
  def nodeChanged(): scala.Unit = js.native
  def nodeChanged(args: js.Object): scala.Unit = js.native
  def queryCommandState(cmd: java.lang.String): scala.Boolean = js.native
  def queryCommandSupported(cmd: java.lang.String): scala.Boolean = js.native
  def queryCommandValue(cmd: java.lang.String): js.Object = js.native
  def remove(): scala.Unit = js.native
  def render(): scala.Unit = js.native
  def save(args: js.Object): java.lang.String = js.native
  def setContent(content: java.lang.String): java.lang.String = js.native
  def setContent(content: java.lang.String, args: js.Object): java.lang.String = js.native
  def setDirty(state: scala.Boolean): scala.Unit = js.native
  def setMode(mode: java.lang.String): scala.Unit = js.native
  def setProgressState(state: scala.Boolean, time: scala.Double): scala.Boolean = js.native
  def show(): scala.Unit = js.native
  def translate(text: java.lang.String): java.lang.String = js.native
  def uploadImages(callback: js.Function0[scala.Unit]): js.Promise[_] = js.native
}

