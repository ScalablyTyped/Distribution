package typings.vscodeLanguageserverTypes

import typings.vscodeLanguageserverTypes.mod.MarkupKind
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object vscodeLanguageserverTypesStrings {
  
  @js.native
  sealed trait create extends StObject
  inline def create: create = "create".asInstanceOf[create]
  
  @js.native
  sealed trait delete extends StObject
  inline def delete: delete = "delete".asInstanceOf[delete]
  
  @js.native
  sealed trait markdown
    extends StObject
       with MarkupKind
  inline def markdown: markdown = "markdown".asInstanceOf[markdown]
  
  @js.native
  sealed trait plaintext
    extends StObject
       with MarkupKind
  inline def plaintext: plaintext = "plaintext".asInstanceOf[plaintext]
  
  @js.native
  sealed trait rename extends StObject
  inline def rename: rename = "rename".asInstanceOf[rename]
}
