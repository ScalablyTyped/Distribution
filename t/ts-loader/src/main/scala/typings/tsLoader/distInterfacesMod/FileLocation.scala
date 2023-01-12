package typings.tsLoader.distInterfacesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait FileLocation extends StObject {
  
  /** 1-based */
  var character: Double
  
  /** 1-based */
  var line: Double
}
object FileLocation {
  
  inline def apply(character: Double, line: Double): FileLocation = {
    val __obj = js.Dynamic.literal(character = character.asInstanceOf[js.Any], line = line.asInstanceOf[js.Any])
    __obj.asInstanceOf[FileLocation]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: FileLocation] (val x: Self) extends AnyVal {
    
    inline def setCharacter(value: Double): Self = StObject.set(x, "character", value.asInstanceOf[js.Any])
    
    inline def setLine(value: Double): Self = StObject.set(x, "line", value.asInstanceOf[js.Any])
  }
}
