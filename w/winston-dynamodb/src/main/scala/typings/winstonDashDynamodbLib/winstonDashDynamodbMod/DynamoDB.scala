package typings
package winstonDashDynamodbLib.winstonDashDynamodbMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("winston-dynamodb", "DynamoDB")
@js.native
class DynamoDB ()
  extends winstonDashTransportLib.winstonDashTransportMod.namespaced
     with DynamoDBTransportInstance {
  def this(options: DynamoDBTransportOptions) = this()
  var AWS: js.Any = js.native
  var db: js.Any = js.native
  var dynamoDoc: scala.Boolean = js.native
  @JSName("level")
  var level_DynamoDB: java.lang.String = js.native
  var name: java.lang.String = js.native
  var region: java.lang.String = js.native
  var regions: js.Array[java.lang.String] = js.native
  var tableName: java.lang.String = js.native
  @JSName("log")
  def log_MDynamoDB(level: js.Any, msg: js.Any, meta: js.Any, callback: js.Any): js.Any = js.native
}

