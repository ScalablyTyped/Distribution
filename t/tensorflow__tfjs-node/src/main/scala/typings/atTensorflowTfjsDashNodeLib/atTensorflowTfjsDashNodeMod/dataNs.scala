package typings
package atTensorflowTfjsDashNodeLib.atTensorflowTfjsDashNodeMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@tensorflow/tfjs-node", "data")
@js.native
object dataNs extends js.Object {
  @js.native
  class CSVDataset protected ()
    extends atTensorflowTfjsLib.atTensorflowTfjsMod.dataNs.CSVDataset {
    /**
      * Create a `CSVDataset`.
      *
      * @param input A `DataSource` providing a chunked, UTF8-encoded byte stream.
      * @param csvConfig (Optional) A CSVConfig object that contains configurations
      *     of reading and decoding from CSV file(s).
      *
      *     hasHeader: (Optional) A boolean value that indicates whether the first
      *     row of provided CSV file is a header line with column names, and should
      *     not be included in the data. Defaults to `true`.
      *
      *     columnNames: (Optional) A list of strings that corresponds to
      *     the CSV column names, in order. If provided, it ignores the column
      *     names inferred from the header row. If not provided, infers the column
      *     names from the first row of the records. If hasHeader is false and
      *     columnNames is not provided, this method throws an error.
      *
      *     columnConfigs: (Optional) A dictionary whose key is column names, value
      *     is an object stating if this column is required, column's data type,
      *     default value, and if this column is label. If provided, keys must
      *     correspond to names provided in columnNames or inferred from the file
      *     header lines. If isLabel is true any column, returns an array of two
      *     items: the first item is a dict of features key/value pairs, the second
      *     item is a dict of labels key/value pairs. If no feature is marked as
      *     label, returns a dict of features only.
      *
      *     configuredColumnsOnly (Optional) If true, only columns provided in
      *     columnConfigs will be parsed and provided during iteration.
      *
      *     delimiter (Optional) The string used to parse each line of the input
      *     file. Defaults to `,`.
      */
    def this(input: atTensorflowTfjsDashDataLib.distDatasourceMod.DataSource) = this()
    def this(input: atTensorflowTfjsDashDataLib.distDatasourceMod.DataSource, csvConfig: atTensorflowTfjsDashDataLib.distTypesMod.CSVConfig) = this()
  }
  
  @js.native
  abstract class Dataset[T /* <: atTensorflowTfjsDashCoreLib.distTensorUnderscoreTypesMod.TensorContainer */] ()
    extends atTensorflowTfjsLib.atTensorflowTfjsMod.dataNs.Dataset[T]
  
  @js.native
  class FileDataSource protected ()
    extends atTensorflowTfjsLib.atTensorflowTfjsMod.dataNs.FileDataSource {
    /**
      * Create a `FileDataSource`.
      *
      * @param input Local file path, or `File`/`Blob`/`Uint8Array` object to
      *     read. Local file only works in node environment.
      * @param options Options passed to the underlying `FileChunkIterator`s,
      *   such as {chunksize: 1024}.
      */
    def this(input: atTensorflowTfjsDashDataLib.distTypesMod.FileElement) = this()
    def this(input: java.lang.String) = this()
    def this(input: atTensorflowTfjsDashDataLib.distTypesMod.FileElement, options: atTensorflowTfjsDashDataLib.distIteratorsFileUnderscoreChunkUnderscoreIteratorMod.FileChunkIteratorOptions) = this()
    def this(input: java.lang.String, options: atTensorflowTfjsDashDataLib.distIteratorsFileUnderscoreChunkUnderscoreIteratorMod.FileChunkIteratorOptions) = this()
  }
  
  @js.native
  class TextLineDataset protected ()
    extends atTensorflowTfjsLib.atTensorflowTfjsMod.dataNs.TextLineDataset {
    /**
      * Create a `TextLineDataset`.
      *
      * @param input A `DataSource` providing a chunked, UTF8-encoded byte stream.
      */
    def this(input: atTensorflowTfjsDashDataLib.distDatasourceMod.DataSource) = this()
  }
  
  @js.native
  class URLDataSource protected ()
    extends atTensorflowTfjsLib.atTensorflowTfjsMod.dataNs.URLDataSource {
    /**
      * Create a `URLDataSource`.
      *
      * @param url A source URL string, or a `Request` object.
      * @param options Options passed to the underlying `FileChunkIterator`s,
      *   such as {chunksize: 1024}.
      */
    def this(url: stdLib.RequestInfo) = this()
    def this(url: stdLib.RequestInfo, fileOptions: atTensorflowTfjsDashDataLib.distIteratorsFileUnderscoreChunkUnderscoreIteratorMod.FileChunkIteratorOptions) = this()
  }
  
  val version_data: atTensorflowTfjsDashNodeLib.atTensorflowTfjsDashNodeLibStrings.`1DOT2DOT5` = js.native
  def array[T /* <: atTensorflowTfjsDashCoreLib.distTensorUnderscoreTypesMod.TensorContainer */](items: js.Array[T]): atTensorflowTfjsDashDataLib.distDatasetMod.Dataset[T] = js.native
  def csv(source: stdLib.RequestInfo): atTensorflowTfjsDashDataLib.distDatasetsCsvUnderscoreDatasetMod.CSVDataset = js.native
  def csv(source: stdLib.RequestInfo, csvConfig: atTensorflowTfjsDashDataLib.distTypesMod.CSVConfig): atTensorflowTfjsDashDataLib.distDatasetsCsvUnderscoreDatasetMod.CSVDataset = js.native
  def func[T /* <: atTensorflowTfjsDashCoreLib.distTensorUnderscoreTypesMod.TensorContainer */](f: js.Function0[stdLib.IteratorResult[T] | js.Promise[stdLib.IteratorResult[T]]]): atTensorflowTfjsDashDataLib.distDatasetMod.Dataset[T] = js.native
  def generator[T /* <: atTensorflowTfjsDashCoreLib.distTensorUnderscoreTypesMod.TensorContainer */](generator: js.Function0[stdLib.Iterator[T] | js.Promise[stdLib.Iterator[T]]]): atTensorflowTfjsDashDataLib.distDatasetMod.Dataset[T] = js.native
  def microphone(): js.Promise[
    atTensorflowTfjsDashDataLib.distIteratorsMicrophoneUnderscoreIteratorMod.MicrophoneIterator
  ] = js.native
  def microphone(microphoneConfig: atTensorflowTfjsDashDataLib.distTypesMod.MicrophoneConfig): js.Promise[
    atTensorflowTfjsDashDataLib.distIteratorsMicrophoneUnderscoreIteratorMod.MicrophoneIterator
  ] = js.native
  def webcam(): js.Promise[
    atTensorflowTfjsDashDataLib.distIteratorsWebcamUnderscoreIteratorMod.WebcamIterator
  ] = js.native
  def webcam(webcamVideoElement: stdLib.HTMLVideoElement): js.Promise[
    atTensorflowTfjsDashDataLib.distIteratorsWebcamUnderscoreIteratorMod.WebcamIterator
  ] = js.native
  def webcam(
    webcamVideoElement: stdLib.HTMLVideoElement,
    webcamConfig: atTensorflowTfjsDashDataLib.distTypesMod.WebcamConfig
  ): js.Promise[
    atTensorflowTfjsDashDataLib.distIteratorsWebcamUnderscoreIteratorMod.WebcamIterator
  ] = js.native
  def zip[O /* <: atTensorflowTfjsDashCoreLib.distTensorUnderscoreTypesMod.TensorContainer */](datasets: atTensorflowTfjsDashDataLib.distTypesMod.DatasetContainer): atTensorflowTfjsDashDataLib.distDatasetMod.Dataset[O] = js.native
  /* static members */
  @js.native
  object Dataset extends js.Object {
    val MAX_BUFFER_SIZE: atTensorflowTfjsDashNodeLib.atTensorflowTfjsDashNodeLibNumbers.`10000` = js.native
  }
  
}

