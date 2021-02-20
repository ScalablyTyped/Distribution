package typings.stylus.anon

import typings.stylus.mod.Stylus.Nodes.Selector
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Selectors extends StObject {
  
  var __type: String = js.native
  
  var column: Double = js.native
  
  var filename: String = js.native
  
  var lineno: Double = js.native
  
  var selectors: js.Array[Selector] = js.native
}
object Selectors {
  
  @scala.inline
  def apply(__type: String, column: Double, filename: String, lineno: Double, selectors: js.Array[Selector]): Selectors = {
    val __obj = js.Dynamic.literal(__type = __type.asInstanceOf[js.Any], column = column.asInstanceOf[js.Any], filename = filename.asInstanceOf[js.Any], lineno = lineno.asInstanceOf[js.Any], selectors = selectors.asInstanceOf[js.Any])
    __obj.asInstanceOf[Selectors]
  }
  
  @scala.inline
  implicit class SelectorsMutableBuilder[Self <: Selectors] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setColumn(value: Double): Self = StObject.set(x, "column", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFilename(value: String): Self = StObject.set(x, "filename", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLineno(value: Double): Self = StObject.set(x, "lineno", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSelectors(value: js.Array[Selector]): Self = StObject.set(x, "selectors", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSelectorsVarargs(value: Selector*): Self = StObject.set(x, "selectors", js.Array(value :_*))
    
    @scala.inline
    def set__type(value: String): Self = StObject.set(x, "__type", value.asInstanceOf[js.Any])
  }
}
