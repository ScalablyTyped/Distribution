package typings.vegaTypings.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Href extends StObject {
  
  var href: String
}
object Href {
  
  @scala.inline
  def apply(href: String): Href = {
    val __obj = js.Dynamic.literal(href = href.asInstanceOf[js.Any])
    __obj.asInstanceOf[Href]
  }
  
  @scala.inline
  implicit class HrefMutableBuilder[Self <: Href] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setHref(value: String): Self = StObject.set(x, "href", value.asInstanceOf[js.Any])
  }
}
