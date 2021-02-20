package typings.winrtUwp.Windows.Web.Syndication

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Represents a custom attribute not defined in the specification. */
@js.native
trait SyndicationAttribute extends StObject {
  
  /** Gets the name of the syndication attribute. */
  var name: String = js.native
  
  /** Gets the namespace of the attribute. */
  var namespace: String = js.native
  
  /** Gets or sets the value of the attribute. */
  var value: String = js.native
}
object SyndicationAttribute {
  
  @scala.inline
  def apply(name: String, namespace: String, value: String): SyndicationAttribute = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any], namespace = namespace.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
    __obj.asInstanceOf[SyndicationAttribute]
  }
  
  @scala.inline
  implicit class SyndicationAttributeMutableBuilder[Self <: SyndicationAttribute] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNamespace(value: String): Self = StObject.set(x, "namespace", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setValue(value: String): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
  }
}
