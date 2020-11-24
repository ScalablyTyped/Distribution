package typings.watsonDeveloperCloud.v1GeneratedMod

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** QueryNoticesResult. */
@js.native
trait QueryNoticesResult
  extends /** DialogNodeOutput accepts additional properties. */
/* propName */ StringDictionary[js.Any] {
  
  /** The internal status code returned by the ingestion subsystem indicating the overall result of ingesting the source document. */
  var code: js.UndefOr[Double] = js.native
  
  /** The collection ID of the collection containing the document for this result. */
  var collection_id: js.UndefOr[String] = js.native
  
  /** The type of the original source file. */
  var file_type: js.UndefOr[String] = js.native
  
  /** Name of the original source file (if available). */
  var filename: js.UndefOr[String] = js.native
  
  /** The unique identifier of the document. */
  var id: js.UndefOr[String] = js.native
  
  /** Metadata of the document. */
  var metadata: js.UndefOr[js.Object] = js.native
  
  /** Array of notices for the document. */
  var notices: js.UndefOr[js.Array[Notice]] = js.native
  
  /** Metadata of a query result. */
  var result_metadata: js.UndefOr[QueryResultMetadata] = js.native
  
  /** The SHA-1 hash of the original source file (formatted as a hexadecimal string). */
  var sha1: js.UndefOr[String] = js.native
  
  /** Automatically extracted result title. */
  var title: js.UndefOr[String] = js.native
}
object QueryNoticesResult {
  
  @scala.inline
  def apply(): QueryNoticesResult = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[QueryNoticesResult]
  }
  
  @scala.inline
  implicit class QueryNoticesResultOps[Self <: QueryNoticesResult] (val x: Self) extends AnyVal {
    
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
    def setCode(value: Double): Self = this.set("code", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCode: Self = this.set("code", js.undefined)
    
    @scala.inline
    def setCollection_id(value: String): Self = this.set("collection_id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCollection_id: Self = this.set("collection_id", js.undefined)
    
    @scala.inline
    def setFile_type(value: String): Self = this.set("file_type", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFile_type: Self = this.set("file_type", js.undefined)
    
    @scala.inline
    def setFilename(value: String): Self = this.set("filename", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFilename: Self = this.set("filename", js.undefined)
    
    @scala.inline
    def setId(value: String): Self = this.set("id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteId: Self = this.set("id", js.undefined)
    
    @scala.inline
    def setMetadata(value: js.Object): Self = this.set("metadata", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMetadata: Self = this.set("metadata", js.undefined)
    
    @scala.inline
    def setNoticesVarargs(value: Notice*): Self = this.set("notices", js.Array(value :_*))
    
    @scala.inline
    def setNotices(value: js.Array[Notice]): Self = this.set("notices", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteNotices: Self = this.set("notices", js.undefined)
    
    @scala.inline
    def setResult_metadata(value: QueryResultMetadata): Self = this.set("result_metadata", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteResult_metadata: Self = this.set("result_metadata", js.undefined)
    
    @scala.inline
    def setSha1(value: String): Self = this.set("sha1", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSha1: Self = this.set("sha1", js.undefined)
    
    @scala.inline
    def setTitle(value: String): Self = this.set("title", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTitle: Self = this.set("title", js.undefined)
  }
}
