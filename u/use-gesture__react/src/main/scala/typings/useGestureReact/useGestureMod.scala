package typings.useGestureReact

import typings.useGestureReact.typesMod.ReactDOMAttributes
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object useGestureMod {
  
  @JSImport("@use-gesture/react/dist/declarations/src/useGesture", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def useGesture[HandlerTypes /* <: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify AnyHandlerEventTypes */ Any */, Config /* <: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify UserGestureConfig */ Any */](
    handlers: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify GestureHandlers<HandlerTypes> */ Any
  ): (js.Function1[/* repeated */ Any, ReactDOMAttributes]) | Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("useGesture")(handlers.asInstanceOf[js.Any]).asInstanceOf[(js.Function1[/* repeated */ Any, ReactDOMAttributes]) | Unit]
  inline def useGesture[HandlerTypes /* <: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify AnyHandlerEventTypes */ Any */, Config /* <: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify UserGestureConfig */ Any */](
    handlers: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify GestureHandlers<HandlerTypes> */ Any,
    config: Config
  ): (js.Function1[/* repeated */ Any, ReactDOMAttributes]) | Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("useGesture")(handlers.asInstanceOf[js.Any], config.asInstanceOf[js.Any])).asInstanceOf[(js.Function1[/* repeated */ Any, ReactDOMAttributes]) | Unit]
}
