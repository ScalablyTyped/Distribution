package typings.typeorm.sapConnectionOptionsMod

import typings.typeorm.anon.CheckInterval
import typings.typeorm.baseConnectionOptionsMod.BaseConnectionOptions
import typings.typeorm.connectionOptionsMod.ConnectionOptions
import typings.typeorm.sapConnectionCredentialsOptionsMod.SapConnectionCredentialsOptions
import typings.typeorm.typeormStrings.sap
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SapConnectionOptions
  extends BaseConnectionOptions
     with SapConnectionCredentialsOptions
     with ConnectionOptions {
  
  /**
    * Pool options.
    */
  val pool: js.UndefOr[CheckInterval] = js.native
  
  /**
    * Database schema.
    */
  val schema: js.UndefOr[String] = js.native
  
  /**
    * Database type.
    */
  @JSName("type")
  val type_SapConnectionOptions: sap = js.native
}
object SapConnectionOptions {
  
  @scala.inline
  def apply(`type`: sap): SapConnectionOptions = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[SapConnectionOptions]
  }
  
  @scala.inline
  implicit class SapConnectionOptionsOps[Self <: SapConnectionOptions] (val x: Self) extends AnyVal {
    
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
    def setType(value: sap): Self = this.set("type", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPool(value: CheckInterval): Self = this.set("pool", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePool: Self = this.set("pool", js.undefined)
    
    @scala.inline
    def setSchema(value: String): Self = this.set("schema", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSchema: Self = this.set("schema", js.undefined)
  }
}
