package typings.typedoc.anon

import typings.typedoc.typedocStrings.media
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `33` extends StObject {
  
  var name: media
}
object `33` {
  
  inline def apply(): `33` = {
    val __obj = js.Dynamic.literal(name = "media")
    __obj.asInstanceOf[`33`]
  }
  
  extension [Self <: `33`](x: Self) {
    
    inline def setName(value: media): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
  }
}
