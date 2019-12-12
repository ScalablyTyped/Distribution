package typings.vsoDashNodeDashApi.interfacesBuildInterfacesMod

import org.scalablytyped.runtime.TopLevel
import typings.vsoDashNodeDashApi.interfacesBuildInterfacesMod.QueuePriority.AboveNormal
import typings.vsoDashNodeDashApi.interfacesBuildInterfacesMod.QueuePriority.BelowNormal
import typings.vsoDashNodeDashApi.interfacesBuildInterfacesMod.QueuePriority.High
import typings.vsoDashNodeDashApi.interfacesBuildInterfacesMod.QueuePriority.Low
import typings.vsoDashNodeDashApi.interfacesBuildInterfacesMod.QueuePriority.Normal
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
  sealed trait AboveNormal extends QueuePriority
  
  /**
    * Below normal priority.
    */
  @js.native
  sealed trait BelowNormal extends QueuePriority
  
  /**
    * High priority.
    */
  @js.native
  sealed trait High extends QueuePriority
  
  /**
    * Low priority.
    */
  @js.native
  sealed trait Low extends QueuePriority
  
  /**
    * Normal priority.
    */
  @js.native
  sealed trait Normal extends QueuePriority
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[QueuePriority with Double] = js.native
  /* 2 */ @js.native
  object AboveNormal extends TopLevel[AboveNormal with Double]
  
  /* 4 */ @js.native
  object BelowNormal extends TopLevel[BelowNormal with Double]
  
  /* 1 */ @js.native
  object High extends TopLevel[High with Double]
  
  /* 5 */ @js.native
  object Low extends TopLevel[Low with Double]
  
  /* 3 */ @js.native
  object Normal extends TopLevel[Normal with Double]
  
}

