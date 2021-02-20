package typings.vfileLocation

import typings.vfile.mod.VFile
import typings.vfileLocation.anon.Column
import typings.vfileLocation.anon.Line
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("vfile-location", JSImport.Namespace)
  @js.native
  def apply(vfile: String): Location = js.native
  @JSImport("vfile-location", JSImport.Namespace)
  @js.native
  def apply(vfile: VFile): Location = js.native
  
  @js.native
  trait Location extends StObject {
    
    /**
      * Get the `offset` (`number`) for a line and column-based `position` in the bound file.
      * Returns `-1` when given invalid or out of bounds input.
      */
    def toOffset(position: Column): Double = js.native
    
    /**
      * Get the line and column-based `position` for `offset` in the bound file.
      */
    def toPosition(offset: Double): Line = js.native
  }
  object Location {
    
    @scala.inline
    def apply(toOffset: Column => Double, toPosition: Double => Line): Location = {
      val __obj = js.Dynamic.literal(toOffset = js.Any.fromFunction1(toOffset), toPosition = js.Any.fromFunction1(toPosition))
      __obj.asInstanceOf[Location]
    }
    
    @scala.inline
    implicit class LocationMutableBuilder[Self <: Location] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setToOffset(value: Column => Double): Self = StObject.set(x, "toOffset", js.Any.fromFunction1(value))
      
      @scala.inline
      def setToPosition(value: Double => Line): Self = StObject.set(x, "toPosition", js.Any.fromFunction1(value))
    }
  }
}
