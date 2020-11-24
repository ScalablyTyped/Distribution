package typings.typeorm.cockroachdbCockroachConnectionOptionsMod

import typings.typeorm.anon.MasterCockroachConnectionCredentialsOptions
import typings.typeorm.cockroachdbCockroachConnectionCredentialsOptionsMod.CockroachConnectionCredentialsOptions
import typings.typeorm.connectionBaseConnectionOptionsMod.BaseConnectionOptions
import typings.typeorm.connectionConnectionOptionsMod.ConnectionOptions
import typings.typeorm.typeormStrings.cockroachdb
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait CockroachConnectionOptions
  extends BaseConnectionOptions
     with CockroachConnectionCredentialsOptions
     with ConnectionOptions {
  
  val poolErrorHandler: js.UndefOr[js.Function1[/* err */ js.Any, _]] = js.native
  
  /**
    * Replication setup.
    */
  val replication: js.UndefOr[MasterCockroachConnectionCredentialsOptions] = js.native
  
  /**
    * Schema name.
    */
  val schema: js.UndefOr[String] = js.native
  
  /**
    * Database type.
    */
  @JSName("type")
  val type_CockroachConnectionOptions: cockroachdb = js.native
}
object CockroachConnectionOptions {
  
  @scala.inline
  def apply(`type`: cockroachdb): CockroachConnectionOptions = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[CockroachConnectionOptions]
  }
  
  @scala.inline
  implicit class CockroachConnectionOptionsOps[Self <: CockroachConnectionOptions] (val x: Self) extends AnyVal {
    
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
    def setType(value: cockroachdb): Self = this.set("type", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPoolErrorHandler(value: /* err */ js.Any => _): Self = this.set("poolErrorHandler", js.Any.fromFunction1(value))
    
    @scala.inline
    def deletePoolErrorHandler: Self = this.set("poolErrorHandler", js.undefined)
    
    @scala.inline
    def setReplication(value: MasterCockroachConnectionCredentialsOptions): Self = this.set("replication", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteReplication: Self = this.set("replication", js.undefined)
    
    @scala.inline
    def setSchema(value: String): Self = this.set("schema", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSchema: Self = this.set("schema", js.undefined)
  }
}
