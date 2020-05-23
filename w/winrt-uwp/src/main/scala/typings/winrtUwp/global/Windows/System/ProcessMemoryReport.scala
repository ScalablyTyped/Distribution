package typings.winrtUwp.global.Windows.System

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Represents process memory usage at a single point in time. */
@JSGlobal("Windows.System.ProcessMemoryReport")
@js.native
abstract class ProcessMemoryReport ()
  extends typings.winrtUwp.Windows.System.ProcessMemoryReport {
  /** Gets the process' private working set usage. */
  /* CompleteClass */
  override var privateWorkingSetUsage: Double = js.native
  /** Gets the process' total working set usage. */
  /* CompleteClass */
  override var totalWorkingSetUsage: Double = js.native
}

