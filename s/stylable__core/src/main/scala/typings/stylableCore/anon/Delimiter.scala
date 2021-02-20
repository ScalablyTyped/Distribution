package typings.stylableCore.anon

import typings.stylableCore.customValuesMod.Box_
import typings.stylableCore.stylableCoreStrings.Comma
import typings.stylableCore.stylableCoreStrings.Space
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Delimiter extends StObject {
  
  var delimiter: Comma | Space = js.native
  
  var parts: js.Array[String | (Box_[String, _])] = js.native
}
object Delimiter {
  
  @scala.inline
  def apply(delimiter: Comma | Space, parts: js.Array[String | (Box_[String, _])]): Delimiter = {
    val __obj = js.Dynamic.literal(delimiter = delimiter.asInstanceOf[js.Any], parts = parts.asInstanceOf[js.Any])
    __obj.asInstanceOf[Delimiter]
  }
  
  @scala.inline
  implicit class DelimiterMutableBuilder[Self <: Delimiter] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDelimiter(value: Comma | Space): Self = StObject.set(x, "delimiter", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setParts(value: js.Array[String | (Box_[String, _])]): Self = StObject.set(x, "parts", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPartsVarargs(value: (String | (Box_[String, js.Any]))*): Self = StObject.set(x, "parts", js.Array(value :_*))
  }
}
