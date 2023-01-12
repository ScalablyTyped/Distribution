package typings.typedoc.anon

import typings.typedoc.typedocStrings.commentStyle
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `56` extends StObject {
  
  var name: commentStyle
}
object `56` {
  
  inline def apply(): `56` = {
    val __obj = js.Dynamic.literal(name = "commentStyle")
    __obj.asInstanceOf[`56`]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: `56`] (val x: Self) extends AnyVal {
    
    inline def setName(value: commentStyle): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
  }
}
