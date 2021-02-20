package typings.wordpressComponents.anon

import typings.wordpressComponents.wordpressComponentsStrings.`bottom left`
import typings.wordpressComponents.wordpressComponentsStrings.`bottom right`
import typings.wordpressComponents.wordpressComponentsStrings.`top left`
import typings.wordpressComponents.wordpressComponentsStrings.`top right`
import typings.wordpressComponents.wordpressComponentsStrings.bottom
import typings.wordpressComponents.wordpressComponentsStrings.top
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Origin extends StObject {
  
  var origin: js.UndefOr[top | (`top left`) | (`top right`) | bottom | (`bottom left`) | (`bottom right`)] = js.native
}
object Origin {
  
  @scala.inline
  def apply(): Origin = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Origin]
  }
  
  @scala.inline
  implicit class OriginMutableBuilder[Self <: Origin] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setOrigin(value: top | (`top left`) | (`top right`) | bottom | (`bottom left`) | (`bottom right`)): Self = StObject.set(x, "origin", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOriginUndefined: Self = StObject.set(x, "origin", js.undefined)
  }
}
