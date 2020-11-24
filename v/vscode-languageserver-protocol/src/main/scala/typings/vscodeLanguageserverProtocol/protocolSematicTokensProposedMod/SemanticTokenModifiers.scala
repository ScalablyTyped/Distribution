package typings.vscodeLanguageserverProtocol.protocolSematicTokensProposedMod

import org.scalablytyped.runtime.TopLevel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait SemanticTokenModifiers extends js.Object
@JSImport("vscode-languageserver-protocol/lib/protocol.sematicTokens.proposed", "SemanticTokenModifiers")
@js.native
object SemanticTokenModifiers extends js.Object {
  
  @JSBracketAccess
  def apply(value: String): js.UndefOr[SemanticTokenModifiers with String] = js.native
  
  @js.native
  sealed trait `abstract` extends SemanticTokenModifiers
  /* "abstract" */ @js.native
  object `abstract` extends TopLevel[`abstract` with String]
  
  @js.native
  sealed trait async extends SemanticTokenModifiers
  /* "async" */ @js.native
  object async extends TopLevel[async with String]
  
  @js.native
  sealed trait declaration extends SemanticTokenModifiers
  /* "declaration" */ @js.native
  object declaration extends TopLevel[declaration with String]
  
  @js.native
  sealed trait definition extends SemanticTokenModifiers
  /* "definition" */ @js.native
  object definition extends TopLevel[definition with String]
  
  @js.native
  sealed trait deprecated extends SemanticTokenModifiers
  /* "deprecated" */ @js.native
  object deprecated extends TopLevel[deprecated with String]
  
  @js.native
  sealed trait documentation extends SemanticTokenModifiers
  /* "documentation" */ @js.native
  object documentation extends TopLevel[documentation with String]
  
  @js.native
  sealed trait readonly extends SemanticTokenModifiers
  /* "readonly" */ @js.native
  object readonly extends TopLevel[readonly with String]
  
  @js.native
  sealed trait reference extends SemanticTokenModifiers
  /* "reference" */ @js.native
  object reference extends TopLevel[reference with String]
  
  @js.native
  sealed trait static extends SemanticTokenModifiers
  /* "static" */ @js.native
  object static extends TopLevel[static with String]
  
  @js.native
  sealed trait volatile extends SemanticTokenModifiers
  /* "volatile" */ @js.native
  object volatile extends TopLevel[volatile with String]
}
