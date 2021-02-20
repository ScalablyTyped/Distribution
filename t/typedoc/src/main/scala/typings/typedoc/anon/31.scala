package typings.typedoc.anon

import typings.typedoc.typedocStrings.gaSite
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait `31` extends StObject {
  
  var name: gaSite = js.native
}
object `31` {
  
  @scala.inline
  def apply(name: gaSite): `31` = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any])
    __obj.asInstanceOf[`31`]
  }
  
  @scala.inline
  implicit class `31MutableBuilder`[Self <: `31`] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setName(value: gaSite): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
  }
}
