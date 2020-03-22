package typings.vscodeLanguageserverProtocol.protocolSematicTokensProposedMod

import org.scalablytyped.runtime.TopLevel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait SemanticTokenTypes extends js.Object

@JSImport("vscode-languageserver-protocol/lib/protocol.sematicTokens.proposed", "SemanticTokenTypes")
@js.native
object SemanticTokenTypes extends js.Object {
  @js.native
  sealed trait `class` extends SemanticTokenTypes
  
  @js.native
  sealed trait comment extends SemanticTokenTypes
  
  @js.native
  sealed trait enum extends SemanticTokenTypes
  
  @js.native
  sealed trait function extends SemanticTokenTypes
  
  @js.native
  sealed trait interface extends SemanticTokenTypes
  
  @js.native
  sealed trait keyword extends SemanticTokenTypes
  
  @js.native
  sealed trait label extends SemanticTokenTypes
  
  @js.native
  sealed trait `macro` extends SemanticTokenTypes
  
  @js.native
  sealed trait member extends SemanticTokenTypes
  
  @js.native
  sealed trait namespace extends SemanticTokenTypes
  
  @js.native
  sealed trait number extends SemanticTokenTypes
  
  @js.native
  sealed trait operator extends SemanticTokenTypes
  
  @js.native
  sealed trait parameter extends SemanticTokenTypes
  
  @js.native
  sealed trait property extends SemanticTokenTypes
  
  @js.native
  sealed trait regexp extends SemanticTokenTypes
  
  @js.native
  sealed trait string extends SemanticTokenTypes
  
  @js.native
  sealed trait struct extends SemanticTokenTypes
  
  @js.native
  sealed trait `type` extends SemanticTokenTypes
  
  @js.native
  sealed trait typeParameter extends SemanticTokenTypes
  
  @js.native
  sealed trait variable extends SemanticTokenTypes
  
  @JSBracketAccess
  def apply(value: String): js.UndefOr[SemanticTokenTypes with String] = js.native
  /* "class" */ @js.native
  object `class` extends TopLevel[`class` with String]
  
  /* "comment" */ @js.native
  object comment extends TopLevel[comment with String]
  
  /* "enum" */ @js.native
  object enum extends TopLevel[enum with String]
  
  /* "function" */ @js.native
  object function extends TopLevel[function with String]
  
  /* "interface" */ @js.native
  object interface extends TopLevel[interface with String]
  
  /* "keyword" */ @js.native
  object keyword extends TopLevel[keyword with String]
  
  /* "label" */ @js.native
  object label extends TopLevel[label with String]
  
  /* "macro" */ @js.native
  object `macro` extends TopLevel[`macro` with String]
  
  /* "member" */ @js.native
  object member extends TopLevel[member with String]
  
  /* "namespace" */ @js.native
  object namespace extends TopLevel[namespace with String]
  
  /* "number" */ @js.native
  object number extends TopLevel[number with String]
  
  /* "operator" */ @js.native
  object operator extends TopLevel[operator with String]
  
  /* "parameter" */ @js.native
  object parameter extends TopLevel[parameter with String]
  
  /* "property" */ @js.native
  object property extends TopLevel[property with String]
  
  /* "regexp" */ @js.native
  object regexp extends TopLevel[regexp with String]
  
  /* "string" */ @js.native
  object string extends TopLevel[string with String]
  
  /* "struct" */ @js.native
  object struct extends TopLevel[struct with String]
  
  /* "type" */ @js.native
  object `type` extends TopLevel[`type` with String]
  
  /* "typeParameter" */ @js.native
  object typeParameter extends TopLevel[typeParameter with String]
  
  /* "variable" */ @js.native
  object variable extends TopLevel[variable with String]
  
}

