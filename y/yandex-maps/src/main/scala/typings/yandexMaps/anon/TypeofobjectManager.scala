package typings.yandexMaps.anon

import org.scalablytyped.runtime.Instantiable0
import typings.yandexMaps.mod.objectManager.ClusterCollection
import typings.yandexMaps.mod.objectManager.ObjectCollection
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TypeofobjectManager extends StObject {
  
  var Balloon: Instantiable0[typings.yandexMaps.anon.Balloon]
  
  var ClusterCollection: Instantiable0[typings.yandexMaps.mod.objectManager.ClusterCollection]
  
  var Hint: Instantiable0[typings.yandexMaps.anon.Hint]
  
  var ObjectCollection: Instantiable0[typings.yandexMaps.mod.objectManager.ObjectCollection]
}
object TypeofobjectManager {
  
  inline def apply(
    Balloon: Instantiable0[Balloon],
    ClusterCollection: Instantiable0[ClusterCollection],
    Hint: Instantiable0[Hint],
    ObjectCollection: Instantiable0[ObjectCollection]
  ): TypeofobjectManager = {
    val __obj = js.Dynamic.literal(Balloon = Balloon.asInstanceOf[js.Any], ClusterCollection = ClusterCollection.asInstanceOf[js.Any], Hint = Hint.asInstanceOf[js.Any], ObjectCollection = ObjectCollection.asInstanceOf[js.Any])
    __obj.asInstanceOf[TypeofobjectManager]
  }
  
  extension [Self <: TypeofobjectManager](x: Self) {
    
    inline def setBalloon(value: Instantiable0[Balloon]): Self = StObject.set(x, "Balloon", value.asInstanceOf[js.Any])
    
    inline def setClusterCollection(value: Instantiable0[ClusterCollection]): Self = StObject.set(x, "ClusterCollection", value.asInstanceOf[js.Any])
    
    inline def setHint(value: Instantiable0[Hint]): Self = StObject.set(x, "Hint", value.asInstanceOf[js.Any])
    
    inline def setObjectCollection(value: Instantiable0[ObjectCollection]): Self = StObject.set(x, "ObjectCollection", value.asInstanceOf[js.Any])
  }
}
