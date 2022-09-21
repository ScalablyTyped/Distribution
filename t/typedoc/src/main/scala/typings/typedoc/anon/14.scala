package typings.typedoc.anon

import typings.typedoc.typedocStrings.githubPages
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `14` extends StObject {
  
  var name: githubPages
}
object `14` {
  
  inline def apply(): `14` = {
    val __obj = js.Dynamic.literal(name = "githubPages")
    __obj.asInstanceOf[`14`]
  }
  
  extension [Self <: `14`](x: Self) {
    
    inline def setName(value: githubPages): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
  }
}
