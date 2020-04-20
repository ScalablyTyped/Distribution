package typings.webgme

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonUri extends js.Object {
  /**
    * Options for MongoClient.connect
    * config.mongo.options = see config
    */
  var options: String
  /**
    * MongoDB connection uri
    * config.mongo.uri = 'mongodb://127.0.0.1:27017/multi';
    */
  var uri: String
}

object AnonUri {
  @scala.inline
  def apply(options: String, uri: String): AnonUri = {
    val __obj = js.Dynamic.literal(options = options.asInstanceOf[js.Any], uri = uri.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonUri]
  }
}

