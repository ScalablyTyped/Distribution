package typings.tinymce.mod.dom

import typings.std.HTMLElement
import typings.tinymce.mod.Editor
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("tinymce", "dom.Serializer")
@js.native
class Serializer protected () extends js.Object {
  def this(settings: js.Object) = this()
  def this(settings: js.Object, editor: Editor) = this()
  
  def addAttributeFilter(callback: js.Function0[Unit]): Unit = js.native
  
  def addNodeFilter(callback: js.Function0[Unit]): Unit = js.native
  
  def addRules(rules: String): Unit = js.native
  
  def addTempAttr(name: String): Unit = js.native
  
  def serialize(node: HTMLElement, args: js.Object): Unit = js.native
  
  def setRules(rules: String): Unit = js.native
}
