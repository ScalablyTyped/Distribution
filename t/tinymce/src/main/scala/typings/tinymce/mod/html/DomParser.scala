package typings.tinymce.mod.html

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("tinymce", "html.DomParser")
@js.native
class DomParser protected () extends js.Object {
  def this(settings: js.Object, schema: Schema) = this()
  
  def addAttributeFilter(attributes: String, callback: js.Function0[Unit]): Unit = js.native
  
  def addNodeFilter(attributes: String, callback: js.Function0[Unit]): Unit = js.native
  
  def filterNode(node: Node): Node = js.native
  
  def parse(html: String): Node = js.native
  def parse(html: String, args: js.Object): Node = js.native
}
