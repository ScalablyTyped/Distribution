package typings.watsonDeveloperCloud.compareComplyV1Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** The results of a successful `GET /v1/batches` request. */
@js.native
trait Batches extends StObject {
  
  /** A list of the status of all batch requests. */
  var batches: js.UndefOr[js.Array[BatchStatus]] = js.native
}
object Batches {
  
  @scala.inline
  def apply(): Batches = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Batches]
  }
  
  @scala.inline
  implicit class BatchesMutableBuilder[Self <: Batches] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setBatches(value: js.Array[BatchStatus]): Self = StObject.set(x, "batches", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBatchesUndefined: Self = StObject.set(x, "batches", js.undefined)
    
    @scala.inline
    def setBatchesVarargs(value: BatchStatus*): Self = StObject.set(x, "batches", js.Array(value :_*))
  }
}
