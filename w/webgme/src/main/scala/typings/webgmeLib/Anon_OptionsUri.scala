package typings
package webgmeLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_OptionsUri extends js.Object {
  /**
    * Options for MongoClient.connect
    * config.mongo.options = see config
    */
  var options: java.lang.String
  /**
    * MongoDB connection uri
    * config.mongo.uri = 'mongodb://127.0.0.1:27017/multi';
    */
  var uri: java.lang.String
}

object Anon_OptionsUri {
  @scala.inline
  def apply(options: java.lang.String, uri: java.lang.String): Anon_OptionsUri = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("options")(options)
    __obj.updateDynamic("uri")(uri)
    __obj.asInstanceOf[Anon_OptionsUri]
  }
}

