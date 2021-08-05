package typings.typeorm

import typings.std.ClassDecorator
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object eventSubscriberMod {
  
  @JSImport("typeorm/browser/decorator/listeners/EventSubscriber", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def EventSubscriber(): ClassDecorator = ^.asInstanceOf[js.Dynamic].applyDynamic("EventSubscriber")().asInstanceOf[ClassDecorator]
}
