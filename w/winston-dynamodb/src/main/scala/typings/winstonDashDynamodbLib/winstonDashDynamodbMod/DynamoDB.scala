package typings
package winstonDashDynamodbLib.winstonDashDynamodbMod

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
  var dynamoDoc: scala.Boolean = js.native
  var level: java.lang.String = js.native
  var name: java.lang.String = js.native
  var region: java.lang.String = js.native
  var regions: js.Array[java.lang.String] = js.native
  var tableName: java.lang.String = js.native
  def log(level: js.Any, msg: js.Any, meta: js.Any, callback: js.Any): js.Any = js.native
}

