package typings.strtok3

import typings.node.Buffer
import typings.node.streamMod.Readable
import typings.strtok3.bufferTokenizerMod.BufferTokenizer
import typings.strtok3.fileTokenizerMod.FileTokenizer
import typings.strtok3.readStreamTokenizerMod.ReadStreamTokenizer
import typings.strtok3.typesMod.IFileInfo
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("strtok3", JSImport.Namespace)
@js.native
object mod extends js.Object {
  
  def fromBuffer(buffer: Buffer): BufferTokenizer = js.native
  def fromBuffer(buffer: Buffer, fileInfo: IFileInfo): BufferTokenizer = js.native
  
  def fromFile(sourceFilePath: String): js.Promise[FileTokenizer] = js.native
  
  def fromStream(stream: Readable): js.Promise[ReadStreamTokenizer] = js.native
  def fromStream(stream: Readable, fileInfo: IFileInfo): js.Promise[ReadStreamTokenizer] = js.native
  
  @js.native
  class EndOfStreamError ()
    extends typings.strtok3.coreMod.EndOfStreamError
}
