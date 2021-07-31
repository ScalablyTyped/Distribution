package typings.wordpressApiFetch.anon

import org.scalablytyped.runtime.StringDictionary
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Dictk
  extends StObject
     with /* k */ StringDictionary[js.Any] {
  
  var href: String
}
object Dictk {
  
  @scala.inline
  def apply(href: String): Dictk = {
    val __obj = js.Dynamic.literal(href = href.asInstanceOf[js.Any])
    __obj.asInstanceOf[Dictk]
  }
  
  @scala.inline
  implicit class DictkMutableBuilder[Self <: Dictk] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setHref(value: String): Self = StObject.set(x, "href", value.asInstanceOf[js.Any])
  }
}
