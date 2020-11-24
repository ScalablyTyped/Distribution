package typings.typeorm.anon

import typings.typeorm.cockroachdbCockroachConnectionCredentialsOptionsMod.CockroachConnectionCredentialsOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait MasterCockroachConnectionCredentialsOptions extends js.Object {
  
  /**
    * Master server used by orm to perform writes.
    */
  val master: CockroachConnectionCredentialsOptions = js.native
  
  /**
    * List of read-from severs (slaves).
    */
  val slaves: js.Array[CockroachConnectionCredentialsOptions] = js.native
}
object MasterCockroachConnectionCredentialsOptions {
  
  @scala.inline
  def apply(
    master: CockroachConnectionCredentialsOptions,
    slaves: js.Array[CockroachConnectionCredentialsOptions]
  ): MasterCockroachConnectionCredentialsOptions = {
    val __obj = js.Dynamic.literal(master = master.asInstanceOf[js.Any], slaves = slaves.asInstanceOf[js.Any])
    __obj.asInstanceOf[MasterCockroachConnectionCredentialsOptions]
  }
  
  @scala.inline
  implicit class MasterCockroachConnectionCredentialsOptionsOps[Self <: MasterCockroachConnectionCredentialsOptions] (val x: Self) extends AnyVal {
    
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
    def setMaster(value: CockroachConnectionCredentialsOptions): Self = this.set("master", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSlavesVarargs(value: CockroachConnectionCredentialsOptions*): Self = this.set("slaves", js.Array(value :_*))
    
    @scala.inline
    def setSlaves(value: js.Array[CockroachConnectionCredentialsOptions]): Self = this.set("slaves", value.asInstanceOf[js.Any])
  }
}
