package typings.uifabricMergeStyles.stylesheetMod

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait IStyleSheetConfig extends js.Object {
  
  /**
    * Initial value for classnames cache. Key is serialized css rules associated with a classname.
    */
  var classNameCache: js.UndefOr[StringDictionary[String]] = js.native
  
  /**
    * CSP settings
    */
  var cspSettings: js.UndefOr[ICSPSettings] = js.native
  
  /**
    * Default 'displayName' to use for a className.
    * @defaultvalue 'css'
    */
  var defaultPrefix: js.UndefOr[String] = js.native
  
  /**
    * Injection mode for how rules are inserted.
    */
  var injectionMode: js.UndefOr[InjectionMode] = js.native
  
  /**
    * Default 'namespace' to attach before the className.
    */
  var namespace: js.UndefOr[String] = js.native
  
  /**
    * Callback executed when a rule is inserted.
    */
  var onInsertRule: js.UndefOr[js.Function1[/* rule */ String, Unit]] = js.native
  
  /**
    * Defines the default direction of rules for auto-rtlifying things.
    * While typically this is represented as a DIR attribute in the markup,
    * the DIR is not enough to control whether padding goes on the left or
    * right. Use this to set the default direction when rules are registered.
    */
  var rtl: js.UndefOr[Boolean] = js.native
}
object IStyleSheetConfig {
  
  @scala.inline
  def apply(): IStyleSheetConfig = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IStyleSheetConfig]
  }
  
  @scala.inline
  implicit class IStyleSheetConfigOps[Self <: IStyleSheetConfig] (val x: Self) extends AnyVal {
    
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
    def setClassNameCache(value: StringDictionary[String]): Self = this.set("classNameCache", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteClassNameCache: Self = this.set("classNameCache", js.undefined)
    
    @scala.inline
    def setCspSettings(value: ICSPSettings): Self = this.set("cspSettings", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCspSettings: Self = this.set("cspSettings", js.undefined)
    
    @scala.inline
    def setDefaultPrefix(value: String): Self = this.set("defaultPrefix", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDefaultPrefix: Self = this.set("defaultPrefix", js.undefined)
    
    @scala.inline
    def setInjectionMode(value: InjectionMode): Self = this.set("injectionMode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteInjectionMode: Self = this.set("injectionMode", js.undefined)
    
    @scala.inline
    def setNamespace(value: String): Self = this.set("namespace", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteNamespace: Self = this.set("namespace", js.undefined)
    
    @scala.inline
    def setOnInsertRule(value: /* rule */ String => Unit): Self = this.set("onInsertRule", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteOnInsertRule: Self = this.set("onInsertRule", js.undefined)
    
    @scala.inline
    def setRtl(value: Boolean): Self = this.set("rtl", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRtl: Self = this.set("rtl", js.undefined)
  }
}
