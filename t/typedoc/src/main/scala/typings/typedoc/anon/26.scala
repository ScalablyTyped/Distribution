package typings.typedoc.anon

import typings.typedoc.typedocStrings.gitRevision
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait `26` extends StObject {
  
  var name: gitRevision = js.native
}
object `26` {
  
  @scala.inline
  def apply(name: gitRevision): `26` = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any])
    __obj.asInstanceOf[`26`]
  }
  
  @scala.inline
  implicit class `26MutableBuilder`[Self <: `26`] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setName(value: gitRevision): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
  }
}
