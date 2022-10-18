package typings.strtok3

import typings.strtok3.libTypesMod.IFileInfo
import typings.strtok3.libTypesMod.IReadChunkOptions
import typings.strtok3.libTypesMod.ITokenizer
import typings.tokenizerToken.mod.IToken
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libAbstractTokenizerMod {
  
  /* note: abstract class */ @JSImport("strtok3/lib/AbstractTokenizer", "AbstractTokenizer")
  @js.native
  /* protected */ open class AbstractTokenizer ()
    extends StObject
       with ITokenizer {
    /* protected */ def this(fileInfo: IFileInfo) = this()
    
    /* protected */ def normalizeOptions(uint8Array: js.typedarray.Uint8Array): INormalizedReadChunkOptions = js.native
    /* protected */ def normalizeOptions(uint8Array: js.typedarray.Uint8Array, options: IReadChunkOptions): INormalizedReadChunkOptions = js.native
    
    /* private */ var numBuffer: Any = js.native
    
    /**
      * Peek (read ahead) buffer from tokenizer
      * @param uint8Array- Target buffer to fill with data peek from the tokenizer-stream
      * @param options - Peek behaviour options
      * @returns Promise with number of bytes read
      */
    def peekBuffer(uint8Array: js.typedarray.Uint8Array): js.Promise[Double] = js.native
    def peekBuffer(uint8Array: js.typedarray.Uint8Array, options: IReadChunkOptions): js.Promise[Double] = js.native
    
    /**
      * Read a numeric token from the stream
      * @param token - Numeric token
      * @returns Promise with number
      */
    def peekNumber(token: IToken[Double, js.typedarray.Uint8Array]): js.Promise[Double] = js.native
    
    /**
      * Read buffer from tokenizer
      * @param buffer - Target buffer to fill with data read from the tokenizer-stream
      * @param options - Additional read options
      * @returns Promise with number of bytes read
      */
    def readBuffer(buffer: js.typedarray.Uint8Array): js.Promise[Double] = js.native
    def readBuffer(buffer: js.typedarray.Uint8Array, options: IReadChunkOptions): js.Promise[Double] = js.native
    
    /**
      * Read a numeric token from the stream
      * @param token - Numeric token
      * @returns Promise with number
      */
    def readNumber(token: IToken[Double, js.typedarray.Uint8Array]): js.Promise[Double] = js.native
  }
  
  trait INormalizedReadChunkOptions
    extends StObject
       with IReadChunkOptions {
    
    @JSName("length")
    var length_INormalizedReadChunkOptions: Double
    
    @JSName("offset")
    var offset_INormalizedReadChunkOptions: Double
    
    @JSName("position")
    var position_INormalizedReadChunkOptions: Double
  }
  object INormalizedReadChunkOptions {
    
    inline def apply(length: Double, offset: Double, position: Double): INormalizedReadChunkOptions = {
      val __obj = js.Dynamic.literal(length = length.asInstanceOf[js.Any], offset = offset.asInstanceOf[js.Any], position = position.asInstanceOf[js.Any])
      __obj.asInstanceOf[INormalizedReadChunkOptions]
    }
    
    extension [Self <: INormalizedReadChunkOptions](x: Self) {
      
      inline def setLength(value: Double): Self = StObject.set(x, "length", value.asInstanceOf[js.Any])
      
      inline def setOffset(value: Double): Self = StObject.set(x, "offset", value.asInstanceOf[js.Any])
      
      inline def setPosition(value: Double): Self = StObject.set(x, "position", value.asInstanceOf[js.Any])
    }
  }
}
