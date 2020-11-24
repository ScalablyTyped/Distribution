package typings.uifabricFoundation.libIcomponentMod

import typings.fluentuiTheme.ithemeMod.ITheme
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ITokenFunction[TViewProps, TTokens] extends js.Object {
  
  def apply(props: TViewProps, theme: ITheme): IToken[TViewProps, TTokens] = js.native
}
