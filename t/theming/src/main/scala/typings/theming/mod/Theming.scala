package typings.theming.mod

import typings.react.mod.ComponentType
import typings.react.mod.Context
import typings.theming.anon.ThemeNonNullable
import typings.theming.anon.`0`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Theming[Theme] extends js.Object {
  
  var ThemeProvider: ThemeProviderFactory[Theme] = js.native
  
  var context: Context[Theme] = js.native
  
  var useTheme: UseThemeFactory[Theme] = js.native
  
  var withTheme: WithThemeFactory[Theme] = js.native
}
object Theming {
  
  @scala.inline
  def apply[Theme](
    ThemeProvider: ThemeProviderFactory[Theme],
    context: Context[Theme],
    useTheme: () => Theme,
    withTheme: /* comp */ ComponentType[ThemeNonNullable[Theme]] => ComponentType[ThemeNonNullable[Theme] with `0`[Theme]]
  ): Theming[Theme] = {
    val __obj = js.Dynamic.literal(ThemeProvider = ThemeProvider.asInstanceOf[js.Any], context = context.asInstanceOf[js.Any], useTheme = js.Any.fromFunction0(useTheme), withTheme = js.Any.fromFunction1(withTheme))
    __obj.asInstanceOf[Theming[Theme]]
  }
  
  @scala.inline
  implicit class ThemingOps[Self <: Theming[_], Theme] (val x: Self with Theming[Theme]) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setThemeProvider(value: ThemeProviderFactory[Theme]): Self = this.set("ThemeProvider", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setContext(value: Context[Theme]): Self = this.set("context", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUseTheme(value: () => Theme): Self = this.set("useTheme", js.Any.fromFunction0(value))
    
    @scala.inline
    def setWithTheme(
      value: /* comp */ ComponentType[ThemeNonNullable[Theme]] => ComponentType[ThemeNonNullable[Theme] with `0`[Theme]]
    ): Self = this.set("withTheme", js.Any.fromFunction1(value))
  }
}
