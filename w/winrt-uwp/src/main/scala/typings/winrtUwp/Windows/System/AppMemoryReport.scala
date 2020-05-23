package typings.winrtUwp.Windows.System

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Represents app memory usage at a single point in time. */
trait AppMemoryReport extends js.Object {
  /** Gets the app's peak usage of private commit. */
  var peakPrivateCommitUsage: Double
  /** Gets the app's usage of private commit. */
  var privateCommitUsage: Double
  /** Gets the app's total cap for private plus shared commit. */
  var totalCommitLimit: Double
  /** Gets the app's total usage of private plus shared commit. */
  var totalCommitUsage: Double
}

object AppMemoryReport {
  @scala.inline
  def apply(
    peakPrivateCommitUsage: Double,
    privateCommitUsage: Double,
    totalCommitLimit: Double,
    totalCommitUsage: Double
  ): AppMemoryReport = {
    val __obj = js.Dynamic.literal(peakPrivateCommitUsage = peakPrivateCommitUsage.asInstanceOf[js.Any], privateCommitUsage = privateCommitUsage.asInstanceOf[js.Any], totalCommitLimit = totalCommitLimit.asInstanceOf[js.Any], totalCommitUsage = totalCommitUsage.asInstanceOf[js.Any])
    __obj.asInstanceOf[AppMemoryReport]
  }
}

