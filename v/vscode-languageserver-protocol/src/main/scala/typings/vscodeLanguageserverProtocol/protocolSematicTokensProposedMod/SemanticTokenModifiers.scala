package typings.vscodeLanguageserverProtocol.protocolSematicTokensProposedMod

import org.scalablytyped.runtime.TopLevel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait SemanticTokenModifiers extends js.Object

@JSImport("vscode-languageserver-protocol/lib/protocol.sematicTokens.proposed", "SemanticTokenModifiers")
@js.native
object SemanticTokenModifiers extends js.Object {
  @js.native
  sealed trait `abstract` extends SemanticTokenModifiers
  
  @js.native
  sealed trait async extends SemanticTokenModifiers
  
  @js.native
  sealed trait declaration extends SemanticTokenModifiers
  
  @js.native
  sealed trait definition extends SemanticTokenModifiers
  
  @js.native
  sealed trait deprecated extends SemanticTokenModifiers
  
  @js.native
  sealed trait documentation extends SemanticTokenModifiers
  
  @js.native
  sealed trait readonly extends SemanticTokenModifiers
  
  @js.native
  sealed trait reference extends SemanticTokenModifiers
  
  @js.native
  sealed trait static extends SemanticTokenModifiers
  
  @js.native
  sealed trait volatile extends SemanticTokenModifiers
  
  @JSBracketAccess
  def apply(value: String): js.UndefOr[SemanticTokenModifiers with String] = js.native
  /* "abstract" */ @js.native
  object `abstract` extends TopLevel[`abstract` with String]
  
  /* "async" */ @js.native
  object async extends TopLevel[async with String]
  
  /* "declaration" */ @js.native
  object declaration extends TopLevel[declaration with String]
  
  /* "definition" */ @js.native
  object definition extends TopLevel[definition with String]
  
  /* "deprecated" */ @js.native
  object deprecated extends TopLevel[deprecated with String]
  
  /* "documentation" */ @js.native
  object documentation extends TopLevel[documentation with String]
  
  /* "readonly" */ @js.native
  object readonly extends TopLevel[readonly with String]
  
  /* "reference" */ @js.native
  object reference extends TopLevel[reference with String]
  
  /* "static" */ @js.native
  object static extends TopLevel[static with String]
  
  /* "volatile" */ @js.native
  object volatile extends TopLevel[volatile with String]
  
}

