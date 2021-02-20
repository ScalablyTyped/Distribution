package typings.uifabricUtilities

import typings.uifabricUtilities.anon.ReadonlyICustomizerContex
import typings.uifabricUtilities.createRefMod.IRefObject
import typings.uifabricUtilities.customizationsMod.ISettings
import typings.uifabricUtilities.customizationsMod.ISettingsFunction
import typings.uifabricUtilities.customizerContextMod.ICustomizerContext
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object customizerTypesMod {
  
  /* Inlined @uifabric/utilities.@uifabric/utilities/lib/BaseComponent.types.IBaseProps<any> & std.Partial<{  settings :@uifabric/utilities.@uifabric/utilities/lib/customizations/Customizations.ISettings | @uifabric/utilities.@uifabric/utilities/lib/customizations/Customizations.ISettingsFunction,   scopedSettings :@uifabric/utilities.@uifabric/utilities/lib/customizations/Customizations.ISettings | @uifabric/utilities.@uifabric/utilities/lib/customizations/Customizations.ISettingsFunction}> & {  contextTransform :(context : std.Readonly<@uifabric/utilities.@uifabric/utilities/lib/customizations/CustomizerContext.ICustomizerContext>): @uifabric/utilities.@uifabric/utilities/lib/customizations/CustomizerContext.ICustomizerContext | undefined} */
  @js.native
  trait ICustomizerProps extends StObject {
    
    var componentRef: js.UndefOr[IRefObject[_]] = js.native
    
    /**
      * Optional transform function for context. Any implementations should take care to return context without
      * mutating it.
      */
    var contextTransform: js.UndefOr[js.Function1[/* context */ ReadonlyICustomizerContex, ICustomizerContext]] = js.native
    
    var scopedSettings: js.UndefOr[ISettings | ISettingsFunction] = js.native
    
    var settings: js.UndefOr[ISettings | ISettingsFunction] = js.native
  }
  object ICustomizerProps {
    
    @scala.inline
    def apply(): ICustomizerProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ICustomizerProps]
    }
    
    @scala.inline
    implicit class ICustomizerPropsMutableBuilder[Self <: ICustomizerProps] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setComponentRef(value: IRefObject[_]): Self = StObject.set(x, "componentRef", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setComponentRefFunction1(value: /* ref */ _ | Null => Unit): Self = StObject.set(x, "componentRef", js.Any.fromFunction1(value))
      
      @scala.inline
      def setComponentRefUndefined: Self = StObject.set(x, "componentRef", js.undefined)
      
      @scala.inline
      def setContextTransform(value: /* context */ ReadonlyICustomizerContex => ICustomizerContext): Self = StObject.set(x, "contextTransform", js.Any.fromFunction1(value))
      
      @scala.inline
      def setContextTransformUndefined: Self = StObject.set(x, "contextTransform", js.undefined)
      
      @scala.inline
      def setScopedSettings(value: ISettings | ISettingsFunction): Self = StObject.set(x, "scopedSettings", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setScopedSettingsFunction1(value: /* settings */ ISettings => ISettings): Self = StObject.set(x, "scopedSettings", js.Any.fromFunction1(value))
      
      @scala.inline
      def setScopedSettingsUndefined: Self = StObject.set(x, "scopedSettings", js.undefined)
      
      @scala.inline
      def setSettings(value: ISettings | ISettingsFunction): Self = StObject.set(x, "settings", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSettingsFunction1(value: /* settings */ ISettings => ISettings): Self = StObject.set(x, "settings", js.Any.fromFunction1(value))
      
      @scala.inline
      def setSettingsUndefined: Self = StObject.set(x, "settings", js.undefined)
    }
  }
}
