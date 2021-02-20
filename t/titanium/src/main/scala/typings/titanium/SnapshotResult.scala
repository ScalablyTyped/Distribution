package typings.titanium

import typings.titanium.Titanium.Blob
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * The parameter passed to the <Titanium.UI.WebView.takeSnapshot> callback.
  */
@js.native
trait SnapshotResult extends StObject {
  
  /**
    * Error message, if any returned.
    */
  var error: js.UndefOr[String] = js.native
  
  /**
    * The snapshot image.
    */
  var snapshot: js.UndefOr[Blob] = js.native
  
  /**
    * Indicates if the snapshot taken.
    */
  var success: js.UndefOr[Boolean] = js.native
}
object SnapshotResult {
  
  @scala.inline
  def apply(): SnapshotResult = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SnapshotResult]
  }
  
  @scala.inline
  implicit class SnapshotResultMutableBuilder[Self <: SnapshotResult] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setError(value: String): Self = StObject.set(x, "error", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setErrorUndefined: Self = StObject.set(x, "error", js.undefined)
    
    @scala.inline
    def setSnapshot(value: Blob): Self = StObject.set(x, "snapshot", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSnapshotUndefined: Self = StObject.set(x, "snapshot", js.undefined)
    
    @scala.inline
    def setSuccess(value: Boolean): Self = StObject.set(x, "success", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSuccessUndefined: Self = StObject.set(x, "success", js.undefined)
  }
}
