package typings
package winstonDashDynamodbLib.winstonDashDynamodbMod.winstonMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Transports extends js.Object {
  var DynamoDB: winstonDashDynamodbLib.winstonDashDynamodbMod.DynamoDB
}

object Transports {
  @scala.inline
  def apply(DynamoDB: winstonDashDynamodbLib.winstonDashDynamodbMod.DynamoDB): Transports = {
    val __obj = js.Dynamic.literal(DynamoDB = DynamoDB)
  
    __obj.asInstanceOf[Transports]
  }
}

