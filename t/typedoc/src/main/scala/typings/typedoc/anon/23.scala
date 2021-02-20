package typings.typedoc.anon

import typings.typedoc.typedocStrings.excludeTags
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait `23` extends StObject {
  
  var name: excludeTags = js.native
}
object `23` {
  
  @scala.inline
  def apply(name: excludeTags): `23` = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any])
    __obj.asInstanceOf[`23`]
  }
  
  @scala.inline
  implicit class `23MutableBuilder`[Self <: `23`] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setName(value: excludeTags): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
  }
}
