package typings.webgme.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Uri extends StObject {
  
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
object Uri {
  
  @scala.inline
  def apply(options: String, uri: String): Uri = {
    val __obj = js.Dynamic.literal(options = options.asInstanceOf[js.Any], uri = uri.asInstanceOf[js.Any])
    __obj.asInstanceOf[Uri]
  }
  
  @scala.inline
  implicit class UriMutableBuilder[Self <: Uri] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setOptions(value: String): Self = StObject.set(x, "options", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUri(value: String): Self = StObject.set(x, "uri", value.asInstanceOf[js.Any])
  }
}
