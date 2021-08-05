package typings.strtok3

import typings.node.Buffer
import typings.std.Uint8Array
import typings.strtok3.typesMod.IFileInfo
import typings.strtok3.typesMod.IReadChunkOptions
import typings.strtok3.typesMod.ITokenizer
import typings.tokenizerToken.mod.IToken
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object bufferTokenizerMod {
  
  @JSImport("strtok3/lib/BufferTokenizer", "BufferTokenizer")
  @js.native
  class BufferTokenizer protected ()
    extends StObject
       with ITokenizer {
    /**
      * Construct BufferTokenizer
      * @param buffer - Buffer to tokenize
      * @param fileInfo - Pass additional file information to the tokenizer
      */
    def this(buffer: Buffer) = this()
    def this(buffer: Buffer, fileInfo: IFileInfo) = this()
    
    /* private */ var buffer: js.Any = js.native
    
    def peekBuffer(buffer: Uint8Array): js.Promise[Double] = js.native
    def peekBuffer(buffer: Uint8Array, options: IReadChunkOptions): js.Promise[Double] = js.native
    
    def peekNumber(token: IToken[Double]): js.Promise[Double] = js.native
    
    def readBuffer(buffer: Uint8Array): js.Promise[Double] = js.native
    def readBuffer(buffer: Uint8Array, options: IReadChunkOptions): js.Promise[Double] = js.native
    
    def readNumber(token: IToken[Double]): js.Promise[Double] = js.native
  }
}
