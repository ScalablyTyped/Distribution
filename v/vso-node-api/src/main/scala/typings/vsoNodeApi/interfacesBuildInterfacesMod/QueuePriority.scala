package typings.vsoNodeApi.interfacesBuildInterfacesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait QueuePriority extends StObject
@JSImport("vso-node-api/interfaces/BuildInterfaces", "QueuePriority")
@js.native
object QueuePriority extends StObject {
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[QueuePriority & Double] = js.native
  
  /**
    * Above normal priority.
    */
  @js.native
  sealed trait AboveNormal
    extends StObject
       with QueuePriority
  /* 2 */ val AboveNormal: typings.vsoNodeApi.interfacesBuildInterfacesMod.QueuePriority.AboveNormal & Double = js.native
  
  /**
    * Below normal priority.
    */
  @js.native
  sealed trait BelowNormal
    extends StObject
       with QueuePriority
  /* 4 */ val BelowNormal: typings.vsoNodeApi.interfacesBuildInterfacesMod.QueuePriority.BelowNormal & Double = js.native
  
  /**
    * High priority.
    */
  @js.native
  sealed trait High
    extends StObject
       with QueuePriority
  /* 1 */ val High: typings.vsoNodeApi.interfacesBuildInterfacesMod.QueuePriority.High & Double = js.native
  
  /**
    * Low priority.
    */
  @js.native
  sealed trait Low
    extends StObject
       with QueuePriority
  /* 5 */ val Low: typings.vsoNodeApi.interfacesBuildInterfacesMod.QueuePriority.Low & Double = js.native
  
  /**
    * Normal priority.
    */
  @js.native
  sealed trait Normal
    extends StObject
       with QueuePriority
  /* 3 */ val Normal: typings.vsoNodeApi.interfacesBuildInterfacesMod.QueuePriority.Normal & Double = js.native
}
