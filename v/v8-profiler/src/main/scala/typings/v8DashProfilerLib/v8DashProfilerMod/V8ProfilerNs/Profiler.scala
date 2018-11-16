package typings
package v8DashProfilerLib.v8DashProfilerMod.V8ProfilerNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._


trait Profiler extends js.Object {
  var deleteAllProfiles: js.Function0[scala.Unit]
  var deleteAllSnapshots: js.Function0[scala.Unit]
  /**
               * Changes default CPU profiler sampling interval to the specified number of microseconds.
               * Default interval is 1000us.
               * This method must be called when there are no profiles being recorded.
               * If called without arguments it resets interval to default.
               */
  var setSamplingInterval: js.Function1[/* ms */ js.UndefOr[scala.Double], scala.Unit]
  /**
               * start CPU profiling.
               * name is optional argument, by default profile name will be constructed from his uid.
               * recsamples is true by default.
               */
  var startProfiling: js.Function2[
    /* name */ js.UndefOr[java.lang.String], 
    /* recsamples */ js.UndefOr[scala.Boolean], 
    scala.Unit
  ]
  /**
               * returns new CPU Profile instance.
               * There is no strictly described behavior for usage without name argument.
               */
  var stopProfiling: js.Function1[/* name */ js.UndefOr[java.lang.String], Profile]
  /**
               * returns new HEAP Snapshot instance.
               * name is optional argument, by default snapshot name will be constructed from his uid.
               */
  var takeSnapshot: js.Function1[/* name */ js.UndefOr[java.lang.String], Snapshot]
}

