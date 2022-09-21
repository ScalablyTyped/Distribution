package typings.typedoc.anon

import typings.typedoc.typedocStrings.entryPointStrategy
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `13` extends StObject {
  
  var name: entryPointStrategy
}
object `13` {
  
  inline def apply(): `13` = {
    val __obj = js.Dynamic.literal(name = "entryPointStrategy")
    __obj.asInstanceOf[`13`]
  }
  
  extension [Self <: `13`](x: Self) {
    
    inline def setName(value: entryPointStrategy): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
  }
}
