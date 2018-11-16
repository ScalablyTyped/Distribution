package typings
package vsoDashNodeDashApiLib.interfacesBuildInterfacesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait QueuePriority extends js.Object

@JSImport("vso-node-api/interfaces/BuildInterfaces", "QueuePriority")
@js.native
object QueuePriority extends js.Object {
  /**
       * Above normal priority.
       */
  @js.native
  sealed trait AboveNormal
    extends vsoDashNodeDashApiLib.interfacesBuildInterfacesMod.QueuePriority
  
  /**
       * Below normal priority.
       */
  @js.native
  sealed trait BelowNormal
    extends vsoDashNodeDashApiLib.interfacesBuildInterfacesMod.QueuePriority
  
  /**
       * High priority.
       */
  @js.native
  sealed trait High
    extends vsoDashNodeDashApiLib.interfacesBuildInterfacesMod.QueuePriority
  
  /**
       * Low priority.
       */
  @js.native
  sealed trait Low
    extends vsoDashNodeDashApiLib.interfacesBuildInterfacesMod.QueuePriority
  
  /**
       * Normal priority.
       */
  @js.native
  sealed trait Normal
    extends vsoDashNodeDashApiLib.interfacesBuildInterfacesMod.QueuePriority
  
  /* 2 */ val AboveNormal: AboveNormal with scala.Double = js.native
  /* 4 */ val BelowNormal: BelowNormal with scala.Double = js.native
  /* 1 */ val High: High with scala.Double = js.native
  /* 5 */ val Low: Low with scala.Double = js.native
  /* 3 */ val Normal: Normal with scala.Double = js.native
  @JSBracketAccess
  def apply(value: scala.Double): js.UndefOr[
    vsoDashNodeDashApiLib.interfacesBuildInterfacesMod.QueuePriority with scala.Double
  ] = js.native
}

