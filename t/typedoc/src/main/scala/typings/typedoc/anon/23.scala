package typings.typedoc.anon

import typings.typedoc.typedocStrings.excludeTags
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `23` extends StObject {
  
  var name: excludeTags
}
object `23` {
  
  @scala.inline
  def apply(): `23` = {
    val __obj = js.Dynamic.literal(name = "excludeTags")
    __obj.asInstanceOf[`23`]
  }
  
  @scala.inline
  implicit class `23MutableBuilder`[Self <: `23`] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setName(value: excludeTags): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
  }
}
