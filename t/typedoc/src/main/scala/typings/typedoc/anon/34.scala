package typings.typedoc.anon

import typings.typedoc.typedocStrings.media
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `34` extends StObject {
  
  var name: media
}
object `34` {
  
  inline def apply(): `34` = {
    val __obj = js.Dynamic.literal(name = "media")
    __obj.asInstanceOf[`34`]
  }
  
  extension [Self <: `34`](x: Self) {
    
    inline def setName(value: media): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
  }
}
