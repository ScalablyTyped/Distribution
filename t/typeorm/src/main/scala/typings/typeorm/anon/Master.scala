package typings.typeorm.anon

import typings.typeorm.cockroachConnectionCredentialsOptionsMod.CockroachConnectionCredentialsOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Master extends StObject {
  
  /**
    * Master server used by orm to perform writes.
    */
  val master: CockroachConnectionCredentialsOptions
  
  /**
    * List of read-from severs (slaves).
    */
  val slaves: js.Array[CockroachConnectionCredentialsOptions]
}
object Master {
  
  inline def apply(
    master: CockroachConnectionCredentialsOptions,
    slaves: js.Array[CockroachConnectionCredentialsOptions]
  ): Master = {
    val __obj = js.Dynamic.literal(master = master.asInstanceOf[js.Any], slaves = slaves.asInstanceOf[js.Any])
    __obj.asInstanceOf[Master]
  }
  
  extension [Self <: Master](x: Self) {
    
    inline def setMaster(value: CockroachConnectionCredentialsOptions): Self = StObject.set(x, "master", value.asInstanceOf[js.Any])
    
    inline def setSlaves(value: js.Array[CockroachConnectionCredentialsOptions]): Self = StObject.set(x, "slaves", value.asInstanceOf[js.Any])
    
    inline def setSlavesVarargs(value: CockroachConnectionCredentialsOptions*): Self = StObject.set(x, "slaves", js.Array(value :_*))
  }
}
