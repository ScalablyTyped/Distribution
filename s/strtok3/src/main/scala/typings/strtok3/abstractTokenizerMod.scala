package typings.strtok3

import typings.std.Uint8Array
import typings.strtok3.typesMod.IFileInfo
import typings.strtok3.typesMod.IReadChunkOptions
import typings.strtok3.typesMod.ITokenizer
import typings.tokenizerToken.mod.IToken
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object abstractTokenizerMod {
  
  @JSImport("strtok3/lib/AbstractTokenizer", "AbstractTokenizer")
  @js.native
  abstract class AbstractTokenizer protected () extends ITokenizer {
    protected def this(fileInfo: IFileInfo) = this()
    
    var numBuffer: js.Any = js.native
    
    def peekBuffer(buffer: Uint8Array): js.Promise[Double] = js.native
    def peekBuffer(buffer: Uint8Array, options: IReadChunkOptions): js.Promise[Double] = js.native
    
    /**
      * Read a numeric token from the stream
      * @param token - Numeric token
      * @returns Promise with number
      */
    def peekNumber(token: IToken[Double]): js.Promise[Double] = js.native
    
    def readBuffer(buffer: Uint8Array): js.Promise[Double] = js.native
    def readBuffer(buffer: Uint8Array, options: IReadChunkOptions): js.Promise[Double] = js.native
    
    /**
      * Read a numeric token from the stream
      * @param token - Numeric token
      * @returns Promise with number
      */
    def readNumber(token: IToken[Double]): js.Promise[Double] = js.native
  }
}
