package typings.tensorflowTfjsData

import typings.tensorflowTfjsCore.tensorTypesMod.TensorContainer
import typings.tensorflowTfjsData.datasetMod.Dataset
import typings.tensorflowTfjsData.datasourceMod.DataSource
import typings.tensorflowTfjsData.textLineDatasetMod.TextLineDataset
import typings.tensorflowTfjsData.typesMod.CSVConfig
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@tensorflow/tfjs-data/dist/datasets/csv_dataset", JSImport.Namespace)
@js.native
object csvDatasetMod extends js.Object {
  @js.native
  class CSVDataset protected () extends Dataset[TensorContainer] {
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
    def this(input: DataSource) = this()
    def this(input: DataSource, csvConfig: CSVConfig) = this()
    var base: TextLineDataset = js.native
    var columnConfigs: js.Any = js.native
    var columnNamesValidated: js.Any = js.native
    var configuredColumnsOnly: js.Any = js.native
    var delimWhitespace: js.Any = js.native
    var delimiter: js.Any = js.native
    var fullColumnNames: js.Any = js.native
    var getBoolean: js.Any = js.native
    var hasHeader: js.Any = js.native
    val input: DataSource = js.native
    var maybeReadHeaderLine: js.Any = js.native
    var parseRow: js.Any = js.native
    var setColumnNames: js.Any = js.native
    /**
      * Returns column names of the csv dataset. If `configuredColumnsOnly` is
      * true, return column names in `columnConfigs`. If `configuredColumnsOnly` is
      * false and `columnNames` is provided, `columnNames`. If
      * `configuredColumnsOnly` is false and `columnNames` is not provided, return
      * all column names parsed from the csv file. For example usage please go to
      * `tf.data.csv`.
      */
    /** @doc {heading: 'Data', subheading: 'Classes'} */
    def columnNames(): js.Promise[js.Array[String]] = js.native
    def makeDataElement(line: String): TensorContainer = js.native
  }
  
}

