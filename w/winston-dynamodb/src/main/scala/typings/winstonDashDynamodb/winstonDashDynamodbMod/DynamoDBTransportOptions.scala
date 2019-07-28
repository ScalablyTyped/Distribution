package typings.winstonDashDynamodb.winstonDashDynamodbMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DynamoDBTransportOptions extends js.Object {
  var accessKeyId: js.UndefOr[String] = js.undefined
  var dynamoDoc: js.UndefOr[Boolean] = js.undefined
  var level: String
  var region: js.UndefOr[String] = js.undefined
  var secretAccessKey: js.UndefOr[String] = js.undefined
  var tableName: String
  var useEnvironment: js.UndefOr[Boolean] = js.undefined
}

object DynamoDBTransportOptions {
  @scala.inline
  def apply(
    level: String,
    tableName: String,
    accessKeyId: String = null,
    dynamoDoc: js.UndefOr[Boolean] = js.undefined,
    region: String = null,
    secretAccessKey: String = null,
    useEnvironment: js.UndefOr[Boolean] = js.undefined
  ): DynamoDBTransportOptions = {
    val __obj = js.Dynamic.literal(level = level, tableName = tableName)
    if (accessKeyId != null) __obj.updateDynamic("accessKeyId")(accessKeyId)
    if (!js.isUndefined(dynamoDoc)) __obj.updateDynamic("dynamoDoc")(dynamoDoc)
    if (region != null) __obj.updateDynamic("region")(region)
    if (secretAccessKey != null) __obj.updateDynamic("secretAccessKey")(secretAccessKey)
    if (!js.isUndefined(useEnvironment)) __obj.updateDynamic("useEnvironment")(useEnvironment)
    __obj.asInstanceOf[DynamoDBTransportOptions]
  }
}

