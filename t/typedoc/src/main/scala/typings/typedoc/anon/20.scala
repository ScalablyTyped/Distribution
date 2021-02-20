package typings.typedoc.anon

import typings.typedoc.typedocStrings.excludeNotExported
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait `20` extends StObject {
  
  var name: excludeNotExported = js.native
}
object `20` {
  
  @scala.inline
  def apply(name: excludeNotExported): `20` = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any])
    __obj.asInstanceOf[`20`]
  }
  
  @scala.inline
  implicit class `20MutableBuilder`[Self <: `20`] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setName(value: excludeNotExported): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
  }
}
