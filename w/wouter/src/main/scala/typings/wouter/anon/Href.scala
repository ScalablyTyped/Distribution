package typings.wouter.anon

import typings.wouter.wouterUseLocationMod.Path
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Href extends StObject {
  
  var href: js.UndefOr[scala.Nothing] = js.undefined
  
  var to: Path
}
object Href {
  
  @scala.inline
  def apply(to: Path): Href = {
    val __obj = js.Dynamic.literal(to = to.asInstanceOf[js.Any])
    __obj.asInstanceOf[Href]
  }
  
  @scala.inline
  implicit class HrefMutableBuilder[Self <: Href] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setTo(value: Path): Self = StObject.set(x, "to", value.asInstanceOf[js.Any])
  }
}
