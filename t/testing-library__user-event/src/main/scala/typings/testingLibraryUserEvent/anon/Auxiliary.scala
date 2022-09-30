package typings.testingLibraryUserEvent.anon

import typings.testingLibraryUserEvent.testingLibraryUserEventInts.`0`
import typings.testingLibraryUserEvent.testingLibraryUserEventInts.`1`
import typings.testingLibraryUserEvent.testingLibraryUserEventInts.`2`
import typings.testingLibraryUserEvent.testingLibraryUserEventInts.`3`
import typings.testingLibraryUserEvent.testingLibraryUserEventInts.`4`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Auxiliary extends StObject {
  
  val X1: `3`
  
  val X2: `4`
  
  val auxiliary: `2`
  
  val back: `3`
  
  val forward: `4`
  
  val primary: `0`
  
  val secondary: `1`
}
object Auxiliary {
  
  inline def apply(): Auxiliary = {
    val __obj = js.Dynamic.literal(X1 = 3, X2 = 4, auxiliary = 2, back = 3, forward = 4, primary = 0, secondary = 1)
    __obj.asInstanceOf[Auxiliary]
  }
  
  extension [Self <: Auxiliary](x: Self) {
    
    inline def setAuxiliary(value: `2`): Self = StObject.set(x, "auxiliary", value.asInstanceOf[js.Any])
    
    inline def setBack(value: `3`): Self = StObject.set(x, "back", value.asInstanceOf[js.Any])
    
    inline def setForward(value: `4`): Self = StObject.set(x, "forward", value.asInstanceOf[js.Any])
    
    inline def setPrimary(value: `0`): Self = StObject.set(x, "primary", value.asInstanceOf[js.Any])
    
    inline def setSecondary(value: `1`): Self = StObject.set(x, "secondary", value.asInstanceOf[js.Any])
    
    inline def setX1(value: `3`): Self = StObject.set(x, "X1", value.asInstanceOf[js.Any])
    
    inline def setX2(value: `4`): Self = StObject.set(x, "X2", value.asInstanceOf[js.Any])
  }
}
