package typings.ydnDb

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait IndexSchemaJson extends StObject {
  
  var keyPath: String | js.Array[String] = js.native
  
  var multiEntry: js.UndefOr[Boolean] = js.native
  
  var name: js.UndefOr[String] = js.native
  
  var `type`: js.UndefOr[String] = js.native
  
  var unique: js.UndefOr[Boolean] = js.native
}
object IndexSchemaJson {
  
  @scala.inline
  def apply(keyPath: String | js.Array[String]): IndexSchemaJson = {
    val __obj = js.Dynamic.literal(keyPath = keyPath.asInstanceOf[js.Any])
    __obj.asInstanceOf[IndexSchemaJson]
  }
  
  @scala.inline
  implicit class IndexSchemaJsonMutableBuilder[Self <: IndexSchemaJson] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setKeyPath(value: String | js.Array[String]): Self = StObject.set(x, "keyPath", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setKeyPathVarargs(value: String*): Self = StObject.set(x, "keyPath", js.Array(value :_*))
    
    @scala.inline
    def setMultiEntry(value: Boolean): Self = StObject.set(x, "multiEntry", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMultiEntryUndefined: Self = StObject.set(x, "multiEntry", js.undefined)
    
    @scala.inline
    def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    @scala.inline
    def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
    
    @scala.inline
    def setUnique(value: Boolean): Self = StObject.set(x, "unique", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUniqueUndefined: Self = StObject.set(x, "unique", js.undefined)
  }
}
