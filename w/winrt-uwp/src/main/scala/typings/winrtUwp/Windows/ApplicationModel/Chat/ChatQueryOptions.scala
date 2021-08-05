package typings.winrtUwp.Windows.ApplicationModel.Chat

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Represents the criteria for finding chat messages. */
trait ChatQueryOptions extends StObject {
  
  /** Gets or sets the string to search for the in ChatMessageStore . */
  var searchString: String
}
object ChatQueryOptions {
  
  inline def apply(searchString: String): ChatQueryOptions = {
    val __obj = js.Dynamic.literal(searchString = searchString.asInstanceOf[js.Any])
    __obj.asInstanceOf[ChatQueryOptions]
  }
  
  extension [Self <: ChatQueryOptions](x: Self) {
    
    inline def setSearchString(value: String): Self = StObject.set(x, "searchString", value.asInstanceOf[js.Any])
  }
}
