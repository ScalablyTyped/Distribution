package typings.tengitsui.mod

import typings.std.Element
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ComposeProps extends StObject {
  
  var Layout: typings.tengitsui.mod.Layout
  
  var name: String
  
  var schema: AdvancedSchema
}
object ComposeProps {
  
  inline def apply(Layout: /* props */ js.Object => js.Array[Element], name: String, schema: AdvancedSchema): ComposeProps = {
    val __obj = js.Dynamic.literal(Layout = js.Any.fromFunction1(Layout), name = name.asInstanceOf[js.Any], schema = schema.asInstanceOf[js.Any])
    __obj.asInstanceOf[ComposeProps]
  }
  
  extension [Self <: ComposeProps](x: Self) {
    
    inline def setLayout(value: /* props */ js.Object => js.Array[Element]): Self = StObject.set(x, "Layout", js.Any.fromFunction1(value))
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setSchema(value: AdvancedSchema): Self = StObject.set(x, "schema", value.asInstanceOf[js.Any])
  }
}
