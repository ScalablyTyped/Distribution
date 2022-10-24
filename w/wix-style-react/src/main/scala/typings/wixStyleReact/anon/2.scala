package typings.wixStyleReact.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `2` extends StObject {
  
  def onClick(): Unit
}
object `2` {
  
  inline def apply(onClick: () => Unit): `2` = {
    val __obj = js.Dynamic.literal(onClick = js.Any.fromFunction0(onClick))
    __obj.asInstanceOf[`2`]
  }
  
  extension [Self <: `2`](x: Self) {
    
    inline def setOnClick(value: () => Unit): Self = StObject.set(x, "onClick", js.Any.fromFunction0(value))
  }
}
