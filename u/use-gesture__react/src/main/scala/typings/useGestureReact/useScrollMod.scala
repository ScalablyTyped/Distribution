package typings.useGestureReact

import typings.useGestureReact.typesMod.ReactDOMAttributes
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object useScrollMod {
  
  @JSImport("@use-gesture/react/dist/declarations/src/useScroll", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def useScroll[EventType, Config /* <: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify UserScrollConfig */ Any */](
    handler: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Handler<'scroll', EventType> */ Any
  ): (js.Function1[/* repeated */ Any, ReactDOMAttributes]) | Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("useScroll")(handler.asInstanceOf[js.Any]).asInstanceOf[(js.Function1[/* repeated */ Any, ReactDOMAttributes]) | Unit]
  inline def useScroll[EventType, Config /* <: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify UserScrollConfig */ Any */](
    handler: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Handler<'scroll', EventType> */ Any,
    config: Config
  ): (js.Function1[/* repeated */ Any, ReactDOMAttributes]) | Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("useScroll")(handler.asInstanceOf[js.Any], config.asInstanceOf[js.Any])).asInstanceOf[(js.Function1[/* repeated */ Any, ReactDOMAttributes]) | Unit]
}
