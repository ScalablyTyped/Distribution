package typings.vueI18n.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait I18nPluginOptions extends StObject {
  
  /**
    * Whether to globally install the components that is offered by Vue I18n
    *
    * @remarks
    * If this option is enabled, the components will be installed globally at `app.use` time.
    *
    * If you want to install manually in the `import` syntax, you can set it to `false` to install when needed.
    *
    * @defaultValue `true`
    */
  var globalInstall: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Whether to use the tag name `i18n` for Translation Component
    *
    * @remarks
    * This option is used for compatibility with Vue I18n v8.x.
    *
    * If you can't migrate right away, you can temporarily enable this option, and you can work Translation Component.
    *
    * @defaultValue `false`
    */
  var useI18nComponentName: js.UndefOr[Boolean] = js.undefined
}
object I18nPluginOptions {
  
  inline def apply(): I18nPluginOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[I18nPluginOptions]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: I18nPluginOptions] (val x: Self) extends AnyVal {
    
    inline def setGlobalInstall(value: Boolean): Self = StObject.set(x, "globalInstall", value.asInstanceOf[js.Any])
    
    inline def setGlobalInstallUndefined: Self = StObject.set(x, "globalInstall", js.undefined)
    
    inline def setUseI18nComponentName(value: Boolean): Self = StObject.set(x, "useI18nComponentName", value.asInstanceOf[js.Any])
    
    inline def setUseI18nComponentNameUndefined: Self = StObject.set(x, "useI18nComponentName", js.undefined)
  }
}
