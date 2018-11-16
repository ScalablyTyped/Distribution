package typings
package tinymceLib.tinymceMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("tinymce", "Formatter")
@js.native
class Formatter protected () extends js.Object {
  def this(ed: Editor) = this()
  @JSName("apply")
  def apply(name: java.lang.String): scala.Unit = js.native
  @JSName("apply")
  def apply(name: java.lang.String, vars: js.Object): scala.Unit = js.native
  @JSName("apply")
  def apply(name: java.lang.String, vars: js.Object, node: tinymceLib.tinymceMod.htmlNs.Node): scala.Unit = js.native
  def canApply(name: java.lang.String): scala.Boolean = js.native
  def formatChanged(formats: java.lang.String, callback: js.Function0[scala.Unit], similar: scala.Boolean): scala.Unit = js.native
  def get(): js.Array[_] | js.Object = js.native
  def get(name: java.lang.String): js.Array[_] | js.Object = js.native
  def getCssText(format: java.lang.String): java.lang.String = js.native
  def `match`(name: java.lang.String): scala.Boolean = js.native
  def `match`(name: java.lang.String, vars: js.Object): scala.Boolean = js.native
  def `match`(name: java.lang.String, vars: js.Object, node: tinymceLib.tinymceMod.htmlNs.Node): scala.Boolean = js.native
  def matchAll(names: js.Array[_]): js.Array[_] = js.native
  def matchAll(names: js.Array[_], vars: js.Object): js.Array[_] = js.native
  def matchNode(
    node: tinymceLib.tinymceMod.htmlNs.Node,
    name: java.lang.String,
    vars: js.Object,
    similar: scala.Boolean
  ): js.Object = js.native
  def register(name: js.Object): scala.Unit = js.native
  def register(name: js.Object, format: js.Object): scala.Unit = js.native
  def remove(name: java.lang.String): scala.Unit = js.native
  def remove(name: java.lang.String, vars: js.Object): scala.Unit = js.native
  def remove(name: java.lang.String, vars: js.Object, node: tinymceLib.tinymceMod.htmlNs.Node): scala.Unit = js.native
  def toggle(name: java.lang.String): scala.Unit = js.native
  def toggle(name: java.lang.String, vars: js.Object): scala.Unit = js.native
  def toggle(name: java.lang.String, vars: js.Object, node: tinymceLib.tinymceMod.htmlNs.Node): scala.Unit = js.native
  def unregister(name: java.lang.String): scala.Unit = js.native
}

