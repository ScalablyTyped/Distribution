package typings.vfileLocation

import typings.vfile.mod.VFile
import typings.vfileLocation.anon.Column
import typings.vfileLocation.anon.Line
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  inline def apply(vfile: String): Location = ^.asInstanceOf[js.Dynamic].apply(vfile.asInstanceOf[js.Any]).asInstanceOf[Location]
  inline def apply(vfile: VFile): Location = ^.asInstanceOf[js.Dynamic].apply(vfile.asInstanceOf[js.Any]).asInstanceOf[Location]
  
  @JSImport("vfile-location", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  trait Location extends StObject {
    
    /**
      * Get the `offset` (`number`) for a line and column-based `position` in the bound file.
      * Returns `-1` when given invalid or out of bounds input.
      */
    def toOffset(position: Column): Double
    
    /**
      * Get the line and column-based `position` for `offset` in the bound file.
      */
    def toPosition(offset: Double): Line
  }
  object Location {
    
    inline def apply(toOffset: Column => Double, toPosition: Double => Line): Location = {
      val __obj = js.Dynamic.literal(toOffset = js.Any.fromFunction1(toOffset), toPosition = js.Any.fromFunction1(toPosition))
      __obj.asInstanceOf[Location]
    }
    
    extension [Self <: Location](x: Self) {
      
      inline def setToOffset(value: Column => Double): Self = StObject.set(x, "toOffset", js.Any.fromFunction1(value))
      
      inline def setToPosition(value: Double => Line): Self = StObject.set(x, "toPosition", js.Any.fromFunction1(value))
    }
  }
}
