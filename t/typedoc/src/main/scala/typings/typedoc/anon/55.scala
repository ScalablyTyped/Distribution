package typings.typedoc.anon

import typings.typedoc.typedocStrings.gitRevision
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `55` extends StObject {
  
  var name: gitRevision
}
object `55` {
  
  inline def apply(): `55` = {
    val __obj = js.Dynamic.literal(name = "gitRevision")
    __obj.asInstanceOf[`55`]
  }
  
  extension [Self <: `55`](x: Self) {
    
    inline def setName(value: gitRevision): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
  }
}
