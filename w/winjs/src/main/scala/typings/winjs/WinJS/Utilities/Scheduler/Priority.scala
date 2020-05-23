package typings.winjs.WinJS.Utilities.Scheduler

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
  
}

