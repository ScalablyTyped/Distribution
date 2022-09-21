package typings.vscodeLanguageserverTypes.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait SemanticTokenModifiers extends StObject
@JSImport("vscode-languageserver-types", "SemanticTokenModifiers")
@js.native
object SemanticTokenModifiers extends StObject {
  
  @JSBracketAccess
  def apply(value: String): js.UndefOr[SemanticTokenModifiers & String] = js.native
  
  @js.native
  sealed trait `abstract`
    extends StObject
       with SemanticTokenModifiers
  /* "abstract" */ val `abstract`: typings.vscodeLanguageserverTypes.mod.SemanticTokenModifiers.`abstract` & String = js.native
  
  @js.native
  sealed trait async
    extends StObject
       with SemanticTokenModifiers
  /* "async" */ val async: typings.vscodeLanguageserverTypes.mod.SemanticTokenModifiers.async & String = js.native
  
  @js.native
  sealed trait declaration
    extends StObject
       with SemanticTokenModifiers
  /* "declaration" */ val declaration: typings.vscodeLanguageserverTypes.mod.SemanticTokenModifiers.declaration & String = js.native
  
  @js.native
  sealed trait defaultLibrary
    extends StObject
       with SemanticTokenModifiers
  /* "defaultLibrary" */ val defaultLibrary: typings.vscodeLanguageserverTypes.mod.SemanticTokenModifiers.defaultLibrary & String = js.native
  
  @js.native
  sealed trait definition
    extends StObject
       with SemanticTokenModifiers
  /* "definition" */ val definition: typings.vscodeLanguageserverTypes.mod.SemanticTokenModifiers.definition & String = js.native
  
  @js.native
  sealed trait deprecated
    extends StObject
       with SemanticTokenModifiers
  /* "deprecated" */ val deprecated: typings.vscodeLanguageserverTypes.mod.SemanticTokenModifiers.deprecated & String = js.native
  
  @js.native
  sealed trait documentation
    extends StObject
       with SemanticTokenModifiers
  /* "documentation" */ val documentation: typings.vscodeLanguageserverTypes.mod.SemanticTokenModifiers.documentation & String = js.native
  
  @js.native
  sealed trait modification
    extends StObject
       with SemanticTokenModifiers
  /* "modification" */ val modification: typings.vscodeLanguageserverTypes.mod.SemanticTokenModifiers.modification & String = js.native
  
  @js.native
  sealed trait readonly
    extends StObject
       with SemanticTokenModifiers
  /* "readonly" */ val readonly: typings.vscodeLanguageserverTypes.mod.SemanticTokenModifiers.readonly & String = js.native
  
  @js.native
  sealed trait static
    extends StObject
       with SemanticTokenModifiers
  /* "static" */ val static: typings.vscodeLanguageserverTypes.mod.SemanticTokenModifiers.static & String = js.native
}
