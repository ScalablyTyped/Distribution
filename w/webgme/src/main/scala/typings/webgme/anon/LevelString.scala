package typings.webgme.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait LevelString extends StObject {
  
  var level: String
}
object LevelString {
  
  inline def apply(level: String): LevelString = {
    val __obj = js.Dynamic.literal(level = level.asInstanceOf[js.Any])
    __obj.asInstanceOf[LevelString]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: LevelString] (val x: Self) extends AnyVal {
    
    inline def setLevel(value: String): Self = StObject.set(x, "level", value.asInstanceOf[js.Any])
  }
}
