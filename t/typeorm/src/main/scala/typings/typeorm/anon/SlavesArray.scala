package typings.typeorm.anon

import typings.typeorm.sqlserverSqlServerConnectionCredentialsOptionsMod.SqlServerConnectionCredentialsOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SlavesArray extends StObject {
  
  /**
    * Master server used by orm to perform writes.
    */
  val master: SqlServerConnectionCredentialsOptions
  
  /**
    * List of read-from severs (slaves).
    */
  val slaves: js.Array[SqlServerConnectionCredentialsOptions]
}
object SlavesArray {
  
  @scala.inline
  def apply(
    master: SqlServerConnectionCredentialsOptions,
    slaves: js.Array[SqlServerConnectionCredentialsOptions]
  ): SlavesArray = {
    val __obj = js.Dynamic.literal(master = master.asInstanceOf[js.Any], slaves = slaves.asInstanceOf[js.Any])
    __obj.asInstanceOf[SlavesArray]
  }
  
  @scala.inline
  implicit class SlavesArrayMutableBuilder[Self <: SlavesArray] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setMaster(value: SqlServerConnectionCredentialsOptions): Self = StObject.set(x, "master", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSlaves(value: js.Array[SqlServerConnectionCredentialsOptions]): Self = StObject.set(x, "slaves", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSlavesVarargs(value: SqlServerConnectionCredentialsOptions*): Self = StObject.set(x, "slaves", js.Array(value :_*))
  }
}
