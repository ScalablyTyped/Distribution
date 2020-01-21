package typings.timezonecomplete

import typings.timezonecomplete.periodMod.PeriodDstJson
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object timezonecompleteStrings {
  @js.native
  sealed trait local extends PeriodDstJson
  
  @js.native
  sealed trait regular extends PeriodDstJson
  
  @scala.inline
  def local: local = "local".asInstanceOf[local]
  @scala.inline
  def regular: regular = "regular".asInstanceOf[regular]
}

