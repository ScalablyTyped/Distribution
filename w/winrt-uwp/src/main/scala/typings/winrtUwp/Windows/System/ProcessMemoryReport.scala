package typings.winrtUwp.Windows.System

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Represents process memory usage at a single point in time. */
trait ProcessMemoryReport extends js.Object {
  /** Gets the process' private working set usage. */
  var privateWorkingSetUsage: Double
  /** Gets the process' total working set usage. */
  var totalWorkingSetUsage: Double
}

object ProcessMemoryReport {
  @scala.inline
  def apply(privateWorkingSetUsage: Double, totalWorkingSetUsage: Double): ProcessMemoryReport = {
    val __obj = js.Dynamic.literal(privateWorkingSetUsage = privateWorkingSetUsage.asInstanceOf[js.Any], totalWorkingSetUsage = totalWorkingSetUsage.asInstanceOf[js.Any])
    __obj.asInstanceOf[ProcessMemoryReport]
  }
}

