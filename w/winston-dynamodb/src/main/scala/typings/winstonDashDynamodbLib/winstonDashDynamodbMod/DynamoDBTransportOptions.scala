package typings
package winstonDashDynamodbLib.winstonDashDynamodbMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DynamoDBTransportOptions extends js.Object {
  var accessKeyId: js.UndefOr[java.lang.String] = js.undefined
  var dynamoDoc: js.UndefOr[scala.Boolean] = js.undefined
  var level: java.lang.String
  var region: js.UndefOr[java.lang.String] = js.undefined
  var secretAccessKey: js.UndefOr[java.lang.String] = js.undefined
  var tableName: java.lang.String
  var useEnvironment: js.UndefOr[scala.Boolean] = js.undefined
}

object DynamoDBTransportOptions {
  @scala.inline
  def apply(
    level: java.lang.String,
    tableName: java.lang.String,
    accessKeyId: java.lang.String = null,
    dynamoDoc: js.UndefOr[scala.Boolean] = js.undefined,
    region: java.lang.String = null,
    secretAccessKey: java.lang.String = null,
    useEnvironment: js.UndefOr[scala.Boolean] = js.undefined
  ): DynamoDBTransportOptions = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("level")(level)
    __obj.updateDynamic("tableName")(tableName)
    if (accessKeyId != null) __obj.updateDynamic("accessKeyId")(accessKeyId)
    if (!js.isUndefined(dynamoDoc)) __obj.updateDynamic("dynamoDoc")(dynamoDoc)
    if (region != null) __obj.updateDynamic("region")(region)
    if (secretAccessKey != null) __obj.updateDynamic("secretAccessKey")(secretAccessKey)
    if (!js.isUndefined(useEnvironment)) __obj.updateDynamic("useEnvironment")(useEnvironment)
    __obj.asInstanceOf[DynamoDBTransportOptions]
  }
}

