package typings.wonka

import typings.wonka.wonkaTypesMod.Source
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object wonkaSourceIntervalMod {
  
  @JSImport("wonka/src/web/wonka_source_interval", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def interval(interval: Double): Source[Double] = ^.asInstanceOf[js.Dynamic].applyDynamic("interval")(interval.asInstanceOf[js.Any]).asInstanceOf[Source[Double]]
}
