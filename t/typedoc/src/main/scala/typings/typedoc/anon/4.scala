package typings.typedoc.anon

import typings.typedoc.typedocStrings.gitRemote
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `4` extends StObject {
  
  var name: gitRemote
}
object `4` {
  
  inline def apply(): `4` = {
    val __obj = js.Dynamic.literal(name = "gitRemote")
    __obj.asInstanceOf[`4`]
  }
  
  extension [Self <: `4`](x: Self) {
    
    inline def setName(value: gitRemote): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
  }
}
