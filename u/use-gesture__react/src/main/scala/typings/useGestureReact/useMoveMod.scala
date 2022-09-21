package typings.useGestureReact

import typings.useGestureReact.typesMod.ReactDOMAttributes
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object useMoveMod {
  
  @JSImport("@use-gesture/react/dist/declarations/src/useMove", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def useMove[EventType, Config /* <: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify UserMoveConfig */ Any */](
    handler: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Handler<'move', EventType> */ Any
  ): (js.Function1[/* repeated */ Any, ReactDOMAttributes]) | Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("useMove")(handler.asInstanceOf[js.Any]).asInstanceOf[(js.Function1[/* repeated */ Any, ReactDOMAttributes]) | Unit]
  inline def useMove[EventType, Config /* <: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify UserMoveConfig */ Any */](
    handler: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Handler<'move', EventType> */ Any,
    config: Config
  ): (js.Function1[/* repeated */ Any, ReactDOMAttributes]) | Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("useMove")(handler.asInstanceOf[js.Any], config.asInstanceOf[js.Any])).asInstanceOf[(js.Function1[/* repeated */ Any, ReactDOMAttributes]) | Unit]
}
