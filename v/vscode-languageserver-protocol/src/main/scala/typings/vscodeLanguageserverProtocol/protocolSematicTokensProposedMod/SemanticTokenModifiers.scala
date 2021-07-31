package typings.vscodeLanguageserverProtocol.protocolSematicTokensProposedMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait SemanticTokenModifiers extends StObject
@JSImport("vscode-languageserver-protocol/lib/protocol.sematicTokens.proposed", "SemanticTokenModifiers")
@js.native
object SemanticTokenModifiers extends StObject {
  
  @JSBracketAccess
  def apply(value: String): js.UndefOr[SemanticTokenModifiers & String] = js.native
  
  @js.native
  sealed trait `abstract`
    extends StObject
       with SemanticTokenModifiers
  /* "abstract" */ val `abstract`: typings.vscodeLanguageserverProtocol.protocolSematicTokensProposedMod.SemanticTokenModifiers.`abstract` & String = js.native
  
  @js.native
  sealed trait async
    extends StObject
       with SemanticTokenModifiers
  /* "async" */ val async: typings.vscodeLanguageserverProtocol.protocolSematicTokensProposedMod.SemanticTokenModifiers.async & String = js.native
  
  @js.native
  sealed trait declaration
    extends StObject
       with SemanticTokenModifiers
  /* "declaration" */ val declaration: typings.vscodeLanguageserverProtocol.protocolSematicTokensProposedMod.SemanticTokenModifiers.declaration & String = js.native
  
  @js.native
  sealed trait definition
    extends StObject
       with SemanticTokenModifiers
  /* "definition" */ val definition: typings.vscodeLanguageserverProtocol.protocolSematicTokensProposedMod.SemanticTokenModifiers.definition & String = js.native
  
  @js.native
  sealed trait deprecated
    extends StObject
       with SemanticTokenModifiers
  /* "deprecated" */ val deprecated: typings.vscodeLanguageserverProtocol.protocolSematicTokensProposedMod.SemanticTokenModifiers.deprecated & String = js.native
  
  @js.native
  sealed trait documentation
    extends StObject
       with SemanticTokenModifiers
  /* "documentation" */ val documentation: typings.vscodeLanguageserverProtocol.protocolSematicTokensProposedMod.SemanticTokenModifiers.documentation & String = js.native
  
  @js.native
  sealed trait readonly
    extends StObject
       with SemanticTokenModifiers
  /* "readonly" */ val readonly: typings.vscodeLanguageserverProtocol.protocolSematicTokensProposedMod.SemanticTokenModifiers.readonly & String = js.native
  
  @js.native
  sealed trait reference
    extends StObject
       with SemanticTokenModifiers
  /* "reference" */ val reference: typings.vscodeLanguageserverProtocol.protocolSematicTokensProposedMod.SemanticTokenModifiers.reference & String = js.native
  
  @js.native
  sealed trait static
    extends StObject
       with SemanticTokenModifiers
  /* "static" */ val static: typings.vscodeLanguageserverProtocol.protocolSematicTokensProposedMod.SemanticTokenModifiers.static & String = js.native
  
  @js.native
  sealed trait volatile
    extends StObject
       with SemanticTokenModifiers
  /* "volatile" */ val volatile: typings.vscodeLanguageserverProtocol.protocolSematicTokensProposedMod.SemanticTokenModifiers.volatile & String = js.native
}
