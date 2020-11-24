package typings.vscode.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Progress[T] extends js.Object {
  
  /**
    * Report a progress update.
    * @param value A progress item, like a message and/or an
    * report on how much work finished
    */
  def report(value: T): Unit = js.native
}
object Progress {
  
  @scala.inline
  def apply[T](report: T => Unit): Progress[T] = {
    val __obj = js.Dynamic.literal(report = js.Any.fromFunction1(report))
    __obj.asInstanceOf[Progress[T]]
  }
  
  @scala.inline
  implicit class ProgressOps[Self <: Progress[_], T] (val x: Self with Progress[T]) extends AnyVal {
    
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
    def setReport(value: T => Unit): Self = this.set("report", js.Any.fromFunction1(value))
  }
}
