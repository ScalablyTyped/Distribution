package typings.webidl2.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ParseOptions extends StObject {
  
  /** Boolean indicating whether the result should include EOF node or not. */
  var concrete: js.UndefOr[Boolean] = js.native
  
  /** The source name, typically a filename. Errors and validation objects can indicate their origin if you pass a value. */
  var sourceName: js.UndefOr[String] = js.native
}
object ParseOptions {
  
  @scala.inline
  def apply(): ParseOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ParseOptions]
  }
  
  @scala.inline
  implicit class ParseOptionsMutableBuilder[Self <: ParseOptions] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setConcrete(value: Boolean): Self = StObject.set(x, "concrete", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setConcreteUndefined: Self = StObject.set(x, "concrete", js.undefined)
    
    @scala.inline
    def setSourceName(value: String): Self = StObject.set(x, "sourceName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSourceNameUndefined: Self = StObject.set(x, "sourceName", js.undefined)
  }
}
