package typings.vfileLocation

import typings.std.NonNullable
import typings.vfileLocation.anon.ToOffset
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("vfile-location", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def location(file: String): ToOffset = ^.asInstanceOf[js.Dynamic].applyDynamic("location")(file.asInstanceOf[js.Any]).asInstanceOf[ToOffset]
  inline def location(file: js.typedarray.Uint8Array): ToOffset = ^.asInstanceOf[js.Dynamic].applyDynamic("location")(file.asInstanceOf[js.Any]).asInstanceOf[ToOffset]
  inline def location(file: VFile): ToOffset = ^.asInstanceOf[js.Dynamic].applyDynamic("location")(file.asInstanceOf[js.Any]).asInstanceOf[ToOffset]
  
  /* Inlined std.Required<vfile-location.vfile-location.Point> */
  trait FullPoint extends StObject {
    
    var column: Double
    
    var line: Double
    
    var offset: Double
  }
  object FullPoint {
    
    inline def apply(column: Double, line: Double, offset: Double): FullPoint = {
      val __obj = js.Dynamic.literal(column = column.asInstanceOf[js.Any], line = line.asInstanceOf[js.Any], offset = offset.asInstanceOf[js.Any])
      __obj.asInstanceOf[FullPoint]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: FullPoint] (val x: Self) extends AnyVal {
      
      inline def setColumn(value: Double): Self = StObject.set(x, "column", value.asInstanceOf[js.Any])
      
      inline def setLine(value: Double): Self = StObject.set(x, "line", value.asInstanceOf[js.Any])
      
      inline def setOffset(value: Double): Self = StObject.set(x, "offset", value.asInstanceOf[js.Any])
    }
  }
  
  type Offset = NonNullable[js.UndefOr[Double]]
  
  type Point = typings.unist.mod.Point
  
  /* Inlined std.Pick<vfile-location.vfile-location.Point, 'line' | 'column'> */
  trait PositionalPoint extends StObject {
    
    var column: Double
    
    var line: Double
  }
  object PositionalPoint {
    
    inline def apply(column: Double, line: Double): PositionalPoint = {
      val __obj = js.Dynamic.literal(column = column.asInstanceOf[js.Any], line = line.asInstanceOf[js.Any])
      __obj.asInstanceOf[PositionalPoint]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: PositionalPoint] (val x: Self) extends AnyVal {
      
      inline def setColumn(value: Double): Self = StObject.set(x, "column", value.asInstanceOf[js.Any])
      
      inline def setLine(value: Double): Self = StObject.set(x, "line", value.asInstanceOf[js.Any])
    }
  }
  
  type VFile = typings.vfile.mod.VFile
}
