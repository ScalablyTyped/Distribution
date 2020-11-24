package typings.yesql.anon

import typings.yesql.yesqlStrings.mysql
import typings.yesql.yesqlStrings.pg
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Pg extends js.Object {
  
  var pg: js.UndefOr[Boolean] = js.native
  
  var `type`: js.UndefOr[pg | mysql] = js.native
}
object Pg {
  
  @scala.inline
  def apply(): Pg = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Pg]
  }
  
  @scala.inline
  implicit class PgOps[Self <: Pg] (val x: Self) extends AnyVal {
    
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
    def setPg(value: Boolean): Self = this.set("pg", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePg: Self = this.set("pg", js.undefined)
    
    @scala.inline
    def setType(value: pg | mysql): Self = this.set("type", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteType: Self = this.set("type", js.undefined)
  }
}
