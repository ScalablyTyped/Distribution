package typings.strtok3

import typings.node.Buffer
import typings.tokenizerToken.mod.IGetToken
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object typesMod {
  
  @js.native
  trait IFileInfo extends StObject {
    
    /**
      * MIME-type of file
      */
    var mimeType: js.UndefOr[String] = js.native
    
    /**
      * File path
      */
    var path: js.UndefOr[String] = js.native
    
    /**
      * File size in bytes
      */
    var size: js.UndefOr[Double] = js.native
    
    /**
      * File URL
      */
    var url: js.UndefOr[String] = js.native
  }
  object IFileInfo {
    
    @scala.inline
    def apply(): IFileInfo = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[IFileInfo]
    }
    
    @scala.inline
    implicit class IFileInfoMutableBuilder[Self <: IFileInfo] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setMimeType(value: String): Self = StObject.set(x, "mimeType", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMimeTypeUndefined: Self = StObject.set(x, "mimeType", js.undefined)
      
      @scala.inline
      def setPath(value: String): Self = StObject.set(x, "path", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPathUndefined: Self = StObject.set(x, "path", js.undefined)
      
      @scala.inline
      def setSize(value: Double): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSizeUndefined: Self = StObject.set(x, "size", js.undefined)
      
      @scala.inline
      def setUrl(value: String): Self = StObject.set(x, "url", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setUrlUndefined: Self = StObject.set(x, "url", js.undefined)
    }
  }
  
  @js.native
  trait IReadChunkOptions extends StObject {
    
    /**
      * Number of bytes to read.
      */
    var length: js.UndefOr[Double] = js.native
    
    /**
      * If set, will not throw an EOF error if not all of the requested data could be read
      */
    var mayBeLess: js.UndefOr[Boolean] = js.native
    
    /**
      * The offset in the buffer to start writing at; default is 0
      */
    var offset: js.UndefOr[Double] = js.native
    
    /**
      * Position where to begin reading from the file.
      * Default it is `tokenizer.position`.
      * Position may not be less then `tokenizer.position`.
      */
    var position: js.UndefOr[Double] = js.native
  }
  object IReadChunkOptions {
    
    @scala.inline
    def apply(): IReadChunkOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[IReadChunkOptions]
    }
    
    @scala.inline
    implicit class IReadChunkOptionsMutableBuilder[Self <: IReadChunkOptions] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setLength(value: Double): Self = StObject.set(x, "length", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLengthUndefined: Self = StObject.set(x, "length", js.undefined)
      
      @scala.inline
      def setMayBeLess(value: Boolean): Self = StObject.set(x, "mayBeLess", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMayBeLessUndefined: Self = StObject.set(x, "mayBeLess", js.undefined)
      
      @scala.inline
      def setOffset(value: Double): Self = StObject.set(x, "offset", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOffsetUndefined: Self = StObject.set(x, "offset", js.undefined)
      
      @scala.inline
      def setPosition(value: Double): Self = StObject.set(x, "position", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPositionUndefined: Self = StObject.set(x, "position", js.undefined)
    }
  }
  
  @js.native
  trait ITokenizer extends StObject {
    
    /**
      * Clean up resources.
      * It does not close the stream for StreamReader, but is does close the file-descriptor.
      */
    def close(): js.Promise[Unit] = js.native
    
    /**
      * Provide access to information of the underlying information stream or file.
      */
    var fileInfo: IFileInfo = js.native
    
    /**
      * Ignore given number of bytes
      * @param length - Number of bytes ignored
      */
    def ignore(length: Double): js.Promise[Double] = js.native
    
    /**
      * Peek (read ahead) buffer from tokenizer
      * @param buffer - Target buffer to fill with data peek from the tokenizer-stream
      * @param options - Read behaviour options
      * @returns Promise with number of bytes read
      */
    def peekBuffer(buffer: Buffer): js.Promise[Double] = js.native
    def peekBuffer(buffer: Buffer, options: IReadChunkOptions): js.Promise[Double] = js.native
    
    /**
      * Peek a numeric token from the stream
      * @param token - Numeric token
      * @returns Promise with number
      */
    def peekNumber(token: IGetToken[Double]): js.Promise[Double] = js.native
    
    /**
      * Peek a token from the tokenizer-stream.
      * @param token - Token to peek from the tokenizer-stream.
      * @param position - Offset where to begin reading within the file. If position is null, data will be read from the current file position.
      * @param maybeless - If set, will not throw an EOF error if the less then the requested length could be read.
      */
    def peekToken[T](token: IGetToken[T]): js.Promise[T] = js.native
    def peekToken[T](token: IGetToken[T], position: js.UndefOr[scala.Nothing], maybeless: Boolean): js.Promise[T] = js.native
    def peekToken[T](token: IGetToken[T], position: Double): js.Promise[T] = js.native
    def peekToken[T](token: IGetToken[T], position: Double, maybeless: Boolean): js.Promise[T] = js.native
    def peekToken[T](token: IGetToken[T], position: Null, maybeless: Boolean): js.Promise[T] = js.native
    
    /**
      * Offset in bytes (= number of bytes read) since beginning of file or stream
      */
    var position: Double = js.native
    
    /**
      * Peek (read ahead) buffer from tokenizer
      * @param buffer - Target buffer to fill with data peeked from the tokenizer-stream
      * @param options - Additional read options
      * @returns Promise with number of bytes read
      */
    def readBuffer(buffer: Buffer): js.Promise[Double] = js.native
    def readBuffer(buffer: Buffer, options: IReadChunkOptions): js.Promise[Double] = js.native
    
    /**
      * Read a numeric token from the stream
      * @param token - Numeric token
      * @returns Promise with number
      */
    def readNumber(token: IGetToken[Double]): js.Promise[Double] = js.native
    
    /**
      * Read a token from the tokenizer-stream.
      * @param token - Token to peek from the tokenizer-stream.
      * @param position - Offset where to begin reading within the file. If position is null, data will be read from the current file position.
      */
    def readToken[T](token: IGetToken[T]): js.Promise[T] = js.native
    def readToken[T](token: IGetToken[T], position: Double): js.Promise[T] = js.native
  }
}
