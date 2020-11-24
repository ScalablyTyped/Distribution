package typings.vsoNodeApi.buildInterfacesMod

import org.scalablytyped.runtime.TopLevel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait QueuePriority extends js.Object
@JSImport("vso-node-api/interfaces/BuildInterfaces", "QueuePriority")
@js.native
object QueuePriority extends js.Object {
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[QueuePriority with Double] = js.native
  
  /**
    * Above normal priority.
    */
  @js.native
  sealed trait AboveNormal extends QueuePriority
  /* 2 */ @js.native
  object AboveNormal extends TopLevel[AboveNormal with Double]
  
  /**
    * Below normal priority.
    */
  @js.native
  sealed trait BelowNormal extends QueuePriority
  /* 4 */ @js.native
  object BelowNormal extends TopLevel[BelowNormal with Double]
  
  /**
    * High priority.
    */
  @js.native
  sealed trait High extends QueuePriority
  /* 1 */ @js.native
  object High extends TopLevel[High with Double]
  
  /**
    * Low priority.
    */
  @js.native
  sealed trait Low extends QueuePriority
  /* 5 */ @js.native
  object Low extends TopLevel[Low with Double]
  
  /**
    * Normal priority.
    */
  @js.native
  sealed trait Normal extends QueuePriority
  /* 3 */ @js.native
  object Normal extends TopLevel[Normal with Double]
}
