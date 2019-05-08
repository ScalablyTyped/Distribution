package typings
package walkdirLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object walkdirWalkdirMod {
  type WalkEmitter = nodeLib.eventsMod.EventEmitter with walkdirLib.Anon_Blockdevice
  type WalkEventListener = js.ThisFunction3[
    /* this */ WalkEmitter, 
    /* path */ java.lang.String, 
    /* stat */ nodeLib.fsMod.Stats, 
    /* ignore */ js.Function1[/* path */ java.lang.String | js.Array[java.lang.String], scala.Unit], 
    scala.Unit
  ]
}
