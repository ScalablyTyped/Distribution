package typings.wixUiCore.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait OnClick extends StObject {
  
  def onClick(): String
}
object OnClick {
  
  inline def apply(onClick: () => String): OnClick = {
    val __obj = js.Dynamic.literal(onClick = js.Any.fromFunction0(onClick))
    __obj.asInstanceOf[OnClick]
  }
  
  extension [Self <: OnClick](x: Self) {
    
    inline def setOnClick(value: () => String): Self = StObject.set(x, "onClick", js.Any.fromFunction0(value))
  }
}
