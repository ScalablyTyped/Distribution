package typings
package v8DashProfilerLib.v8DashProfilerMod.V8ProfilerNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Profiler extends js.Object {
  def deleteAllProfiles(): scala.Unit = js.native
  def deleteAllSnapshots(): scala.Unit = js.native
  /**
    * Changes default CPU profiler sampling interval to the specified number of microseconds.
    * Default interval is 1000us.
    * This method must be called when there are no profiles being recorded.
    * If called without arguments it resets interval to default.
    */
  def setSamplingInterval(): scala.Unit = js.native
  def setSamplingInterval(ms: scala.Double): scala.Unit = js.native
  /**
    * start CPU profiling.
    * name is optional argument, by default profile name will be constructed from his uid.
    * recsamples is true by default.
    */
  def startProfiling(): scala.Unit = js.native
  def startProfiling(name: java.lang.String): scala.Unit = js.native
  def startProfiling(name: java.lang.String, recsamples: scala.Boolean): scala.Unit = js.native
  /**
    * returns new CPU Profile instance.
    * There is no strictly described behavior for usage without name argument.
    */
  def stopProfiling(): Profile = js.native
  def stopProfiling(name: java.lang.String): Profile = js.native
  /**
    * returns new HEAP Snapshot instance.
    * name is optional argument, by default snapshot name will be constructed from his uid.
    */
  def takeSnapshot(): Snapshot = js.native
  def takeSnapshot(name: java.lang.String): Snapshot = js.native
}

