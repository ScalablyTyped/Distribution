package typings.wouter.anon

import typings.wouter.wouterUseLocationMod.Path
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait To extends StObject {
  
  var href: Path = js.native
  
  var to: js.UndefOr[scala.Nothing] = js.native
}
object To {
  
  @scala.inline
  def apply(href: Path): To = {
    val __obj = js.Dynamic.literal(href = href.asInstanceOf[js.Any])
    __obj.asInstanceOf[To]
  }
  
  @scala.inline
  implicit class ToMutableBuilder[Self <: To] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setHref(value: Path): Self = StObject.set(x, "href", value.asInstanceOf[js.Any])
  }
}
