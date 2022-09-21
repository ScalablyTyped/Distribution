package typings.useGestureReact

import typings.useGestureReact.typesMod.ReactDOMAttributes
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object createUseGestureMod {
  
  @JSImport("@use-gesture/react/dist/declarations/src/createUseGesture", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def createUseGesture(
    actions: js.Array[
      /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Action */ Any
    ]
  ): js.Function2[
    /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify GestureHandlers */ /* _handlers */ Any, 
    /* _config */ js.UndefOr[
      /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify UserGestureConfig */ Any
    ], 
    (js.Function1[/* repeated */ Any, ReactDOMAttributes]) | Unit
  ] = ^.asInstanceOf[js.Dynamic].applyDynamic("createUseGesture")(actions.asInstanceOf[js.Any]).asInstanceOf[js.Function2[
    /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify GestureHandlers */ /* _handlers */ Any, 
    /* _config */ js.UndefOr[
      /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify UserGestureConfig */ Any
    ], 
    (js.Function1[/* repeated */ Any, ReactDOMAttributes]) | Unit
  ]]
}
