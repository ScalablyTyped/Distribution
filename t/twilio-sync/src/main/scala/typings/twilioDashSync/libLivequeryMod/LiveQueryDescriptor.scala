package typings.twilioDashSync.libLivequeryMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait LiveQueryDescriptor extends js.Object {
  var indexName: String
  var queryExpression: String
  var queryUri: String
  var sid: String
}

object LiveQueryDescriptor {
  @scala.inline
  def apply(indexName: String, queryExpression: String, queryUri: String, sid: String): LiveQueryDescriptor = {
    val __obj = js.Dynamic.literal(indexName = indexName.asInstanceOf[js.Any], queryExpression = queryExpression.asInstanceOf[js.Any], queryUri = queryUri.asInstanceOf[js.Any], sid = sid.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[LiveQueryDescriptor]
  }
}

