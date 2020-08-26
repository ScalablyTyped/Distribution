package typings.watsonDeveloperCloud.compareComplyV1Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** The analysis of the document's tables. */
@js.native
trait TableReturn extends js.Object {
  /** Information about the parsed input document. */
  var document: js.UndefOr[DocInfo] = js.native
  /** The ID of the model used to extract the table contents. The value for table extraction is `tables`. */
  var model_id: js.UndefOr[String] = js.native
  /** The version of the `tables` model ID. */
  var model_version: js.UndefOr[String] = js.native
  /** Definitions of the tables identified in the input document. */
  var tables: js.UndefOr[js.Array[Tables]] = js.native
}

object TableReturn {
  @scala.inline
  def apply(): TableReturn = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[TableReturn]
  }
  @scala.inline
  implicit class TableReturnOps[Self <: TableReturn] (val x: Self) extends AnyVal {
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
    def setDocument(value: DocInfo): Self = this.set("document", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDocument: Self = this.set("document", js.undefined)
    @scala.inline
    def setModel_id(value: String): Self = this.set("model_id", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteModel_id: Self = this.set("model_id", js.undefined)
    @scala.inline
    def setModel_version(value: String): Self = this.set("model_version", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteModel_version: Self = this.set("model_version", js.undefined)
    @scala.inline
    def setTablesVarargs(value: Tables*): Self = this.set("tables", js.Array(value :_*))
    @scala.inline
    def setTables(value: js.Array[Tables]): Self = this.set("tables", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTables: Self = this.set("tables", js.undefined)
  }
  
}

