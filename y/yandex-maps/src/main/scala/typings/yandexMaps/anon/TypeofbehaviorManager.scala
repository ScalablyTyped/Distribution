package typings.yandexMaps.anon

import org.scalablytyped.runtime.Instantiable3
import typings.yandexMaps.mod.Map_
import typings.yandexMaps.mod.map.behavior.Manager
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TypeofbehaviorManager extends StObject {
  
  var Manager: Instantiable3[
    /* map */ Map_, 
    /* behaviors */ js.UndefOr[js.Array[js.Array[String] | String]], 
    /* options */ js.UndefOr[js.Object], 
    typings.yandexMaps.mod.map.behavior.Manager
  ]
}
object TypeofbehaviorManager {
  
  inline def apply(
    Manager: Instantiable3[
      /* map */ Map_, 
      /* behaviors */ js.UndefOr[js.Array[js.Array[String] | String]], 
      /* options */ js.UndefOr[js.Object], 
      Manager
    ]
  ): TypeofbehaviorManager = {
    val __obj = js.Dynamic.literal(Manager = Manager.asInstanceOf[js.Any])
    __obj.asInstanceOf[TypeofbehaviorManager]
  }
  
  extension [Self <: TypeofbehaviorManager](x: Self) {
    
    inline def setManager(
      value: Instantiable3[
          /* map */ Map_, 
          /* behaviors */ js.UndefOr[js.Array[js.Array[String] | String]], 
          /* options */ js.UndefOr[js.Object], 
          Manager
        ]
    ): Self = StObject.set(x, "Manager", value.asInstanceOf[js.Any])
  }
}
