package typings.typeorm.anon

import typings.typeorm.postgresPostgresConnectionCredentialsOptionsMod.PostgresConnectionCredentialsOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait MasterPostgresConnectionCredentialsOptions extends js.Object {
  
  /**
    * Master server used by orm to perform writes.
    */
  val master: PostgresConnectionCredentialsOptions = js.native
  
  /**
    * List of read-from severs (slaves).
    */
  val slaves: js.Array[PostgresConnectionCredentialsOptions] = js.native
}
object MasterPostgresConnectionCredentialsOptions {
  
  @scala.inline
  def apply(
    master: PostgresConnectionCredentialsOptions,
    slaves: js.Array[PostgresConnectionCredentialsOptions]
  ): MasterPostgresConnectionCredentialsOptions = {
    val __obj = js.Dynamic.literal(master = master.asInstanceOf[js.Any], slaves = slaves.asInstanceOf[js.Any])
    __obj.asInstanceOf[MasterPostgresConnectionCredentialsOptions]
  }
  
  @scala.inline
  implicit class MasterPostgresConnectionCredentialsOptionsOps[Self <: MasterPostgresConnectionCredentialsOptions] (val x: Self) extends AnyVal {
    
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
    def setMaster(value: PostgresConnectionCredentialsOptions): Self = this.set("master", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSlavesVarargs(value: PostgresConnectionCredentialsOptions*): Self = this.set("slaves", js.Array(value :_*))
    
    @scala.inline
    def setSlaves(value: js.Array[PostgresConnectionCredentialsOptions]): Self = this.set("slaves", value.asInstanceOf[js.Any])
  }
}
