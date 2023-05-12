package typings.thunderbirdWebextBrowser.global.browser

import typings.std.File
import typings.thunderbirdWebextBrowser.WebExtEvent
import typings.thunderbirdWebextBrowser.anon.Details
import typings.thunderbirdWebextBrowser.browser.compose.BeginForwardForwardType
import typings.thunderbirdWebextBrowser.browser.compose.BeginReplyReplyType
import typings.thunderbirdWebextBrowser.browser.compose.ComposeAttachment
import typings.thunderbirdWebextBrowser.browser.compose.ComposeDetails
import typings.thunderbirdWebextBrowser.browser.compose.ComposeDictionaries
import typings.thunderbirdWebextBrowser.browser.compose.ComposeState
import typings.thunderbirdWebextBrowser.browser.compose.FileAttachment
import typings.thunderbirdWebextBrowser.browser.compose.OnAfterSaveSaveInfo
import typings.thunderbirdWebextBrowser.browser.compose.OnAfterSendSendInfo
import typings.thunderbirdWebextBrowser.browser.compose.SaveMessageOptions
import typings.thunderbirdWebextBrowser.browser.compose.SaveMessageReturnReturn
import typings.thunderbirdWebextBrowser.browser.compose.SendMessageOptions
import typings.thunderbirdWebextBrowser.browser.compose.SendMessageReturnReturn
import typings.thunderbirdWebextBrowser.browser.tabs.Tab
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object compose {
  
  @JSGlobal("browser.compose")
  @js.native
  val ^ : js.Any = js.native
  
  inline def addAttachment(tabId: Double, attachment: ComposeAttachment): js.Promise[ComposeAttachment] = (^.asInstanceOf[js.Dynamic].applyDynamic("addAttachment")(tabId.asInstanceOf[js.Any], attachment.asInstanceOf[js.Any])).asInstanceOf[js.Promise[ComposeAttachment]]
  inline def addAttachment(tabId: Double, attachment: FileAttachment): js.Promise[ComposeAttachment] = (^.asInstanceOf[js.Dynamic].applyDynamic("addAttachment")(tabId.asInstanceOf[js.Any], attachment.asInstanceOf[js.Any])).asInstanceOf[js.Promise[ComposeAttachment]]
  
  inline def beginForward(messageId: Double): js.Promise[Tab] = ^.asInstanceOf[js.Dynamic].applyDynamic("beginForward")(messageId.asInstanceOf[js.Any]).asInstanceOf[js.Promise[Tab]]
  inline def beginForward(messageId: Double, details: ComposeDetails): js.Promise[Tab] = (^.asInstanceOf[js.Dynamic].applyDynamic("beginForward")(messageId.asInstanceOf[js.Any], details.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Tab]]
  inline def beginForward(messageId: Double, forwardType: BeginForwardForwardType): js.Promise[Tab] = (^.asInstanceOf[js.Dynamic].applyDynamic("beginForward")(messageId.asInstanceOf[js.Any], forwardType.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Tab]]
  inline def beginForward(messageId: Double, forwardType: BeginForwardForwardType, details: ComposeDetails): js.Promise[Tab] = (^.asInstanceOf[js.Dynamic].applyDynamic("beginForward")(messageId.asInstanceOf[js.Any], forwardType.asInstanceOf[js.Any], details.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Tab]]
  
  inline def beginNew(): js.Promise[Tab] = ^.asInstanceOf[js.Dynamic].applyDynamic("beginNew")().asInstanceOf[js.Promise[Tab]]
  inline def beginNew(details: ComposeDetails): js.Promise[Tab] = ^.asInstanceOf[js.Dynamic].applyDynamic("beginNew")(details.asInstanceOf[js.Any]).asInstanceOf[js.Promise[Tab]]
  inline def beginNew(messageId: Double): js.Promise[Tab] = ^.asInstanceOf[js.Dynamic].applyDynamic("beginNew")(messageId.asInstanceOf[js.Any]).asInstanceOf[js.Promise[Tab]]
  inline def beginNew(messageId: Double, details: ComposeDetails): js.Promise[Tab] = (^.asInstanceOf[js.Dynamic].applyDynamic("beginNew")(messageId.asInstanceOf[js.Any], details.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Tab]]
  
  inline def beginReply(messageId: Double): js.Promise[Tab] = ^.asInstanceOf[js.Dynamic].applyDynamic("beginReply")(messageId.asInstanceOf[js.Any]).asInstanceOf[js.Promise[Tab]]
  inline def beginReply(messageId: Double, details: ComposeDetails): js.Promise[Tab] = (^.asInstanceOf[js.Dynamic].applyDynamic("beginReply")(messageId.asInstanceOf[js.Any], details.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Tab]]
  inline def beginReply(messageId: Double, replyType: BeginReplyReplyType): js.Promise[Tab] = (^.asInstanceOf[js.Dynamic].applyDynamic("beginReply")(messageId.asInstanceOf[js.Any], replyType.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Tab]]
  inline def beginReply(messageId: Double, replyType: BeginReplyReplyType, details: ComposeDetails): js.Promise[Tab] = (^.asInstanceOf[js.Dynamic].applyDynamic("beginReply")(messageId.asInstanceOf[js.Any], replyType.asInstanceOf[js.Any], details.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Tab]]
  
  inline def getActiveDictionaries(tabId: Double): js.Promise[ComposeDictionaries] = ^.asInstanceOf[js.Dynamic].applyDynamic("getActiveDictionaries")(tabId.asInstanceOf[js.Any]).asInstanceOf[js.Promise[ComposeDictionaries]]
  
  inline def getAttachmentFile(id: Double): js.Promise[File] = ^.asInstanceOf[js.Dynamic].applyDynamic("getAttachmentFile")(id.asInstanceOf[js.Any]).asInstanceOf[js.Promise[File]]
  
  inline def getComposeDetails(tabId: Double): js.Promise[ComposeDetails] = ^.asInstanceOf[js.Dynamic].applyDynamic("getComposeDetails")(tabId.asInstanceOf[js.Any]).asInstanceOf[js.Promise[ComposeDetails]]
  
  inline def getComposeState(tabId: Double): js.Promise[ComposeState] = ^.asInstanceOf[js.Dynamic].applyDynamic("getComposeState")(tabId.asInstanceOf[js.Any]).asInstanceOf[js.Promise[ComposeState]]
  
  inline def listAttachments(tabId: Double): js.Promise[js.Array[ComposeAttachment]] = ^.asInstanceOf[js.Dynamic].applyDynamic("listAttachments")(tabId.asInstanceOf[js.Any]).asInstanceOf[js.Promise[js.Array[ComposeAttachment]]]
  
  @JSGlobal("browser.compose.onActiveDictionariesChanged")
  @js.native
  val onActiveDictionariesChanged: WebExtEvent[js.Function2[/* tab */ Tab, /* dictionaries */ ComposeDictionaries, Unit]] = js.native
  
  @JSGlobal("browser.compose.onAfterSave")
  @js.native
  val onAfterSave: WebExtEvent[js.Function2[/* tab */ Tab, /* saveInfo */ OnAfterSaveSaveInfo, Unit]] = js.native
  
  @JSGlobal("browser.compose.onAfterSend")
  @js.native
  val onAfterSend: WebExtEvent[js.Function2[/* tab */ Tab, /* sendInfo */ OnAfterSendSendInfo, Unit]] = js.native
  
  @JSGlobal("browser.compose.onAttachmentAdded")
  @js.native
  val onAttachmentAdded: WebExtEvent[js.Function2[/* tab */ Tab, /* attachment */ ComposeAttachment, Unit]] = js.native
  
  @JSGlobal("browser.compose.onAttachmentRemoved")
  @js.native
  val onAttachmentRemoved: WebExtEvent[js.Function2[/* tab */ Tab, /* attachmentId */ Double, Unit]] = js.native
  
  @JSGlobal("browser.compose.onBeforeSend")
  @js.native
  val onBeforeSend: WebExtEvent[js.Function2[/* tab */ Tab, /* details */ ComposeDetails, Details]] = js.native
  
  @JSGlobal("browser.compose.onComposeStateChanged")
  @js.native
  val onComposeStateChanged: WebExtEvent[js.Function2[/* tab */ Tab, /* state */ ComposeState, Unit]] = js.native
  
  @JSGlobal("browser.compose.onIdentityChanged")
  @js.native
  val onIdentityChanged: WebExtEvent[js.Function2[/* tab */ Tab, /* identityId */ String, Unit]] = js.native
  
  inline def removeAttachment(tabId: Double, attachmentId: Double): js.Promise[Any] = (^.asInstanceOf[js.Dynamic].applyDynamic("removeAttachment")(tabId.asInstanceOf[js.Any], attachmentId.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Any]]
  
  inline def saveMessage(tabId: Double): js.Promise[SaveMessageReturnReturn] = ^.asInstanceOf[js.Dynamic].applyDynamic("saveMessage")(tabId.asInstanceOf[js.Any]).asInstanceOf[js.Promise[SaveMessageReturnReturn]]
  inline def saveMessage(tabId: Double, options: SaveMessageOptions): js.Promise[SaveMessageReturnReturn] = (^.asInstanceOf[js.Dynamic].applyDynamic("saveMessage")(tabId.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Promise[SaveMessageReturnReturn]]
  
  inline def sendMessage(tabId: Double): js.Promise[SendMessageReturnReturn] = ^.asInstanceOf[js.Dynamic].applyDynamic("sendMessage")(tabId.asInstanceOf[js.Any]).asInstanceOf[js.Promise[SendMessageReturnReturn]]
  inline def sendMessage(tabId: Double, options: SendMessageOptions): js.Promise[SendMessageReturnReturn] = (^.asInstanceOf[js.Dynamic].applyDynamic("sendMessage")(tabId.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Promise[SendMessageReturnReturn]]
  
  inline def setActiveDictionaries(tabId: Double, activeDictionaries: js.Array[String]): js.Promise[Any] = (^.asInstanceOf[js.Dynamic].applyDynamic("setActiveDictionaries")(tabId.asInstanceOf[js.Any], activeDictionaries.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Any]]
  
  inline def setComposeDetails(tabId: Double, details: ComposeDetails): js.Promise[Any] = (^.asInstanceOf[js.Dynamic].applyDynamic("setComposeDetails")(tabId.asInstanceOf[js.Any], details.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Any]]
  
  inline def updateAttachment(tabId: Double, attachmentId: Double, attachment: FileAttachment): js.Promise[ComposeAttachment] = (^.asInstanceOf[js.Dynamic].applyDynamic("updateAttachment")(tabId.asInstanceOf[js.Any], attachmentId.asInstanceOf[js.Any], attachment.asInstanceOf[js.Any])).asInstanceOf[js.Promise[ComposeAttachment]]
}
