package typings.wixStyleReact.mod

import org.scalablytyped.runtime.Instantiable0
import typings.react.mod.SFC
import typings.wixStyleReact.inputMod.AffixProps
import typings.wixStyleReact.inputMod.IconAffixProps
import typings.wixStyleReact.inputMod.InputStatusError
import typings.wixStyleReact.inputMod.InputStatusLoading
import typings.wixStyleReact.inputMod.InputStatusWarning
import typings.wixStyleReact.inputMod.TickerProps
import typings.wixStyleReact.inputMod.default
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("wix-style-react", "Input")
@js.native
class Input () extends default
/* static members */
object Input {
  
  @JSImport("wix-style-react", "Input")
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("wix-style-react", "Input.Affix")
  @js.native
  def Affix: SFC[AffixProps] = js.native
  inline def Affix_=(x: SFC[AffixProps]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("Affix")(x.asInstanceOf[js.Any])
  
  @JSImport("wix-style-react", "Input.Group")
  @js.native
  def Group: SFC[js.Object] = js.native
  inline def Group_=(x: SFC[js.Object]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("Group")(x.asInstanceOf[js.Any])
  
  @JSImport("wix-style-react", "Input.IconAffix")
  @js.native
  def IconAffix: SFC[IconAffixProps] = js.native
  inline def IconAffix_=(x: SFC[IconAffixProps]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("IconAffix")(x.asInstanceOf[js.Any])
  
  @JSImport("wix-style-react", "Input.StatusError")
  @js.native
  def StatusError: InputStatusError = js.native
  inline def StatusError_=(x: InputStatusError): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("StatusError")(x.asInstanceOf[js.Any])
  
  @JSImport("wix-style-react", "Input.StatusLoading")
  @js.native
  def StatusLoading: InputStatusLoading = js.native
  inline def StatusLoading_=(x: InputStatusLoading): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("StatusLoading")(x.asInstanceOf[js.Any])
  
  @JSImport("wix-style-react", "Input.StatusWarning")
  @js.native
  def StatusWarning: InputStatusWarning = js.native
  inline def StatusWarning_=(x: InputStatusWarning): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("StatusWarning")(x.asInstanceOf[js.Any])
  
  @JSImport("wix-style-react", "Input.Ticker")
  @js.native
  def Ticker: SFC[TickerProps] = js.native
  inline def Ticker_=(x: SFC[TickerProps]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("Ticker")(x.asInstanceOf[js.Any])
  
  @JSImport("wix-style-react", "Input.Unit")
  @js.native
  def Unit: Instantiable0[typings.wixStyleReact.inputMod.Unit] = js.native
  inline def Unit_=(x: Instantiable0[typings.wixStyleReact.inputMod.Unit]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("Unit")(x.asInstanceOf[js.Any])
}
