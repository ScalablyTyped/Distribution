package typings.vueRouter

import typings.vueRouter.routerMod.RouterMode
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object vueRouterStrings {
  
  @scala.inline
  def VueRouter: VueRouter = "VueRouter".asInstanceOf[VueRouter]
  
  @scala.inline
  def `abstract`: `abstract` = "abstract".asInstanceOf[`abstract`]
  
  @scala.inline
  def default: default = "default".asInstanceOf[default]
  
  @scala.inline
  def hash: hash = "hash".asInstanceOf[hash]
  
  @scala.inline
  def history: history = "history".asInstanceOf[history]
  
  @js.native
  sealed trait VueRouter extends js.Object
  
  @js.native
  sealed trait `abstract` extends RouterMode
  
  @js.native
  sealed trait default extends js.Object
  
  @js.native
  sealed trait hash extends RouterMode
  
  @js.native
  sealed trait history extends RouterMode
}
