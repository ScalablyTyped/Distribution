package typings.wixUiCore

import typings.unidriverCore.mod.UniDriver
import typings.wixUiCore.anon.ClickMenuItem
import typings.wixUiCore.anon.GetArrowOffset
import typings.wixUiCore.anon.GetTooltipText
import typings.wixUiCore.avatarUniDriverMod.AvatarDriver
import typings.wixUiCore.buttonNextUniDriverMod.ButtonNextDriver
import typings.wixUiCore.captchaUniDriverMod.CaptchaDriver
import typings.wixUiCore.circularProgressBarUniDriverMod.CircularProgressBarUniDriver
import typings.wixUiCore.filePickerButtonUniDriverMod.FilePickerButtonUniDriver
import typings.wixUiCore.imageUniDriverMod.ImageDriver
import typings.wixUiCore.labelUniDriverMod.LabelDriver
import typings.wixUiCore.linearProgressBarUniDriverMod.LinearProgressBarUniDriver
import typings.wixUiCore.mediaImageUniDriverMod.MediaImageDriver
import typings.wixUiCore.menuItemUniDriverMod.MenuItemDriver
import typings.wixUiCore.paginationUniDriverMod.PaginationDriver
import typings.wixUiCore.signatureInputUniDriverMod.SignatureInputDriver
import typings.wixUiCore.tagsListUniDriverMod.TagsListUniDriver
import typings.wixUiCore.toggleSwitchUniDriverMod.ToggleSwitchUniDriver
import typings.wixUiCore.videoUniDriverMod.IVideoDriver
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object driversUnidriverMod {
  
  @JSImport("wix-ui-core/drivers/unidriver", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @scala.inline
  def avatarDriverFactory(base: UniDriver[js.Any]): AvatarDriver = ^.asInstanceOf[js.Dynamic].applyDynamic("avatarDriverFactory")(base.asInstanceOf[js.Any]).asInstanceOf[AvatarDriver]
  
  @scala.inline
  def buttonNextDriverFactory(base: UniDriver[js.Any]): ButtonNextDriver = ^.asInstanceOf[js.Dynamic].applyDynamic("buttonNextDriverFactory")(base.asInstanceOf[js.Any]).asInstanceOf[ButtonNextDriver]
  
  @scala.inline
  def captchaDriverFactory(base: UniDriver[js.Any]): CaptchaDriver = ^.asInstanceOf[js.Dynamic].applyDynamic("captchaDriverFactory")(base.asInstanceOf[js.Any]).asInstanceOf[CaptchaDriver]
  
  @scala.inline
  def circularProgressBarUniDriverFactory(base: UniDriver[js.Any]): CircularProgressBarUniDriver = ^.asInstanceOf[js.Dynamic].applyDynamic("circularProgressBarUniDriverFactory")(base.asInstanceOf[js.Any]).asInstanceOf[CircularProgressBarUniDriver]
  
  @scala.inline
  def filePickerButtonUniDriverFactory(base: UniDriver[js.Any]): FilePickerButtonUniDriver = ^.asInstanceOf[js.Dynamic].applyDynamic("filePickerButtonUniDriverFactory")(base.asInstanceOf[js.Any]).asInstanceOf[FilePickerButtonUniDriver]
  
  @scala.inline
  def horizontalMenuUniDriverFactory(base: UniDriver[js.Any]): ClickMenuItem = ^.asInstanceOf[js.Dynamic].applyDynamic("horizontalMenuUniDriverFactory")(base.asInstanceOf[js.Any]).asInstanceOf[ClickMenuItem]
  
  @scala.inline
  def imageDriverFactory(base: UniDriver[js.Any]): ImageDriver = ^.asInstanceOf[js.Dynamic].applyDynamic("imageDriverFactory")(base.asInstanceOf[js.Any]).asInstanceOf[ImageDriver]
  
  @scala.inline
  def labelUniDriverFactory(base: UniDriver[js.Any]): LabelDriver = ^.asInstanceOf[js.Dynamic].applyDynamic("labelUniDriverFactory")(base.asInstanceOf[js.Any]).asInstanceOf[LabelDriver]
  
  @scala.inline
  def linearProgressBarUniDriverFactory(base: UniDriver[js.Any]): LinearProgressBarUniDriver = ^.asInstanceOf[js.Dynamic].applyDynamic("linearProgressBarUniDriverFactory")(base.asInstanceOf[js.Any]).asInstanceOf[LinearProgressBarUniDriver]
  
  @scala.inline
  def makeTagsListUniDriver(base: UniDriver[js.Any]): TagsListUniDriver = ^.asInstanceOf[js.Dynamic].applyDynamic("makeTagsListUniDriver")(base.asInstanceOf[js.Any]).asInstanceOf[TagsListUniDriver]
  
  @scala.inline
  def mediaImageDriverFactory(base: UniDriver[js.Any]): MediaImageDriver = ^.asInstanceOf[js.Dynamic].applyDynamic("mediaImageDriverFactory")(base.asInstanceOf[js.Any]).asInstanceOf[MediaImageDriver]
  
  @scala.inline
  def menuItemDriverFactory(base: UniDriver[js.Any]): MenuItemDriver = ^.asInstanceOf[js.Dynamic].applyDynamic("menuItemDriverFactory")(base.asInstanceOf[js.Any]).asInstanceOf[MenuItemDriver]
  
  @scala.inline
  def paginationDriverFactory(base: UniDriver[js.Any]): PaginationDriver = ^.asInstanceOf[js.Dynamic].applyDynamic("paginationDriverFactory")(base.asInstanceOf[js.Any]).asInstanceOf[PaginationDriver]
  
  @scala.inline
  def popoverNextDriverFactory(base: js.Any, body: js.Any): GetArrowOffset = (^.asInstanceOf[js.Dynamic].applyDynamic("popoverNextDriverFactory")(base.asInstanceOf[js.Any], body.asInstanceOf[js.Any])).asInstanceOf[GetArrowOffset]
  
  @scala.inline
  def signatureInputUniDriverFactory(base: UniDriver[js.Any]): SignatureInputDriver = ^.asInstanceOf[js.Dynamic].applyDynamic("signatureInputUniDriverFactory")(base.asInstanceOf[js.Any]).asInstanceOf[SignatureInputDriver]
  
  @scala.inline
  def testkit(base: UniDriver[js.Any], body: UniDriver[js.Any]): GetArrowOffset = (^.asInstanceOf[js.Dynamic].applyDynamic("testkit")(base.asInstanceOf[js.Any], body.asInstanceOf[js.Any])).asInstanceOf[GetArrowOffset]
  
  @scala.inline
  def toggleSwitchUniDriverFactory(base: UniDriver[js.Any]): ToggleSwitchUniDriver = ^.asInstanceOf[js.Dynamic].applyDynamic("toggleSwitchUniDriverFactory")(base.asInstanceOf[js.Any]).asInstanceOf[ToggleSwitchUniDriver]
  
  @scala.inline
  def tooltipDriverFactory(base: js.Any, body: js.Any): GetTooltipText = (^.asInstanceOf[js.Dynamic].applyDynamic("tooltipDriverFactory")(base.asInstanceOf[js.Any], body.asInstanceOf[js.Any])).asInstanceOf[GetTooltipText]
  
  @scala.inline
  def tooltipNextDriverFactory(base: js.Any, body: js.Any): GetTooltipText = (^.asInstanceOf[js.Dynamic].applyDynamic("tooltipNextDriverFactory")(base.asInstanceOf[js.Any], body.asInstanceOf[js.Any])).asInstanceOf[GetTooltipText]
  
  @scala.inline
  def videoDriverFactory(base: UniDriver[js.Any]): IVideoDriver = ^.asInstanceOf[js.Dynamic].applyDynamic("videoDriverFactory")(base.asInstanceOf[js.Any]).asInstanceOf[IVideoDriver]
}
