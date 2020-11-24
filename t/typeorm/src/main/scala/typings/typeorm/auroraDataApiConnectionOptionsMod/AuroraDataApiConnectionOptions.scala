package typings.typeorm.auroraDataApiConnectionOptionsMod

import org.scalablytyped.runtime.StringDictionary
import typings.typeorm.auroraDataApiConnectionCredentialsOptionsMod.AuroraDataApiConnectionCredentialsOptions
import typings.typeorm.baseConnectionOptionsMod.BaseConnectionOptions
import typings.typeorm.connectionOptionsMod.ConnectionOptions
import typings.typeorm.typeormStrings.`aurora-data-api`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait AuroraDataApiConnectionOptions
  extends BaseConnectionOptions
     with AuroraDataApiConnectionCredentialsOptions
     with ConnectionOptions {
  
  @JSName("database")
  val database_AuroraDataApiConnectionOptions: String = js.native
  
  val formatOptions: js.UndefOr[StringDictionary[js.Any]] = js.native
  
  /**
    * Use spatial functions like GeomFromText and AsText which are removed in MySQL 8.
    * (Default: true)
    */
  val legacySpatialSupport: js.UndefOr[Boolean] = js.native
  
  val region: String = js.native
  
  val resourceArn: String = js.native
  
  val secretArn: String = js.native
  
  val serviceConfigOptions: js.UndefOr[StringDictionary[js.Any]] = js.native
  
  /**
    * Database type.
    */
  @JSName("type")
  val type_AuroraDataApiConnectionOptions: `aurora-data-api` = js.native
}
object AuroraDataApiConnectionOptions {
  
  @scala.inline
  def apply(
    database: String,
    region: String,
    resourceArn: String,
    secretArn: String,
    `type`: `aurora-data-api`
  ): AuroraDataApiConnectionOptions = {
    val __obj = js.Dynamic.literal(database = database.asInstanceOf[js.Any], region = region.asInstanceOf[js.Any], resourceArn = resourceArn.asInstanceOf[js.Any], secretArn = secretArn.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[AuroraDataApiConnectionOptions]
  }
  
  @scala.inline
  implicit class AuroraDataApiConnectionOptionsOps[Self <: AuroraDataApiConnectionOptions] (val x: Self) extends AnyVal {
    
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
    def setType(value: `aurora-data-api`): Self = this.set("type", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFormatOptions(value: StringDictionary[js.Any]): Self = this.set("formatOptions", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFormatOptions: Self = this.set("formatOptions", js.undefined)
    
    @scala.inline
    def setLegacySpatialSupport(value: Boolean): Self = this.set("legacySpatialSupport", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLegacySpatialSupport: Self = this.set("legacySpatialSupport", js.undefined)
    
    @scala.inline
    def setServiceConfigOptions(value: StringDictionary[js.Any]): Self = this.set("serviceConfigOptions", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteServiceConfigOptions: Self = this.set("serviceConfigOptions", js.undefined)
  }
}
