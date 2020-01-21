package typings.winstonDynamodb.mod.winstonAugmentingMod

import typings.winstonDynamodb.mod.DynamoDB
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Transports extends js.Object {
  var DynamoDB: typings.winstonDynamodb.mod.DynamoDB
}

object Transports {
  @scala.inline
  def apply(DynamoDB: DynamoDB): Transports = {
    val __obj = js.Dynamic.literal(DynamoDB = DynamoDB.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[Transports]
  }
}

