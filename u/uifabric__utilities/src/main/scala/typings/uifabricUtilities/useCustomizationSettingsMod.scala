package typings.uifabricUtilities

import typings.uifabricUtilities.customizationsMod.ISettings
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object useCustomizationSettingsMod {
  
  @JSImport("@uifabric/utilities/lib/customizations/useCustomizationSettings", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @scala.inline
  def useCustomizationSettings(properties: js.Array[String]): ISettings = ^.asInstanceOf[js.Dynamic].applyDynamic("useCustomizationSettings")(properties.asInstanceOf[js.Any]).asInstanceOf[ISettings]
  @scala.inline
  def useCustomizationSettings(properties: js.Array[String], scopeName: String): ISettings = (^.asInstanceOf[js.Dynamic].applyDynamic("useCustomizationSettings")(properties.asInstanceOf[js.Any], scopeName.asInstanceOf[js.Any])).asInstanceOf[ISettings]
}
