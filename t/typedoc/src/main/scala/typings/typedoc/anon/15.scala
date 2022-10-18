package typings.typedoc.anon

import typings.typedoc.typedocStrings.githubPages
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `15` extends StObject {
  
  var name: githubPages
}
object `15` {
  
  inline def apply(): `15` = {
    val __obj = js.Dynamic.literal(name = "githubPages")
    __obj.asInstanceOf[`15`]
  }
  
  extension [Self <: `15`](x: Self) {
    
    inline def setName(value: githubPages): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
  }
}
