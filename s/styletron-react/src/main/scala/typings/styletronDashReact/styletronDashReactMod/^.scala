package typings.styletronDashReact.styletronDashReactMod

import org.scalablytyped.runtime.Instantiable0
import typings.react.reactMod.Global.JSXNs.Element
import typings.std.ReturnType
import typings.styletronDashReact.Anon_Children
import typings.styletronDashStandard.styletronDashStandardMod.StandardEngine
import typings.styletronDashStandard.styletronDashStandardMod.StyleObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("styletron-react", JSImport.Namespace)
@js.native
object ^ extends js.Object {
  val DebugEngine: Instantiable0[BrowserDebugEngine | NoopDebugEngine] = js.native
  val Provider: Instantiable0[DevProvider] | typings.react.reactMod.Provider[StandardEngine] = js.native
  val styled: ReturnType[js.Function1[/* options */ CreateStyledOptions, StyledFn]] = js.native
  val withStyle: WithStyleFn = js.native
  val withStyleDeep: WithStyleFn = js.native
  val withTransform: WithTransformFn = js.native
  val withWrapper: WithWrapperFn = js.native
  def DevConsumer(props: Anon_Children): Element = js.native
  def autoComposeDeep(styletron: Styletron, styleArg: js.Function1[/* props */ js.Object, StyleObject]): ReturnType[
    js.Function2[
      /* styletron */ Styletron, 
      /* styleArg */ js.Function1[/* props */ js.Object, StyleObject], 
      ReturnType[
        /* import warning: ImportType.apply Failed type conversion: typeof composeDynamic */ js.Any
      ]
    ]
  ] = js.native
  def autoComposeDeep(styletron: Styletron, styleArg: StyleObject): ReturnType[
    js.Function2[
      /* styletron */ Styletron, 
      /* style */ StyleObject, 
      ReturnType[
        /* import warning: ImportType.apply Failed type conversion: typeof composeStatic */ js.Any
      ]
    ]
  ] = js.native
  def autoComposeShallow(styletron: Styletron, styleArg: js.Function1[/* props */ js.Object, StyleObject]): ReturnType[
    js.Function2[
      /* styletron */ Styletron, 
      /* style */ StyleObject, 
      ReturnType[
        /* import warning: ImportType.apply Failed type conversion: typeof composeStatic */ js.Any
      ]
    ]
  ] = js.native
  def autoComposeShallow(styletron: Styletron, styleArg: StyleObject): ReturnType[
    js.Function2[
      /* styletron */ Styletron, 
      /* style */ StyleObject, 
      ReturnType[
        /* import warning: ImportType.apply Failed type conversion: typeof composeStatic */ js.Any
      ]
    ]
  ] = js.native
  def composeDynamic(
    styletron: Styletron,
    reducer: js.Function2[/* style */ StyleObject, /* props */ js.Object, StyleObject]
  ): Styletron = js.native
  def composeStatic(styletron: Styletron, reducerContainer: ReducerContainer): Styletron = js.native
  def createDeepMergeReducer(style: StyleObject): AssignmentCommutativeReducerContainer = js.native
  def createShallowMergeReducer(style: StyleObject): AssignmentCommutativeReducerContainer = js.native
  def createStyled(options: CreateStyledOptions): StyledFn = js.native
  def createStyledElementComponent(styletron: Styletron): StyletronComponent[_] = js.native
  def dynamicComposeDeep(styletron: Styletron, styleArg: js.Function1[/* props */ js.Object, StyleObject]): ReturnType[
    js.Function2[
      /* styletron */ Styletron, 
      /* reducer */ js.Function2[/* style */ StyleObject, /* props */ js.Object, StyleObject], 
      Styletron
    ]
  ] = js.native
  def dynamicComposeShallow(styletron: Styletron, styleArg: js.Function1[/* props */ js.Object, StyleObject]): ReturnType[
    js.Function2[
      /* styletron */ Styletron, 
      /* reducer */ js.Function2[/* style */ StyleObject, /* props */ js.Object, StyleObject], 
      Styletron
    ]
  ] = js.native
  def resolveStyle(getInitialStyle: js.Function0[StyleObject], reducers: js.Array[ReducerContainer], props: js.Object): StyleObject = js.native
  def staticComposeDeep(styletron: Styletron, style: StyleObject): ReturnType[
    js.Function2[/* styletron */ Styletron, /* reducerContainer */ ReducerContainer, Styletron]
  ] = js.native
  def staticComposeShallow(styletron: Styletron, style: StyleObject): ReturnType[
    js.Function2[/* styletron */ Styletron, /* reducerContainer */ ReducerContainer, Styletron]
  ] = js.native
  def useStyletron(): js.Array[CSSFn] = js.native
}

