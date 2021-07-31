package typings.tuyaPanelKit

import typings.react.mod.global.JSX.Element
import typings.tuyaPanelKit.stackTypesMod.StackHeaderLeftButtonProps
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object headerBackButtonMod {
  
  @JSImport("tuya-panel-kit/@react-navigation/stack/views/Header/HeaderBackButton", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @scala.inline
  def default(
    hasDisabledAllowFontScalingBackImageLabelLabelStyleLabelVisibleOnLabelLayoutOnPressCustomPressColorAndroidScreenLayoutCustomTintColorTitleLayoutTruncatedLabelAccessibilityLabelStyle: Props
  ): Element = ^.asInstanceOf[js.Dynamic].applyDynamic("default")(hasDisabledAllowFontScalingBackImageLabelLabelStyleLabelVisibleOnLabelLayoutOnPressCustomPressColorAndroidScreenLayoutCustomTintColorTitleLayoutTruncatedLabelAccessibilityLabelStyle.asInstanceOf[js.Any]).asInstanceOf[Element]
  
  // tslint:disable-next-line strict-export-declare-modifiers
  type Props = StackHeaderLeftButtonProps
}
