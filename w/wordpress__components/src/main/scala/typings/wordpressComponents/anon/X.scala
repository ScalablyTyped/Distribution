package typings.wordpressComponents.anon

import typings.wordpressComponents.wordpressComponentsStrings.bottom
import typings.wordpressComponents.wordpressComponentsStrings.left
import typings.wordpressComponents.wordpressComponentsStrings.right
import typings.wordpressComponents.wordpressComponentsStrings.top
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait X extends StObject {
  
  var x: left | right = js.native
  
  var y: top | bottom = js.native
}
object X {
  
  @scala.inline
  def apply(x: left | right, y: top | bottom): X = {
    val __obj = js.Dynamic.literal(x = x.asInstanceOf[js.Any], y = y.asInstanceOf[js.Any])
    __obj.asInstanceOf[X]
  }
  
  @scala.inline
  implicit class XMutableBuilder[Self <: X] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setX(value: left | right): Self = StObject.set(x, "x", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setY(value: top | bottom): Self = StObject.set(x, "y", value.asInstanceOf[js.Any])
  }
}
