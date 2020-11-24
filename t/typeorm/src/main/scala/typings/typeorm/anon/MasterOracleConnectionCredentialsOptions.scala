package typings.typeorm.anon

import typings.typeorm.oracleOracleConnectionCredentialsOptionsMod.OracleConnectionCredentialsOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait MasterOracleConnectionCredentialsOptions extends js.Object {
  
  /**
    * Master server used by orm to perform writes.
    */
  val master: OracleConnectionCredentialsOptions = js.native
  
  /**
    * List of read-from severs (slaves).
    */
  val slaves: js.Array[OracleConnectionCredentialsOptions] = js.native
}
object MasterOracleConnectionCredentialsOptions {
  
  @scala.inline
  def apply(master: OracleConnectionCredentialsOptions, slaves: js.Array[OracleConnectionCredentialsOptions]): MasterOracleConnectionCredentialsOptions = {
    val __obj = js.Dynamic.literal(master = master.asInstanceOf[js.Any], slaves = slaves.asInstanceOf[js.Any])
    __obj.asInstanceOf[MasterOracleConnectionCredentialsOptions]
  }
  
  @scala.inline
  implicit class MasterOracleConnectionCredentialsOptionsOps[Self <: MasterOracleConnectionCredentialsOptions] (val x: Self) extends AnyVal {
    
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
    def setMaster(value: OracleConnectionCredentialsOptions): Self = this.set("master", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSlavesVarargs(value: OracleConnectionCredentialsOptions*): Self = this.set("slaves", js.Array(value :_*))
    
    @scala.inline
    def setSlaves(value: js.Array[OracleConnectionCredentialsOptions]): Self = this.set("slaves", value.asInstanceOf[js.Any])
  }
}
