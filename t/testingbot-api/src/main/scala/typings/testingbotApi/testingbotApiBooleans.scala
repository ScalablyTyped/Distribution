package typings.testingbotApi

import typings.testingbotApi.mod.TestSuccess
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object testingbotApiBooleans {
  @js.native
  sealed trait `false` extends TestSuccess
  
  @js.native
  sealed trait `true` extends TestSuccess
  
  @scala.inline
  def `false`: `false` = false.asInstanceOf[`false`]
  @scala.inline
  def `true`: `true` = true.asInstanceOf[`true`]
}

