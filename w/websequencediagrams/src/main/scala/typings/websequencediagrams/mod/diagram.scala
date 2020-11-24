package typings.websequencediagrams.mod

import typings.node.Buffer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("websequencediagrams", "diagram")
@js.native
object diagram extends js.Object {
  
  def apply(description: String, style: Null, format: Null, callback: diagramCallback): Unit = js.native
  def apply(description: String, style: Null, format: OutputType, callback: diagramCallback): Unit = js.native
  def apply(description: String, style: Style, format: Null, callback: diagramCallback): Unit = js.native
  def apply(description: String, style: Style, format: OutputType, callback: diagramCallback): Unit = js.native
  def apply(description: Buffer, style: Null, format: Null, callback: diagramCallback): Unit = js.native
  def apply(description: Buffer, style: Null, format: OutputType, callback: diagramCallback): Unit = js.native
  def apply(description: Buffer, style: Style, format: Null, callback: diagramCallback): Unit = js.native
  def apply(description: Buffer, style: Style, format: OutputType, callback: diagramCallback): Unit = js.native
}
