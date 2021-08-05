package typings.wonka

import typings.wonka.wonkaTypesMod.Source
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object wonkaSourceFromListenerMod {
  
  @JSImport("wonka/src/web/wonka_source_fromListener", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def fromListener[E](
    addListener: js.Function1[/* cb */ js.Function1[/* event */ E, Unit], Unit],
    removeListener: js.Function1[/* cb */ js.Function1[/* event */ E, Unit], Unit]
  ): Source[E] = (^.asInstanceOf[js.Dynamic].applyDynamic("fromListener")(addListener.asInstanceOf[js.Any], removeListener.asInstanceOf[js.Any])).asInstanceOf[Source[E]]
}
