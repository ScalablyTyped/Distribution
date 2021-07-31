package typings.uifabricMergeStyles

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object getVendorSettingsMod {
  
  @JSImport("@uifabric/merge-styles/lib/getVendorSettings", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @scala.inline
  def getVendorSettings(): IVendorSettings = ^.asInstanceOf[js.Dynamic].applyDynamic("getVendorSettings")().asInstanceOf[IVendorSettings]
  
  @scala.inline
  def setVendorSettings(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("setVendorSettings")().asInstanceOf[Unit]
  @scala.inline
  def setVendorSettings(vendorSettings: IVendorSettings): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("setVendorSettings")(vendorSettings.asInstanceOf[js.Any]).asInstanceOf[Unit]
  
  trait IVendorSettings extends StObject {
    
    var isMoz: js.UndefOr[Boolean] = js.undefined
    
    var isMs: js.UndefOr[Boolean] = js.undefined
    
    var isOpera: js.UndefOr[Boolean] = js.undefined
    
    var isWebkit: js.UndefOr[Boolean] = js.undefined
  }
  object IVendorSettings {
    
    @scala.inline
    def apply(): IVendorSettings = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[IVendorSettings]
    }
    
    @scala.inline
    implicit class IVendorSettingsMutableBuilder[Self <: IVendorSettings] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setIsMoz(value: Boolean): Self = StObject.set(x, "isMoz", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIsMozUndefined: Self = StObject.set(x, "isMoz", js.undefined)
      
      @scala.inline
      def setIsMs(value: Boolean): Self = StObject.set(x, "isMs", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIsMsUndefined: Self = StObject.set(x, "isMs", js.undefined)
      
      @scala.inline
      def setIsOpera(value: Boolean): Self = StObject.set(x, "isOpera", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIsOperaUndefined: Self = StObject.set(x, "isOpera", js.undefined)
      
      @scala.inline
      def setIsWebkit(value: Boolean): Self = StObject.set(x, "isWebkit", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIsWebkitUndefined: Self = StObject.set(x, "isWebkit", js.undefined)
    }
  }
}
