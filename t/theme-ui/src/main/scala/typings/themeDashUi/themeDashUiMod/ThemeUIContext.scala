package typings.themeDashUi.themeDashUiMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ThemeUIContext extends js.Object {
  var components: /* import warning: ImportType.apply c Unsupported type mapping: 
  {[ P in 'p' | 'b' | 'i' | 'a' | 'h1' | 'h2' | 'h3' | 'h4' | 'h5' | 'h6' | 'img' | 'pre' | 'code' | 'ol' | 'ul' | 'li' | 'blockquote' | 'hr' | 'table' | 'tr' | 'th' | 'td' | 'em' | 'strong' | 'div' | 'delete' | 'inlineCode' | 'thematicBreak' | 'root' ]: theme-ui.theme-ui.SxComponent<theme-ui.theme-ui.IntrinsicSxElements[P]>}
    */ typings.themeDashUi.themeDashUiStrings.ThemeUIContext with IntrinsicSxElements
  var theme: Theme
}

object ThemeUIContext {
  @scala.inline
  def apply(
    components: /* import warning: ImportType.apply c Unsupported type mapping: 
  {[ P in 'p' | 'b' | 'i' | 'a' | 'h1' | 'h2' | 'h3' | 'h4' | 'h5' | 'h6' | 'img' | 'pre' | 'code' | 'ol' | 'ul' | 'li' | 'blockquote' | 'hr' | 'table' | 'tr' | 'th' | 'td' | 'em' | 'strong' | 'div' | 'delete' | 'inlineCode' | 'thematicBreak' | 'root' ]: theme-ui.theme-ui.SxComponent<theme-ui.theme-ui.IntrinsicSxElements[P]>}
    */ typings.themeDashUi.themeDashUiStrings.ThemeUIContext with IntrinsicSxElements,
    theme: Theme
  ): ThemeUIContext = {
    val __obj = js.Dynamic.literal(components = components, theme = theme)
  
    __obj.asInstanceOf[ThemeUIContext]
  }
}

