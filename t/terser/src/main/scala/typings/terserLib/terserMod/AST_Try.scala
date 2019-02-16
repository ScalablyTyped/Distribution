package typings
package terserLib.terserMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AST_Try extends AST_Block {
  var bcatch: AST_Catch = js.native
  var bfinally: scala.Null | AST_Finally = js.native
}

