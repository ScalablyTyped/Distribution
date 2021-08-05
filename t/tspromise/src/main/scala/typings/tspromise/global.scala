package typings.tspromise

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object global {
  
  @JSGlobal("Thenable")
  @js.native
  class Thenable[T] ()
    extends StObject
       with typings.tspromise.Thenable[T]
  
  inline def `yield`[T](promise: typings.tspromise.Thenable[T]): T = js.Dynamic.global.applyDynamic("yield")(promise.asInstanceOf[js.Any]).asInstanceOf[T]
}
