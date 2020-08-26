package typings.winrtUwp.Windows.System

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Represents app memory usage at a single point in time. */
@js.native
trait AppMemoryReport extends js.Object {
  /** Gets the app's peak usage of private commit. */
  var peakPrivateCommitUsage: Double = js.native
  /** Gets the app's usage of private commit. */
  var privateCommitUsage: Double = js.native
  /** Gets the app's total cap for private plus shared commit. */
  var totalCommitLimit: Double = js.native
  /** Gets the app's total usage of private plus shared commit. */
  var totalCommitUsage: Double = js.native
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
  @scala.inline
  implicit class AppMemoryReportOps[Self <: AppMemoryReport] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setPeakPrivateCommitUsage(value: Double): Self = this.set("peakPrivateCommitUsage", value.asInstanceOf[js.Any])
    @scala.inline
    def setPrivateCommitUsage(value: Double): Self = this.set("privateCommitUsage", value.asInstanceOf[js.Any])
    @scala.inline
    def setTotalCommitLimit(value: Double): Self = this.set("totalCommitLimit", value.asInstanceOf[js.Any])
    @scala.inline
    def setTotalCommitUsage(value: Double): Self = this.set("totalCommitUsage", value.asInstanceOf[js.Any])
  }
  
}

