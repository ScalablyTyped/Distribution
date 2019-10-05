package typings.xmlbuilder.xmlbuilderMod

import typings.node.streamMod.Writable
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("xmlbuilder", "streamWriter")
@js.native
object streamWriter extends js.Object {
  /**
    * Creates and returns a default stream writer.
    * 
    * @param stream - a writeable stream
    * @param options - writer options
    */
  def apply(stream: Writable): XMLWriter = js.native
  def apply(stream: Writable, options: WriterOptions): XMLWriter = js.native
}

