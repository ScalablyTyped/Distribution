package typings.vscode.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ColorTheme extends js.Object {
  /**
    * The kind of this color theme: light, dark or high contrast.
    */
  val kind: ColorThemeKind
}

object ColorTheme {
  @scala.inline
  def apply(kind: ColorThemeKind): ColorTheme = {
    val __obj = js.Dynamic.literal(kind = kind.asInstanceOf[js.Any])
    __obj.asInstanceOf[ColorTheme]
  }
}

