package typings.tsToolbelt

import typings.tsToolbelt.outAnyPromiseMod.Promise
import typings.tsToolbelt.outFunctionFunctionMod.Function
import typings.tsToolbelt.outFunctionParametersMod.Parameters
import typings.tsToolbelt.outFunctionReturnMod.Return
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object outFunctionPromisifyMod {
  
  type Promisify[F /* <: Function[Any, Any] */] = js.Function1[/* args */ Parameters[F], Promise[Return[F]]]
}
