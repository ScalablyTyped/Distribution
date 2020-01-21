package typings.uifabricFoundation.libIcomponentMod

import typings.uifabricStyling.ithemeMod.ITheme
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ITokenFunction[TViewProps, TTokens] extends js.Object {
  def apply(props: TViewProps, theme: ITheme): IToken[TViewProps, TTokens] = js.native
}

