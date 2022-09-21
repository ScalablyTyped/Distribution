package typings.strtok3

import typings.node.nodeStreamMod.Readable
import typings.strtok3.bufferTokenizerMod.BufferTokenizer
import typings.strtok3.readStreamTokenizerMod.ReadStreamTokenizer
import typings.strtok3.typesMod.IFileInfo
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object coreMod {
  
  @JSImport("strtok3/lib/core", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("strtok3/lib/core", "EndOfStreamError")
  @js.native
  open class EndOfStreamError ()
    extends typings.peekReadable.mod.EndOfStreamError
  
  inline def fromBuffer(uint8Array: js.typedarray.Uint8Array): BufferTokenizer = ^.asInstanceOf[js.Dynamic].applyDynamic("fromBuffer")(uint8Array.asInstanceOf[js.Any]).asInstanceOf[BufferTokenizer]
  inline def fromBuffer(uint8Array: js.typedarray.Uint8Array, fileInfo: IFileInfo): BufferTokenizer = (^.asInstanceOf[js.Dynamic].applyDynamic("fromBuffer")(uint8Array.asInstanceOf[js.Any], fileInfo.asInstanceOf[js.Any])).asInstanceOf[BufferTokenizer]
  
  inline def fromStream(stream: Readable): ReadStreamTokenizer = ^.asInstanceOf[js.Dynamic].applyDynamic("fromStream")(stream.asInstanceOf[js.Any]).asInstanceOf[ReadStreamTokenizer]
  inline def fromStream(stream: Readable, fileInfo: IFileInfo): ReadStreamTokenizer = (^.asInstanceOf[js.Dynamic].applyDynamic("fromStream")(stream.asInstanceOf[js.Any], fileInfo.asInstanceOf[js.Any])).asInstanceOf[ReadStreamTokenizer]
}
