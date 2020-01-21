package typings.vscodeLanguageserverProtocol

import typings.vscodeLanguageserverProtocol.protocolMod.FailureHandlingKind
import typings.vscodeLanguageserverProtocol.protocolMod.ResourceOperationKind
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object vscodeLanguageserverProtocolStrings {
  @js.native
  sealed trait abort extends FailureHandlingKind
  
  @js.native
  sealed trait create extends ResourceOperationKind
  
  @js.native
  sealed trait delete extends ResourceOperationKind
  
  @js.native
  sealed trait markdown extends js.Object
  
  @js.native
  sealed trait messages extends js.Object
  
  @js.native
  sealed trait off extends js.Object
  
  @js.native
  sealed trait plaintext extends js.Object
  
  @js.native
  sealed trait rename extends ResourceOperationKind
  
  @js.native
  sealed trait textOnlyTransactional extends FailureHandlingKind
  
  @js.native
  sealed trait transactional extends FailureHandlingKind
  
  @js.native
  sealed trait undo extends FailureHandlingKind
  
  @js.native
  sealed trait verbose extends js.Object
  
  @scala.inline
  def abort: abort = "abort".asInstanceOf[abort]
  @scala.inline
  def create: create = "create".asInstanceOf[create]
  @scala.inline
  def delete: delete = "delete".asInstanceOf[delete]
  @scala.inline
  def markdown: markdown = "markdown".asInstanceOf[markdown]
  @scala.inline
  def messages: messages = "messages".asInstanceOf[messages]
  @scala.inline
  def off: off = "off".asInstanceOf[off]
  @scala.inline
  def plaintext: plaintext = "plaintext".asInstanceOf[plaintext]
  @scala.inline
  def rename: rename = "rename".asInstanceOf[rename]
  @scala.inline
  def textOnlyTransactional: textOnlyTransactional = "textOnlyTransactional".asInstanceOf[textOnlyTransactional]
  @scala.inline
  def transactional: transactional = "transactional".asInstanceOf[transactional]
  @scala.inline
  def undo: undo = "undo".asInstanceOf[undo]
  @scala.inline
  def verbose: verbose = "verbose".asInstanceOf[verbose]
}

