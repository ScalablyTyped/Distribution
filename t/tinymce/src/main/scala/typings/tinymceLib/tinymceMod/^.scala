package typings
package tinymceLib.tinymceMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("tinymce", JSImport.Namespace)
@js.native
object ^ extends js.Object {
  val DOM: tinymceLib.tinymceMod.domNs.DOMUtils = js.native
  val EditorManager: tinymceLib.tinymceMod.EditorManager = js.native
  val PluginManager: AddOnManager = js.native
  val ScriptLoader: tinymceLib.tinymceMod.domNs.ScriptLoader = js.native
  val ThemeManager: AddOnManager = js.native
  val activeEditor: Editor = js.native
  val baseURL: java.lang.String = js.native
  def create(s: java.lang.String, p: js.Object): scala.Unit = js.native
  def create(s: java.lang.String, p: js.Object, root: js.Object): scala.Unit = js.native
  def createNS(n: java.lang.String, o: js.Object): js.Object = js.native
  def each(o: js.Object, cb: js.Function0[scala.Unit]): scala.Unit = js.native
  def each(o: js.Object, cb: js.Function0[scala.Unit], s: js.Object): scala.Unit = js.native
  def explode(s: java.lang.String, d: java.lang.String): scala.Unit = js.native
  def get(id: java.lang.String): Editor = js.native
  def get(id: scala.Double): Editor = js.native
  def grep(a: js.Array[_], f: js.Function0[scala.Unit]): js.Array[_] = js.native
  def inArray(item: js.Any, arr: js.Array[_]): scala.Double = js.native
  def init(settings: Settings): scala.Unit = js.native
  def is(obj: js.Object): scala.Boolean = js.native
  def is(obj: js.Object, `type`: java.lang.String): scala.Boolean = js.native
  def isArray(obj: js.Object): scala.Boolean = js.native
  def makeMap(items: js.Array[_]): js.Object = js.native
  def makeMap(items: js.Array[_], delim: java.lang.String): js.Object = js.native
  def makeMap(items: js.Array[_], delim: java.lang.String, map: js.Object): js.Object = js.native
  def map(array: js.Array[_], callback: js.Function0[scala.Unit]): js.Array[_] = js.native
  def resolve(n: java.lang.String): js.Object = js.native
  def resolve(n: java.lang.String, o: js.Object): js.Object = js.native
  def toArray(obj: js.Object): js.Array[_] = js.native
  def triggerSave(): scala.Unit = js.native
  def trim(s: java.lang.String): java.lang.String = js.native
  def walk(o: js.Object, f: js.Function0[scala.Unit]): scala.Unit = js.native
  def walk(o: js.Object, f: js.Function0[scala.Unit], n: java.lang.String): scala.Unit = js.native
  def walk(o: js.Object, f: js.Function0[scala.Unit], n: java.lang.String, s: java.lang.String): scala.Unit = js.native
}

