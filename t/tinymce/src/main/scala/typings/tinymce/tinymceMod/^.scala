package typings.tinymce.tinymceMod

import typings.tinymce.tinymceMod.domNs.DOMUtils
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("tinymce", JSImport.Namespace)
@js.native
object ^ extends js.Object {
  val DOM: DOMUtils = js.native
  val EditorManager: typings.tinymce.tinymceMod.EditorManager = js.native
  val PluginManager: AddOnManager = js.native
  val ScriptLoader: typings.tinymce.tinymceMod.domNs.ScriptLoader = js.native
  val ThemeManager: AddOnManager = js.native
  val activeEditor: Editor = js.native
  val baseURL: String = js.native
  def create(s: String, p: js.Object): Unit = js.native
  def create(s: String, p: js.Object, root: js.Object): Unit = js.native
  def createNS(n: String, o: js.Object): js.Object = js.native
  def each(o: js.Object, cb: js.Function0[Unit]): Unit = js.native
  def each(o: js.Object, cb: js.Function0[Unit], s: js.Object): Unit = js.native
  def explode(s: String, d: String): Unit = js.native
  def get(id: String): Editor = js.native
  def get(id: Double): Editor = js.native
  def grep(a: js.Array[_], f: js.Function0[Unit]): js.Array[_] = js.native
  def inArray(item: js.Any, arr: js.Array[_]): Double = js.native
  def init(settings: Settings): Unit = js.native
  def is(obj: js.Object): Boolean = js.native
  def is(obj: js.Object, `type`: String): Boolean = js.native
  def isArray(obj: js.Object): Boolean = js.native
  def makeMap(items: js.Array[_]): js.Object = js.native
  def makeMap(items: js.Array[_], delim: String): js.Object = js.native
  def makeMap(items: js.Array[_], delim: String, map: js.Object): js.Object = js.native
  def map(array: js.Array[_], callback: js.Function0[Unit]): js.Array[_] = js.native
  def resolve(n: String): js.Object = js.native
  def resolve(n: String, o: js.Object): js.Object = js.native
  def toArray(obj: js.Object): js.Array[_] = js.native
  def triggerSave(): Unit = js.native
  def trim(s: String): String = js.native
  def walk(o: js.Object, f: js.Function0[Unit]): Unit = js.native
  def walk(o: js.Object, f: js.Function0[Unit], n: String): Unit = js.native
  def walk(o: js.Object, f: js.Function0[Unit], n: String, s: String): Unit = js.native
}

