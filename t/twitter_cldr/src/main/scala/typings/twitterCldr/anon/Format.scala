package typings.twitterCldr.anon

import typings.twitterCldr.twitterCldrStrings.date
import typings.twitterCldr.twitterCldrStrings.full
import typings.twitterCldr.twitterCldrStrings.long
import typings.twitterCldr.twitterCldrStrings.medium
import typings.twitterCldr.twitterCldrStrings.short
import typings.twitterCldr.twitterCldrStrings.time
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Format extends StObject {
  
  var format: js.UndefOr[date | time] = js.undefined
  
  var `type`: js.UndefOr[full | long | medium | short] = js.undefined
}
object Format {
  
  inline def apply(): Format = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Format]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Format] (val x: Self) extends AnyVal {
    
    inline def setFormat(value: date | time): Self = StObject.set(x, "format", value.asInstanceOf[js.Any])
    
    inline def setFormatUndefined: Self = StObject.set(x, "format", js.undefined)
    
    inline def setType(value: full | long | medium | short): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    inline def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
  }
}
