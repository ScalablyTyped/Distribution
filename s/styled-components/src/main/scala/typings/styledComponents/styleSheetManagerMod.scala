package typings.styledComponents

import typings.react.mod.Consumer
import typings.react.mod.Context
import typings.react.mod.ReactChild
import typings.react.mod.global.JSX.Element
import typings.std.HTMLElement
import typings.styledComponents.distTypesMod.Stringifier
import typings.styledComponents.sheetMod.default
import typings.stylis.mod.Middleware_
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object styleSheetManagerMod {
  
  @JSImport("styled-components/native/dist/dist/models/StyleSheetManager", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def default(props: Props): Element = ^.asInstanceOf[js.Dynamic].applyDynamic("default")(props.asInstanceOf[js.Any]).asInstanceOf[Element]
  
  @JSImport("styled-components/native/dist/dist/models/StyleSheetManager", "StyleSheetConsumer")
  @js.native
  val StyleSheetConsumer: Consumer[Unit | default] = js.native
  
  @JSImport("styled-components/native/dist/dist/models/StyleSheetManager", "StyleSheetContext")
  @js.native
  val StyleSheetContext: Context[Unit | default] = js.native
  
  @JSImport("styled-components/native/dist/dist/models/StyleSheetManager", "StylisConsumer")
  @js.native
  val StylisConsumer: Consumer[Unit | Stringifier] = js.native
  
  @JSImport("styled-components/native/dist/dist/models/StyleSheetManager", "StylisContext")
  @js.native
  val StylisContext: Context[Unit | Stringifier] = js.native
  
  @JSImport("styled-components/native/dist/dist/models/StyleSheetManager", "mainSheet")
  @js.native
  val mainSheet: default = js.native
  
  @JSImport("styled-components/native/dist/dist/models/StyleSheetManager", "mainStylis")
  @js.native
  val mainStylis: Stringifier = js.native
  
  inline def useStyleSheet(): default = ^.asInstanceOf[js.Dynamic].applyDynamic("useStyleSheet")().asInstanceOf[default]
  
  inline def useStylis(): Stringifier = ^.asInstanceOf[js.Dynamic].applyDynamic("useStylis")().asInstanceOf[Stringifier]
  
  trait Props extends StObject {
    
    var children: js.UndefOr[ReactChild] = js.undefined
    
    var disableCSSOMInjection: js.UndefOr[Boolean] = js.undefined
    
    var disableVendorPrefixes: js.UndefOr[Boolean] = js.undefined
    
    var sheet: js.UndefOr[default] = js.undefined
    
    var stylisPlugins: js.UndefOr[js.Array[Middleware_]] = js.undefined
    
    var target: js.UndefOr[HTMLElement] = js.undefined
  }
  object Props {
    
    inline def apply(): Props = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Props]
    }
    
    extension [Self <: Props](x: Self) {
      
      inline def setChildren(value: ReactChild): Self = StObject.set(x, "children", value.asInstanceOf[js.Any])
      
      inline def setChildrenUndefined: Self = StObject.set(x, "children", js.undefined)
      
      inline def setDisableCSSOMInjection(value: Boolean): Self = StObject.set(x, "disableCSSOMInjection", value.asInstanceOf[js.Any])
      
      inline def setDisableCSSOMInjectionUndefined: Self = StObject.set(x, "disableCSSOMInjection", js.undefined)
      
      inline def setDisableVendorPrefixes(value: Boolean): Self = StObject.set(x, "disableVendorPrefixes", value.asInstanceOf[js.Any])
      
      inline def setDisableVendorPrefixesUndefined: Self = StObject.set(x, "disableVendorPrefixes", js.undefined)
      
      inline def setSheet(value: default): Self = StObject.set(x, "sheet", value.asInstanceOf[js.Any])
      
      inline def setSheetUndefined: Self = StObject.set(x, "sheet", js.undefined)
      
      inline def setStylisPlugins(value: js.Array[Middleware_]): Self = StObject.set(x, "stylisPlugins", value.asInstanceOf[js.Any])
      
      inline def setStylisPluginsUndefined: Self = StObject.set(x, "stylisPlugins", js.undefined)
      
      inline def setStylisPluginsVarargs(value: Middleware_ *): Self = StObject.set(x, "stylisPlugins", js.Array(value*))
      
      inline def setTarget(value: HTMLElement): Self = StObject.set(x, "target", value.asInstanceOf[js.Any])
      
      inline def setTargetUndefined: Self = StObject.set(x, "target", js.undefined)
    }
  }
}
