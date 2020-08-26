package typings.winstonDynamodb.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DynamoDBTransportOptions extends js.Object {
  var accessKeyId: js.UndefOr[String] = js.native
  var dynamoDoc: js.UndefOr[Boolean] = js.native
  var level: String = js.native
  var region: js.UndefOr[String] = js.native
  var secretAccessKey: js.UndefOr[String] = js.native
  var tableName: String = js.native
  var useEnvironment: js.UndefOr[Boolean] = js.native
}

object DynamoDBTransportOptions {
  @scala.inline
  def apply(level: String, tableName: String): DynamoDBTransportOptions = {
    val __obj = js.Dynamic.literal(level = level.asInstanceOf[js.Any], tableName = tableName.asInstanceOf[js.Any])
    __obj.asInstanceOf[DynamoDBTransportOptions]
  }
  @scala.inline
  implicit class DynamoDBTransportOptionsOps[Self <: DynamoDBTransportOptions] (val x: Self) extends AnyVal {
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
    def setLevel(value: String): Self = this.set("level", value.asInstanceOf[js.Any])
    @scala.inline
    def setTableName(value: String): Self = this.set("tableName", value.asInstanceOf[js.Any])
    @scala.inline
    def setAccessKeyId(value: String): Self = this.set("accessKeyId", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAccessKeyId: Self = this.set("accessKeyId", js.undefined)
    @scala.inline
    def setDynamoDoc(value: Boolean): Self = this.set("dynamoDoc", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDynamoDoc: Self = this.set("dynamoDoc", js.undefined)
    @scala.inline
    def setRegion(value: String): Self = this.set("region", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRegion: Self = this.set("region", js.undefined)
    @scala.inline
    def setSecretAccessKey(value: String): Self = this.set("secretAccessKey", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSecretAccessKey: Self = this.set("secretAccessKey", js.undefined)
    @scala.inline
    def setUseEnvironment(value: Boolean): Self = this.set("useEnvironment", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteUseEnvironment: Self = this.set("useEnvironment", js.undefined)
  }
  
}

