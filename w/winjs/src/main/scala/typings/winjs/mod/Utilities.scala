package typings.winjs.mod

import typings.std.Event
import typings.std.HTMLElement
import typings.winjs.WinJS.Utilities.ILogOptions
import typings.winjs.WinJS.Utilities.IPosition
import typings.winjs.WinJS.Utilities.Scheduler.IJob
import typings.winjs.WinJS.Utilities.Scheduler.IJobInfo
import typings.winjs.WinJS.Utilities.Scheduler.IOwnerToken
import typings.winjs.WinJS.Utilities.Scheduler.Priority
import typings.winjs.anon.ScrollLeft
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Provides helper functions, for example, functions to add and remove CSS classes.
**/
object Utilities {
  
  @JSImport("winjs", "Utilities")
  @js.native
  val ^ : js.Any = js.native
  
  //#region Enumerations
  /**
    * Defines a set of keyboard values.
    **/
  @JSImport("winjs", "Utilities.Key")
  @js.native
  object Key extends StObject {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[typings.winjs.WinJS.Utilities.Key & Double] = js.native
    
    /* 74 */ val F1: typings.winjs.WinJS.Utilities.Key.F1 & Double = js.native
    
    /* 83 */ val F10: typings.winjs.WinJS.Utilities.Key.F10 & Double = js.native
    
    /* 84 */ val F11: typings.winjs.WinJS.Utilities.Key.F11 & Double = js.native
    
    /* 85 */ val F12: typings.winjs.WinJS.Utilities.Key.F12 & Double = js.native
    
    /* 75 */ val F2: typings.winjs.WinJS.Utilities.Key.F2 & Double = js.native
    
    /* 76 */ val F3: typings.winjs.WinJS.Utilities.Key.F3 & Double = js.native
    
    /* 77 */ val F4: typings.winjs.WinJS.Utilities.Key.F4 & Double = js.native
    
    /* 78 */ val F5: typings.winjs.WinJS.Utilities.Key.F5 & Double = js.native
    
    /* 79 */ val F6: typings.winjs.WinJS.Utilities.Key.F6 & Double = js.native
    
    /* 80 */ val F7: typings.winjs.WinJS.Utilities.Key.F7 & Double = js.native
    
    /* 81 */ val F8: typings.winjs.WinJS.Utilities.Key.F8 & Double = js.native
    
    /* 82 */ val F9: typings.winjs.WinJS.Utilities.Key.F9 & Double = js.native
    
    /* 105 */ val GamepadA: typings.winjs.WinJS.Utilities.Key.GamepadA & Double = js.native
    
    /* 106 */ val GamepadB: typings.winjs.WinJS.Utilities.Key.GamepadB & Double = js.native
    
    /* 114 */ val GamepadDPadDown: typings.winjs.WinJS.Utilities.Key.GamepadDPadDown & Double = js.native
    
    /* 115 */ val GamepadDPadLeft: typings.winjs.WinJS.Utilities.Key.GamepadDPadLeft & Double = js.native
    
    /* 116 */ val GamepadDPadRight: typings.winjs.WinJS.Utilities.Key.GamepadDPadRight & Double = js.native
    
    /* 113 */ val GamepadDPadUp: typings.winjs.WinJS.Utilities.Key.GamepadDPadUp & Double = js.native
    
    /* 110 */ val GamepadLeftShoulder: typings.winjs.WinJS.Utilities.Key.GamepadLeftShoulder & Double = js.native
    
    /* 119 */ val GamepadLeftThumbstick: typings.winjs.WinJS.Utilities.Key.GamepadLeftThumbstick & Double = js.native
    
    /* 122 */ val GamepadLeftThumbstickDown: typings.winjs.WinJS.Utilities.Key.GamepadLeftThumbstickDown & Double = js.native
    
    /* 124 */ val GamepadLeftThumbstickLeft: typings.winjs.WinJS.Utilities.Key.GamepadLeftThumbstickLeft & Double = js.native
    
    /* 123 */ val GamepadLeftThumbstickRight: typings.winjs.WinJS.Utilities.Key.GamepadLeftThumbstickRight & Double = js.native
    
    /* 121 */ val GamepadLeftThumbstickUp: typings.winjs.WinJS.Utilities.Key.GamepadLeftThumbstickUp & Double = js.native
    
    /* 111 */ val GamepadLeftTrigger: typings.winjs.WinJS.Utilities.Key.GamepadLeftTrigger & Double = js.native
    
    /* 117 */ val GamepadMenu: typings.winjs.WinJS.Utilities.Key.GamepadMenu & Double = js.native
    
    /* 109 */ val GamepadRightShoulder: typings.winjs.WinJS.Utilities.Key.GamepadRightShoulder & Double = js.native
    
    /* 120 */ val GamepadRightThumbstick: typings.winjs.WinJS.Utilities.Key.GamepadRightThumbstick & Double = js.native
    
    /* 126 */ val GamepadRightThumbstickDown: typings.winjs.WinJS.Utilities.Key.GamepadRightThumbstickDown & Double = js.native
    
    /* 128 */ val GamepadRightThumbstickLeft: typings.winjs.WinJS.Utilities.Key.GamepadRightThumbstickLeft & Double = js.native
    
    /* 127 */ val GamepadRightThumbstickRight: typings.winjs.WinJS.Utilities.Key.GamepadRightThumbstickRight & Double = js.native
    
    /* 125 */ val GamepadRightThumbstickUp: typings.winjs.WinJS.Utilities.Key.GamepadRightThumbstickUp & Double = js.native
    
    /* 112 */ val GamepadRightTrigger: typings.winjs.WinJS.Utilities.Key.GamepadRightTrigger & Double = js.native
    
    /* 118 */ val GamepadView: typings.winjs.WinJS.Utilities.Key.GamepadView & Double = js.native
    
    /* 107 */ val GamepadX: typings.winjs.WinJS.Utilities.Key.GamepadX & Double = js.native
    
    /* 108 */ val GamepadY: typings.winjs.WinJS.Utilities.Key.GamepadY & Double = js.native
    
    /* 133 */ val IME: typings.winjs.WinJS.Utilities.Key.IME & Double = js.native
    
    /* 92 */ val NavigationAccept: typings.winjs.WinJS.Utilities.Key.NavigationAccept & Double = js.native
    
    /* 93 */ val NavigationCancel: typings.winjs.WinJS.Utilities.Key.NavigationCancel & Double = js.native
    
    /* 89 */ val NavigationDown: typings.winjs.WinJS.Utilities.Key.NavigationDown & Double = js.native
    
    /* 90 */ val NavigationLeft: typings.winjs.WinJS.Utilities.Key.NavigationLeft & Double = js.native
    
    /* 87 */ val NavigationMenu: typings.winjs.WinJS.Utilities.Key.NavigationMenu & Double = js.native
    
    /* 91 */ val NavigationRight: typings.winjs.WinJS.Utilities.Key.NavigationRight & Double = js.native
    
    /* 88 */ val NavigationUp: typings.winjs.WinJS.Utilities.Key.NavigationUp & Double = js.native
    
    /* 86 */ val NavigationView: typings.winjs.WinJS.Utilities.Key.NavigationView & Double = js.native
    
    /* 30 */ val a: typings.winjs.WinJS.Utilities.Key.a & Double = js.native
    
    /* 70 */ val add: typings.winjs.WinJS.Utilities.Key.add & Double = js.native
    
    /* 5 */ val alt: typings.winjs.WinJS.Utilities.Key.alt & Double = js.native
    
    /* 31 */ val b: typings.winjs.WinJS.Utilities.Key.b & Double = js.native
    
    /* 130 */ val backSlash: typings.winjs.WinJS.Utilities.Key.backSlash & Double = js.native
    
    /* 0 */ val backspace: typings.winjs.WinJS.Utilities.Key.backspace & Double = js.native
    
    /* 96 */ val browserBack: typings.winjs.WinJS.Utilities.Key.browserBack & Double = js.native
    
    /* 97 */ val browserForward: typings.winjs.WinJS.Utilities.Key.browserForward & Double = js.native
    
    /* 32 */ val c: typings.winjs.WinJS.Utilities.Key.c & Double = js.native
    
    /* 7 */ val capsLock: typings.winjs.WinJS.Utilities.Key.capsLock & Double = js.native
    
    /* 131 */ val closeBracket: typings.winjs.WinJS.Utilities.Key.closeBracket & Double = js.native
    
    /* 100 */ val comma: typings.winjs.WinJS.Utilities.Key.comma & Double = js.native
    
    /* 4 */ val ctrl: typings.winjs.WinJS.Utilities.Key.ctrl & Double = js.native
    
    /* 33 */ val d: typings.winjs.WinJS.Utilities.Key.d & Double = js.native
    
    /* 101 */ val dash: typings.winjs.WinJS.Utilities.Key.dash & Double = js.native
    
    /* 72 */ val decimalPoint: typings.winjs.WinJS.Utilities.Key.decimalPoint & Double = js.native
    
    /* 19 */ val deleteKey: typings.winjs.WinJS.Utilities.Key.deleteKey & Double = js.native
    
    /* 73 */ val divide: typings.winjs.WinJS.Utilities.Key.divide & Double = js.native
    
    /* 17 */ val downArrow: typings.winjs.WinJS.Utilities.Key.downArrow & Double = js.native
    
    /* 34 */ val e: typings.winjs.WinJS.Utilities.Key.e & Double = js.native
    
    /* 12 */ val end: typings.winjs.WinJS.Utilities.Key.end & Double = js.native
    
    /* 2 */ val enter: typings.winjs.WinJS.Utilities.Key.enter & Double = js.native
    
    /* 99 */ val equal: typings.winjs.WinJS.Utilities.Key.equal & Double = js.native
    
    /* 8 */ val escape: typings.winjs.WinJS.Utilities.Key.escape & Double = js.native
    
    /* 35 */ val f: typings.winjs.WinJS.Utilities.Key.f & Double = js.native
    
    /* 103 */ val forwardSlash: typings.winjs.WinJS.Utilities.Key.forwardSlash & Double = js.native
    
    /* 36 */ val g: typings.winjs.WinJS.Utilities.Key.g & Double = js.native
    
    /* 104 */ val graveAccent: typings.winjs.WinJS.Utilities.Key.graveAccent & Double = js.native
    
    /* 37 */ val h: typings.winjs.WinJS.Utilities.Key.h & Double = js.native
    
    /* 13 */ val home: typings.winjs.WinJS.Utilities.Key.home & Double = js.native
    
    /* 38 */ val i: typings.winjs.WinJS.Utilities.Key.i & Double = js.native
    
    /* 18 */ val insert: typings.winjs.WinJS.Utilities.Key.insert & Double = js.native
    
    /* 39 */ val j: typings.winjs.WinJS.Utilities.Key.j & Double = js.native
    
    /* 40 */ val k: typings.winjs.WinJS.Utilities.Key.k & Double = js.native
    
    /* 41 */ val l: typings.winjs.WinJS.Utilities.Key.l & Double = js.native
    
    /* 14 */ val leftArrow: typings.winjs.WinJS.Utilities.Key.leftArrow & Double = js.native
    
    /* 56 */ val leftWindows: typings.winjs.WinJS.Utilities.Key.leftWindows & Double = js.native
    
    /* 42 */ val m: typings.winjs.WinJS.Utilities.Key.m & Double = js.native
    
    /* 58 */ val menu: typings.winjs.WinJS.Utilities.Key.menu & Double = js.native
    
    /* 69 */ val multiply: typings.winjs.WinJS.Utilities.Key.multiply & Double = js.native
    
    /* 43 */ val n: typings.winjs.WinJS.Utilities.Key.n & Double = js.native
    
    /* 20 */ val num0: typings.winjs.WinJS.Utilities.Key.num0 & Double = js.native
    
    /* 21 */ val num1: typings.winjs.WinJS.Utilities.Key.num1 & Double = js.native
    
    /* 22 */ val num2: typings.winjs.WinJS.Utilities.Key.num2 & Double = js.native
    
    /* 23 */ val num3: typings.winjs.WinJS.Utilities.Key.num3 & Double = js.native
    
    /* 24 */ val num4: typings.winjs.WinJS.Utilities.Key.num4 & Double = js.native
    
    /* 25 */ val num5: typings.winjs.WinJS.Utilities.Key.num5 & Double = js.native
    
    /* 26 */ val num6: typings.winjs.WinJS.Utilities.Key.num6 & Double = js.native
    
    /* 27 */ val num7: typings.winjs.WinJS.Utilities.Key.num7 & Double = js.native
    
    /* 28 */ val num8: typings.winjs.WinJS.Utilities.Key.num8 & Double = js.native
    
    /* 29 */ val num9: typings.winjs.WinJS.Utilities.Key.num9 & Double = js.native
    
    /* 94 */ val numLock: typings.winjs.WinJS.Utilities.Key.numLock & Double = js.native
    
    /* 59 */ val numPad0: typings.winjs.WinJS.Utilities.Key.numPad0 & Double = js.native
    
    /* 60 */ val numPad1: typings.winjs.WinJS.Utilities.Key.numPad1 & Double = js.native
    
    /* 61 */ val numPad2: typings.winjs.WinJS.Utilities.Key.numPad2 & Double = js.native
    
    /* 62 */ val numPad3: typings.winjs.WinJS.Utilities.Key.numPad3 & Double = js.native
    
    /* 63 */ val numPad4: typings.winjs.WinJS.Utilities.Key.numPad4 & Double = js.native
    
    /* 64 */ val numPad5: typings.winjs.WinJS.Utilities.Key.numPad5 & Double = js.native
    
    /* 65 */ val numPad6: typings.winjs.WinJS.Utilities.Key.numPad6 & Double = js.native
    
    /* 66 */ val numPad7: typings.winjs.WinJS.Utilities.Key.numPad7 & Double = js.native
    
    /* 67 */ val numPad8: typings.winjs.WinJS.Utilities.Key.numPad8 & Double = js.native
    
    /* 68 */ val numPad9: typings.winjs.WinJS.Utilities.Key.numPad9 & Double = js.native
    
    /* 44 */ val o: typings.winjs.WinJS.Utilities.Key.o & Double = js.native
    
    /* 129 */ val openBracket: typings.winjs.WinJS.Utilities.Key.openBracket & Double = js.native
    
    /* 45 */ val p: typings.winjs.WinJS.Utilities.Key.p & Double = js.native
    
    /* 11 */ val pageDown: typings.winjs.WinJS.Utilities.Key.pageDown & Double = js.native
    
    /* 10 */ val pageUp: typings.winjs.WinJS.Utilities.Key.pageUp & Double = js.native
    
    /* 6 */ val pause: typings.winjs.WinJS.Utilities.Key.pause & Double = js.native
    
    /* 102 */ val period: typings.winjs.WinJS.Utilities.Key.period & Double = js.native
    
    /* 46 */ val q: typings.winjs.WinJS.Utilities.Key.q & Double = js.native
    
    /* 47 */ val r: typings.winjs.WinJS.Utilities.Key.r & Double = js.native
    
    /* 16 */ val rightArrow: typings.winjs.WinJS.Utilities.Key.rightArrow & Double = js.native
    
    /* 57 */ val rightWindows: typings.winjs.WinJS.Utilities.Key.rightWindows & Double = js.native
    
    /* 48 */ val s: typings.winjs.WinJS.Utilities.Key.s & Double = js.native
    
    /* 95 */ val scrollLock: typings.winjs.WinJS.Utilities.Key.scrollLock & Double = js.native
    
    /* 98 */ val semicolon: typings.winjs.WinJS.Utilities.Key.semicolon & Double = js.native
    
    /* 3 */ val shift: typings.winjs.WinJS.Utilities.Key.shift & Double = js.native
    
    /* 132 */ val singleQuote: typings.winjs.WinJS.Utilities.Key.singleQuote & Double = js.native
    
    /* 9 */ val space: typings.winjs.WinJS.Utilities.Key.space & Double = js.native
    
    /* 71 */ val subtract: typings.winjs.WinJS.Utilities.Key.subtract & Double = js.native
    
    /* 49 */ val t: typings.winjs.WinJS.Utilities.Key.t & Double = js.native
    
    /* 1 */ val tab: typings.winjs.WinJS.Utilities.Key.tab & Double = js.native
    
    /* 50 */ val u: typings.winjs.WinJS.Utilities.Key.u & Double = js.native
    
    /* 15 */ val upArrow: typings.winjs.WinJS.Utilities.Key.upArrow & Double = js.native
    
    /* 51 */ val v: typings.winjs.WinJS.Utilities.Key.v & Double = js.native
    
    /* 52 */ val w: typings.winjs.WinJS.Utilities.Key.w & Double = js.native
    
    /* 53 */ val x: typings.winjs.WinJS.Utilities.Key.x & Double = js.native
    
    /* 54 */ val y: typings.winjs.WinJS.Utilities.Key.y & Double = js.native
    
    /* 55 */ val z: typings.winjs.WinJS.Utilities.Key.z & Double = js.native
  }
  
  /**
    * Represents the result of a query selector, and provides various operations that perform actions over the elements of the collection.
    **/
  @JSImport("winjs", "Utilities.QueryCollection")
  @js.native
  class QueryCollection[T] ()
    extends StObject
       with typings.winjs.WinJS.Utilities.QueryCollection[T]
  object QueryCollection {
    
    @JSImport("winjs", "Utilities.QueryCollection")
    @js.native
    val ^ : js.Any = js.native
    
    //#endregion Methods
    /**
      * Indicates that the object is compatibile with declarative processing.
      **/
    /* static member */
    @JSImport("winjs", "Utilities.QueryCollection.supportedForProcessing")
    @js.native
    def supportedForProcessing: Boolean = js.native
    @scala.inline
    def supportedForProcessing_=(x: Boolean): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("supportedForProcessing")(x.asInstanceOf[js.Any])
  }
  
  /**
    * Provides functions and objects for scheduling and managing asynchronous tasks.
  **/
  object Scheduler {
    
    @JSImport("winjs", "Utilities.Scheduler")
    @js.native
    val ^ : js.Any = js.native
    
    //#region Enumerations
    /**
      * Represents a priority for a job managed by the Scheduler.
      **/
    @JSImport("winjs", "Utilities.Scheduler.Priority")
    @js.native
    object Priority extends StObject {
      
      @JSBracketAccess
      def apply(value: Double): js.UndefOr[typings.winjs.WinJS.Utilities.Scheduler.Priority & Double] = js.native
      
      /* 0 */ val aboveNormal: typings.winjs.WinJS.Utilities.Scheduler.Priority.aboveNormal & Double = js.native
      
      /* 1 */ val belowNormal: typings.winjs.WinJS.Utilities.Scheduler.Priority.belowNormal & Double = js.native
      
      /* 2 */ val high: typings.winjs.WinJS.Utilities.Scheduler.Priority.high & Double = js.native
      
      /* 3 */ val idle: typings.winjs.WinJS.Utilities.Scheduler.Priority.idle & Double = js.native
      
      /* 4 */ val max: typings.winjs.WinJS.Utilities.Scheduler.Priority.max & Double = js.native
      
      /* 5 */ val min: typings.winjs.WinJS.Utilities.Scheduler.Priority.min & Double = js.native
      
      /* 6 */ val normal: typings.winjs.WinJS.Utilities.Scheduler.Priority.normal & Double = js.native
    }
    
    //#endregion Properties
    //#region Functions
    /**
      * Creates and returns a new IOwnerToken which can be set to the owner property of one or more jobs.
      * @returns A new IOwnerToken which can be set to the owner property of one or more jobs.
      **/
    @scala.inline
    def createOwnerToken(): IOwnerToken = ^.asInstanceOf[js.Dynamic].applyDynamic("createOwnerToken")().asInstanceOf[IOwnerToken]
    
    //#endregion Interfaces
    //#region Properties
    /**
      * Gets the current priority at which the caller is executing.
      **/
    @JSImport("winjs", "Utilities.Scheduler.currentPriority")
    @js.native
    def currentPriority: Priority = js.native
    @scala.inline
    def currentPriority_=(x: Priority): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("currentPriority")(x.asInstanceOf[js.Any])
    
    /**
      * Runs the specified callback in a high priority context.
      * @param callback The callback to run in a high priority callback.
      * @returns The return value of the callback.
      **/
    @scala.inline
    def execHigh[U](callback: js.Function0[U]): U = ^.asInstanceOf[js.Dynamic].applyDynamic("execHigh")(callback.asInstanceOf[js.Any]).asInstanceOf[U]
    
    /**
      * Runs jobs in the scheduler without timeslicing until all jobs at the specified priority and higher have executed.
      * @param priority The priority to which the scheduler should drain. The default is -15.
      * @param name An optional description of the drain request for diagnostics.
      * @returns A Promise which completes when the drain has finished. Canceling this Promise cancels the drain request. This Promise will never enter an error state.
      **/
    @scala.inline
    def requestDrain(): typings.winjs.WinJS.Promise[js.Any] = ^.asInstanceOf[js.Dynamic].applyDynamic("requestDrain")().asInstanceOf[typings.winjs.WinJS.Promise[js.Any]]
    @scala.inline
    def requestDrain(priority: Unit, name: String): typings.winjs.WinJS.Promise[js.Any] = (^.asInstanceOf[js.Dynamic].applyDynamic("requestDrain")(priority.asInstanceOf[js.Any], name.asInstanceOf[js.Any])).asInstanceOf[typings.winjs.WinJS.Promise[js.Any]]
    @scala.inline
    def requestDrain(priority: Priority): typings.winjs.WinJS.Promise[js.Any] = ^.asInstanceOf[js.Dynamic].applyDynamic("requestDrain")(priority.asInstanceOf[js.Any]).asInstanceOf[typings.winjs.WinJS.Promise[js.Any]]
    @scala.inline
    def requestDrain(priority: Priority, name: String): typings.winjs.WinJS.Promise[js.Any] = (^.asInstanceOf[js.Dynamic].applyDynamic("requestDrain")(priority.asInstanceOf[js.Any], name.asInstanceOf[js.Any])).asInstanceOf[typings.winjs.WinJS.Promise[js.Any]]
    
    /**
      * Returns a string representation of the scheduler's state for diagnostic purposes. The jobs and drain requests are displayed in the order in which they are currently expected to be processed. The current job and drain request are marked by an asterisk.
      * @returns A string representation of the scheduler's state for diagnostic purposes. The jobs and drain requests are displayed in the order in which they are currently expected to be processed. The current job and drain request are marked by an asterisk.
      **/
    @scala.inline
    def retrieveState(): String = ^.asInstanceOf[js.Dynamic].applyDynamic("retrieveState")().asInstanceOf[String]
    
    /**
      * Schedules the specified function to execute asynchronously.
      * @param work A function that represents the work item to be scheduled. When called the work item will receive as its first argument an object which allows the work item to ask the scheduler if it should yield cooperatively and if so allows the work item to either provide a function to be run as a continuation or a WinJS.Promise which will when complete provide a function to run as a continuation. Provide these fields for the object: shouldYield, setWork(work), setPromise(promise), job.
      * @param priority The priority of the work item. If you don't specify a priority, it defaults to WinJS.Utilities.Scheduler.Priority.normal.
      * @param thisArg A "this" instance to be bound to the work item. The default value is null.
      * @param name A description of the work item for diagnostics. The default value is an empty string.
      * @returns The job instance that represents this work item.
      **/
    @scala.inline
    def schedule(work: js.Function1[/* jobInfo */ IJobInfo, js.Any]): IJob = ^.asInstanceOf[js.Dynamic].applyDynamic("schedule")(work.asInstanceOf[js.Any]).asInstanceOf[IJob]
    @scala.inline
    def schedule(work: js.Function1[/* jobInfo */ IJobInfo, js.Any], priority: Unit, thisArg: js.Any): IJob = (^.asInstanceOf[js.Dynamic].applyDynamic("schedule")(work.asInstanceOf[js.Any], priority.asInstanceOf[js.Any], thisArg.asInstanceOf[js.Any])).asInstanceOf[IJob]
    @scala.inline
    def schedule(work: js.Function1[/* jobInfo */ IJobInfo, js.Any], priority: Unit, thisArg: js.Any, name: String): IJob = (^.asInstanceOf[js.Dynamic].applyDynamic("schedule")(work.asInstanceOf[js.Any], priority.asInstanceOf[js.Any], thisArg.asInstanceOf[js.Any], name.asInstanceOf[js.Any])).asInstanceOf[IJob]
    @scala.inline
    def schedule(work: js.Function1[/* jobInfo */ IJobInfo, js.Any], priority: Unit, thisArg: Unit, name: String): IJob = (^.asInstanceOf[js.Dynamic].applyDynamic("schedule")(work.asInstanceOf[js.Any], priority.asInstanceOf[js.Any], thisArg.asInstanceOf[js.Any], name.asInstanceOf[js.Any])).asInstanceOf[IJob]
    @scala.inline
    def schedule(work: js.Function1[/* jobInfo */ IJobInfo, js.Any], priority: Priority): IJob = (^.asInstanceOf[js.Dynamic].applyDynamic("schedule")(work.asInstanceOf[js.Any], priority.asInstanceOf[js.Any])).asInstanceOf[IJob]
    @scala.inline
    def schedule(work: js.Function1[/* jobInfo */ IJobInfo, js.Any], priority: Priority, thisArg: js.Any): IJob = (^.asInstanceOf[js.Dynamic].applyDynamic("schedule")(work.asInstanceOf[js.Any], priority.asInstanceOf[js.Any], thisArg.asInstanceOf[js.Any])).asInstanceOf[IJob]
    @scala.inline
    def schedule(
      work: js.Function1[/* jobInfo */ IJobInfo, js.Any],
      priority: Priority,
      thisArg: js.Any,
      name: String
    ): IJob = (^.asInstanceOf[js.Dynamic].applyDynamic("schedule")(work.asInstanceOf[js.Any], priority.asInstanceOf[js.Any], thisArg.asInstanceOf[js.Any], name.asInstanceOf[js.Any])).asInstanceOf[IJob]
    @scala.inline
    def schedule(
      work: js.Function1[/* jobInfo */ IJobInfo, js.Any],
      priority: Priority,
      thisArg: Unit,
      name: String
    ): IJob = (^.asInstanceOf[js.Dynamic].applyDynamic("schedule")(work.asInstanceOf[js.Any], priority.asInstanceOf[js.Any], thisArg.asInstanceOf[js.Any], name.asInstanceOf[js.Any])).asInstanceOf[IJob]
    
    /**
      * Schedules a job to complete the returned Promise at WinJS.Utilities.Scheduler.Priority.aboveNormal priority.
      * @param promiseValue The value returned by the completed Promise.
      * @param jobName A string that describes the job for diagnostic purposes.
      * @returns A Promise that completes within a job of aboveNormal priority.
      **/
    @scala.inline
    def schedulePromiseAboveNormal[U](): typings.winjs.WinJS.Promise[U] = ^.asInstanceOf[js.Dynamic].applyDynamic("schedulePromiseAboveNormal")().asInstanceOf[typings.winjs.WinJS.Promise[U]]
    @scala.inline
    def schedulePromiseAboveNormal[U](promiseValue: U): typings.winjs.WinJS.Promise[U] = ^.asInstanceOf[js.Dynamic].applyDynamic("schedulePromiseAboveNormal")(promiseValue.asInstanceOf[js.Any]).asInstanceOf[typings.winjs.WinJS.Promise[U]]
    @scala.inline
    def schedulePromiseAboveNormal[U](promiseValue: U, jobName: String): typings.winjs.WinJS.Promise[U] = (^.asInstanceOf[js.Dynamic].applyDynamic("schedulePromiseAboveNormal")(promiseValue.asInstanceOf[js.Any], jobName.asInstanceOf[js.Any])).asInstanceOf[typings.winjs.WinJS.Promise[U]]
    @scala.inline
    def schedulePromiseAboveNormal[U](promiseValue: Unit, jobName: String): typings.winjs.WinJS.Promise[U] = (^.asInstanceOf[js.Dynamic].applyDynamic("schedulePromiseAboveNormal")(promiseValue.asInstanceOf[js.Any], jobName.asInstanceOf[js.Any])).asInstanceOf[typings.winjs.WinJS.Promise[U]]
    
    /**
      * Schedules a job to complete the returned Promise at WinJS.Utilities.Scheduler.Priority.belowNormal priority.
      * @param promiseValue The value returned by the completed Promise.
      * @param jobName A string that describes the job for diagnostic purposes.
      * @returns A Promise that completes within a job of belowNormal priority.
      **/
    @scala.inline
    def schedulePromiseBelowNormal[U](): typings.winjs.WinJS.Promise[U] = ^.asInstanceOf[js.Dynamic].applyDynamic("schedulePromiseBelowNormal")().asInstanceOf[typings.winjs.WinJS.Promise[U]]
    @scala.inline
    def schedulePromiseBelowNormal[U](promiseValue: U): typings.winjs.WinJS.Promise[U] = ^.asInstanceOf[js.Dynamic].applyDynamic("schedulePromiseBelowNormal")(promiseValue.asInstanceOf[js.Any]).asInstanceOf[typings.winjs.WinJS.Promise[U]]
    @scala.inline
    def schedulePromiseBelowNormal[U](promiseValue: U, jobName: String): typings.winjs.WinJS.Promise[U] = (^.asInstanceOf[js.Dynamic].applyDynamic("schedulePromiseBelowNormal")(promiseValue.asInstanceOf[js.Any], jobName.asInstanceOf[js.Any])).asInstanceOf[typings.winjs.WinJS.Promise[U]]
    @scala.inline
    def schedulePromiseBelowNormal[U](promiseValue: Unit, jobName: String): typings.winjs.WinJS.Promise[U] = (^.asInstanceOf[js.Dynamic].applyDynamic("schedulePromiseBelowNormal")(promiseValue.asInstanceOf[js.Any], jobName.asInstanceOf[js.Any])).asInstanceOf[typings.winjs.WinJS.Promise[U]]
    
    /**
      * Schedules a job to complete the returned Promise at WinJS.Utilities.Scheduler.Priority.high priority.
      * @param promiseValue The value returned by the completed Promise.
      * @param jobName A string that describes the job for diagnostic purposes.
      * @returns A Promise that completes within a job of high priority.
      **/
    @scala.inline
    def schedulePromiseHigh[U](): typings.winjs.WinJS.Promise[U] = ^.asInstanceOf[js.Dynamic].applyDynamic("schedulePromiseHigh")().asInstanceOf[typings.winjs.WinJS.Promise[U]]
    @scala.inline
    def schedulePromiseHigh[U](promiseValue: U): typings.winjs.WinJS.Promise[U] = ^.asInstanceOf[js.Dynamic].applyDynamic("schedulePromiseHigh")(promiseValue.asInstanceOf[js.Any]).asInstanceOf[typings.winjs.WinJS.Promise[U]]
    @scala.inline
    def schedulePromiseHigh[U](promiseValue: U, jobName: String): typings.winjs.WinJS.Promise[U] = (^.asInstanceOf[js.Dynamic].applyDynamic("schedulePromiseHigh")(promiseValue.asInstanceOf[js.Any], jobName.asInstanceOf[js.Any])).asInstanceOf[typings.winjs.WinJS.Promise[U]]
    @scala.inline
    def schedulePromiseHigh[U](promiseValue: Unit, jobName: String): typings.winjs.WinJS.Promise[U] = (^.asInstanceOf[js.Dynamic].applyDynamic("schedulePromiseHigh")(promiseValue.asInstanceOf[js.Any], jobName.asInstanceOf[js.Any])).asInstanceOf[typings.winjs.WinJS.Promise[U]]
    
    /**
      * Schedules a job to complete the returned Promise at WinJS.Utilities.Scheduler.Priority.Idle priority.
      * @param promiseValue The value returned by the completed Promise.
      * @param jobName A string that describes the job for diagnostic purposes.
      * @returns A Promise that completes within a job of idle priority.
      **/
    @scala.inline
    def schedulePromiseIdle[U](): typings.winjs.WinJS.Promise[U] = ^.asInstanceOf[js.Dynamic].applyDynamic("schedulePromiseIdle")().asInstanceOf[typings.winjs.WinJS.Promise[U]]
    @scala.inline
    def schedulePromiseIdle[U](promiseValue: U): typings.winjs.WinJS.Promise[U] = ^.asInstanceOf[js.Dynamic].applyDynamic("schedulePromiseIdle")(promiseValue.asInstanceOf[js.Any]).asInstanceOf[typings.winjs.WinJS.Promise[U]]
    @scala.inline
    def schedulePromiseIdle[U](promiseValue: U, jobName: String): typings.winjs.WinJS.Promise[U] = (^.asInstanceOf[js.Dynamic].applyDynamic("schedulePromiseIdle")(promiseValue.asInstanceOf[js.Any], jobName.asInstanceOf[js.Any])).asInstanceOf[typings.winjs.WinJS.Promise[U]]
    @scala.inline
    def schedulePromiseIdle[U](promiseValue: Unit, jobName: String): typings.winjs.WinJS.Promise[U] = (^.asInstanceOf[js.Dynamic].applyDynamic("schedulePromiseIdle")(promiseValue.asInstanceOf[js.Any], jobName.asInstanceOf[js.Any])).asInstanceOf[typings.winjs.WinJS.Promise[U]]
    
    /**
      * Schedules a job to complete the returned Promise at WinJS.Utilities.Scheduler.Priority.normal priority.
      * @param promiseValue The value returned by the completed Promise.
      * @param jobName A string that describes the job for diagnostic purposes.
      * @returns A Promise that completes within a job of normal priority.
      **/
    @scala.inline
    def schedulePromiseNormal[U](): typings.winjs.WinJS.Promise[U] = ^.asInstanceOf[js.Dynamic].applyDynamic("schedulePromiseNormal")().asInstanceOf[typings.winjs.WinJS.Promise[U]]
    @scala.inline
    def schedulePromiseNormal[U](promiseValue: U): typings.winjs.WinJS.Promise[U] = ^.asInstanceOf[js.Dynamic].applyDynamic("schedulePromiseNormal")(promiseValue.asInstanceOf[js.Any]).asInstanceOf[typings.winjs.WinJS.Promise[U]]
    @scala.inline
    def schedulePromiseNormal[U](promiseValue: U, jobName: String): typings.winjs.WinJS.Promise[U] = (^.asInstanceOf[js.Dynamic].applyDynamic("schedulePromiseNormal")(promiseValue.asInstanceOf[js.Any], jobName.asInstanceOf[js.Any])).asInstanceOf[typings.winjs.WinJS.Promise[U]]
    @scala.inline
    def schedulePromiseNormal[U](promiseValue: Unit, jobName: String): typings.winjs.WinJS.Promise[U] = (^.asInstanceOf[js.Dynamic].applyDynamic("schedulePromiseNormal")(promiseValue.asInstanceOf[js.Any], jobName.asInstanceOf[js.Any])).asInstanceOf[typings.winjs.WinJS.Promise[U]]
  }
  
  //#endregion Objects
  //#region Functions
  /**
    * Adds the specified class to the specified element.
    * @param e The element to which to add the class.
    * @param name The name of the class to add.
    * @returns The element.
    **/
  @scala.inline
  def addClass[T /* <: HTMLElement */](e: T, name: String): T = (^.asInstanceOf[js.Dynamic].applyDynamic("addClass")(e.asInstanceOf[js.Any], name.asInstanceOf[js.Any])).asInstanceOf[T]
  
  /**
    * Gets a collection of elements that are the direct children of the specified element.
    * @param element The parent element.
    * @returns The collection of children of the element.
    **/
  @scala.inline
  def children(element: HTMLElement): typings.winjs.WinJS.Utilities.QueryCollection[HTMLElement] = ^.asInstanceOf[js.Dynamic].applyDynamic("children")(element.asInstanceOf[js.Any]).asInstanceOf[typings.winjs.WinJS.Utilities.QueryCollection[HTMLElement]]
  
  /**
    * Converts a CSS positioning string for the specified element to pixels.
    * @param element The element.
    * @param value The CSS positioning string.
    * @returns The number of pixels.
    **/
  @scala.inline
  def convertToPixels(element: HTMLElement, value: String): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("convertToPixels")(element.asInstanceOf[js.Any], value.asInstanceOf[js.Any])).asInstanceOf[Double]
  
  /**
    * Creates an object that has one event for each name passed to the function.
    * @param events A variable list of property names.
    * @returns The object with the specified properties. The names of the properties are prefixed with 'on'.
    **/
  @scala.inline
  def createEventProperties(events: String*): js.Any = ^.asInstanceOf[js.Dynamic].applyDynamic("createEventProperties")(events.asInstanceOf[js.Any]).asInstanceOf[js.Any]
  
  /**
    * Gets the data value associated with the specified element.
    * @param element The element.
    * @returns The value associated with the element.
    **/
  @scala.inline
  def data(element: HTMLElement): js.Any = ^.asInstanceOf[js.Dynamic].applyDynamic("data")(element.asInstanceOf[js.Any]).asInstanceOf[js.Any]
  
  /**
    * Disposes all first-generation disposable elements that are descendents of the specified element. The specified element itself is not disposed.
    * @param element The root element whose sub-tree is to be disposed.
    **/
  @scala.inline
  def disposeSubTree(element: HTMLElement): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("disposeSubTree")(element.asInstanceOf[js.Any]).asInstanceOf[Unit]
  
  /**
    * Removes all the child nodes from the specified element.
    * @param element The element.
    * @returns The element.
    **/
  @scala.inline
  def empty[T /* <: HTMLElement */](element: T): T = ^.asInstanceOf[js.Dynamic].applyDynamic("empty")(element.asInstanceOf[js.Any]).asInstanceOf[T]
  
  //#endregion Enumerations
  //#region Objects
  /**
    * A mixin that contains event-related functions.
    **/
  object eventMixin {
    
    @JSImport("winjs", "Utilities.eventMixin")
    @js.native
    val ^ : js.Any = js.native
    
    //#region Methods
    /**
      * Adds an event listener to the control.
      * @param type The type (name) of the event.
      * @param listener The listener to invoke when the event gets raised.
      * @param useCapture If true, initiates capture, otherwise false.
      **/
    @scala.inline
    def addEventListener(`type`: String, listener: js.Function): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("addEventListener")(`type`.asInstanceOf[js.Any], listener.asInstanceOf[js.Any])).asInstanceOf[Unit]
    @scala.inline
    def addEventListener(`type`: String, listener: js.Function, useCapture: Boolean): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("addEventListener")(`type`.asInstanceOf[js.Any], listener.asInstanceOf[js.Any], useCapture.asInstanceOf[js.Any])).asInstanceOf[Unit]
    
    /**
      * Raises an event of the specified type and with the specified additional properties.
      * @param type The type (name) of the event.
      * @param eventProperties The set of additional properties to be attached to the event object when the event is raised.
      * @returns true if preventDefault was called on the event.
      **/
    @scala.inline
    def dispatchEvent(`type`: String, eventProperties: js.Any): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("dispatchEvent")(`type`.asInstanceOf[js.Any], eventProperties.asInstanceOf[js.Any])).asInstanceOf[Boolean]
    
    /**
      * Removes an event listener from the control.
      * @param type The type (name) of the event.
      * @param listener The listener to remove.
      * @param useCapture true if capture is to be initiated, otherwise false.
      **/
    @scala.inline
    def removeEventListener(`type`: String, listener: js.Function): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("removeEventListener")(`type`.asInstanceOf[js.Any], listener.asInstanceOf[js.Any])).asInstanceOf[Unit]
    @scala.inline
    def removeEventListener(`type`: String, listener: js.Function, useCapture: Boolean): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("removeEventListener")(`type`.asInstanceOf[js.Any], listener.asInstanceOf[js.Any], useCapture.asInstanceOf[js.Any])).asInstanceOf[Unit]
  }
  
  /**
    * Determines whether the specified event occurred within the specified element.
    * @param element The element.
    * @param event The event.
    * @returns true if the event occurred within the element; otherwise, false.
    **/
  @scala.inline
  def eventWithinElement(element: HTMLElement, event: Event): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("eventWithinElement")(element.asInstanceOf[js.Any], event.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  
  /**
    * Adds tags and type to a logging message.
    * @param message The message to be formatted.
    * @param tag The tag(s) to be applied to the message. Multiple tags should be separated by spaces.
    * @param type The type of the message.
    * @returns The formatted message.
    **/
  @scala.inline
  def formatLog(message: String, tag: String, `type`: String): String = (^.asInstanceOf[js.Dynamic].applyDynamic("formatLog")(message.asInstanceOf[js.Any], tag.asInstanceOf[js.Any], `type`.asInstanceOf[js.Any])).asInstanceOf[String]
  
  /**
    * Gets the height of the content of the specified element. The content height does not include borders or padding.
    * @param element The element.
    * @returns The content height of the element.
    **/
  @scala.inline
  def getContentHeight(element: HTMLElement): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("getContentHeight")(element.asInstanceOf[js.Any]).asInstanceOf[Double]
  
  /**
    * Gets the width of the content of the specified element. The content width does not include borders or padding.
    * @param element The element.
    * @returns The content width of the element.
    **/
  @scala.inline
  def getContentWidth(element: HTMLElement): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("getContentWidth")(element.asInstanceOf[js.Any]).asInstanceOf[Double]
  
  /**
    * Gets the leaf-level type or namespace specified by the name parameter.
    * @param name The name of the member.
    * @param root The root to start in. Defaults to the global object.
    * @returns The leaf-level type or namespace in the specified parent namespace.
    **/
  @scala.inline
  def getMember(name: String): js.Any = ^.asInstanceOf[js.Dynamic].applyDynamic("getMember")(name.asInstanceOf[js.Any]).asInstanceOf[js.Any]
  @scala.inline
  def getMember(name: String, root: js.Any): js.Any = (^.asInstanceOf[js.Dynamic].applyDynamic("getMember")(name.asInstanceOf[js.Any], root.asInstanceOf[js.Any])).asInstanceOf[js.Any]
  
  /**
    * Gets the position of the specified element.
    * @param element The element.
    * @returns An object that contains the left, top, width and height properties of the element.
    **/
  @scala.inline
  def getPosition(element: HTMLElement): IPosition = ^.asInstanceOf[js.Dynamic].applyDynamic("getPosition")(element.asInstanceOf[js.Any]).asInstanceOf[IPosition]
  
  /**
    * Gets the left coordinate of the specified element relative to the specified parent.
    * @param element The element.
    * @param parent The parent element.
    * @returns The relative left coordinate.
    **/
  @scala.inline
  def getRelativeLeft(): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("getRelativeLeft")().asInstanceOf[Double]
  @scala.inline
  def getRelativeLeft(element: Unit, parent: HTMLElement): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("getRelativeLeft")(element.asInstanceOf[js.Any], parent.asInstanceOf[js.Any])).asInstanceOf[Double]
  @scala.inline
  def getRelativeLeft(element: HTMLElement): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("getRelativeLeft")(element.asInstanceOf[js.Any]).asInstanceOf[Double]
  @scala.inline
  def getRelativeLeft(element: HTMLElement, parent: HTMLElement): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("getRelativeLeft")(element.asInstanceOf[js.Any], parent.asInstanceOf[js.Any])).asInstanceOf[Double]
  
  /**
    * Gets the top coordinate of the element relative to the specified parent.
    * @param element The element.
    * @param parent The parent element.
    * @returns The relative top coordinate.
    **/
  @scala.inline
  def getRelativeTop(): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("getRelativeTop")().asInstanceOf[Double]
  @scala.inline
  def getRelativeTop(element: Unit, parent: HTMLElement): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("getRelativeTop")(element.asInstanceOf[js.Any], parent.asInstanceOf[js.Any])).asInstanceOf[Double]
  @scala.inline
  def getRelativeTop(element: HTMLElement): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("getRelativeTop")(element.asInstanceOf[js.Any]).asInstanceOf[Double]
  @scala.inline
  def getRelativeTop(element: HTMLElement, parent: HTMLElement): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("getRelativeTop")(element.asInstanceOf[js.Any], parent.asInstanceOf[js.Any])).asInstanceOf[Double]
  
  /**
    * Gets the scrollLeft and scrollTop of the specified element, adjusting the scrollLeft to change from browser specific coordinates to logical coordinates when in RTL.
    * @param element The element.
    * @returns An object with two properties: scrollLeft and scrollTop
    **/
  @scala.inline
  def getScrollPosition(element: HTMLElement): ScrollLeft = ^.asInstanceOf[js.Dynamic].applyDynamic("getScrollPosition")(element.asInstanceOf[js.Any]).asInstanceOf[ScrollLeft]
  
  /**
    * Gets the tab index of the specified element.
    * @param element The element
    * @returns The tabIndex of the element. Returns -1 if the element cannot be tabbed to.
    **/
  @scala.inline
  def getTabIndex(element: HTMLElement): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("getTabIndex")(element.asInstanceOf[js.Any]).asInstanceOf[Double]
  
  /**
    * Gets the height of the element, including its margins.
    * @param element The element.
    * @returns The height of the element including margins.
    **/
  @scala.inline
  def getTotalHeight(element: HTMLElement): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("getTotalHeight")(element.asInstanceOf[js.Any]).asInstanceOf[Double]
  
  /**
    * Gets the width of the element, including margins.
    * @param element The element.
    * @returns The width of the element including margins.
    **/
  @scala.inline
  def getTotalWidth(element: HTMLElement): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("getTotalWidth")(element.asInstanceOf[js.Any]).asInstanceOf[Double]
  
  /**
    * Determines whether the specified element has the specified class.
    * @param e The element.
    * @param name The name of the class.
    * @returns true if the element has the class, otherwise false.
    **/
  @scala.inline
  def hasClass(e: HTMLElement, name: String): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("hasClass")(e.asInstanceOf[js.Any], name.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  
  //#endregion Functions
  //#region Properties
  /**
    * Gets whether the current script context has access to WinRT APIs.
    **/
  @JSImport("winjs", "Utilities.hasWinRT")
  @js.native
  def hasWinRT: Boolean = js.native
  @scala.inline
  def hasWinRT_=(x: Boolean): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("hasWinRT")(x.asInstanceOf[js.Any])
  
  /**
    * Returns a collection with zero or one elements matching the specified id.
    * @param id The ID of the element (or elements).
    * @returns A collection of elements whose id matches the id parameter.
    **/
  @scala.inline
  def id(id: String): typings.winjs.WinJS.Utilities.QueryCollection[HTMLElement] = ^.asInstanceOf[js.Dynamic].applyDynamic("id")(id.asInstanceOf[js.Any]).asInstanceOf[typings.winjs.WinJS.Utilities.QueryCollection[HTMLElement]]
  
  /**
    * Calls insertAdjacentHTML on the specified element.
    * @param element The element on which insertAdjacentHTML is to be called.
    * @param position The position relative to the element at which to insert the HTML. Possible values are: beforebegin, afterbegin, beforeend, afterend.
    * @param text The text to insert.
    **/
  @scala.inline
  def insertAdjacentHTML(element: HTMLElement, position: String, text: String): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("insertAdjacentHTML")(element.asInstanceOf[js.Any], position.asInstanceOf[js.Any], text.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  /**
    * Calls insertAdjacentHTML on the specified element in the context of MSApp.execUnsafeLocalFunction.
    * @param element The element on which insertAdjacentHTML is to be called.
    * @param position The position relative to the element at which to insert the HTML. Possible values are: beforebegin, afterbegin, beforeend, afterend.
    * @param text Value to be provided to insertAdjacentHTML.
    **/
  @scala.inline
  def insertAdjacentHTMLUnsafe(element: HTMLElement, position: String, text: String): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("insertAdjacentHTMLUnsafe")(element.asInstanceOf[js.Any], position.asInstanceOf[js.Any], text.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  /**
    * Attaches the default dispose API wrapping the dispose implementation to the specified element.
    * @param element The element to mark as disposable.
    * @param disposeImpl The function containing the element-specific dispose logic, called by the dispose function that markDisposable attaches.
    **/
  @scala.inline
  def markDisposable(element: HTMLElement): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("markDisposable")(element.asInstanceOf[js.Any]).asInstanceOf[Unit]
  @scala.inline
  def markDisposable(element: HTMLElement, disposeImpl: js.Function): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("markDisposable")(element.asInstanceOf[js.Any], disposeImpl.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  /**
    * Marks a function as being compatible with declarative processing. Declarative processing is performed by WinJS.UI.processAll or WinJS.Binding.processAll.
    * @param func The function to be marked as compatible with declarative processing.
    * @returns The input function, marked as compatible with declarative processing.
    **/
  @scala.inline
  def markSupportedForProcessing[U /* <: js.Function */](func: U): U = ^.asInstanceOf[js.Dynamic].applyDynamic("markSupportedForProcessing")(func.asInstanceOf[js.Any]).asInstanceOf[U]
  
  /**
    * Returns a QueryCollection with zero or one elements matching the specified selector query.
    * @param query The CSS selector to use. See Selectors for more information.
    * @param element Optional. The root element at which to start the query. If this parameter is omitted, the scope of the query is the entire document.
    * @returns A QueryCollection with zero or one elements matching the specified selector query.
    **/
  @scala.inline
  def query(query: js.Any): typings.winjs.WinJS.Utilities.QueryCollection[HTMLElement] = ^.asInstanceOf[js.Dynamic].applyDynamic("query")(query.asInstanceOf[js.Any]).asInstanceOf[typings.winjs.WinJS.Utilities.QueryCollection[HTMLElement]]
  @scala.inline
  def query(query: js.Any, element: HTMLElement): typings.winjs.WinJS.Utilities.QueryCollection[HTMLElement] = (^.asInstanceOf[js.Dynamic].applyDynamic("query")(query.asInstanceOf[js.Any], element.asInstanceOf[js.Any])).asInstanceOf[typings.winjs.WinJS.Utilities.QueryCollection[HTMLElement]]
  
  /**
    * Ensures that the specified function executes only after the DOMContentLoaded event has fired for the current page. The DOMContentLoaded event occurs after the page has been parsed but before all the resources are loaded.
    * @param callback A function that executes after the DOMContentLoaded event has occurred.
    * @param async If true, the callback should be executed asynchronously.
    * @returns A promise that completes after the DOMContentLoaded event has occurred.
    **/
  @scala.inline
  def ready(): typings.winjs.WinJS.Promise[js.Any] = ^.asInstanceOf[js.Dynamic].applyDynamic("ready")().asInstanceOf[typings.winjs.WinJS.Promise[js.Any]]
  @scala.inline
  def ready(callback: js.Function): typings.winjs.WinJS.Promise[js.Any] = ^.asInstanceOf[js.Dynamic].applyDynamic("ready")(callback.asInstanceOf[js.Any]).asInstanceOf[typings.winjs.WinJS.Promise[js.Any]]
  @scala.inline
  def ready(callback: js.Function, async: Boolean): typings.winjs.WinJS.Promise[js.Any] = (^.asInstanceOf[js.Dynamic].applyDynamic("ready")(callback.asInstanceOf[js.Any], async.asInstanceOf[js.Any])).asInstanceOf[typings.winjs.WinJS.Promise[js.Any]]
  @scala.inline
  def ready(callback: Unit, async: Boolean): typings.winjs.WinJS.Promise[js.Any] = (^.asInstanceOf[js.Dynamic].applyDynamic("ready")(callback.asInstanceOf[js.Any], async.asInstanceOf[js.Any])).asInstanceOf[typings.winjs.WinJS.Promise[js.Any]]
  
  /**
    * Removes the specified class from the specified element.
    * @param e The element from which to remove the class.
    * @param name The name of the class to remove.
    * @returns The element.
    **/
  @scala.inline
  def removeClass[T /* <: HTMLElement */](e: T, name: String): T = (^.asInstanceOf[js.Dynamic].applyDynamic("removeClass")(e.asInstanceOf[js.Any], name.asInstanceOf[js.Any])).asInstanceOf[T]
  
  /**
    * Asserts that the value is compatible with declarative processing. Declarative processing is performed by WinJS.UI.processAll or WinJS.Binding.processAll. If the value is not compatible, and strictProcessing is on, an exception is thrown. All functions that have been declared using WinJS.Class.define, WinJS.Class.derive, WinJS.UI.Pages.define, or WinJS.Binding.converter are automatically marked as supported for declarative processing. Any other function that you use from a declarative context (that is, a context in which an HTML element has a data-win-control or data-win-options attribute) must be marked manually by calling this function. When you mark a function as supported for declarative processing, you are guaranteeing that the code in the function is secure from injection of third-party content.
    * @param value The value to be tested for compatibility with declarative processing. If the value is a function it must be marked with a property supportedForProcessing with a value of true when strictProcessing is on. For more information, see WinJS.Utilities.markSupportedForProcessing.
    * @returns The input value.
    **/
  @scala.inline
  def requireSupportedForProcessing[T](value: T): T = ^.asInstanceOf[js.Dynamic].applyDynamic("requireSupportedForProcessing")(value.asInstanceOf[js.Any]).asInstanceOf[T]
  
  /**
    * Sets the innerHTML property of the specified element to the specified text.
    * @param element The element on which the innerHTML property is to be set.
    * @param text The value to be set to the innerHTML property.
    **/
  @scala.inline
  def setInnerHTML(element: HTMLElement, text: String): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("setInnerHTML")(element.asInstanceOf[js.Any], text.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  /**
    * Sets the innerHTML property of the specified element to the specified text.
    * @param element The element on which the innerHTML property is to be set.
    * @param text The value to be set to the innerHTML property.
    **/
  @scala.inline
  def setInnerHTMLUnsafe(element: HTMLElement, text: String): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("setInnerHTMLUnsafe")(element.asInstanceOf[js.Any], text.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  /**
    * Sets the outerHTML property of the specified element to the specified text.
    * @param element The element on which the outerHTML property is to be set.
    * @param text The value to be set to the outerHTML property.
    **/
  @scala.inline
  def setOuterHTML(element: HTMLElement, text: String): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("setOuterHTML")(element.asInstanceOf[js.Any], text.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  /**
    * Sets the outerHTML property of the specified element to the specified text in the context of MSApp.execUnsafeLocalFunction.
    * @param element The element on which the outerHTML property is to be set.
    * @param text The value to be set to the outerHTML property.
    **/
  @scala.inline
  def setOuterHTMLUnsafe(element: HTMLElement, text: String): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("setOuterHTMLUnsafe")(element.asInstanceOf[js.Any], text.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  /**
    * Sets the scrollLeft and scrollTop of the specified element, changing the scrollLeft from logical coordinates to browser-specific coordinates when in RTL.
    * @param element The element.
    * @param position An object describing the position to set.
    **/
  @scala.inline
  def setScrollPosition(element: HTMLElement, position: ScrollLeft): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("setScrollPosition")(element.asInstanceOf[js.Any], position.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  /**
    * Configures a logger that writes messages containing the specified tags to the JavaScript console.
    * @param options The tags for messages to log. Multiple tags should be separated by spaces. May contain type, tags, excludeTags and action properties.
    **/
  @scala.inline
  def startLog(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("startLog")().asInstanceOf[Unit]
  @scala.inline
  def startLog(options: ILogOptions): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("startLog")(options.asInstanceOf[js.Any]).asInstanceOf[Unit]
  @scala.inline
  def startLog(tags: String): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("startLog")(tags.asInstanceOf[js.Any]).asInstanceOf[Unit]
  
  /**
    * Removes the WinJS logger that had previously been set up.
    **/
  @scala.inline
  def stopLog(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("stopLog")().asInstanceOf[Unit]
  
  /**
    * Determines if strict declarative processing is enabled in this script context.
    **/
  @JSImport("winjs", "Utilities.strictProcessing")
  @js.native
  def strictProcessing: Boolean = js.native
  @scala.inline
  def strictProcessing_=(x: Boolean): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("strictProcessing")(x.asInstanceOf[js.Any])
  
  /**
    * Toggles (adds or removes) the specified class on the specified element. If the class is present, it is removed; if it is absent, it is added.
    * @param e The element on which to toggle the class.
    * @param name The name of the class to toggle.
    * @returns The element.
    **/
  @scala.inline
  def toggleClass[T /* <: HTMLElement */](e: T, name: String): T = (^.asInstanceOf[js.Dynamic].applyDynamic("toggleClass")(e.asInstanceOf[js.Any], name.asInstanceOf[js.Any])).asInstanceOf[T]
}
