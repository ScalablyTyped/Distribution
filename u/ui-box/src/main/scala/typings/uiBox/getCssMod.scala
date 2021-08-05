package typings.uiBox

import typings.uiBox.getClassNameMod.PropertyInfo
import typings.uiBox.typesEnhancersMod.EnhancedProp
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object getCssMod {
  
  @JSImport("ui-box/dist/src/get-css", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def default(propertyInfo: PropertyInfo, value: String): EnhancedProp | Null = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(propertyInfo.asInstanceOf[js.Any], value.asInstanceOf[js.Any])).asInstanceOf[EnhancedProp | Null]
  inline def default(propertyInfo: PropertyInfo, value: Double): EnhancedProp | Null = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(propertyInfo.asInstanceOf[js.Any], value.asInstanceOf[js.Any])).asInstanceOf[EnhancedProp | Null]
}
