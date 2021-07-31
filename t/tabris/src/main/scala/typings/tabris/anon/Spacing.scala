package typings.tabris.anon

import typings.tabris.tabrisStrings.centerX
import typings.tabris.tabrisStrings.left
import typings.tabris.tabrisStrings.right
import typings.tabris.tabrisStrings.stretchX
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Spacing extends StObject {
  
  var alignment: js.UndefOr[left | centerX | stretchX | right] = js.undefined
  
  var spacing: js.UndefOr[Double] = js.undefined
}
object Spacing {
  
  @scala.inline
  def apply(): Spacing = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Spacing]
  }
  
  @scala.inline
  implicit class SpacingMutableBuilder[Self <: Spacing] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAlignment(value: left | centerX | stretchX | right): Self = StObject.set(x, "alignment", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAlignmentUndefined: Self = StObject.set(x, "alignment", js.undefined)
    
    @scala.inline
    def setSpacing(value: Double): Self = StObject.set(x, "spacing", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSpacingUndefined: Self = StObject.set(x, "spacing", js.undefined)
  }
}
