package typings.ts3NodejsLibrary.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Pick<ts3-nodejs-library.ts3-nodejs-library/lib/transport/Command.Command.ParserArgument, 'raw'> */
trait PickParserArgumentraw extends StObject {
  
  var raw: String
}
object PickParserArgumentraw {
  
  inline def apply(raw: String): PickParserArgumentraw = {
    val __obj = js.Dynamic.literal(raw = raw.asInstanceOf[js.Any])
    __obj.asInstanceOf[PickParserArgumentraw]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: PickParserArgumentraw] (val x: Self) extends AnyVal {
    
    inline def setRaw(value: String): Self = StObject.set(x, "raw", value.asInstanceOf[js.Any])
  }
}
