package typings.wixStyleReact

import typings.color.mod.Color
import typings.color.mod.ColorParam
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distTypesColorPickerUtilsMod {
  
  @JSImport("wix-style-react/dist/types/ColorPicker/utils", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def getHexOrEmpty(_color: Any): Any = ^.asInstanceOf[js.Dynamic].applyDynamic("getHexOrEmpty")(_color.asInstanceOf[js.Any]).asInstanceOf[Any]
  
  inline def getHsbOrEmpty(_color: Any): Any = ^.asInstanceOf[js.Dynamic].applyDynamic("getHsbOrEmpty")(_color.asInstanceOf[js.Any]).asInstanceOf[Any]
  
  inline def getRgbOrEmpty(_color: Any): js.Object = ^.asInstanceOf[js.Dynamic].applyDynamic("getRgbOrEmpty")(_color.asInstanceOf[js.Any]).asInstanceOf[js.Object]
  
  inline def isTransparent(_color: Any): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isTransparent")(_color.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  
  inline def safeColor(input: Any): Color[ColorParam] | Null = ^.asInstanceOf[js.Dynamic].applyDynamic("safeColor")(input.asInstanceOf[js.Any]).asInstanceOf[Color[ColorParam] | Null]
  inline def safeColor(input: Any, allowEmpty: Boolean): Color[ColorParam] | Null = (^.asInstanceOf[js.Dynamic].applyDynamic("safeColor")(input.asInstanceOf[js.Any], allowEmpty.asInstanceOf[js.Any])).asInstanceOf[Color[ColorParam] | Null]
}
