package typings.tsToolbelt

import typings.tsToolbelt.functionMod.Function
import typings.tsToolbelt.functionParametersMod.Parameters
import typings.tsToolbelt.promiseMod.Promise
import typings.tsToolbelt.returnMod.Return
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object promisifyMod {
  
  type Promisify[F /* <: Function[Any, Any] */] = js.Function1[/* args */ Parameters[F], Promise[Return[F]]]
}
