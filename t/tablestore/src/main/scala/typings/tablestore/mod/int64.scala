package typings.tablestore.mod

import typings.node.bufferMod.global.Buffer
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait int64 extends StObject {
  
  def toBuffer(): Buffer
  
  def toNumber(): Double
}
object int64 {
  
  inline def apply(toBuffer: () => Buffer, toNumber: () => Double): int64 = {
    val __obj = js.Dynamic.literal(toBuffer = js.Any.fromFunction0(toBuffer), toNumber = js.Any.fromFunction0(toNumber))
    __obj.asInstanceOf[int64]
  }
  
  extension [Self <: int64](x: Self) {
    
    inline def setToBuffer(value: () => Buffer): Self = StObject.set(x, "toBuffer", js.Any.fromFunction0(value))
    
    inline def setToNumber(value: () => Double): Self = StObject.set(x, "toNumber", js.Any.fromFunction0(value))
  }
}
