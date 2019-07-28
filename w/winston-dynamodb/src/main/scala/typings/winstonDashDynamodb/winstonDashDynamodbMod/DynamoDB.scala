package typings.winstonDashDynamodb.winstonDashDynamodbMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* import warning: RemoveDifficultInheritance.summarizeChanges 
- Dropped 'usb' | 'nfc' | 'ble' */ @JSImport("winston-dynamodb", "DynamoDB")
@js.native
class DynamoDB () extends DynamoDBTransportInstance {
  def this(options: DynamoDBTransportOptions) = this()
  var AWS: js.Any = js.native
  var db: js.Any = js.native
  var dynamoDoc: Boolean = js.native
  var level: String = js.native
  var name: String = js.native
  var region: String = js.native
  var regions: js.Array[String] = js.native
  var tableName: String = js.native
  def log(level: js.Any, msg: js.Any, meta: js.Any, callback: js.Any): js.Any = js.native
}

