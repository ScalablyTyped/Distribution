package typings.winrtUwp.Windows.System

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Represents app memory usage at a single point in time. */
trait AppMemoryReport extends StObject {
  
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
  
  @scala.inline
  implicit class AppMemoryReportMutableBuilder[Self <: AppMemoryReport] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setPeakPrivateCommitUsage(value: Double): Self = StObject.set(x, "peakPrivateCommitUsage", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPrivateCommitUsage(value: Double): Self = StObject.set(x, "privateCommitUsage", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTotalCommitLimit(value: Double): Self = StObject.set(x, "totalCommitLimit", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTotalCommitUsage(value: Double): Self = StObject.set(x, "totalCommitUsage", value.asInstanceOf[js.Any])
  }
}
