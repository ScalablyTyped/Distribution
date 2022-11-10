package typings.styletronReact

import typings.react.mod.ComponentProps
import typings.react.mod.ComponentType
import typings.react.mod.ElementType
import typings.react.mod.global.JSX.Element
import typings.std.Omit
import typings.styletronReact.anon.As
import typings.styletronReact.anon.Base
import typings.styletronReact.anon.ClassName
import typings.styletronReact.anon.Ref
import typings.styletronReact.anon.StackInfo
import typings.styletronReact.styletronReactBooleans.`false`
import typings.styletronReact.styletronReactBooleans.`true`
import typings.styletronReact.styletronReactStrings.$style
import typings.styletronReact.styletronReactStrings.className
import typings.styletronStandard.mod.StyleObject
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libTypesMod {
  
  /** NOTE: Conditional type definitions are impossible to translate to Scala.
    * See https://www.typescriptlang.org/docs/handbook/2/conditional-types.html for an intro.
    * This RHS of the type alias is guess work. You should cast if it's not correct in your case.
    * TS definition: {{{
    P extends {  ref :infer R} ? P & {  $ref :R | undefined} : P
    }}}
    */
  type AddStyletronRef[P /* <: Ref */] = P
  
  trait AssignmentCommutativeReducerContainer
    extends StObject
       with ReducerContainer {
    
    var assignmentCommutative: `true`
    
    def factory(a: StyleObject): AssignmentCommutativeReducerContainer
    
    def reducer(a: StyleObject): StyleObject
    
    var style: StyleObject
  }
  object AssignmentCommutativeReducerContainer {
    
    inline def apply(
      factory: StyleObject => AssignmentCommutativeReducerContainer,
      reducer: StyleObject => StyleObject,
      style: StyleObject
    ): AssignmentCommutativeReducerContainer = {
      val __obj = js.Dynamic.literal(assignmentCommutative = true, factory = js.Any.fromFunction1(factory), reducer = js.Any.fromFunction1(reducer), style = style.asInstanceOf[js.Any])
      __obj.asInstanceOf[AssignmentCommutativeReducerContainer]
    }
    
    extension [Self <: AssignmentCommutativeReducerContainer](x: Self) {
      
      inline def setAssignmentCommutative(value: `true`): Self = StObject.set(x, "assignmentCommutative", value.asInstanceOf[js.Any])
      
      inline def setFactory(value: StyleObject => AssignmentCommutativeReducerContainer): Self = StObject.set(x, "factory", js.Any.fromFunction1(value))
      
      inline def setReducer(value: StyleObject => StyleObject): Self = StObject.set(x, "reducer", js.Any.fromFunction1(value))
      
      inline def setStyle(value: StyleObject): Self = StObject.set(x, "style", value.asInstanceOf[js.Any])
    }
  }
  
  type BaseProps[P /* <: js.Object */] = P & ClassName[P]
  
  trait NonAssignmentCommutativeReducerContainer
    extends StObject
       with ReducerContainer {
    
    var assignmentCommutative: `false`
    
    def reducer(b: StyleObject, a: Any): StyleObject
  }
  object NonAssignmentCommutativeReducerContainer {
    
    inline def apply(reducer: (StyleObject, Any) => StyleObject): NonAssignmentCommutativeReducerContainer = {
      val __obj = js.Dynamic.literal(assignmentCommutative = false, reducer = js.Any.fromFunction2(reducer))
      __obj.asInstanceOf[NonAssignmentCommutativeReducerContainer]
    }
    
    extension [Self <: NonAssignmentCommutativeReducerContainer](x: Self) {
      
      inline def setAssignmentCommutative(value: `false`): Self = StObject.set(x, "assignmentCommutative", value.asInstanceOf[js.Any])
      
      inline def setReducer(value: (StyleObject, Any) => StyleObject): Self = StObject.set(x, "reducer", js.Any.fromFunction2(value))
    }
  }
  
  type OverrideProps[D /* <: ElementType[Any] */, P /* <: js.Object */] = BaseProps[P] & (Omit[
    AddStyletronRef[ComponentProps[D]], 
    /* keyof styletron-react.styletron-react/lib/types.BaseProps<P> */ $style | className
  ])
  
  /* Rewritten from type alias, can be one of: 
    - typings.styletronReact.libTypesMod.AssignmentCommutativeReducerContainer
    - typings.styletronReact.libTypesMod.NonAssignmentCommutativeReducerContainer
  */
  trait ReducerContainer extends StObject
  object ReducerContainer {
    
    inline def AssignmentCommutativeReducerContainer(
      factory: StyleObject => typings.styletronReact.libTypesMod.AssignmentCommutativeReducerContainer,
      reducer: StyleObject => StyleObject,
      style: StyleObject
    ): typings.styletronReact.libTypesMod.AssignmentCommutativeReducerContainer = {
      val __obj = js.Dynamic.literal(assignmentCommutative = true, factory = js.Any.fromFunction1(factory), reducer = js.Any.fromFunction1(reducer), style = style.asInstanceOf[js.Any])
      __obj.asInstanceOf[typings.styletronReact.libTypesMod.AssignmentCommutativeReducerContainer]
    }
    
    inline def NonAssignmentCommutativeReducerContainer(reducer: (StyleObject, Any) => StyleObject): typings.styletronReact.libTypesMod.NonAssignmentCommutativeReducerContainer = {
      val __obj = js.Dynamic.literal(assignmentCommutative = false, reducer = js.Any.fromFunction2(reducer))
      __obj.asInstanceOf[typings.styletronReact.libTypesMod.NonAssignmentCommutativeReducerContainer]
    }
  }
  
  type StyledFn = js.Function2[
    /* component */ ElementType[Any], 
    /* style */ StyleObject | (js.Function1[/* props */ Any, StyleObject]), 
    StyletronComponent[ElementType[Any], Any]
  ]
  
  trait Styletron extends StObject {
    
    var base: Any
    
    var debug: js.UndefOr[StackInfo] = js.undefined
    
    var driver: Any
    
    var ext: js.UndefOr[Base] = js.undefined
    
    var getInitialStyle: Any
    
    var name: js.UndefOr[String] = js.undefined
    
    var reducers: js.Array[ReducerContainer]
    
    var wrapper: Any
  }
  object Styletron {
    
    inline def apply(base: Any, driver: Any, getInitialStyle: Any, reducers: js.Array[ReducerContainer], wrapper: Any): Styletron = {
      val __obj = js.Dynamic.literal(base = base.asInstanceOf[js.Any], driver = driver.asInstanceOf[js.Any], getInitialStyle = getInitialStyle.asInstanceOf[js.Any], reducers = reducers.asInstanceOf[js.Any], wrapper = wrapper.asInstanceOf[js.Any])
      __obj.asInstanceOf[Styletron]
    }
    
    extension [Self <: Styletron](x: Self) {
      
      inline def setBase(value: Any): Self = StObject.set(x, "base", value.asInstanceOf[js.Any])
      
      inline def setDebug(value: StackInfo): Self = StObject.set(x, "debug", value.asInstanceOf[js.Any])
      
      inline def setDebugUndefined: Self = StObject.set(x, "debug", js.undefined)
      
      inline def setDriver(value: Any): Self = StObject.set(x, "driver", value.asInstanceOf[js.Any])
      
      inline def setExt(value: Base): Self = StObject.set(x, "ext", value.asInstanceOf[js.Any])
      
      inline def setExtUndefined: Self = StObject.set(x, "ext", js.undefined)
      
      inline def setGetInitialStyle(value: Any): Self = StObject.set(x, "getInitialStyle", value.asInstanceOf[js.Any])
      
      inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
      
      inline def setReducers(value: js.Array[ReducerContainer]): Self = StObject.set(x, "reducers", value.asInstanceOf[js.Any])
      
      inline def setReducersVarargs(value: ReducerContainer*): Self = StObject.set(x, "reducers", js.Array(value*))
      
      inline def setWrapper(value: Any): Self = StObject.set(x, "wrapper", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait StyletronComponent[D /* <: ElementType[Any] */, P /* <: js.Object */] extends StObject {
    
    def apply[C /* <: ElementType[Any] */](props: As[C] & (OverrideProps[C, P])): Element = js.native
    
    var __STYLETRON__ : Any = js.native
    
    var displayName: js.UndefOr[String] = js.native
  }
  
  /* Inlined std.Partial<{  $style :styletron-standard.styletron-standard.StyleObject | (props : Props): styletron-standard.styletron-standard.StyleObject,   $as :react.react.ComponentType<any> | keyof react.react.<global>.JSX.IntrinsicElements,   className :string,   $ref :Props extends {  ref :infer T | undefined} ? T : react.react.Ref<any>,   ref :Props extends {  ref :infer T | undefined} ? T : react.react.Ref<any>}> */
  trait StyletronProps[Props] extends StObject {
    
    @JSName("$as")
    var $as: js.UndefOr[
        /* import warning: LimitUnionLength.leaveTypeRef Was union type with length 177, starting with typings.react.mod.ComponentType[scala.Any], typings.styletronReact.styletronReactStrings.a, typings.styletronReact.styletronReactStrings.abbr */ Any
      ] = js.undefined
    
    @JSName("$ref")
    var $ref: js.UndefOr[
        /* import warning: importer.ImportType#apply Failed type conversion: Props extends {  ref :infer T | undefined} ? T : react.react.Ref<any> */ js.Any
      ] = js.undefined
    
    @JSName("$style")
    var $style: js.UndefOr[StyleObject | (js.Function1[/* props */ Props, StyleObject])] = js.undefined
    
    var className: js.UndefOr[String] = js.undefined
    
    var ref: js.UndefOr[
        /* import warning: importer.ImportType#apply Failed type conversion: Props extends {  ref :infer T | undefined} ? T : react.react.Ref<any> */ js.Any
      ] = js.undefined
  }
  object StyletronProps {
    
    inline def apply[Props](): StyletronProps[Props] = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[StyletronProps[Props]]
    }
    
    extension [Self <: StyletronProps[?], Props](x: Self & StyletronProps[Props]) {
      
      inline def set$as(
        value: /* import warning: LimitUnionLength.leaveTypeRef Was union type with length 177, starting with typings.react.mod.ComponentType[scala.Any], typings.styletronReact.styletronReactStrings.a, typings.styletronReact.styletronReactStrings.abbr */ Any
      ): Self = StObject.set(x, "$as", value.asInstanceOf[js.Any])
      
      inline def set$asUndefined: Self = StObject.set(x, "$as", js.undefined)
      
      inline def set$ref(
        value: /* import warning: importer.ImportType#apply Failed type conversion: Props extends {  ref :infer T | undefined} ? T : react.react.Ref<any> */ js.Any
      ): Self = StObject.set(x, "$ref", value.asInstanceOf[js.Any])
      
      inline def set$refUndefined: Self = StObject.set(x, "$ref", js.undefined)
      
      inline def set$style(value: StyleObject | (js.Function1[/* props */ Props, StyleObject])): Self = StObject.set(x, "$style", value.asInstanceOf[js.Any])
      
      inline def set$styleFunction1(value: /* props */ Props => StyleObject): Self = StObject.set(x, "$style", js.Any.fromFunction1(value))
      
      inline def set$styleUndefined: Self = StObject.set(x, "$style", js.undefined)
      
      inline def setClassName(value: String): Self = StObject.set(x, "className", value.asInstanceOf[js.Any])
      
      inline def setClassNameUndefined: Self = StObject.set(x, "className", js.undefined)
      
      inline def setRef(
        value: /* import warning: importer.ImportType#apply Failed type conversion: Props extends {  ref :infer T | undefined} ? T : react.react.Ref<any> */ js.Any
      ): Self = StObject.set(x, "ref", value.asInstanceOf[js.Any])
      
      inline def setRefUndefined: Self = StObject.set(x, "ref", js.undefined)
    }
  }
  
  type WithStyleFn = js.Function2[
    /* component */ StyletronComponent[Any, Any], 
    /* style */ StyleObject | (js.Function1[/* props */ js.Object, StyleObject]), 
    /* import warning: importer.ImportType#apply Failed type conversion: styletron-react.styletron-react/lib/types.StyletronComponent<any, any> extends styletron-react.styletron-react/lib/types.StyletronComponent<infer D, infer P> ? styletron-react.styletron-react/lib/types.StyletronComponent<D, P & {}> : never */ js.Any
  ]
  
  type WithTransformFn = js.Function2[
    /* component */ StyletronComponent[Any, Any], 
    /* style */ js.Function2[/* style */ StyleObject, /* props */ Any, StyleObject], 
    /* import warning: importer.ImportType#apply Failed type conversion: styletron-react.styletron-react/lib/types.StyletronComponent<any, any> extends styletron-react.styletron-react/lib/types.StyletronComponent<infer D, infer P> ? styletron-react.styletron-react/lib/types.StyletronComponent<D, P & any> : never */ js.Any
  ]
  
  type WithWrapperFn = js.Function2[
    /* component */ StyletronComponent[Any, Any], 
    /* wrapper */ js.Function1[
      /* component */ StyletronComponent[Any, Any], 
      ComponentType[Any & (ComponentProps[StyletronComponent[Any, Any]])]
    ], 
    /* import warning: importer.ImportType#apply Failed type conversion: styletron-react.styletron-react/lib/types.StyletronComponent<any, any> extends styletron-react.styletron-react/lib/types.StyletronComponent<infer D, infer P> ? styletron-react.styletron-react/lib/types.StyletronComponent<D, P & any> : never */ js.Any
  ]
}
