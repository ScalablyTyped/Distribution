package typings.strtok3.typesMod

import typings.node.Buffer
import typings.tokenizerToken.mod.IGetToken
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ITokenizer extends js.Object {
  /**
    * Provide access to information of the underlying information stream or file.
    */
  var fileInfo: IFileInfo = js.native
  /**
    * Offset in bytes (= number of bytes read) since beginning of file or stream
    */
  var position: Double = js.native
  /**
    * Clean up resources.
    * It does not close the stream for StreamReader, but is does close the file-descriptor.
    */
  def close(): js.Promise[Unit] = js.native
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

