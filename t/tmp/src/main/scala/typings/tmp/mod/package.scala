package typings.tmp

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object mod {
  type DirCallback = js.Function3[
    /* err */ js.Any, 
    /* name */ java.lang.String, 
    /* removeCallback */ js.Function0[scala.Unit], 
    scala.Unit
  ]
  type FileCallback = js.Function4[
    /* err */ js.Any, 
    /* name */ java.lang.String, 
    /* fd */ scala.Double, 
    /* removeCallback */ js.Function0[scala.Unit], 
    scala.Unit
  ]
  type TmpNameCallback = js.Function2[/* err */ js.Any, /* name */ java.lang.String, scala.Unit]
}
