package typings
package twilioDashSyncLib.libLivequeryMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait LiveQueryDescriptor extends js.Object {
  var indexName: java.lang.String
  var queryExpression: java.lang.String
  var queryUri: java.lang.String
  var sid: java.lang.String
}

object LiveQueryDescriptor {
  @scala.inline
  def apply(
    indexName: java.lang.String,
    queryExpression: java.lang.String,
    queryUri: java.lang.String,
    sid: java.lang.String
  ): LiveQueryDescriptor = {
    val __obj = js.Dynamic.literal(indexName = indexName, queryExpression = queryExpression, queryUri = queryUri, sid = sid)
  
    __obj.asInstanceOf[LiveQueryDescriptor]
  }
}

