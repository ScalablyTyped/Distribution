package typings.sudokus

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("sudokus", "solve")
  @js.native
  def solve(data: js.Array[js.Array[Double]]): js.Array[js.Array[Double]] = js.native
  @JSImport("sudokus", "solve")
  @js.native
  def solve(data: js.Array[js.Array[Double]], options: Options): js.Array[js.Array[Double]] = js.native
  
  @js.native
  trait Cell extends StObject {
    
    var fixed: Boolean = js.native
    
    var value: Double = js.native
  }
  object Cell {
    
    @scala.inline
    def apply(fixed: Boolean, value: Double): Cell = {
      val __obj = js.Dynamic.literal(fixed = fixed.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
      __obj.asInstanceOf[Cell]
    }
    
    @scala.inline
    implicit class CellMutableBuilder[Self <: Cell] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setFixed(value: Boolean): Self = StObject.set(x, "fixed", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setValue(value: Double): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait Options extends StObject {
    
    var onProgress: js.UndefOr[ProgressFn] = js.native
  }
  object Options {
    
    @scala.inline
    def apply(): Options = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Options]
    }
    
    @scala.inline
    implicit class OptionsMutableBuilder[Self <: Options] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setOnProgress(value: /* state */ js.Array[js.Array[Cell]] => Unit): Self = StObject.set(x, "onProgress", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnProgressUndefined: Self = StObject.set(x, "onProgress", js.undefined)
    }
  }
  
  type ProgressFn = js.Function1[/* state */ js.Array[js.Array[Cell]], Unit]
}
