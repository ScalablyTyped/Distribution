package typings.systeminformation.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Errorcountoutdated extends js.Object {
  
  var count: Double = js.native
  
  var error_count_outdated: Double = js.native
  
  var error_count_total: Double = js.native
  
  var revision: Double = js.native
  
  var table: js.Array[Lifetimehours] = js.native
}
object Errorcountoutdated {
  
  @scala.inline
  def apply(
    count: Double,
    error_count_outdated: Double,
    error_count_total: Double,
    revision: Double,
    table: js.Array[Lifetimehours]
  ): Errorcountoutdated = {
    val __obj = js.Dynamic.literal(count = count.asInstanceOf[js.Any], error_count_outdated = error_count_outdated.asInstanceOf[js.Any], error_count_total = error_count_total.asInstanceOf[js.Any], revision = revision.asInstanceOf[js.Any], table = table.asInstanceOf[js.Any])
    __obj.asInstanceOf[Errorcountoutdated]
  }
  
  @scala.inline
  implicit class ErrorcountoutdatedOps[Self <: Errorcountoutdated] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: java.lang.String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setCount(value: Double): Self = this.set("count", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setError_count_outdated(value: Double): Self = this.set("error_count_outdated", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setError_count_total(value: Double): Self = this.set("error_count_total", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRevision(value: Double): Self = this.set("revision", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTableVarargs(value: Lifetimehours*): Self = this.set("table", js.Array(value :_*))
    
    @scala.inline
    def setTable(value: js.Array[Lifetimehours]): Self = this.set("table", value.asInstanceOf[js.Any])
  }
}
