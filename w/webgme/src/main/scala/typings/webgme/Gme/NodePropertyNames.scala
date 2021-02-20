package typings.webgme.Gme

import typings.webgme.anon.Name
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait NodePropertyNames extends StObject {
  
  var Attributes: Name = js.native
}
object NodePropertyNames {
  
  @scala.inline
  def apply(Attributes: Name): NodePropertyNames = {
    val __obj = js.Dynamic.literal(Attributes = Attributes.asInstanceOf[js.Any])
    __obj.asInstanceOf[NodePropertyNames]
  }
  
  @scala.inline
  implicit class NodePropertyNamesMutableBuilder[Self <: NodePropertyNames] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAttributes(value: Name): Self = StObject.set(x, "Attributes", value.asInstanceOf[js.Any])
  }
}
