package typings.tensorflowTfjsData.typesMod

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait CSVConfig extends js.Object {
  
  /**
    * A dictionary whose key is column names, value is an object stating if this
    * column is required, column's data type, default value, and if this column
    * is label. If provided, keys must correspond to names provided in
    * `columnNames` or inferred from the file header lines. If any column is
    * marked as label, the .csv() API will return an array of two items: the
    * first item is a dict of features key/value pairs, the second item is a dict
    * of labels key/value pairs. If no column is marked as label returns a dict
    * of features only.
    *
    * Has the following fields:
    * - `required` If value in this column is required. If set to `true`, throw
    * an error when it finds an empty value.
    *
    * - `dtype` Data type of this column. Could be int32, float32, bool, or
    * string.
    *
    * - `default` Default value of this column.
    *
    * - `isLabel` Whether this column is label instead of features. If isLabel is
    * `true` for at least one column, the element in returned `CSVDataset` will
    * be an object of {xs: features, ys: labels}: xs is a dict of features
    * key/value pairs, ys is a dict of labels key/value pairs. If no column is
    * marked as label, returns a dict of features only.
    */
  var columnConfigs: js.UndefOr[StringDictionary[ColumnConfig]] = js.native
  
  /**
    * A list of strings that corresponds to the CSV column names, in order. If
    * provided, it ignores the column names inferred from the header row. If not
    * provided, infers the column names from the first row of the records. If
    * `hasHeader` is false and `columnNames` is not provided, this method will
    * throw an error.
    */
  var columnNames: js.UndefOr[js.Array[String]] = js.native
  
  /**
    * If true, only columns provided in `columnConfigs` will be parsed and
    * provided during iteration.
    */
  var configuredColumnsOnly: js.UndefOr[Boolean] = js.native
  
  /**
    * If true, delimiter field should be null. Parsing delimiter is whitespace
    * and treat continuous multiple whitespace as one delimiter.
    */
  var delimWhitespace: js.UndefOr[Boolean] = js.native
  
  /**
    * The string used to parse each line of the input file.
    */
  var delimiter: js.UndefOr[String] = js.native
  
  /**
    * A boolean value that indicates whether the first row of provided CSV file
    * is a header line with column names, and should not be included in the data.
    */
  var hasHeader: js.UndefOr[Boolean] = js.native
}
object CSVConfig {
  
  @scala.inline
  def apply(): CSVConfig = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CSVConfig]
  }
  
  @scala.inline
  implicit class CSVConfigOps[Self <: CSVConfig] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setColumnConfigs(value: StringDictionary[ColumnConfig]): Self = this.set("columnConfigs", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteColumnConfigs: Self = this.set("columnConfigs", js.undefined)
    
    @scala.inline
    def setColumnNamesVarargs(value: String*): Self = this.set("columnNames", js.Array(value :_*))
    
    @scala.inline
    def setColumnNames(value: js.Array[String]): Self = this.set("columnNames", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteColumnNames: Self = this.set("columnNames", js.undefined)
    
    @scala.inline
    def setConfiguredColumnsOnly(value: Boolean): Self = this.set("configuredColumnsOnly", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteConfiguredColumnsOnly: Self = this.set("configuredColumnsOnly", js.undefined)
    
    @scala.inline
    def setDelimWhitespace(value: Boolean): Self = this.set("delimWhitespace", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDelimWhitespace: Self = this.set("delimWhitespace", js.undefined)
    
    @scala.inline
    def setDelimiter(value: String): Self = this.set("delimiter", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDelimiter: Self = this.set("delimiter", js.undefined)
    
    @scala.inline
    def setHasHeader(value: Boolean): Self = this.set("hasHeader", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteHasHeader: Self = this.set("hasHeader", js.undefined)
  }
}
