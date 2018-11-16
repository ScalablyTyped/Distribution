package typings
package terserLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object terserMod {
  type visitor = js.Function2[
    /* node */ AST_Node, 
    /* descend */ js.Function0[scala.Unit], 
    scala.Boolean | scala.Unit
  ]
}
