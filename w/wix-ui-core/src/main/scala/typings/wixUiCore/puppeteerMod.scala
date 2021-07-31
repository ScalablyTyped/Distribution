package typings.wixUiCore

import typings.wixUiCore.anon.ClickMenuItem
import typings.wixUiCore.anon.Page
import typings.wixUiCore.avatarUniDriverMod.AvatarDriver
import typings.wixUiCore.buttonNextUniDriverMod.ButtonNextDriver
import typings.wixUiCore.captchaUniDriverMod.CaptchaDriver
import typings.wixUiCore.circularProgressBarUniDriverMod.CircularProgressBarUniDriver
import typings.wixUiCore.filePickerButtonUniDriverMod.FilePickerButtonUniDriver
import typings.wixUiCore.linearProgressBarUniDriverMod.LinearProgressBarUniDriver
import typings.wixUiCore.signatureInputUniDriverMod.SignatureInputDriver
import typings.wixUiCore.tagsListUniDriverMod.TagsListUniDriver
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object puppeteerMod {
  
  @JSImport("wix-ui-core/dist/src/testkit/puppeteer", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @scala.inline
  def avatarTestkitFactory(obj: Page): js.Promise[AvatarDriver] = ^.asInstanceOf[js.Dynamic].applyDynamic("avatarTestkitFactory")(obj.asInstanceOf[js.Any]).asInstanceOf[js.Promise[AvatarDriver]]
  
  @scala.inline
  def buttonNextTestkitFactory(obj: Page): js.Promise[ButtonNextDriver] = ^.asInstanceOf[js.Dynamic].applyDynamic("buttonNextTestkitFactory")(obj.asInstanceOf[js.Any]).asInstanceOf[js.Promise[ButtonNextDriver]]
  
  @scala.inline
  def captchaTestkitFactory(obj: Page): js.Promise[CaptchaDriver] = ^.asInstanceOf[js.Dynamic].applyDynamic("captchaTestkitFactory")(obj.asInstanceOf[js.Any]).asInstanceOf[js.Promise[CaptchaDriver]]
  
  @scala.inline
  def circularProgressBarTestkitFactory(obj: Page): js.Promise[CircularProgressBarUniDriver] = ^.asInstanceOf[js.Dynamic].applyDynamic("circularProgressBarTestkitFactory")(obj.asInstanceOf[js.Any]).asInstanceOf[js.Promise[CircularProgressBarUniDriver]]
  
  @scala.inline
  def filePickerButtonTestkitFactory(obj: Page): js.Promise[FilePickerButtonUniDriver] = ^.asInstanceOf[js.Dynamic].applyDynamic("filePickerButtonTestkitFactory")(obj.asInstanceOf[js.Any]).asInstanceOf[js.Promise[FilePickerButtonUniDriver]]
  
  @scala.inline
  def horizontalMenuTestkitFactory(obj: Page): js.Promise[ClickMenuItem] = ^.asInstanceOf[js.Dynamic].applyDynamic("horizontalMenuTestkitFactory")(obj.asInstanceOf[js.Any]).asInstanceOf[js.Promise[ClickMenuItem]]
  
  @scala.inline
  def linearProgressBarTestkitFactory(obj: Page): js.Promise[LinearProgressBarUniDriver] = ^.asInstanceOf[js.Dynamic].applyDynamic("linearProgressBarTestkitFactory")(obj.asInstanceOf[js.Any]).asInstanceOf[js.Promise[LinearProgressBarUniDriver]]
  
  @scala.inline
  def signatureInputTestkitFactory(obj: Page): js.Promise[SignatureInputDriver] = ^.asInstanceOf[js.Dynamic].applyDynamic("signatureInputTestkitFactory")(obj.asInstanceOf[js.Any]).asInstanceOf[js.Promise[SignatureInputDriver]]
  
  @scala.inline
  def tagsListTestkitFactory(obj: Page): js.Promise[TagsListUniDriver] = ^.asInstanceOf[js.Dynamic].applyDynamic("tagsListTestkitFactory")(obj.asInstanceOf[js.Any]).asInstanceOf[js.Promise[TagsListUniDriver]]
}
