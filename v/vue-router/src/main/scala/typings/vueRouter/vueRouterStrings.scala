package typings.vueRouter

import typings.vueRouter.routerMod.RouterMode
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object vueRouterStrings {
  @js.native
  sealed trait `abstract` extends RouterMode
  
  @js.native
  sealed trait hash extends RouterMode
  
  @js.native
  sealed trait history extends RouterMode
  
  @scala.inline
  def `abstract`: `abstract` = "abstract".asInstanceOf[`abstract`]
  @scala.inline
  def hash: hash = "hash".asInstanceOf[hash]
  @scala.inline
  def history: history = "history".asInstanceOf[history]
}

