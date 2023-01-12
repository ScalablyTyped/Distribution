package typings.xterm.mod

import typings.xterm.xtermInts.`0`
import typings.xterm.xtermInts.`1`
import typings.xterm.xtermInts.`2`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IUnicodeVersionProvider extends StObject {
  
  /**
    * String indicating the Unicode version provided.
    */
  val version: String
  
  /**
    * Unicode version dependent wcwidth implementation.
    */
  def wcwidth(codepoint: Double): `0` | `1` | `2`
}
object IUnicodeVersionProvider {
  
  inline def apply(version: String, wcwidth: Double => `0` | `1` | `2`): IUnicodeVersionProvider = {
    val __obj = js.Dynamic.literal(version = version.asInstanceOf[js.Any], wcwidth = js.Any.fromFunction1(wcwidth))
    __obj.asInstanceOf[IUnicodeVersionProvider]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: IUnicodeVersionProvider] (val x: Self) extends AnyVal {
    
    inline def setVersion(value: String): Self = StObject.set(x, "version", value.asInstanceOf[js.Any])
    
    inline def setWcwidth(value: Double => `0` | `1` | `2`): Self = StObject.set(x, "wcwidth", js.Any.fromFunction1(value))
  }
}
