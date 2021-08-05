package typings.typeorm.anon

import typings.typeorm.postgresConnectionCredentialsOptionsMod.PostgresConnectionCredentialsOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait MasterSlaves extends StObject {
  
  /**
    * Master server used by orm to perform writes.
    */
  val master: PostgresConnectionCredentialsOptions
  
  /**
    * List of read-from severs (slaves).
    */
  val slaves: js.Array[PostgresConnectionCredentialsOptions]
}
object MasterSlaves {
  
  inline def apply(
    master: PostgresConnectionCredentialsOptions,
    slaves: js.Array[PostgresConnectionCredentialsOptions]
  ): MasterSlaves = {
    val __obj = js.Dynamic.literal(master = master.asInstanceOf[js.Any], slaves = slaves.asInstanceOf[js.Any])
    __obj.asInstanceOf[MasterSlaves]
  }
  
  extension [Self <: MasterSlaves](x: Self) {
    
    inline def setMaster(value: PostgresConnectionCredentialsOptions): Self = StObject.set(x, "master", value.asInstanceOf[js.Any])
    
    inline def setSlaves(value: js.Array[PostgresConnectionCredentialsOptions]): Self = StObject.set(x, "slaves", value.asInstanceOf[js.Any])
    
    inline def setSlavesVarargs(value: PostgresConnectionCredentialsOptions*): Self = StObject.set(x, "slaves", js.Array(value :_*))
  }
}
