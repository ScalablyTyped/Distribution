package typings.walkdir

import typings.node.eventsMod.EventEmitter
import typings.node.fsMod.Stats
import typings.walkdir.Anon_Blockdevice
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object walkdirWalkdirMod {
  type WalkEmitter = EventEmitter with Anon_Blockdevice
  type WalkEventListener = js.ThisFunction3[
    /* this */ WalkEmitter, 
    /* path */ String, 
    /* stat */ Stats, 
    /* ignore */ js.Function1[/* path */ String | js.Array[String], Unit], 
    Unit
  ]
}
