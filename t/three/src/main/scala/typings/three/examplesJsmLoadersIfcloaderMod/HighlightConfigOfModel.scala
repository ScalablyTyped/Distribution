package typings.three.examplesJsmLoadersIfcloaderMod

import typings.three.srcCoreEventDispatcherMod.Event
import typings.three.srcThreeMod.Object3D
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait HighlightConfigOfModel
  extends StObject
     with HighlightConfig {
  
  var modelID: Double
}
object HighlightConfigOfModel {
  
  inline def apply(ids: js.Array[Double], modelID: Double, removePrevious: Boolean, scene: Object3D[Event]): HighlightConfigOfModel = {
    val __obj = js.Dynamic.literal(ids = ids.asInstanceOf[js.Any], modelID = modelID.asInstanceOf[js.Any], removePrevious = removePrevious.asInstanceOf[js.Any], scene = scene.asInstanceOf[js.Any])
    __obj.asInstanceOf[HighlightConfigOfModel]
  }
  
  extension [Self <: HighlightConfigOfModel](x: Self) {
    
    inline def setModelID(value: Double): Self = StObject.set(x, "modelID", value.asInstanceOf[js.Any])
  }
}
