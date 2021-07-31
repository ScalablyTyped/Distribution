package typings.typedoc.anon

import typings.typedoc.schemaMod.ModelToObject
import typings.typedoc.schemaMod._ModelToObject
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Pick<typedoc.typedoc/dist/lib/serialization/schema.StringLiteralType, 'type'> */
trait PickStringLiteralTypetype extends StObject {
  
  var `type`: (ModelToObject[/* "stringLiteral" */ String]) | (/* "stringLiteral" */ String)
}
object PickStringLiteralTypetype {
  
  @scala.inline
  def apply(`type`: (ModelToObject[/* "stringLiteral" */ String]) | (/* "stringLiteral" */ String)): PickStringLiteralTypetype = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[PickStringLiteralTypetype]
  }
  
  @scala.inline
  implicit class PickStringLiteralTypetypeMutableBuilder[Self <: PickStringLiteralTypetype] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setType(value: (ModelToObject[/* "stringLiteral" */ String]) | (/* "stringLiteral" */ String)): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTypeVarargs(value: _ModelToObject[js.Any]*): Self = StObject.set(x, "type", js.Array(value :_*))
  }
}
