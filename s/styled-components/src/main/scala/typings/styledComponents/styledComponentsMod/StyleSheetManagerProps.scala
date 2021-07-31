package typings.styledComponents.styledComponentsMod

import typings.std.HTMLElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait StyleSheetManagerProps extends StObject {
  
  var disableCSSOMInjection: js.UndefOr[Boolean] = js.undefined
  
  var disableVendorPrefixes: js.UndefOr[Boolean] = js.undefined
  
  var sheet: js.UndefOr[ServerStyleSheet] = js.undefined
  
  var stylisPlugins: js.UndefOr[js.Array[StylisPlugin]] = js.undefined
  
  var target: js.UndefOr[HTMLElement] = js.undefined
}
object StyleSheetManagerProps {
  
  @scala.inline
  def apply(): StyleSheetManagerProps = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[StyleSheetManagerProps]
  }
  
  @scala.inline
  implicit class StyleSheetManagerPropsMutableBuilder[Self <: StyleSheetManagerProps] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDisableCSSOMInjection(value: Boolean): Self = StObject.set(x, "disableCSSOMInjection", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDisableCSSOMInjectionUndefined: Self = StObject.set(x, "disableCSSOMInjection", js.undefined)
    
    @scala.inline
    def setDisableVendorPrefixes(value: Boolean): Self = StObject.set(x, "disableVendorPrefixes", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDisableVendorPrefixesUndefined: Self = StObject.set(x, "disableVendorPrefixes", js.undefined)
    
    @scala.inline
    def setSheet(value: ServerStyleSheet): Self = StObject.set(x, "sheet", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSheetUndefined: Self = StObject.set(x, "sheet", js.undefined)
    
    @scala.inline
    def setStylisPlugins(value: js.Array[StylisPlugin]): Self = StObject.set(x, "stylisPlugins", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStylisPluginsUndefined: Self = StObject.set(x, "stylisPlugins", js.undefined)
    
    @scala.inline
    def setStylisPluginsVarargs(value: StylisPlugin*): Self = StObject.set(x, "stylisPlugins", js.Array(value :_*))
    
    @scala.inline
    def setTarget(value: HTMLElement): Self = StObject.set(x, "target", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTargetUndefined: Self = StObject.set(x, "target", js.undefined)
  }
}
