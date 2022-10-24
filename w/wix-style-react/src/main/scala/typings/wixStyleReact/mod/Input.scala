package typings.wixStyleReact.mod

import typings.react.mod.FC
import typings.wixStyleReact.distTypesInputMod.AffixProps
import typings.wixStyleReact.distTypesInputMod.IconAffixProps
import typings.wixStyleReact.distTypesInputMod.InputStatusError
import typings.wixStyleReact.distTypesInputMod.InputStatusLoading
import typings.wixStyleReact.distTypesInputMod.InputStatusWarning
import typings.wixStyleReact.distTypesInputMod.TickerProps
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("wix-style-react", "Input")
@js.native
open class Input ()
  extends typings.wixStyleReact.distTypesInputMod.default
/* static members */
object Input {
  
  @JSImport("wix-style-react", "Input")
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("wix-style-react", "Input.Affix")
  @js.native
  def Affix: FC[AffixProps] = js.native
  inline def Affix_=(x: FC[AffixProps]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("Affix")(x.asInstanceOf[js.Any])
  
  @JSImport("wix-style-react", "Input.Group")
  @js.native
  def Group: FC[js.Object] = js.native
  inline def Group_=(x: FC[js.Object]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("Group")(x.asInstanceOf[js.Any])
  
  @JSImport("wix-style-react", "Input.IconAffix")
  @js.native
  def IconAffix: FC[IconAffixProps] = js.native
  inline def IconAffix_=(x: FC[IconAffixProps]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("IconAffix")(x.asInstanceOf[js.Any])
  
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
  def Ticker: FC[TickerProps] = js.native
  inline def Ticker_=(x: FC[TickerProps]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("Ticker")(x.asInstanceOf[js.Any])
}
