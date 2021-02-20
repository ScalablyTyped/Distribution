package typings.wouter.anon

import typings.wouter.useLocationMod.Path
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait HrefPath extends StObject {
  
  var href: Path = js.native
  
  var to: js.UndefOr[scala.Nothing] = js.native
}
object HrefPath {
  
  @scala.inline
  def apply(href: Path): HrefPath = {
    val __obj = js.Dynamic.literal(href = href.asInstanceOf[js.Any])
    __obj.asInstanceOf[HrefPath]
  }
  
  @scala.inline
  implicit class HrefPathMutableBuilder[Self <: HrefPath] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setHref(value: Path): Self = StObject.set(x, "href", value.asInstanceOf[js.Any])
  }
}
