package typings.typeorm.anon

import typings.typeorm.cockroachdbCockroachConnectionCredentialsOptionsMod.CockroachConnectionCredentialsOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait MasterCockroachConnectionCredentialsOptions extends StObject {
  
  /**
    * Master server used by orm to perform writes.
    */
  val master: CockroachConnectionCredentialsOptions
  
  /**
    * List of read-from severs (slaves).
    */
  val slaves: js.Array[CockroachConnectionCredentialsOptions]
}
object MasterCockroachConnectionCredentialsOptions {
  
  inline def apply(
    master: CockroachConnectionCredentialsOptions,
    slaves: js.Array[CockroachConnectionCredentialsOptions]
  ): MasterCockroachConnectionCredentialsOptions = {
    val __obj = js.Dynamic.literal(master = master.asInstanceOf[js.Any], slaves = slaves.asInstanceOf[js.Any])
    __obj.asInstanceOf[MasterCockroachConnectionCredentialsOptions]
  }
  
  extension [Self <: MasterCockroachConnectionCredentialsOptions](x: Self) {
    
    inline def setMaster(value: CockroachConnectionCredentialsOptions): Self = StObject.set(x, "master", value.asInstanceOf[js.Any])
    
    inline def setSlaves(value: js.Array[CockroachConnectionCredentialsOptions]): Self = StObject.set(x, "slaves", value.asInstanceOf[js.Any])
    
    inline def setSlavesVarargs(value: CockroachConnectionCredentialsOptions*): Self = StObject.set(x, "slaves", js.Array(value :_*))
  }
}
