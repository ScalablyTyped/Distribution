package typings.typeorm.anon

import typings.typeorm.sqlServerConnectionCredentialsOptionsMod.SqlServerConnectionCredentialsOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait MasterSqlServerConnectionCredentialsOptions extends StObject {
  
  /**
    * Master server used by orm to perform writes.
    */
  val master: SqlServerConnectionCredentialsOptions
  
  /**
    * List of read-from severs (slaves).
    */
  val slaves: js.Array[SqlServerConnectionCredentialsOptions]
}
object MasterSqlServerConnectionCredentialsOptions {
  
  @scala.inline
  def apply(
    master: SqlServerConnectionCredentialsOptions,
    slaves: js.Array[SqlServerConnectionCredentialsOptions]
  ): MasterSqlServerConnectionCredentialsOptions = {
    val __obj = js.Dynamic.literal(master = master.asInstanceOf[js.Any], slaves = slaves.asInstanceOf[js.Any])
    __obj.asInstanceOf[MasterSqlServerConnectionCredentialsOptions]
  }
  
  @scala.inline
  implicit class MasterSqlServerConnectionCredentialsOptionsMutableBuilder[Self <: MasterSqlServerConnectionCredentialsOptions] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setMaster(value: SqlServerConnectionCredentialsOptions): Self = StObject.set(x, "master", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSlaves(value: js.Array[SqlServerConnectionCredentialsOptions]): Self = StObject.set(x, "slaves", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSlavesVarargs(value: SqlServerConnectionCredentialsOptions*): Self = StObject.set(x, "slaves", js.Array(value :_*))
  }
}
