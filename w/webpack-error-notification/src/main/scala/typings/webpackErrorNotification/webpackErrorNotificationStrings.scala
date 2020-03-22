package typings.webpackErrorNotification

import typings.webpackErrorNotification.mod._Strategy
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object webpackErrorNotificationStrings {
  @js.native
  sealed trait darwin extends _Strategy
  
  @js.native
  sealed trait linux extends _Strategy
  
  @scala.inline
  def darwin: darwin = "darwin".asInstanceOf[darwin]
  @scala.inline
  def linux: linux = "linux".asInstanceOf[linux]
}

