package typings.themeUiCss.typesMod

import org.scalablytyped.runtime.StringDictionary
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ColorModesScale
  extends StObject
     with ColorMode {
  
  /**
    * Nested color modes can provide overrides when used in conjunction with
    * `Theme.initialColorModeName and `useColorMode()`
    */
  var modes: js.UndefOr[StringDictionary[ColorMode]] = js.undefined
}
object ColorModesScale {
  
  @scala.inline
  def apply(): ColorModesScale = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ColorModesScale]
  }
  
  @scala.inline
  implicit class ColorModesScaleMutableBuilder[Self <: ColorModesScale] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setModes(value: StringDictionary[ColorMode]): Self = StObject.set(x, "modes", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setModesUndefined: Self = StObject.set(x, "modes", js.undefined)
  }
}
