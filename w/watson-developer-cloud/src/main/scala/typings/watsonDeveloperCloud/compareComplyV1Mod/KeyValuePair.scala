package typings.watsonDeveloperCloud.compareComplyV1Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Key-value pairs detected across cell boundaries. */
trait KeyValuePair extends StObject {
  
  /** A key in a key-value pair. */
  var key: js.UndefOr[Key] = js.undefined
  
  /** A value in a key-value pair. */
  var value: js.UndefOr[Value] = js.undefined
}
object KeyValuePair {
  
  @scala.inline
  def apply(): KeyValuePair = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[KeyValuePair]
  }
  
  @scala.inline
  implicit class KeyValuePairMutableBuilder[Self <: KeyValuePair] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setKey(value: Key): Self = StObject.set(x, "key", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setKeyUndefined: Self = StObject.set(x, "key", js.undefined)
    
    @scala.inline
    def setValue(value: Value): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setValueUndefined: Self = StObject.set(x, "value", js.undefined)
  }
}
