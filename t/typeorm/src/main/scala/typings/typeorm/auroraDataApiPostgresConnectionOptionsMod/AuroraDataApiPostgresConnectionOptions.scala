package typings.typeorm.auroraDataApiPostgresConnectionOptionsMod

import org.scalablytyped.runtime.StringDictionary
import typings.typeorm.baseConnectionOptionsMod.BaseConnectionOptions
import typings.typeorm.connectionOptionsMod.ConnectionOptions
import typings.typeorm.typeormStrings.`aurora-data-api-pg`
import typings.typeorm.typeormStrings.`uuid-ossp`
import typings.typeorm.typeormStrings.pgcrypto
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait AuroraDataApiPostgresConnectionOptions
  extends BaseConnectionOptions
     with ConnectionOptions {
  
  val database: String = js.native
  
  val formatOptions: js.UndefOr[StringDictionary[js.Any]] = js.native
  
  val poolErrorHandler: js.UndefOr[js.Function1[/* err */ js.Any, _]] = js.native
  
  val region: String = js.native
  
  val resourceArn: String = js.native
  
  val secretArn: String = js.native
  
  val serviceConfigOptions: js.UndefOr[StringDictionary[js.Any]] = js.native
  
  /**
    * Database type.
    */
  @JSName("type")
  val type_AuroraDataApiPostgresConnectionOptions: `aurora-data-api-pg` = js.native
  
  /**
    * The Postgres extension to use to generate UUID columns. Defaults to uuid-ossp.
    * If pgcrypto is selected, TypeORM will use the gen_random_uuid() function from this extension.
    * If uuid-ossp is selected, TypeORM will use the uuid_generate_v4() function from this extension.
    */
  val uuidExtension: js.UndefOr[pgcrypto | `uuid-ossp`] = js.native
}
object AuroraDataApiPostgresConnectionOptions {
  
  @scala.inline
  def apply(
    database: String,
    region: String,
    resourceArn: String,
    secretArn: String,
    `type`: `aurora-data-api-pg`
  ): AuroraDataApiPostgresConnectionOptions = {
    val __obj = js.Dynamic.literal(database = database.asInstanceOf[js.Any], region = region.asInstanceOf[js.Any], resourceArn = resourceArn.asInstanceOf[js.Any], secretArn = secretArn.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[AuroraDataApiPostgresConnectionOptions]
  }
  
  @scala.inline
  implicit class AuroraDataApiPostgresConnectionOptionsOps[Self <: AuroraDataApiPostgresConnectionOptions] (val x: Self) extends AnyVal {
    
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
    def setDatabase(value: String): Self = this.set("database", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRegion(value: String): Self = this.set("region", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setResourceArn(value: String): Self = this.set("resourceArn", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSecretArn(value: String): Self = this.set("secretArn", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setType(value: `aurora-data-api-pg`): Self = this.set("type", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFormatOptions(value: StringDictionary[js.Any]): Self = this.set("formatOptions", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFormatOptions: Self = this.set("formatOptions", js.undefined)
    
    @scala.inline
    def setPoolErrorHandler(value: /* err */ js.Any => _): Self = this.set("poolErrorHandler", js.Any.fromFunction1(value))
    
    @scala.inline
    def deletePoolErrorHandler: Self = this.set("poolErrorHandler", js.undefined)
    
    @scala.inline
    def setServiceConfigOptions(value: StringDictionary[js.Any]): Self = this.set("serviceConfigOptions", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteServiceConfigOptions: Self = this.set("serviceConfigOptions", js.undefined)
    
    @scala.inline
    def setUuidExtension(value: pgcrypto | `uuid-ossp`): Self = this.set("uuidExtension", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteUuidExtension: Self = this.set("uuidExtension", js.undefined)
  }
}
