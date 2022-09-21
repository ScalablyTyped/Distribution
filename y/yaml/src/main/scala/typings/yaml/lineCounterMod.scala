package typings.yaml

import typings.yaml.anon.Col
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object lineCounterMod {
  
  @JSImport("yaml/dist/parse/line-counter", "LineCounter")
  @js.native
  open class LineCounter () extends StObject {
    
    /**
      * Should be called in ascending order. Otherwise, call
      * `lineCounter.lineStarts.sort()` before calling `linePos()`.
      */
    def addNewLine(offset: Double): Double = js.native
    
    /**
      * Performs a binary search and returns the 1-indexed { line, col }
      * position of `offset`. If `line === 0`, `addNewLine` has never been
      * called or `offset` is before the first known newline.
      */
    def linePos(offset: Double): Col = js.native
    
    var lineStarts: js.Array[Double] = js.native
  }
}
