package typings.strtok3

import typings.node.Buffer
import typings.node.streamMod.Readable
import typings.strtok3.bufferTokenizerMod.BufferTokenizer
import typings.strtok3.readStreamTokenizerMod.ReadStreamTokenizer
import typings.strtok3.typesMod.IFileInfo
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("strtok3/lib/core", JSImport.Namespace)
@js.native
object coreMod extends js.Object {
  @js.native
  class EndOfStreamError ()
    extends typings.peekReadable.mod.EndOfStreamError
  
  def fromBuffer(buffer: Buffer): BufferTokenizer = js.native
  def fromBuffer(buffer: Buffer, fileInfo: IFileInfo): BufferTokenizer = js.native
  def fromStream(stream: Readable): ReadStreamTokenizer = js.native
  def fromStream(stream: Readable, fileInfo: IFileInfo): ReadStreamTokenizer = js.native
}

