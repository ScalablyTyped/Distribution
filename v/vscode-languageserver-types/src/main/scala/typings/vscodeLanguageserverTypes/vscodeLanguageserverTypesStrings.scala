package typings.vscodeLanguageserverTypes

import typings.vscodeLanguageserverTypes.mod.MarkupKind
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object vscodeLanguageserverTypesStrings {
  
  @js.native
  sealed trait create extends StObject
  @scala.inline
  def create: create = "create".asInstanceOf[create]
  
  @js.native
  sealed trait delete extends StObject
  @scala.inline
  def delete: delete = "delete".asInstanceOf[delete]
  
  @js.native
  sealed trait markdown
    extends StObject
       with MarkupKind
  @scala.inline
  def markdown: markdown = "markdown".asInstanceOf[markdown]
  
  @js.native
  sealed trait plaintext
    extends StObject
       with MarkupKind
  @scala.inline
  def plaintext: plaintext = "plaintext".asInstanceOf[plaintext]
  
  @js.native
  sealed trait rename extends StObject
  @scala.inline
  def rename: rename = "rename".asInstanceOf[rename]
}
