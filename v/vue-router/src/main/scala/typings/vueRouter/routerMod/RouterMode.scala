package typings.vueRouter.routerMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typings.vueRouter.vueRouterStrings.hash
  - typings.vueRouter.vueRouterStrings.history
  - typings.vueRouter.vueRouterStrings.`abstract`
*/
trait RouterMode extends js.Object

object RouterMode {
  @scala.inline
  def `abstract`: typings.vueRouter.vueRouterStrings.`abstract` = this.cast("abstract")
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def hash: typings.vueRouter.vueRouterStrings.hash = this.cast("hash")
  @scala.inline
  def history: typings.vueRouter.vueRouterStrings.history = this.cast("history")
}

