package typings.winrtUwp.Windows.Foundation

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Represents a name-value pair in a URL query string. */
@js.native
trait IWwwFormUrlDecoderEntry extends StObject {
  
  /** Represents the name of a parameter in a URL query string. */
  var name: String = js.native
  
  /** Represents a named value in a URL query string. */
  var value: String = js.native
}
object IWwwFormUrlDecoderEntry {
  
  @scala.inline
  def apply(name: String, value: String): IWwwFormUrlDecoderEntry = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
    __obj.asInstanceOf[IWwwFormUrlDecoderEntry]
  }
  
  @scala.inline
  implicit class IWwwFormUrlDecoderEntryMutableBuilder[Self <: IWwwFormUrlDecoderEntry] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setValue(value: String): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
  }
}
