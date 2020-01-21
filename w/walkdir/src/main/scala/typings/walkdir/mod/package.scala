package typings.walkdir

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object mod {
  type WalkEmitter = typings.node.eventsMod.EventEmitter with typings.walkdir.AnonBlockdevice
  type WalkEventListener = js.ThisFunction3[
    /* this */ typings.walkdir.mod.WalkEmitter, 
    /* path */ java.lang.String, 
    /* stat */ typings.node.fsMod.Stats, 
    /* ignore */ js.Function1[/* path */ java.lang.String | js.Array[java.lang.String], scala.Unit], 
    scala.Unit
  ]
}
