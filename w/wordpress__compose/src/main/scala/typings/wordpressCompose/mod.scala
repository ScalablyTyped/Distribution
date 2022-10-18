package typings.wordpressCompose

import typings.react.mod.ComponentClass
import typings.react.mod.ComponentState
import typings.react.mod.ComponentType
import typings.react.mod.FC
import typings.wordpressCompose.anon.kinkeyofWindowEventMapstr
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("@wordpress/compose", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  // tslint:disable:no-unnecessary-generics
  // prettier-ignore
  inline def createHigherOrderComponent[EP](
    mapComponentToEnhancedComponent: js.Function1[/* component */ ComponentType[Any], ComponentType[Any]],
    modifierName: String
  ): js.Function1[
    /* component */ ComponentType[Any], 
    /* import warning: importer.ImportType#apply Failed type conversion: react.react.ComponentType<any> extends react.react.ComponentType<infer OP> ? react.react.ComponentType<std.Omit<OP, keyof EP>> : never */ js.Any
  ] = (^.asInstanceOf[js.Dynamic].applyDynamic("createHigherOrderComponent")(mapComponentToEnhancedComponent.asInstanceOf[js.Any], modifierName.asInstanceOf[js.Any])).asInstanceOf[js.Function1[
    /* component */ ComponentType[Any], 
    /* import warning: importer.ImportType#apply Failed type conversion: react.react.ComponentType<any> extends react.react.ComponentType<infer OP> ? react.react.ComponentType<std.Omit<OP, keyof EP>> : never */ js.Any
  ]]
  
  inline def ifCondition[P](predicate: js.Function1[/* props */ P, Boolean]): js.Function1[/* component */ ComponentType[P], FC[P]] = ^.asInstanceOf[js.Dynamic].applyDynamic("ifCondition")(predicate.asInstanceOf[js.Any]).asInstanceOf[js.Function1[/* component */ ComponentType[P], FC[P]]]
  
  // prettier-ignore
  inline def pure[T /* <: ComponentType[Any] */](component: T): /* import warning: importer.ImportType#apply Failed type conversion: T extends react.react.ComponentType<infer U> ? react.react.ComponentType<U> : never */ js.Any = ^.asInstanceOf[js.Dynamic].applyDynamic("pure")(component.asInstanceOf[js.Any]).asInstanceOf[/* import warning: importer.ImportType#apply Failed type conversion: T extends react.react.ComponentType<infer U> ? react.react.ComponentType<U> : never */ js.Any]
  
  inline def useMediaQuery(query: String): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("useMediaQuery")(query.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  
  inline def useReducedMotion(): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("useReducedMotion")().asInstanceOf[Boolean]
  
  // prettier-ignore
  inline def withGlobalEvents(eventMapper: kinkeyofWindowEventMapstr): js.Function1[
    /* component */ ComponentClass[Any, ComponentState], 
    /* import warning: importer.ImportType#apply Failed type conversion: react.react.ComponentClass<any, react.react.ComponentState> extends react.react.ComponentClass<infer U, react.react.ComponentState> ? react.react.ComponentType<U> : never */ js.Any
  ] = ^.asInstanceOf[js.Dynamic].applyDynamic("withGlobalEvents")(eventMapper.asInstanceOf[js.Any]).asInstanceOf[js.Function1[
    /* component */ ComponentClass[Any, ComponentState], 
    /* import warning: importer.ImportType#apply Failed type conversion: react.react.ComponentClass<any, react.react.ComponentState> extends react.react.ComponentClass<infer U, react.react.ComponentState> ? react.react.ComponentType<U> : never */ js.Any
  ]]
  
  // prettier-ignore
  inline def withInstanceId[T /* <: ComponentType[Any] */](wrapped: T): /* import warning: importer.ImportType#apply Failed type conversion: T extends react.react.ComponentType<infer U> ? react.react.ComponentType<std.Omit<U, 'instanceId'>> : never */ js.Any = ^.asInstanceOf[js.Dynamic].applyDynamic("withInstanceId")(wrapped.asInstanceOf[js.Any]).asInstanceOf[/* import warning: importer.ImportType#apply Failed type conversion: T extends react.react.ComponentType<infer U> ? react.react.ComponentType<std.Omit<U, 'instanceId'>> : never */ js.Any]
  
  // prettier-ignore
  inline def withSafeTimeout[T /* <: ComponentType[Any] */](component: T): /* import warning: importer.ImportType#apply Failed type conversion: T extends react.react.ComponentType<infer U> ? react.react.ComponentType<std.Omit<U, 'setTimeout'>> : never */ js.Any = ^.asInstanceOf[js.Dynamic].applyDynamic("withSafeTimeout")(component.asInstanceOf[js.Any]).asInstanceOf[/* import warning: importer.ImportType#apply Failed type conversion: T extends react.react.ComponentType<infer U> ? react.react.ComponentType<std.Omit<U, 'setTimeout'>> : never */ js.Any]
  
  // prettier-ignore
  inline def withState[SP /* <: js.Object */](
    initialState: /* import warning: importer.ImportType#apply Failed type conversion: {[ k in keyof SP ]: SP[k]} */ js.Any
  ): js.Function1[
    /* component */ ComponentType[Any], 
    /* import warning: importer.ImportType#apply Failed type conversion: react.react.ComponentType<any> extends react.react.ComponentType<infer U> ? react.react.ComponentClass<std.Omit<U, keyof SP | 'setState'>, SP> : never */ js.Any
  ] = ^.asInstanceOf[js.Dynamic].applyDynamic("withState")(initialState.asInstanceOf[js.Any]).asInstanceOf[js.Function1[
    /* component */ ComponentType[Any], 
    /* import warning: importer.ImportType#apply Failed type conversion: react.react.ComponentType<any> extends react.react.ComponentType<infer U> ? react.react.ComponentClass<std.Omit<U, keyof SP | 'setState'>, SP> : never */ js.Any
  ]]
}
