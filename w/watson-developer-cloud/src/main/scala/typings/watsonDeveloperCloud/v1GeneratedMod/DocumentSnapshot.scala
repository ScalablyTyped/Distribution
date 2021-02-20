package typings.watsonDeveloperCloud.v1GeneratedMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** DocumentSnapshot. */
@js.native
trait DocumentSnapshot extends StObject {
  
  /** Snapshot of the conversion. */
  var snapshot: js.UndefOr[js.Object] = js.native
  
  /** The step in the document conversion process that the snapshot object represents. */
  var step: js.UndefOr[String] = js.native
}
object DocumentSnapshot {
  
  @scala.inline
  def apply(): DocumentSnapshot = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DocumentSnapshot]
  }
  
  @scala.inline
  implicit class DocumentSnapshotMutableBuilder[Self <: DocumentSnapshot] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setSnapshot(value: js.Object): Self = StObject.set(x, "snapshot", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSnapshotUndefined: Self = StObject.set(x, "snapshot", js.undefined)
    
    @scala.inline
    def setStep(value: String): Self = StObject.set(x, "step", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStepUndefined: Self = StObject.set(x, "step", js.undefined)
  }
}
