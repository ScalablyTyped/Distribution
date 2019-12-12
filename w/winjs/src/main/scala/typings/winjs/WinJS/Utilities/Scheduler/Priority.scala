package typings.winjs.WinJS.Utilities.Scheduler

import org.scalablytyped.runtime.TopLevel
import typings.winjs.WinJS.Utilities.Scheduler.Priority.aboveNormal
import typings.winjs.WinJS.Utilities.Scheduler.Priority.belowNormal
import typings.winjs.WinJS.Utilities.Scheduler.Priority.high
import typings.winjs.WinJS.Utilities.Scheduler.Priority.idle
import typings.winjs.WinJS.Utilities.Scheduler.Priority.max
import typings.winjs.WinJS.Utilities.Scheduler.Priority.min
import typings.winjs.WinJS.Utilities.Scheduler.Priority.normal
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
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[Priority with Double] = js.native
  /* 0 */ @js.native
  object aboveNormal extends TopLevel[aboveNormal with Double]
  
  /* 1 */ @js.native
  object belowNormal extends TopLevel[belowNormal with Double]
  
  /* 2 */ @js.native
  object high extends TopLevel[high with Double]
  
  /* 3 */ @js.native
  object idle extends TopLevel[idle with Double]
  
  /* 4 */ @js.native
  object max extends TopLevel[max with Double]
  
  /* 5 */ @js.native
  object min extends TopLevel[min with Double]
  
  /* 6 */ @js.native
  object normal extends TopLevel[normal with Double]
  
}

