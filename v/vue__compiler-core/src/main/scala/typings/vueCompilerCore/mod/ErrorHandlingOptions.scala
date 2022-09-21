package typings.vueCompilerCore.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ErrorHandlingOptions extends StObject {
  
  var onError: js.UndefOr[js.Function1[/* error */ CompilerError, Unit]] = js.undefined
  
  var onWarn: js.UndefOr[js.Function1[/* warning */ CompilerError, Unit]] = js.undefined
}
object ErrorHandlingOptions {
  
  inline def apply(): ErrorHandlingOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ErrorHandlingOptions]
  }
  
  extension [Self <: ErrorHandlingOptions](x: Self) {
    
    inline def setOnError(value: /* error */ CompilerError => Unit): Self = StObject.set(x, "onError", js.Any.fromFunction1(value))
    
    inline def setOnErrorUndefined: Self = StObject.set(x, "onError", js.undefined)
    
    inline def setOnWarn(value: /* warning */ CompilerError => Unit): Self = StObject.set(x, "onWarn", js.Any.fromFunction1(value))
    
    inline def setOnWarnUndefined: Self = StObject.set(x, "onWarn", js.undefined)
  }
}
