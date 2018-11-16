package typings
package through2Lib.through2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object through2Ns {
  type FlushCallback = js.ThisFunction1[
    /* this */ nodeLib.streamMod.Transform, 
    /* flushCallback */ js.Function0[scala.Unit], 
    scala.Unit
  ]
  type TransformCallback = js.Function2[/* err */ js.UndefOr[js.Any], /* data */ js.UndefOr[js.Any], scala.Unit]
  type TransformFunction = js.ThisFunction3[
    /* this */ nodeLib.streamMod.Transform, 
    /* chunk */ js.Any, 
    /* enc */ java.lang.String, 
    /* callback */ TransformCallback, 
    scala.Unit
  ]
}
