package typings.winjs.WinJSNs.UtilitiesNs.SchedulerNs

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
  sealed trait aboveNormal extends Priority
  
  /**
    * A priority less than the normal priority level.
    **/
  @js.native
  sealed trait belowNormal extends Priority
  
  /**
    * A high priority.
    **/
  @js.native
  sealed trait high extends Priority
  
  /**
    * The idle priority for work items.
    **/
  @js.native
  sealed trait idle extends Priority
  
  /**
    * The highest priority.
    **/
  @js.native
  sealed trait max extends Priority
  
  /**
    * The lowest priority.
    **/
  @js.native
  sealed trait min extends Priority
  
  /**
    * The normal priority for work items.
    **/
  @js.native
  sealed trait normal extends Priority
  
  /* 0 */ val aboveNormal: typings.winjs.WinJSNs.UtilitiesNs.SchedulerNs.Priority.aboveNormal with Double = js.native
  /* 1 */ val belowNormal: typings.winjs.WinJSNs.UtilitiesNs.SchedulerNs.Priority.belowNormal with Double = js.native
  /* 2 */ val high: typings.winjs.WinJSNs.UtilitiesNs.SchedulerNs.Priority.high with Double = js.native
  /* 3 */ val idle: typings.winjs.WinJSNs.UtilitiesNs.SchedulerNs.Priority.idle with Double = js.native
  /* 4 */ val max: typings.winjs.WinJSNs.UtilitiesNs.SchedulerNs.Priority.max with Double = js.native
  /* 5 */ val min: typings.winjs.WinJSNs.UtilitiesNs.SchedulerNs.Priority.min with Double = js.native
  /* 6 */ val normal: typings.winjs.WinJSNs.UtilitiesNs.SchedulerNs.Priority.normal with Double = js.native
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[Priority with Double] = js.native
}

