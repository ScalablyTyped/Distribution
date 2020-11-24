package typings.winrt.global.Windows.Storage

import typings.winrt.Windows.Foundation.IAsyncOperationWithProgress
import typings.winrt.Windows.Foundation.Uri
import typings.winrt.Windows.Storage.IStorageFile
import typings.winrt.Windows.Storage.Streams.IBuffer
import typings.winrt.Windows.Storage.Streams.IInputStream
import typings.winrt.Windows.Storage.Streams.IOutputStream
import typings.winrt.Windows.Storage.Streams.IRandomAccessStream
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSGlobal("Windows.Storage.Streams")
@js.native
object Streams extends js.Object {
  
  @js.native
  class Buffer protected ()
    extends typings.winrt.Windows.Storage.Streams.Buffer {
    def this(capacity: Double) = this()
  }
  
  @js.native
  object ByteOrder extends js.Object {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[typings.winrt.Windows.Storage.Streams.ByteOrder with Double] = js.native
    
    /* 1 */ val bigEndian: typings.winrt.Windows.Storage.Streams.ByteOrder.bigEndian with Double = js.native
    
    /* 0 */ val littleEndian: typings.winrt.Windows.Storage.Streams.ByteOrder.littleEndian with Double = js.native
  }
  
  @js.native
  class DataReader protected ()
    extends typings.winrt.Windows.Storage.Streams.DataReader {
    def this(inputStream: IInputStream) = this()
  }
  /* static members */
  @js.native
  object DataReader extends js.Object {
    
    def fromBuffer(buffer: IBuffer): typings.winrt.Windows.Storage.Streams.DataReader = js.native
  }
  
  @js.native
  class DataReaderLoadOperation ()
    extends typings.winrt.Windows.Storage.Streams.DataReaderLoadOperation
  
  @js.native
  class DataWriter ()
    extends typings.winrt.Windows.Storage.Streams.DataWriter {
    def this(outputStream: IOutputStream) = this()
  }
  
  @js.native
  class DataWriterStoreOperation ()
    extends typings.winrt.Windows.Storage.Streams.DataWriterStoreOperation
  
  @js.native
  class FileInputStream ()
    extends typings.winrt.Windows.Storage.Streams.FileInputStream
  
  @js.native
  class FileOutputStream ()
    extends typings.winrt.Windows.Storage.Streams.FileOutputStream
  
  @js.native
  class FileRandomAccessStream ()
    extends typings.winrt.Windows.Storage.Streams.FileRandomAccessStream
  
  @js.native
  class InMemoryRandomAccessStream ()
    extends typings.winrt.Windows.Storage.Streams.InMemoryRandomAccessStream
  
  @js.native
  object InputStreamOptions extends js.Object {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[typings.winrt.Windows.Storage.Streams.InputStreamOptions with Double] = js.native
    
    /* 0 */ val none: typings.winrt.Windows.Storage.Streams.InputStreamOptions.none with Double = js.native
    
    /* 1 */ val partial: typings.winrt.Windows.Storage.Streams.InputStreamOptions.partial with Double = js.native
    
    /* 2 */ val readAhead: typings.winrt.Windows.Storage.Streams.InputStreamOptions.readAhead with Double = js.native
  }
  
  @js.native
  class InputStreamOverStream ()
    extends typings.winrt.Windows.Storage.Streams.InputStreamOverStream
  
  @js.native
  class OutputStreamOverStream ()
    extends typings.winrt.Windows.Storage.Streams.OutputStreamOverStream
  
  @js.native
  class RandomAccessStream ()
    extends typings.winrt.Windows.Storage.Streams.RandomAccessStream
  /* static members */
  @js.native
  object RandomAccessStream extends js.Object {
    
    def copyAndCloseAsync(source: IInputStream, destination: IOutputStream): IAsyncOperationWithProgress[Double, Double] = js.native
    
    def copyAsync(source: IInputStream, destination: IOutputStream): IAsyncOperationWithProgress[Double, Double] = js.native
    def copyAsync(source: IInputStream, destination: IOutputStream, bytesToCopy: Double): IAsyncOperationWithProgress[Double, Double] = js.native
  }
  
  @js.native
  class RandomAccessStreamOverStream ()
    extends typings.winrt.Windows.Storage.Streams.RandomAccessStreamOverStream
  
  @js.native
  class RandomAccessStreamReference ()
    extends typings.winrt.Windows.Storage.Streams.RandomAccessStreamReference
  /* static members */
  @js.native
  object RandomAccessStreamReference extends js.Object {
    
    def createFromFile(file: IStorageFile): typings.winrt.Windows.Storage.Streams.RandomAccessStreamReference = js.native
    
    def createFromStream(stream: IRandomAccessStream): typings.winrt.Windows.Storage.Streams.RandomAccessStreamReference = js.native
    
    def createFromUri(uri: Uri): typings.winrt.Windows.Storage.Streams.RandomAccessStreamReference = js.native
  }
  
  @js.native
  object UnicodeEncoding extends js.Object {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[typings.winrt.Windows.Storage.Streams.UnicodeEncoding with Double] = js.native
    
    /* 2 */ val utf16BE: typings.winrt.Windows.Storage.Streams.UnicodeEncoding.utf16BE with Double = js.native
    
    /* 1 */ val utf16LE: typings.winrt.Windows.Storage.Streams.UnicodeEncoding.utf16LE with Double = js.native
    
    /* 0 */ val utf8: typings.winrt.Windows.Storage.Streams.UnicodeEncoding.utf8 with Double = js.native
  }
}
