package typings.themeDashUi.themeDashUiMod

import typings.react.reactMod.Dispatch
import typings.react.reactMod.ReactElement
import typings.react.reactMod.SetStateAction
import typings.std.Record
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("theme-ui", JSImport.Namespace)
@js.native
object ^ extends js.Object {
  val Box: SxComponent = js.native
  val Container: SxComponent = js.native
  val Context: typings.react.reactMod.Context[ThemeUIContext] = js.native
  val Flex: SxComponent = js.native
  val Footer: SxComponent = js.native
  val Header: SxComponent = js.native
  val Layout: SxComponent = js.native
  val Main: SxComponent = js.native
  val Styled: (Record[StyledTags, SxComponent]) with SxComponent = js.native
  def ThemeProvider[Theme](props: ThemeProviderProps[Theme]): ReactElement = js.native
  def useColorMode[Modes /* <: String */](): js.Tuple2[Modes, Dispatch[SetStateAction[Modes]]] = js.native
  def useColorMode[Modes /* <: String */](initialMode: Modes): js.Tuple2[Modes, Dispatch[SetStateAction[Modes]]] = js.native
  def useThemeUI(): ThemeUIContext = js.native
}

