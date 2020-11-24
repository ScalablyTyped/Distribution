package typings.umzug.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait UpDownMigrationsOptions extends js.Object {
  
  /**
    * Running specific migrations while ignoring the right order, can be
    * done like this:
    */
  var migrations: js.Array[String] = js.native
}
object UpDownMigrationsOptions {
  
  @scala.inline
  def apply(migrations: js.Array[String]): UpDownMigrationsOptions = {
    val __obj = js.Dynamic.literal(migrations = migrations.asInstanceOf[js.Any])
    __obj.asInstanceOf[UpDownMigrationsOptions]
  }
  
  @scala.inline
  implicit class UpDownMigrationsOptionsOps[Self <: UpDownMigrationsOptions] (val x: Self) extends AnyVal {
    
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
    def setMigrationsVarargs(value: String*): Self = this.set("migrations", js.Array(value :_*))
    
    @scala.inline
    def setMigrations(value: js.Array[String]): Self = this.set("migrations", value.asInstanceOf[js.Any])
  }
}
