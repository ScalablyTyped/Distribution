package typings
package styletronDashReactLib.styletronDashReactMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("styletron-react", JSImport.Namespace)
@js.native
object ^ extends js.Object {
  val Provider: org.scalablytyped.runtime.Instantiable0[DevProvider] | reactLib.reactMod.Provider[styletronDashStandardLib.styletronDashStandardMod.StandardEngine] = js.native
  val styled: stdLib.ReturnType[js.Function1[/* options */ CreateStyledOptions, StyledFn]] = js.native
  val withStyle: WithStyleFn = js.native
  val withStyleDeep: WithStyleFn = js.native
  val withTransform: WithTransformFn = js.native
  val withWrapper: WithWrapperFn = js.native
  def DevConsumer(props: styletronDashReactLib.Anon_Children): reactLib.reactMod.Global.JSXNs.Element = js.native
  def autoComposeDeep(
    styletron: Styletron,
    styleArg: js.Function1[
      /* props */ js.Object, 
      styletronDashStandardLib.styletronDashStandardMod.StyleObject
    ]
  ): stdLib.ReturnType[
    js.Function2[
      /* styletron */ Styletron, 
      /* styleArg */ js.Function1[
        /* props */ js.Object, 
        styletronDashStandardLib.styletronDashStandardMod.StyleObject
      ], 
      stdLib.ReturnType[
        /* import warning: ImportType.apply Failed type conversion: typeof composeDynamic */ js.Any
      ]
    ]
  ] = js.native
  def autoComposeDeep(styletron: Styletron, styleArg: styletronDashStandardLib.styletronDashStandardMod.StyleObject): stdLib.ReturnType[
    js.Function2[
      /* styletron */ Styletron, 
      /* style */ styletronDashStandardLib.styletronDashStandardMod.StyleObject, 
      stdLib.ReturnType[
        /* import warning: ImportType.apply Failed type conversion: typeof composeStatic */ js.Any
      ]
    ]
  ] = js.native
  def autoComposeShallow(
    styletron: Styletron,
    styleArg: js.Function1[
      /* props */ js.Object, 
      styletronDashStandardLib.styletronDashStandardMod.StyleObject
    ]
  ): stdLib.ReturnType[
    js.Function2[
      /* styletron */ Styletron, 
      /* style */ styletronDashStandardLib.styletronDashStandardMod.StyleObject, 
      stdLib.ReturnType[
        /* import warning: ImportType.apply Failed type conversion: typeof composeStatic */ js.Any
      ]
    ]
  ] = js.native
  def autoComposeShallow(styletron: Styletron, styleArg: styletronDashStandardLib.styletronDashStandardMod.StyleObject): stdLib.ReturnType[
    js.Function2[
      /* styletron */ Styletron, 
      /* style */ styletronDashStandardLib.styletronDashStandardMod.StyleObject, 
      stdLib.ReturnType[
        /* import warning: ImportType.apply Failed type conversion: typeof composeStatic */ js.Any
      ]
    ]
  ] = js.native
  def composeDynamic(
    styletron: Styletron,
    reducer: js.Function2[
      /* style */ styletronDashStandardLib.styletronDashStandardMod.StyleObject, 
      /* props */ js.Object, 
      styletronDashStandardLib.styletronDashStandardMod.StyleObject
    ]
  ): Styletron = js.native
  def composeStatic(styletron: Styletron, reducerContainer: ReducerContainer): Styletron = js.native
  def createDeepMergeReducer(style: styletronDashStandardLib.styletronDashStandardMod.StyleObject): AssignmentCommutativeReducerContainer = js.native
  def createShallowMergeReducer(style: styletronDashStandardLib.styletronDashStandardMod.StyleObject): AssignmentCommutativeReducerContainer = js.native
  def createStyled(options: CreateStyledOptions): StyledFn = js.native
  def createStyledElementComponent(styletron: Styletron): StyletronComponent[_] = js.native
  def dynamicComposeDeep(
    styletron: Styletron,
    styleArg: js.Function1[
      /* props */ js.Object, 
      styletronDashStandardLib.styletronDashStandardMod.StyleObject
    ]
  ): stdLib.ReturnType[
    js.Function2[
      /* styletron */ Styletron, 
      /* reducer */ js.Function2[
        /* style */ styletronDashStandardLib.styletronDashStandardMod.StyleObject, 
        /* props */ js.Object, 
        styletronDashStandardLib.styletronDashStandardMod.StyleObject
      ], 
      Styletron
    ]
  ] = js.native
  def dynamicComposeShallow(
    styletron: Styletron,
    styleArg: js.Function1[
      /* props */ js.Object, 
      styletronDashStandardLib.styletronDashStandardMod.StyleObject
    ]
  ): stdLib.ReturnType[
    js.Function2[
      /* styletron */ Styletron, 
      /* reducer */ js.Function2[
        /* style */ styletronDashStandardLib.styletronDashStandardMod.StyleObject, 
        /* props */ js.Object, 
        styletronDashStandardLib.styletronDashStandardMod.StyleObject
      ], 
      Styletron
    ]
  ] = js.native
  def resolveStyle(
    getInitialStyle: js.Function0[styletronDashStandardLib.styletronDashStandardMod.StyleObject],
    reducers: js.Array[ReducerContainer],
    props: js.Object
  ): styletronDashStandardLib.styletronDashStandardMod.StyleObject = js.native
  def staticComposeDeep(styletron: Styletron, style: styletronDashStandardLib.styletronDashStandardMod.StyleObject): stdLib.ReturnType[
    js.Function2[/* styletron */ Styletron, /* reducerContainer */ ReducerContainer, Styletron]
  ] = js.native
  def staticComposeShallow(styletron: Styletron, style: styletronDashStandardLib.styletronDashStandardMod.StyleObject): stdLib.ReturnType[
    js.Function2[/* styletron */ Styletron, /* reducerContainer */ ReducerContainer, Styletron]
  ] = js.native
  def useStyletron(): js.Array[CSSFn] = js.native
}

