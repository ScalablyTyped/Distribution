package typings
package tstlLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object numericOperatorsMod {
  type Param[Y, Ret, Key /* <: java.lang.String */] = scala.Double | (stdLib.Pick[tstlLib.numericIComputableMod.IComputable[Y, Ret], Key])
  type PlusParam[Y, Ret] = scala.Double | java.lang.String | (stdLib.Pick[tstlLib.numericIComputableMod.IComputable[Y, Ret], tstlLib.tstlLibStrings.plus])
}
