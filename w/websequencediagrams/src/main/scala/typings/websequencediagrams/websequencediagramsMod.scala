package typings.websequencediagrams

import typings.node.Buffer
import typings.std.Error
import typings.websequencediagrams.websequencediagramsMod.OutputType
import typings.websequencediagrams.websequencediagramsMod.Style
import typings.websequencediagrams.websequencediagramsMod.diagramCallback
import typings.websequencediagrams.websequencediagramsMod.diagramUrlCallback
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("websequencediagrams", JSImport.Namespace)
@js.native
object websequencediagramsMod extends js.Object {
  /* Rewritten from type alias, can be one of: 
    - typings.websequencediagrams.websequencediagramsStrings.png
    - typings.websequencediagrams.websequencediagramsStrings.svg
    - typings.websequencediagrams.websequencediagramsStrings.pdf
  */
  trait OutputType extends js.Object
  
  /* Rewritten from type alias, can be one of: 
    - typings.websequencediagrams.websequencediagramsStrings.default
    - typings.websequencediagrams.websequencediagramsStrings.earth
    - typings.websequencediagrams.websequencediagramsStrings.`modern-blue`
    - typings.websequencediagrams.websequencediagramsStrings.mscgen
    - typings.websequencediagrams.websequencediagramsStrings.omegapple
    - typings.websequencediagrams.websequencediagramsStrings.qsd
    - typings.websequencediagrams.websequencediagramsStrings.rose
    - typings.websequencediagrams.websequencediagramsStrings.roundgreen
    - typings.websequencediagrams.websequencediagramsStrings.napkin
    - typings.websequencediagrams.websequencediagramsStrings.magazine
    - typings.websequencediagrams.websequencediagramsStrings.vs2010
    - typings.websequencediagrams.websequencediagramsStrings.patent
  */
  trait Style extends js.Object
  
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
  type diagramCallback = js.Function3[
    /* error */ Error | Null, 
    /* buffer */ js.UndefOr[Buffer], 
    /* mimeType */ js.UndefOr[String], 
    Unit
  ]
  type diagramUrlCallback = js.Function2[/* error */ Error | Null, /* url */ js.UndefOr[String], Unit]
}

