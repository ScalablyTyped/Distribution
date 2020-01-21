package typings.winstonDynamodb.mod

import typings.std.Transport
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("winston-dynamodb", "DynamoDB")
@js.native
class DynamoDB ()
  extends Transport
     with DynamoDBTransportInstance {
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

