package typings.typedoc.anon

import typings.typedoc.typedocStrings.entryPoints
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `20` extends StObject {
  
  var name: entryPoints
}
object `20` {
  
  inline def apply(): `20` = {
    val __obj = js.Dynamic.literal(name = "entryPoints")
    __obj.asInstanceOf[`20`]
  }
  
  extension [Self <: `20`](x: Self) {
    
    inline def setName(value: entryPoints): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
  }
}
