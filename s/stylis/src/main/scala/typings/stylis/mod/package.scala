package typings.stylis

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

package object mod {
  
  type Plugin = js.ThisFunction9[
    /* this */ typings.stylis.mod.Stylis, 
    /* context */ typings.stylis.mod.Context, 
    /* content */ java.lang.String, 
    /* selector */ typings.stylis.mod.Selectors, 
    /* parent */ typings.stylis.mod.Selectors, 
    /* line */ scala.Double, 
    /* column */ scala.Double, 
    /* length */ scala.Double, 
    /* at */ scala.Double, 
    /* depth */ scala.Double, 
    js.Any
  ]
  
  type Selectors = js.Array[java.lang.String]
}
