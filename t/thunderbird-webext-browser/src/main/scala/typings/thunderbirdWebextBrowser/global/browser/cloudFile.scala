package typings.thunderbirdWebextBrowser.global.browser

import typings.thunderbirdWebextBrowser.WebExtEvent
import typings.thunderbirdWebextBrowser.anon.Error
import typings.thunderbirdWebextBrowser.anon.TemplateInfo
import typings.thunderbirdWebextBrowser.browser.cloudFile.CloudFile
import typings.thunderbirdWebextBrowser.browser.cloudFile.CloudFileAccount
import typings.thunderbirdWebextBrowser.browser.cloudFile.RelatedCloudFile
import typings.thunderbirdWebextBrowser.browser.cloudFile.UpdateAccountUpdateProperties
import typings.thunderbirdWebextBrowser.browser.tabs.Tab
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object cloudFile {
  
  @JSGlobal("browser.cloudFile")
  @js.native
  val ^ : js.Any = js.native
  
  inline def getAccount(accountId: String): js.Promise[CloudFileAccount] = ^.asInstanceOf[js.Dynamic].applyDynamic("getAccount")(accountId.asInstanceOf[js.Any]).asInstanceOf[js.Promise[CloudFileAccount]]
  
  inline def getAllAccounts(): js.Promise[js.Array[CloudFileAccount]] = ^.asInstanceOf[js.Dynamic].applyDynamic("getAllAccounts")().asInstanceOf[js.Promise[js.Array[CloudFileAccount]]]
  
  @JSGlobal("browser.cloudFile.onAccountAdded")
  @js.native
  val onAccountAdded: WebExtEvent[js.Function1[/* account */ CloudFileAccount, Unit]] = js.native
  
  @JSGlobal("browser.cloudFile.onAccountDeleted")
  @js.native
  val onAccountDeleted: WebExtEvent[js.Function1[/* accountId */ String, Unit]] = js.native
  
  @JSGlobal("browser.cloudFile.onFileDeleted")
  @js.native
  val onFileDeleted: WebExtEvent[
    js.Function3[/* account */ CloudFileAccount, /* fileId */ Double, /* tab */ Tab, Unit]
  ] = js.native
  
  @JSGlobal("browser.cloudFile.onFileRename")
  @js.native
  val onFileRename: WebExtEvent[
    js.Function4[
      /* account */ CloudFileAccount, 
      /* fileId */ Double, 
      /* newName */ String, 
      /* tab */ Tab, 
      Error
    ]
  ] = js.native
  
  @JSGlobal("browser.cloudFile.onFileUpload")
  @js.native
  val onFileUpload: WebExtEvent[
    js.Function4[
      /* account */ CloudFileAccount, 
      /* fileInfo */ CloudFile, 
      /* tab */ Tab, 
      /* relatedFileInfo */ js.UndefOr[RelatedCloudFile], 
      TemplateInfo
    ]
  ] = js.native
  
  @JSGlobal("browser.cloudFile.onFileUploadAbort")
  @js.native
  val onFileUploadAbort: WebExtEvent[
    js.Function3[/* account */ CloudFileAccount, /* fileId */ Double, /* tab */ Tab, Unit]
  ] = js.native
  
  inline def updateAccount(accountId: String, updateProperties: UpdateAccountUpdateProperties): js.Promise[CloudFileAccount] = (^.asInstanceOf[js.Dynamic].applyDynamic("updateAccount")(accountId.asInstanceOf[js.Any], updateProperties.asInstanceOf[js.Any])).asInstanceOf[js.Promise[CloudFileAccount]]
}
