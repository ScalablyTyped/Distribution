package typings.winstonDynamodb.mod

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
    val __obj = js.Dynamic.literal(level = level.asInstanceOf[js.Any], tableName = tableName.asInstanceOf[js.Any])
    if (accessKeyId != null) __obj.updateDynamic("accessKeyId")(accessKeyId.asInstanceOf[js.Any])
    if (!js.isUndefined(dynamoDoc)) __obj.updateDynamic("dynamoDoc")(dynamoDoc.asInstanceOf[js.Any])
    if (region != null) __obj.updateDynamic("region")(region.asInstanceOf[js.Any])
    if (secretAccessKey != null) __obj.updateDynamic("secretAccessKey")(secretAccessKey.asInstanceOf[js.Any])
    if (!js.isUndefined(useEnvironment)) __obj.updateDynamic("useEnvironment")(useEnvironment.asInstanceOf[js.Any])
    __obj.asInstanceOf[DynamoDBTransportOptions]
  }
}

