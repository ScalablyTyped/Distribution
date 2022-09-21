package typings.useGestureReact

import typings.useGestureReact.typesMod.ReactDOMAttributes
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object useHoverMod {
  
  @JSImport("@use-gesture/react/dist/declarations/src/useHover", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def useHover[EventType, Config /* <: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify UserHoverConfig */ Any */](
    handler: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Handler<'hover', EventType> */ Any
  ): (js.Function1[/* repeated */ Any, ReactDOMAttributes]) | Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("useHover")(handler.asInstanceOf[js.Any]).asInstanceOf[(js.Function1[/* repeated */ Any, ReactDOMAttributes]) | Unit]
  inline def useHover[EventType, Config /* <: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify UserHoverConfig */ Any */](
    handler: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Handler<'hover', EventType> */ Any,
    config: Config
  ): (js.Function1[/* repeated */ Any, ReactDOMAttributes]) | Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("useHover")(handler.asInstanceOf[js.Any], config.asInstanceOf[js.Any])).asInstanceOf[(js.Function1[/* repeated */ Any, ReactDOMAttributes]) | Unit]
}
