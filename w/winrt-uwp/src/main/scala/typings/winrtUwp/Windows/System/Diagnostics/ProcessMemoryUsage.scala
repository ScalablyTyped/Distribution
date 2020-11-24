package typings.winrtUwp.Windows.System.Diagnostics

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Provides access to data about the memory usage of a process. */
@js.native
trait ProcessMemoryUsage extends js.Object {
  
  /**
    * Gets the ProcessMemoryUsageReport for the process.
    * @return The ProcessMemoryUsageReport for the process.
    */
  def getReport(): ProcessMemoryUsageReport = js.native
}
object ProcessMemoryUsage {
  
  @scala.inline
  def apply(getReport: () => ProcessMemoryUsageReport): ProcessMemoryUsage = {
    val __obj = js.Dynamic.literal(getReport = js.Any.fromFunction0(getReport))
    __obj.asInstanceOf[ProcessMemoryUsage]
  }
  
  @scala.inline
  implicit class ProcessMemoryUsageOps[Self <: ProcessMemoryUsage] (val x: Self) extends AnyVal {
    
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
    def setGetReport(value: () => ProcessMemoryUsageReport): Self = this.set("getReport", js.Any.fromFunction0(value))
  }
}
