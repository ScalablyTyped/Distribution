package typings.themeDashUi.themeDashUiMod

import typings.react.reactMod.ComponentType
import typings.react.reactMod.Dispatch
import typings.react.reactMod.ReactElement
import typings.react.reactMod.SetStateAction
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("theme-ui", JSImport.Namespace)
@js.native
object ^ extends js.Object {
  val Box: SxComponent[
    (/* import warning: ImportType.apply Failed type conversion: react.react.Global.JSX.IntrinsicElements['div'] */ js.Any) with SxProps
  ] = js.native
  val ColorMode: ComponentType[js.Object] = js.native
  val Container: SxComponent[
    (/* import warning: ImportType.apply Failed type conversion: react.react.Global.JSX.IntrinsicElements['div'] */ js.Any) with SxProps
  ] = js.native
  val Context: typings.react.reactMod.Context[ThemeUIContext] = js.native
  val Flex: SxComponent[
    (/* import warning: ImportType.apply Failed type conversion: react.react.Global.JSX.IntrinsicElements['div'] */ js.Any) with SxProps
  ] = js.native
  val Footer: SxComponent[
    (/* import warning: ImportType.apply Failed type conversion: react.react.Global.JSX.IntrinsicElements['div'] */ js.Any) with SxProps
  ] = js.native
  val Header: SxComponent[
    (/* import warning: ImportType.apply Failed type conversion: react.react.Global.JSX.IntrinsicElements['div'] */ js.Any) with SxProps
  ] = js.native
  val InitializeColorMode: ComponentType[js.Object] = js.native
  val Layout: SxComponent[
    (/* import warning: ImportType.apply Failed type conversion: react.react.Global.JSX.IntrinsicElements['div'] */ js.Any) with SxProps
  ] = js.native
  val Main: SxComponent[
    (/* import warning: ImportType.apply Failed type conversion: react.react.Global.JSX.IntrinsicElements['div'] */ js.Any) with SxProps
  ] = js.native
  val Styled: typings.themeDashUi.themeDashUiStrings.Styled with IntrinsicSxElements with (SxComponent[
    (/* import warning: ImportType.apply Failed type conversion: react.react.Global.JSX.IntrinsicElements['div'] */ js.Any) with SxProps
  ]) = js.native
  def ThemeProvider[Theme](props: ThemeProviderProps[Theme]): ReactElement = js.native
  def useColorMode[Modes /* <: String */](): js.Tuple2[Modes, Dispatch[SetStateAction[Modes]]] = js.native
  def useColorMode[Modes /* <: String */](initialMode: Modes): js.Tuple2[Modes, Dispatch[SetStateAction[Modes]]] = js.native
  def useThemeUI(): ThemeUIContext = js.native
}

