package typings.vscodeLanguageserverTypes

import typings.vscodeLanguageserverTypes.mod.MarkupKind
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object vscodeLanguageserverTypesStrings {
  @js.native
  sealed trait create extends js.Object
  
  @js.native
  sealed trait delete extends js.Object
  
  @js.native
  sealed trait markdown extends MarkupKind
  
  @js.native
  sealed trait plaintext extends MarkupKind
  
  @js.native
  sealed trait rename extends js.Object
  
  @scala.inline
  def create: create = "create".asInstanceOf[create]
  @scala.inline
  def delete: delete = "delete".asInstanceOf[delete]
  @scala.inline
  def markdown: markdown = "markdown".asInstanceOf[markdown]
  @scala.inline
  def plaintext: plaintext = "plaintext".asInstanceOf[plaintext]
  @scala.inline
  def rename: rename = "rename".asInstanceOf[rename]
}

