package typings.watsonDeveloperCloud.v1GeneratedMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** TestDocument. */
trait TestDocument extends StObject {
  
  /** The unique identifier for the configuration. */
  var configuration_id: js.UndefOr[String] = js.undefined
  
  /** The number of 10-kB chunks of field data that were enriched. This can be used to estimate the cost of running a real ingestion. */
  var enriched_field_units: js.UndefOr[Double] = js.undefined
  
  /** An array of notice messages about the preview operation. */
  var notices: js.UndefOr[js.Array[Notice]] = js.undefined
  
  /** Format of the test document. */
  var original_media_type: js.UndefOr[String] = js.undefined
  
  /** An array of objects that describe each step in the preview process. */
  var snapshots: js.UndefOr[js.Array[DocumentSnapshot]] = js.undefined
  
  /** Status of the preview operation. */
  var status: js.UndefOr[String] = js.undefined
}
object TestDocument {
  
  @scala.inline
  def apply(): TestDocument = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[TestDocument]
  }
  
  @scala.inline
  implicit class TestDocumentMutableBuilder[Self <: TestDocument] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setConfiguration_id(value: String): Self = StObject.set(x, "configuration_id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setConfiguration_idUndefined: Self = StObject.set(x, "configuration_id", js.undefined)
    
    @scala.inline
    def setEnriched_field_units(value: Double): Self = StObject.set(x, "enriched_field_units", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEnriched_field_unitsUndefined: Self = StObject.set(x, "enriched_field_units", js.undefined)
    
    @scala.inline
    def setNotices(value: js.Array[Notice]): Self = StObject.set(x, "notices", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNoticesUndefined: Self = StObject.set(x, "notices", js.undefined)
    
    @scala.inline
    def setNoticesVarargs(value: Notice*): Self = StObject.set(x, "notices", js.Array(value :_*))
    
    @scala.inline
    def setOriginal_media_type(value: String): Self = StObject.set(x, "original_media_type", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOriginal_media_typeUndefined: Self = StObject.set(x, "original_media_type", js.undefined)
    
    @scala.inline
    def setSnapshots(value: js.Array[DocumentSnapshot]): Self = StObject.set(x, "snapshots", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSnapshotsUndefined: Self = StObject.set(x, "snapshots", js.undefined)
    
    @scala.inline
    def setSnapshotsVarargs(value: DocumentSnapshot*): Self = StObject.set(x, "snapshots", js.Array(value :_*))
    
    @scala.inline
    def setStatus(value: String): Self = StObject.set(x, "status", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStatusUndefined: Self = StObject.set(x, "status", js.undefined)
  }
}
