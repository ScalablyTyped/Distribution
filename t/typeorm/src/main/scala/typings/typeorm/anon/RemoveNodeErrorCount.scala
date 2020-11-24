package typings.typeorm.anon

import typings.typeorm.mysqlMysqlConnectionCredentialsOptionsMod.MysqlConnectionCredentialsOptions
import typings.typeorm.typeormStrings.ORDER
import typings.typeorm.typeormStrings.RANDOM
import typings.typeorm.typeormStrings.RR
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait RemoveNodeErrorCount extends js.Object {
  
  /**
    * If true, PoolCluster will attempt to reconnect when connection fails. (Default: true)
    */
  val canRetry: js.UndefOr[Boolean] = js.native
  
  /**
    * Master server used by orm to perform writes.
    */
  val master: MysqlConnectionCredentialsOptions = js.native
  
  /**
    * If connection fails, node's errorCount increases.
    * When errorCount is greater than removeNodeErrorCount, remove a node in the PoolCluster. (Default: 5)
    */
  val removeNodeErrorCount: js.UndefOr[Double] = js.native
  
  /**
    * If connection fails, specifies the number of milliseconds before another connection attempt will be made.
    * If set to 0, then node will be removed instead and never re-used. (Default: 0)
    */
  val restoreNodeTimeout: js.UndefOr[Double] = js.native
  
  /**
    * Determines how slaves are selected:
    * RR: Select one alternately (Round-Robin).
    * RANDOM: Select the node by random function.
    * ORDER: Select the first node available unconditionally.
    */
  val selector: js.UndefOr[RR | RANDOM | ORDER] = js.native
  
  /**
    * List of read-from severs (slaves).
    */
  val slaves: js.Array[MysqlConnectionCredentialsOptions] = js.native
}
object RemoveNodeErrorCount {
  
  @scala.inline
  def apply(master: MysqlConnectionCredentialsOptions, slaves: js.Array[MysqlConnectionCredentialsOptions]): RemoveNodeErrorCount = {
    val __obj = js.Dynamic.literal(master = master.asInstanceOf[js.Any], slaves = slaves.asInstanceOf[js.Any])
    __obj.asInstanceOf[RemoveNodeErrorCount]
  }
  
  @scala.inline
  implicit class RemoveNodeErrorCountOps[Self <: RemoveNodeErrorCount] (val x: Self) extends AnyVal {
    
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
    def setMaster(value: MysqlConnectionCredentialsOptions): Self = this.set("master", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSlavesVarargs(value: MysqlConnectionCredentialsOptions*): Self = this.set("slaves", js.Array(value :_*))
    
    @scala.inline
    def setSlaves(value: js.Array[MysqlConnectionCredentialsOptions]): Self = this.set("slaves", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCanRetry(value: Boolean): Self = this.set("canRetry", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCanRetry: Self = this.set("canRetry", js.undefined)
    
    @scala.inline
    def setRemoveNodeErrorCount(value: Double): Self = this.set("removeNodeErrorCount", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRemoveNodeErrorCount: Self = this.set("removeNodeErrorCount", js.undefined)
    
    @scala.inline
    def setRestoreNodeTimeout(value: Double): Self = this.set("restoreNodeTimeout", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRestoreNodeTimeout: Self = this.set("restoreNodeTimeout", js.undefined)
    
    @scala.inline
    def setSelector(value: RR | RANDOM | ORDER): Self = this.set("selector", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSelector: Self = this.set("selector", js.undefined)
  }
}
