package typings.strtok3

import typings.node.Buffer
import typings.node.streamMod.Readable
import typings.strtok3.bufferTokenizerMod.BufferTokenizer
import typings.strtok3.fileTokenizerMod.FileTokenizer
import typings.strtok3.readStreamTokenizerMod.ReadStreamTokenizer
import typings.strtok3.typesMod.IFileInfo
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("strtok3", "EndOfStreamError")
  @js.native
  class EndOfStreamError ()
    extends typings.strtok3.coreMod.EndOfStreamError
  
  @JSImport("strtok3", "fromBuffer")
  @js.native
  def fromBuffer(buffer: Buffer): BufferTokenizer = js.native
  @JSImport("strtok3", "fromBuffer")
  @js.native
  def fromBuffer(buffer: Buffer, fileInfo: IFileInfo): BufferTokenizer = js.native
  
  @JSImport("strtok3", "fromFile")
  @js.native
  def fromFile(sourceFilePath: String): js.Promise[FileTokenizer] = js.native
  
  @JSImport("strtok3", "fromStream")
  @js.native
  def fromStream(stream: Readable): js.Promise[ReadStreamTokenizer] = js.native
  @JSImport("strtok3", "fromStream")
  @js.native
  def fromStream(stream: Readable, fileInfo: IFileInfo): js.Promise[ReadStreamTokenizer] = js.native
}
