package typings.watsonDeveloperCloud.discoveryV1GeneratedMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** DocumentSnapshot. */
trait DocumentSnapshot extends StObject {
  
  /** Snapshot of the conversion. */
  var snapshot: js.UndefOr[js.Object] = js.undefined
  
  /** The step in the document conversion process that the snapshot object represents. */
  var step: js.UndefOr[String] = js.undefined
}
object DocumentSnapshot {
  
  inline def apply(): DocumentSnapshot = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DocumentSnapshot]
  }
  
  extension [Self <: DocumentSnapshot](x: Self) {
    
    inline def setSnapshot(value: js.Object): Self = StObject.set(x, "snapshot", value.asInstanceOf[js.Any])
    
    inline def setSnapshotUndefined: Self = StObject.set(x, "snapshot", js.undefined)
    
    inline def setStep(value: String): Self = StObject.set(x, "step", value.asInstanceOf[js.Any])
    
    inline def setStepUndefined: Self = StObject.set(x, "step", js.undefined)
  }
}
