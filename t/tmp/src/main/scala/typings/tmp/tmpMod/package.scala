package typings.tmp

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object tmpMod {
  type DirCallback = js.Function3[/* err */ js.Any, /* name */ String, /* removeCallback */ js.Function0[Unit], Unit]
  type FileCallback = js.Function4[
    /* err */ js.Any, 
    /* name */ String, 
    /* fd */ Double, 
    /* removeCallback */ js.Function0[Unit], 
    Unit
  ]
  type TmpNameCallback = js.Function2[/* err */ js.Any, /* name */ String, Unit]
}
