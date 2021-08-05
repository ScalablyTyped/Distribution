package typings.stylableCore.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Dirname extends StObject {
  
  def dirname(path: String): String
  
  def relative(from: String, to: String): String
}
object Dirname {
  
  inline def apply(dirname: String => String, relative: (String, String) => String): Dirname = {
    val __obj = js.Dynamic.literal(dirname = js.Any.fromFunction1(dirname), relative = js.Any.fromFunction2(relative))
    __obj.asInstanceOf[Dirname]
  }
  
  extension [Self <: Dirname](x: Self) {
    
    inline def setDirname(value: String => String): Self = StObject.set(x, "dirname", js.Any.fromFunction1(value))
    
    inline def setRelative(value: (String, String) => String): Self = StObject.set(x, "relative", js.Any.fromFunction2(value))
  }
}
