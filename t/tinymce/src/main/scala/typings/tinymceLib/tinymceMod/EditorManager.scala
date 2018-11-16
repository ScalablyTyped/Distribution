package typings
package tinymceLib.tinymceMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait EditorManager
  extends tinymceLib.tinymceMod.utilNs.Observable {
  @JSName("$")
  var $: tinymceLib.tinymceMod.domNs.DomQuery = js.native
  var activeEditor: Editor = js.native
  var baseURI: tinymceLib.tinymceMod.utilNs.URI = js.native
  var baseURL: java.lang.String = js.native
  var documentBaseURL: java.lang.String = js.native
  var editors: js.Array[Editor] = js.native
  var majorVersion: java.lang.String = js.native
  var minorVersion: java.lang.String = js.native
  var releaseDate: java.lang.String = js.native
  var suffix: java.lang.String = js.native
  def add(editor: Editor): Editor = js.native
  def addI18n(code: java.lang.String, items: js.Object): scala.Unit = js.native
  def createEditor(id: java.lang.String, settings: js.Object): Editor = js.native
  def execCommand(cmd: java.lang.String): scala.Boolean = js.native
  def execCommand(cmd: java.lang.String, ui: scala.Boolean): scala.Boolean = js.native
  def execCommand(cmd: java.lang.String, ui: scala.Boolean, value: java.lang.String): scala.Boolean = js.native
  def get(id: java.lang.String): Editor = js.native
  def init(settings: Settings): stdLib.Promise[Editor] = js.native
  def overrideDefaults(defaultSettings: js.Object): scala.Unit = js.native
  def remove(selector: Editor): Editor = js.native
  def setActive(editor: Editor): scala.Unit = js.native
  def translate(text: java.lang.String): java.lang.String = js.native
  def triggerSave(): scala.Unit = js.native
}

