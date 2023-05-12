package typings.traceEventLib

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distUtilsMod {
  
  @JSImport("trace-event-lib/dist/utils", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def compactObject[T](maybeObject: T): T = ^.asInstanceOf[js.Dynamic].applyDynamic("compactObject")(maybeObject.asInstanceOf[js.Any]).asInstanceOf[T]
  
  inline def getProcessId(): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("getProcessId")().asInstanceOf[Double]
  
  inline def now(): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("now")().asInstanceOf[Double]
}
