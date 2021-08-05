package typings.timezonedDate

import typings.std.DateConstructor
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("timezoned-date", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def makeConstructor(offsetInMinutes: Double): DateConstructor = ^.asInstanceOf[js.Dynamic].applyDynamic("makeConstructor")(offsetInMinutes.asInstanceOf[js.Any]).asInstanceOf[DateConstructor]
}
