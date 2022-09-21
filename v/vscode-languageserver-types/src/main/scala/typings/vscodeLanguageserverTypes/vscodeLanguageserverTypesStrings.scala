package typings.vscodeLanguageserverTypes

import typings.vscodeLanguageserverTypes.mod.MarkupKind
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object vscodeLanguageserverTypesStrings {
  
  @js.native
  sealed trait _empty extends StObject
  inline def _empty: _empty = "".asInstanceOf[_empty]
  
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
  sealed trait quickfix extends StObject
  inline def quickfix: quickfix = "quickfix".asInstanceOf[quickfix]
  
  @js.native
  sealed trait refactor extends StObject
  inline def refactor: refactor = "refactor".asInstanceOf[refactor]
  
  @js.native
  sealed trait refactorDotextract extends StObject
  inline def refactorDotextract: refactorDotextract = "refactor.extract".asInstanceOf[refactorDotextract]
  
  @js.native
  sealed trait refactorDotinline extends StObject
  inline def refactorDotinline: refactorDotinline = "refactor.inline".asInstanceOf[refactorDotinline]
  
  @js.native
  sealed trait refactorDotrewrite extends StObject
  inline def refactorDotrewrite: refactorDotrewrite = "refactor.rewrite".asInstanceOf[refactorDotrewrite]
  
  @js.native
  sealed trait rename extends StObject
  inline def rename: rename = "rename".asInstanceOf[rename]
  
  @js.native
  sealed trait source extends StObject
  inline def source: source = "source".asInstanceOf[source]
  
  @js.native
  sealed trait sourceDotfixAll extends StObject
  inline def sourceDotfixAll: sourceDotfixAll = "source.fixAll".asInstanceOf[sourceDotfixAll]
  
  @js.native
  sealed trait sourceDotorganizeImports extends StObject
  inline def sourceDotorganizeImports: sourceDotorganizeImports = "source.organizeImports".asInstanceOf[sourceDotorganizeImports]
}
