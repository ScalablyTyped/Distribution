package typings.tabris.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Animate extends StObject {
  
  var animate: js.UndefOr[Boolean] = js.undefined
}
object Animate {
  
  @scala.inline
  def apply(): Animate = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Animate]
  }
  
  @scala.inline
  implicit class AnimateMutableBuilder[Self <: Animate] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAnimate(value: Boolean): Self = StObject.set(x, "animate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAnimateUndefined: Self = StObject.set(x, "animate", js.undefined)
  }
}
