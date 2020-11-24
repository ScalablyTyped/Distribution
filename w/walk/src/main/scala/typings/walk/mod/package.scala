package typings.walk

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

package object mod {
  
  type WalkNamesEventCallback = js.Function3[
    /* base */ java.lang.String, 
    /* names */ js.Array[java.lang.String], 
    /* next */ typings.walk.mod.WalkNext, 
    scala.Unit
  ]
  
  type WalkNext = js.Function0[scala.Unit]
  
  type WalkStatArrayEventCallback = js.Function3[
    /* base */ java.lang.String, 
    /* names */ js.Array[typings.walk.mod.WalkStats], 
    /* next */ typings.walk.mod.WalkNext, 
    scala.Unit
  ]
  
  type WalkStatEventCallback = js.Function3[
    /* base */ java.lang.String, 
    /* names */ typings.walk.mod.WalkStats, 
    /* next */ typings.walk.mod.WalkNext, 
    scala.Unit
  ]
}
