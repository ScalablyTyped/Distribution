package typings
package timezonecompleteLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object timezonecompleteLibStrings {
  @js.native
  sealed trait local
    extends timezonecompleteLib.distLibPeriodMod.PeriodDstJson
  
  @js.native
  sealed trait regular
    extends timezonecompleteLib.distLibPeriodMod.PeriodDstJson
  
  @scala.inline
  def local: local = "local".asInstanceOf[local]
  @scala.inline
  def regular: regular = "regular".asInstanceOf[regular]
}

