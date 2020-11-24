package typings.udpDiscovery

import typings.udpDiscovery.mod.ReasonType
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object udpDiscoveryStrings {
  
  @scala.inline
  def availabilityChange: availabilityChange = "availabilityChange".asInstanceOf[availabilityChange]
  
  @scala.inline
  def `new`: `new` = "new".asInstanceOf[`new`]
  
  @scala.inline
  def timedOut: timedOut = "timedOut".asInstanceOf[timedOut]
  
  @js.native
  sealed trait availabilityChange extends ReasonType
  
  @js.native
  sealed trait `new` extends ReasonType
  
  @js.native
  sealed trait timedOut extends ReasonType
}
