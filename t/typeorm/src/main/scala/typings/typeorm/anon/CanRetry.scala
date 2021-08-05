package typings.typeorm.anon

import typings.typeorm.mysqlConnectionCredentialsOptionsMod.MysqlConnectionCredentialsOptions
import typings.typeorm.typeormStrings.ORDER
import typings.typeorm.typeormStrings.RANDOM
import typings.typeorm.typeormStrings.RR
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CanRetry extends StObject {
  
  /**
    * If true, PoolCluster will attempt to reconnect when connection fails. (Default: true)
    */
  val canRetry: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Master server used by orm to perform writes.
    */
  val master: MysqlConnectionCredentialsOptions
  
  /**
    * If connection fails, node's errorCount increases.
    * When errorCount is greater than removeNodeErrorCount, remove a node in the PoolCluster. (Default: 5)
    */
  val removeNodeErrorCount: js.UndefOr[Double] = js.undefined
  
  /**
    * If connection fails, specifies the number of milliseconds before another connection attempt will be made.
    * If set to 0, then node will be removed instead and never re-used. (Default: 0)
    */
  val restoreNodeTimeout: js.UndefOr[Double] = js.undefined
  
  /**
    * Determines how slaves are selected:
    * RR: Select one alternately (Round-Robin).
    * RANDOM: Select the node by random function.
    * ORDER: Select the first node available unconditionally.
    */
  val selector: js.UndefOr[RR | RANDOM | ORDER] = js.undefined
  
  /**
    * List of read-from severs (slaves).
    */
  val slaves: js.Array[MysqlConnectionCredentialsOptions]
}
object CanRetry {
  
  inline def apply(master: MysqlConnectionCredentialsOptions, slaves: js.Array[MysqlConnectionCredentialsOptions]): CanRetry = {
    val __obj = js.Dynamic.literal(master = master.asInstanceOf[js.Any], slaves = slaves.asInstanceOf[js.Any])
    __obj.asInstanceOf[CanRetry]
  }
  
  extension [Self <: CanRetry](x: Self) {
    
    inline def setCanRetry(value: Boolean): Self = StObject.set(x, "canRetry", value.asInstanceOf[js.Any])
    
    inline def setCanRetryUndefined: Self = StObject.set(x, "canRetry", js.undefined)
    
    inline def setMaster(value: MysqlConnectionCredentialsOptions): Self = StObject.set(x, "master", value.asInstanceOf[js.Any])
    
    inline def setRemoveNodeErrorCount(value: Double): Self = StObject.set(x, "removeNodeErrorCount", value.asInstanceOf[js.Any])
    
    inline def setRemoveNodeErrorCountUndefined: Self = StObject.set(x, "removeNodeErrorCount", js.undefined)
    
    inline def setRestoreNodeTimeout(value: Double): Self = StObject.set(x, "restoreNodeTimeout", value.asInstanceOf[js.Any])
    
    inline def setRestoreNodeTimeoutUndefined: Self = StObject.set(x, "restoreNodeTimeout", js.undefined)
    
    inline def setSelector(value: RR | RANDOM | ORDER): Self = StObject.set(x, "selector", value.asInstanceOf[js.Any])
    
    inline def setSelectorUndefined: Self = StObject.set(x, "selector", js.undefined)
    
    inline def setSlaves(value: js.Array[MysqlConnectionCredentialsOptions]): Self = StObject.set(x, "slaves", value.asInstanceOf[js.Any])
    
    inline def setSlavesVarargs(value: MysqlConnectionCredentialsOptions*): Self = StObject.set(x, "slaves", js.Array(value :_*))
  }
}
