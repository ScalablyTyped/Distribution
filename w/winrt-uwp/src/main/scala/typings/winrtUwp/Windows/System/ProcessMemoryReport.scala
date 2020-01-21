package typings.winrtUwp.Windows.System

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Represents process memory usage at a single point in time. */
@JSGlobal("Windows.System.ProcessMemoryReport")
@js.native
abstract class ProcessMemoryReport () extends js.Object {
  /** Gets the process' private working set usage. */
  var privateWorkingSetUsage: Double = js.native
  /** Gets the process' total working set usage. */
  var totalWorkingSetUsage: Double = js.native
}

