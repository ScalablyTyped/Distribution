package typings.udpDiscovery

import typings.udpDiscovery.mod.ReasonType
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object udpDiscoveryStrings {
  
  @js.native
  sealed trait availabilityChange extends ReasonType
  @scala.inline
  def availabilityChange: availabilityChange = "availabilityChange".asInstanceOf[availabilityChange]
  
  @js.native
  sealed trait `new` extends ReasonType
  @scala.inline
  def `new`: `new` = "new".asInstanceOf[`new`]
  
  @js.native
  sealed trait timedOut extends ReasonType
  @scala.inline
  def timedOut: timedOut = "timedOut".asInstanceOf[timedOut]
}
