package typings.typedoc.anon

import typings.typedoc.typedocStrings.categorizeByGroup
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait `33` extends StObject {
  
  var name: categorizeByGroup = js.native
}
object `33` {
  
  @scala.inline
  def apply(name: categorizeByGroup): `33` = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any])
    __obj.asInstanceOf[`33`]
  }
  
  @scala.inline
  implicit class `33MutableBuilder`[Self <: `33`] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setName(value: categorizeByGroup): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
  }
}
