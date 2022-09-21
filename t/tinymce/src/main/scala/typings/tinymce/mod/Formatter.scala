package typings.tinymce.mod

import typings.tinymce.mod.html.Node
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("tinymce", "Formatter")
@js.native
open class Formatter protected () extends StObject {
  def this(ed: Editor) = this()
  
  @JSName("apply")
  def apply(name: String): Unit = js.native
  @JSName("apply")
  def apply(name: String, vars: js.Object): Unit = js.native
  @JSName("apply")
  def apply(name: String, vars: js.Object, node: Node): Unit = js.native
  @JSName("apply")
  def apply(name: String, vars: Unit, node: Node): Unit = js.native
  
  def canApply(name: String): Boolean = js.native
  
  def formatChanged(formats: String, callback: js.Function0[Unit], similar: Boolean): Unit = js.native
  
  def get(): js.Array[Any] | js.Object = js.native
  def get(name: String): js.Array[Any] | js.Object = js.native
  
  def getCssText(format: String): String = js.native
  
  def `match`(name: String): Boolean = js.native
  def `match`(name: String, vars: js.Object): Boolean = js.native
  def `match`(name: String, vars: js.Object, node: Node): Boolean = js.native
  def `match`(name: String, vars: Unit, node: Node): Boolean = js.native
  
  def matchAll(names: js.Array[Any]): js.Array[Any] = js.native
  def matchAll(names: js.Array[Any], vars: js.Object): js.Array[Any] = js.native
  
  def matchNode(node: Node, name: String, vars: js.Object, similar: Boolean): js.Object = js.native
  
  def register(name: js.Object): Unit = js.native
  def register(name: js.Object, format: js.Object): Unit = js.native
  
  def remove(name: String): Unit = js.native
  def remove(name: String, vars: js.Object): Unit = js.native
  def remove(name: String, vars: js.Object, node: Node): Unit = js.native
  def remove(name: String, vars: Unit, node: Node): Unit = js.native
  
  def toggle(name: String): Unit = js.native
  def toggle(name: String, vars: js.Object): Unit = js.native
  def toggle(name: String, vars: js.Object, node: Node): Unit = js.native
  def toggle(name: String, vars: Unit, node: Node): Unit = js.native
  
  def unregister(name: String): Unit = js.native
}
