package typings.typedoc.anon

import typings.typedoc.typedocStrings.gitRemote
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `9` extends StObject {
  
  var name: gitRemote
}
object `9` {
  
  inline def apply(): `9` = {
    val __obj = js.Dynamic.literal(name = "gitRemote")
    __obj.asInstanceOf[`9`]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: `9`] (val x: Self) extends AnyVal {
    
    inline def setName(value: gitRemote): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
  }
}
