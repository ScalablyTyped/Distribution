package typings.strtok3

import typings.node.nodeColonstreamMod.Readable
import typings.strtok3.libBufferTokenizerMod.BufferTokenizer
import typings.strtok3.libFileTokenizerMod.FileTokenizer
import typings.strtok3.libReadStreamTokenizerMod.ReadStreamTokenizer
import typings.strtok3.libTypesMod.IFileInfo
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("strtok3", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("strtok3", "EndOfStreamError")
  @js.native
  open class EndOfStreamError ()
    extends typings.strtok3.libCoreMod.EndOfStreamError
  
  inline def fromBuffer(uint8Array: js.typedarray.Uint8Array): BufferTokenizer = ^.asInstanceOf[js.Dynamic].applyDynamic("fromBuffer")(uint8Array.asInstanceOf[js.Any]).asInstanceOf[BufferTokenizer]
  inline def fromBuffer(uint8Array: js.typedarray.Uint8Array, fileInfo: IFileInfo): BufferTokenizer = (^.asInstanceOf[js.Dynamic].applyDynamic("fromBuffer")(uint8Array.asInstanceOf[js.Any], fileInfo.asInstanceOf[js.Any])).asInstanceOf[BufferTokenizer]
  
  inline def fromFile(sourceFilePath: String): js.Promise[FileTokenizer] = ^.asInstanceOf[js.Dynamic].applyDynamic("fromFile")(sourceFilePath.asInstanceOf[js.Any]).asInstanceOf[js.Promise[FileTokenizer]]
  
  inline def fromStream(stream: Readable): js.Promise[ReadStreamTokenizer] = ^.asInstanceOf[js.Dynamic].applyDynamic("fromStream")(stream.asInstanceOf[js.Any]).asInstanceOf[js.Promise[ReadStreamTokenizer]]
  inline def fromStream(stream: Readable, fileInfo: IFileInfo): js.Promise[ReadStreamTokenizer] = (^.asInstanceOf[js.Dynamic].applyDynamic("fromStream")(stream.asInstanceOf[js.Any], fileInfo.asInstanceOf[js.Any])).asInstanceOf[js.Promise[ReadStreamTokenizer]]
}
