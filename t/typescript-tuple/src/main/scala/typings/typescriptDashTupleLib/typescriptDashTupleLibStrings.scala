package typings
package typescriptDashTupleLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object typescriptDashTupleLibStrings {
  @js.native
  sealed trait equal
    extends typescriptDashTupleLib.libUtilsMod.CompareLength[js.Any, js.Any]
  
  @js.native
  sealed trait shorterLeft
    extends typescriptDashTupleLib.libUtilsMod.CompareLength[js.Any, js.Any]
  
  @js.native
  sealed trait shorterRight
    extends typescriptDashTupleLib.libUtilsMod.CompareLength[js.Any, js.Any]
  
  @scala.inline
  def equal: equal = "equal".asInstanceOf[equal]
  @scala.inline
  def shorterLeft: shorterLeft = "shorterLeft".asInstanceOf[shorterLeft]
  @scala.inline
  def shorterRight: shorterRight = "shorterRight".asInstanceOf[shorterRight]
}

