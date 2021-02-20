package typings.titanium

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Simple object used to describe the size of a movie.
  */
@js.native
trait MovieSize extends StObject {
  
  /**
    * Height of the movie.
    */
  var height: js.UndefOr[Double] = js.native
  
  /**
    * Width of the movie.
    */
  var width: js.UndefOr[Double] = js.native
}
object MovieSize {
  
  @scala.inline
  def apply(): MovieSize = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[MovieSize]
  }
  
  @scala.inline
  implicit class MovieSizeMutableBuilder[Self <: MovieSize] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setHeight(value: Double): Self = StObject.set(x, "height", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHeightUndefined: Self = StObject.set(x, "height", js.undefined)
    
    @scala.inline
    def setWidth(value: Double): Self = StObject.set(x, "width", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setWidthUndefined: Self = StObject.set(x, "width", js.undefined)
  }
}
