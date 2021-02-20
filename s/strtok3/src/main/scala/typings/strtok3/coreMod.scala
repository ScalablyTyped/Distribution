package typings.strtok3

import typings.node.Buffer
import typings.node.streamMod.Readable
import typings.strtok3.bufferTokenizerMod.BufferTokenizer
import typings.strtok3.readStreamTokenizerMod.ReadStreamTokenizer
import typings.strtok3.typesMod.IFileInfo
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object coreMod {
  
  @JSImport("strtok3/lib/core", "EndOfStreamError")
  @js.native
  class EndOfStreamError ()
    extends typings.peekReadable.mod.EndOfStreamError
  
  @JSImport("strtok3/lib/core", "fromBuffer")
  @js.native
  def fromBuffer(buffer: Buffer): BufferTokenizer = js.native
  @JSImport("strtok3/lib/core", "fromBuffer")
  @js.native
  def fromBuffer(buffer: Buffer, fileInfo: IFileInfo): BufferTokenizer = js.native
  
  @JSImport("strtok3/lib/core", "fromStream")
  @js.native
  def fromStream(stream: Readable): ReadStreamTokenizer = js.native
  @JSImport("strtok3/lib/core", "fromStream")
  @js.native
  def fromStream(stream: Readable, fileInfo: IFileInfo): ReadStreamTokenizer = js.native
}
