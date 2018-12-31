package typings
package winjsLib.WinJSNs.UtilitiesNs.SchedulerNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait Priority extends js.Object

//#region Enumerations
/**
  * Represents a priority for a job managed by the Scheduler.
  **/
@JSGlobal("WinJS.Utilities.Scheduler.Priority")
@js.native
object Priority extends js.Object {
  /**
    * A priority higher than the normal priority level.
    **/
  @js.native
  sealed trait aboveNormal
    extends winjsLib.WinJSNs.UtilitiesNs.SchedulerNs.Priority
  
  /**
    * A priority less than the normal priority level.
    **/
  @js.native
  sealed trait belowNormal
    extends winjsLib.WinJSNs.UtilitiesNs.SchedulerNs.Priority
  
  /**
    * A high priority.
    **/
  @js.native
  sealed trait high
    extends winjsLib.WinJSNs.UtilitiesNs.SchedulerNs.Priority
  
  /**
    * The idle priority for work items.
    **/
  @js.native
  sealed trait idle
    extends winjsLib.WinJSNs.UtilitiesNs.SchedulerNs.Priority
  
  /**
    * The highest priority.
    **/
  @js.native
  sealed trait max
    extends winjsLib.WinJSNs.UtilitiesNs.SchedulerNs.Priority
  
  /**
    * The lowest priority.
    **/
  @js.native
  sealed trait min
    extends winjsLib.WinJSNs.UtilitiesNs.SchedulerNs.Priority
  
  /**
    * The normal priority for work items.
    **/
  @js.native
  sealed trait normal
    extends winjsLib.WinJSNs.UtilitiesNs.SchedulerNs.Priority
  
  val aboveNormal: aboveNormal with java.lang.String = js.native
  val belowNormal: belowNormal with java.lang.String = js.native
  val high: high with java.lang.String = js.native
  val idle: idle with java.lang.String = js.native
  val max: max with java.lang.String = js.native
  val min: min with java.lang.String = js.native
  val normal: normal with java.lang.String = js.native
  @JSBracketAccess
  def apply(value: java.lang.String): js.UndefOr[winjsLib.WinJSNs.UtilitiesNs.SchedulerNs.Priority with java.lang.String] = js.native
}

