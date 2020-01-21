package typings.v8Profiler.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Profiler extends js.Object {
  def deleteAllProfiles(): Unit = js.native
  def deleteAllSnapshots(): Unit = js.native
  /**
    * Changes default CPU profiler sampling interval to the specified number of microseconds.
    * Default interval is 1000us.
    * This method must be called when there are no profiles being recorded.
    * If called without arguments it resets interval to default.
    */
  def setSamplingInterval(): Unit = js.native
  def setSamplingInterval(ms: Double): Unit = js.native
  /**
    * start CPU profiling.
    * name is optional argument, by default profile name will be constructed from its uid.
    * recsamples is true by default.
    */
  def startProfiling(): Unit = js.native
  def startProfiling(name: String): Unit = js.native
  def startProfiling(name: String, recsamples: Boolean): Unit = js.native
  /**
    * returns new CPU Profile instance.
    * There is no strictly described behavior for usage without name argument.
    */
  def stopProfiling(): Profile = js.native
  def stopProfiling(name: String): Profile = js.native
  /**
    * returns new HEAP Snapshot instance.
    * name is optional argument, by default snapshot name will be constructed from its uid.
    */
  def takeSnapshot(): Snapshot = js.native
  def takeSnapshot(name: String): Snapshot = js.native
}

