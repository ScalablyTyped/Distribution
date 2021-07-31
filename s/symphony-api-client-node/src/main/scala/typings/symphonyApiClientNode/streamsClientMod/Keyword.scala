package typings.symphonyApiClientNode.streamsClientMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Keyword extends StObject {
  
  var key: String
  
  var value: String
}
object Keyword {
  
  @scala.inline
  def apply(key: String, value: String): Keyword = {
    val __obj = js.Dynamic.literal(key = key.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
    __obj.asInstanceOf[Keyword]
  }
  
  @scala.inline
  implicit class KeywordMutableBuilder[Self <: Keyword] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setKey(value: String): Self = StObject.set(x, "key", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setValue(value: String): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
  }
}
