package typings
package walkLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object walkMod {
  type WalkNamesEventCallback = js.Function3[
    /* base */ java.lang.String, 
    /* names */ js.Array[java.lang.String], 
    /* next */ WalkNext, 
    scala.Unit
  ]
  type WalkNext = js.Function0[scala.Unit]
  type WalkStatArrayEvent = walkLib.walkLibStrings.files | walkLib.walkLibStrings.directories | walkLib.walkLibStrings.errors | walkLib.walkLibStrings.nodeError | walkLib.walkLibStrings.directoryError
  type WalkStatArrayEventCallback = js.Function3[
    /* base */ java.lang.String, 
    /* names */ js.Array[WalkStats], 
    /* next */ WalkNext, 
    scala.Unit
  ]
  type WalkStatEvent = walkLib.walkLibStrings.file | walkLib.walkLibStrings.directory
  type WalkStatEventCallback = js.Function3[/* base */ java.lang.String, /* names */ WalkStats, /* next */ WalkNext, scala.Unit]
}
