package typings.twitterCldr.anon

import typings.twitterCldr.mod.UnicodeRegex
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Compile extends StObject {
  
  def compile(source: String, flags: String): UnicodeRegex
}
object Compile {
  
  inline def apply(compile: (String, String) => UnicodeRegex): Compile = {
    val __obj = js.Dynamic.literal(compile = js.Any.fromFunction2(compile))
    __obj.asInstanceOf[Compile]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Compile] (val x: Self) extends AnyVal {
    
    inline def setCompile(value: (String, String) => UnicodeRegex): Self = StObject.set(x, "compile", js.Any.fromFunction2(value))
  }
}
