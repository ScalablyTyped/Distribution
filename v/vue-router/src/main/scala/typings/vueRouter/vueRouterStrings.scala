package typings.vueRouter

import typings.vueRouter.routerMod.RouterMode
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object vueRouterStrings {
  
  @js.native
  sealed trait NavigationFailureType extends StObject
  @scala.inline
  def NavigationFailureType: NavigationFailureType = "NavigationFailureType".asInstanceOf[NavigationFailureType]
  
  @js.native
  sealed trait `abstract` extends RouterMode
  @scala.inline
  def `abstract`: `abstract` = "abstract".asInstanceOf[`abstract`]
  
  @js.native
  sealed trait hash extends RouterMode
  @scala.inline
  def hash: hash = "hash".asInstanceOf[hash]
  
  @js.native
  sealed trait history extends RouterMode
  @scala.inline
  def history: history = "history".asInstanceOf[history]
}
