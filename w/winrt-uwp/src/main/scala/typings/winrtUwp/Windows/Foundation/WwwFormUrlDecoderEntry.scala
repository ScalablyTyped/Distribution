package typings.winrtUwp.Windows.Foundation

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Represents a name-value pair in a URL query string. Use the IWwwFormUrlDecoderEntry interface instead; see Remarks. */
@js.native
trait WwwFormUrlDecoderEntry extends StObject {
  
  /** Represents the name of a parameter in a URL query string. Use the IWwwFormUrlDecoderEntry interface version ( IWwwFormUrlDecoderEntry.Name ) instead; see Remarks. */
  var name: String = js.native
  
  /** Represents a named value in a URL query string. Use the IWwwFormUrlDecoderEntry interface version ( IWwwFormUrlDecoderEntry.Value ) instead; see Remarks. */
  var value: String = js.native
}
object WwwFormUrlDecoderEntry {
  
  @scala.inline
  def apply(name: String, value: String): WwwFormUrlDecoderEntry = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
    __obj.asInstanceOf[WwwFormUrlDecoderEntry]
  }
  
  @scala.inline
  implicit class WwwFormUrlDecoderEntryMutableBuilder[Self <: WwwFormUrlDecoderEntry] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setValue(value: String): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
  }
}
