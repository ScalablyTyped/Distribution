package typings.websequencediagrams.websequencediagramsMod

import typings.node.Buffer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("websequencediagrams", "diagram_url")
@js.native
object diagram_url extends js.Object {
  def apply(description: String, style: Null, format: Null, callback: diagramUrlCallback): Unit = js.native
  def apply(description: String, style: Null, format: OutputType, callback: diagramUrlCallback): Unit = js.native
  def apply(description: String, style: Style, format: Null, callback: diagramUrlCallback): Unit = js.native
  def apply(description: String, style: Style, format: OutputType, callback: diagramUrlCallback): Unit = js.native
  def apply(description: Buffer, style: Null, format: Null, callback: diagramUrlCallback): Unit = js.native
  def apply(description: Buffer, style: Null, format: OutputType, callback: diagramUrlCallback): Unit = js.native
  def apply(description: Buffer, style: Style, format: Null, callback: diagramUrlCallback): Unit = js.native
  def apply(description: Buffer, style: Style, format: OutputType, callback: diagramUrlCallback): Unit = js.native
}

