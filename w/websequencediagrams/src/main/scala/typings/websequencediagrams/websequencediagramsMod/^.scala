package typings.websequencediagrams.websequencediagramsMod

import typings.node.Buffer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("websequencediagrams", JSImport.Namespace)
@js.native
object ^ extends js.Object {
  val root: String = js.native
  val styles: js.Array[Style] = js.native
  def diagram(description: String, style: Null, format: Null, callback: diagramCallback): Unit = js.native
  def diagram(description: String, style: Null, format: OutputType, callback: diagramCallback): Unit = js.native
  def diagram(description: String, style: Style, format: Null, callback: diagramCallback): Unit = js.native
  def diagram(description: String, style: Style, format: OutputType, callback: diagramCallback): Unit = js.native
  def diagram(description: Buffer, style: Null, format: Null, callback: diagramCallback): Unit = js.native
  def diagram(description: Buffer, style: Null, format: OutputType, callback: diagramCallback): Unit = js.native
  def diagram(description: Buffer, style: Style, format: Null, callback: diagramCallback): Unit = js.native
  def diagram(description: Buffer, style: Style, format: OutputType, callback: diagramCallback): Unit = js.native
  def diagram_url(description: String, style: Null, format: Null, callback: diagramUrlCallback): Unit = js.native
  def diagram_url(description: String, style: Null, format: OutputType, callback: diagramUrlCallback): Unit = js.native
  def diagram_url(description: String, style: Style, format: Null, callback: diagramUrlCallback): Unit = js.native
  def diagram_url(description: String, style: Style, format: OutputType, callback: diagramUrlCallback): Unit = js.native
  def diagram_url(description: Buffer, style: Null, format: Null, callback: diagramUrlCallback): Unit = js.native
  def diagram_url(description: Buffer, style: Null, format: OutputType, callback: diagramUrlCallback): Unit = js.native
  def diagram_url(description: Buffer, style: Style, format: Null, callback: diagramUrlCallback): Unit = js.native
  def diagram_url(description: Buffer, style: Style, format: OutputType, callback: diagramUrlCallback): Unit = js.native
}

