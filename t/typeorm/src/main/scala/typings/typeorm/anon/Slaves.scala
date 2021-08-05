package typings.typeorm.anon

import typings.typeorm.oracleConnectionCredentialsOptionsMod.OracleConnectionCredentialsOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Slaves extends StObject {
  
  /**
    * Master server used by orm to perform writes.
    */
  val master: OracleConnectionCredentialsOptions
  
  /**
    * List of read-from severs (slaves).
    */
  val slaves: js.Array[OracleConnectionCredentialsOptions]
}
object Slaves {
  
  inline def apply(master: OracleConnectionCredentialsOptions, slaves: js.Array[OracleConnectionCredentialsOptions]): Slaves = {
    val __obj = js.Dynamic.literal(master = master.asInstanceOf[js.Any], slaves = slaves.asInstanceOf[js.Any])
    __obj.asInstanceOf[Slaves]
  }
  
  extension [Self <: Slaves](x: Self) {
    
    inline def setMaster(value: OracleConnectionCredentialsOptions): Self = StObject.set(x, "master", value.asInstanceOf[js.Any])
    
    inline def setSlaves(value: js.Array[OracleConnectionCredentialsOptions]): Self = StObject.set(x, "slaves", value.asInstanceOf[js.Any])
    
    inline def setSlavesVarargs(value: OracleConnectionCredentialsOptions*): Self = StObject.set(x, "slaves", js.Array(value :_*))
  }
}
