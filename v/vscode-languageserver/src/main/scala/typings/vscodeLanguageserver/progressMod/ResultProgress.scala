package typings.vscodeLanguageserver.progressMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ResultProgress[R] extends js.Object {
  
  def report(data: R): Unit = js.native
}
object ResultProgress {
  
  @scala.inline
  def apply[R](report: R => Unit): ResultProgress[R] = {
    val __obj = js.Dynamic.literal(report = js.Any.fromFunction1(report))
    __obj.asInstanceOf[ResultProgress[R]]
  }
  
  @scala.inline
  implicit class ResultProgressOps[Self <: ResultProgress[_], R] (val x: Self with ResultProgress[R]) extends AnyVal {
    
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
    def setReport(value: R => Unit): Self = this.set("report", js.Any.fromFunction1(value))
  }
}
