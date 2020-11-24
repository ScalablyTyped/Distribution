package typings.walkdir

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

package object mod {
  
  type WalkEventListener = js.ThisFunction3[
    /* this */ typings.walkdir.mod.WalkEmitter, 
    /* path */ java.lang.String, 
    /* stat */ typings.node.fsMod.Stats, 
    /* ignore */ js.Function1[/* path */ java.lang.String | js.Array[java.lang.String], scala.Unit], 
    scala.Unit
  ]
}
