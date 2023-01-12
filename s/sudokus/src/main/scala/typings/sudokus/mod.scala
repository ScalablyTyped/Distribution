package typings.sudokus

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("sudokus", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def solve(data: js.Array[js.Array[Double]]): js.Array[js.Array[Double]] = ^.asInstanceOf[js.Dynamic].applyDynamic("solve")(data.asInstanceOf[js.Any]).asInstanceOf[js.Array[js.Array[Double]]]
  inline def solve(data: js.Array[js.Array[Double]], options: Options): js.Array[js.Array[Double]] = (^.asInstanceOf[js.Dynamic].applyDynamic("solve")(data.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Array[js.Array[Double]]]
  
  trait Cell extends StObject {
    
    var fixed: Boolean
    
    var value: Double
  }
  object Cell {
    
    inline def apply(fixed: Boolean, value: Double): Cell = {
      val __obj = js.Dynamic.literal(fixed = fixed.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
      __obj.asInstanceOf[Cell]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Cell] (val x: Self) extends AnyVal {
      
      inline def setFixed(value: Boolean): Self = StObject.set(x, "fixed", value.asInstanceOf[js.Any])
      
      inline def setValue(value: Double): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
    }
  }
  
  trait Options extends StObject {
    
    var onProgress: js.UndefOr[ProgressFn] = js.undefined
  }
  object Options {
    
    inline def apply(): Options = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Options]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Options] (val x: Self) extends AnyVal {
      
      inline def setOnProgress(value: /* state */ js.Array[js.Array[Cell]] => Unit): Self = StObject.set(x, "onProgress", js.Any.fromFunction1(value))
      
      inline def setOnProgressUndefined: Self = StObject.set(x, "onProgress", js.undefined)
    }
  }
  
  type ProgressFn = js.Function1[/* state */ js.Array[js.Array[Cell]], Unit]
}
