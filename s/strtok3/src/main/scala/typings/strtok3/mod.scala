package typings.strtok3

import typings.node.Buffer
import typings.node.streamMod.Readable
import typings.strtok3.bufferTokenizerMod.BufferTokenizer
import typings.strtok3.fileTokenizerMod.FileTokenizer
import typings.strtok3.readStreamTokenizerMod.ReadStreamTokenizer
import typings.strtok3.typesMod.IFileInfo
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("strtok3", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("strtok3", "EndOfStreamError")
  @js.native
  class EndOfStreamError ()
    extends typings.strtok3.coreMod.EndOfStreamError
  
  inline def fromBuffer(buffer: Buffer): BufferTokenizer = ^.asInstanceOf[js.Dynamic].applyDynamic("fromBuffer")(buffer.asInstanceOf[js.Any]).asInstanceOf[BufferTokenizer]
  inline def fromBuffer(buffer: Buffer, fileInfo: IFileInfo): BufferTokenizer = (^.asInstanceOf[js.Dynamic].applyDynamic("fromBuffer")(buffer.asInstanceOf[js.Any], fileInfo.asInstanceOf[js.Any])).asInstanceOf[BufferTokenizer]
  
  inline def fromFile(sourceFilePath: String): js.Promise[FileTokenizer] = ^.asInstanceOf[js.Dynamic].applyDynamic("fromFile")(sourceFilePath.asInstanceOf[js.Any]).asInstanceOf[js.Promise[FileTokenizer]]
  
  inline def fromStream(stream: Readable): js.Promise[ReadStreamTokenizer] = ^.asInstanceOf[js.Dynamic].applyDynamic("fromStream")(stream.asInstanceOf[js.Any]).asInstanceOf[js.Promise[ReadStreamTokenizer]]
  inline def fromStream(stream: Readable, fileInfo: IFileInfo): js.Promise[ReadStreamTokenizer] = (^.asInstanceOf[js.Dynamic].applyDynamic("fromStream")(stream.asInstanceOf[js.Any], fileInfo.asInstanceOf[js.Any])).asInstanceOf[js.Promise[ReadStreamTokenizer]]
}
