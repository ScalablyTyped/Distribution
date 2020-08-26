package typings.webgme.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Uri extends js.Object {
  /**
    * Options for MongoClient.connect
    * config.mongo.options = see config
    */
  var options: String = js.native
  /**
    * MongoDB connection uri
    * config.mongo.uri = 'mongodb://127.0.0.1:27017/multi';
    */
  var uri: String = js.native
}

object Uri {
  @scala.inline
  def apply(options: String, uri: String): Uri = {
    val __obj = js.Dynamic.literal(options = options.asInstanceOf[js.Any], uri = uri.asInstanceOf[js.Any])
    __obj.asInstanceOf[Uri]
  }
  @scala.inline
  implicit class UriOps[Self <: Uri] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setOptions(value: String): Self = this.set("options", value.asInstanceOf[js.Any])
    @scala.inline
    def setUri(value: String): Self = this.set("uri", value.asInstanceOf[js.Any])
  }
  
}

