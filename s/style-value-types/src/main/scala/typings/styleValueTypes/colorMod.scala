package typings.styleValueTypes

import typings.styleValueTypes.typesMod.ValueType
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object colorMod {
  
  @JSImport("style-value-types/lib/value-types/color", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("style-value-types/lib/value-types/color", "color")
  @js.native
  val color: ValueType = js.native
  
  @scala.inline
  def getValueFromFunctionString(value: String): String = ^.asInstanceOf[js.Dynamic].applyDynamic("getValueFromFunctionString")(value.asInstanceOf[js.Any]).asInstanceOf[String]
  
  @JSImport("style-value-types/lib/value-types/color", "hex")
  @js.native
  val hex: ValueType = js.native
  
  @JSImport("style-value-types/lib/value-types/color", "hsla")
  @js.native
  val hsla: ValueType = js.native
  
  @JSImport("style-value-types/lib/value-types/color", "rgbUnit")
  @js.native
  val rgbUnit: ValueType = js.native
  
  @JSImport("style-value-types/lib/value-types/color", "rgba")
  @js.native
  val rgba: ValueType = js.native
}
