package typings.vscodeLanguageserverProtocol.protocolSematicTokensProposedMod

import org.scalablytyped.runtime.TopLevel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait SemanticTokenTypes extends js.Object
@JSImport("vscode-languageserver-protocol/lib/protocol.sematicTokens.proposed", "SemanticTokenTypes")
@js.native
object SemanticTokenTypes extends js.Object {
  
  @JSBracketAccess
  def apply(value: String): js.UndefOr[SemanticTokenTypes with String] = js.native
  
  @js.native
  sealed trait `class` extends SemanticTokenTypes
  /* "class" */ @js.native
  object `class` extends TopLevel[`class` with String]
  
  @js.native
  sealed trait comment extends SemanticTokenTypes
  /* "comment" */ @js.native
  object comment extends TopLevel[comment with String]
  
  @js.native
  sealed trait enum extends SemanticTokenTypes
  /* "enum" */ @js.native
  object enum extends TopLevel[enum with String]
  
  @js.native
  sealed trait function extends SemanticTokenTypes
  /* "function" */ @js.native
  object function extends TopLevel[function with String]
  
  @js.native
  sealed trait interface extends SemanticTokenTypes
  /* "interface" */ @js.native
  object interface extends TopLevel[interface with String]
  
  @js.native
  sealed trait keyword extends SemanticTokenTypes
  /* "keyword" */ @js.native
  object keyword extends TopLevel[keyword with String]
  
  @js.native
  sealed trait label extends SemanticTokenTypes
  /* "label" */ @js.native
  object label extends TopLevel[label with String]
  
  @js.native
  sealed trait `macro` extends SemanticTokenTypes
  /* "macro" */ @js.native
  object `macro` extends TopLevel[`macro` with String]
  
  @js.native
  sealed trait member extends SemanticTokenTypes
  /* "member" */ @js.native
  object member extends TopLevel[member with String]
  
  @js.native
  sealed trait namespace extends SemanticTokenTypes
  /* "namespace" */ @js.native
  object namespace extends TopLevel[namespace with String]
  
  @js.native
  sealed trait number extends SemanticTokenTypes
  /* "number" */ @js.native
  object number extends TopLevel[number with String]
  
  @js.native
  sealed trait operator extends SemanticTokenTypes
  /* "operator" */ @js.native
  object operator extends TopLevel[operator with String]
  
  @js.native
  sealed trait parameter extends SemanticTokenTypes
  /* "parameter" */ @js.native
  object parameter extends TopLevel[parameter with String]
  
  @js.native
  sealed trait property extends SemanticTokenTypes
  /* "property" */ @js.native
  object property extends TopLevel[property with String]
  
  @js.native
  sealed trait regexp extends SemanticTokenTypes
  /* "regexp" */ @js.native
  object regexp extends TopLevel[regexp with String]
  
  @js.native
  sealed trait string extends SemanticTokenTypes
  /* "string" */ @js.native
  object string extends TopLevel[string with String]
  
  @js.native
  sealed trait struct extends SemanticTokenTypes
  /* "struct" */ @js.native
  object struct extends TopLevel[struct with String]
  
  @js.native
  sealed trait `type` extends SemanticTokenTypes
  /* "type" */ @js.native
  object `type` extends TopLevel[`type` with String]
  
  @js.native
  sealed trait typeParameter extends SemanticTokenTypes
  /* "typeParameter" */ @js.native
  object typeParameter extends TopLevel[typeParameter with String]
  
  @js.native
  sealed trait variable extends SemanticTokenTypes
  /* "variable" */ @js.native
  object variable extends TopLevel[variable with String]
}
