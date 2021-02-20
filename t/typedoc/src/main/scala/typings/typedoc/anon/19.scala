package typings.typedoc.anon

import typings.typedoc.typedocStrings.tsconfig
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait `19` extends StObject {
  
  var name: tsconfig = js.native
}
object `19` {
  
  @scala.inline
  def apply(name: tsconfig): `19` = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any])
    __obj.asInstanceOf[`19`]
  }
  
  @scala.inline
  implicit class `19MutableBuilder`[Self <: `19`] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setName(value: tsconfig): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
  }
}
