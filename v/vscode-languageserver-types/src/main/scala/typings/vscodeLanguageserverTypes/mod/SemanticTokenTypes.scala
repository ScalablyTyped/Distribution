package typings.vscodeLanguageserverTypes.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait SemanticTokenTypes extends StObject
@JSImport("vscode-languageserver-types", "SemanticTokenTypes")
@js.native
object SemanticTokenTypes extends StObject {
  
  @JSBracketAccess
  def apply(value: String): js.UndefOr[SemanticTokenTypes & String] = js.native
  
  @js.native
  sealed trait `class`
    extends StObject
       with SemanticTokenTypes
  /* "class" */ val `class`: typings.vscodeLanguageserverTypes.mod.SemanticTokenTypes.`class` & String = js.native
  
  @js.native
  sealed trait comment
    extends StObject
       with SemanticTokenTypes
  /* "comment" */ val comment: typings.vscodeLanguageserverTypes.mod.SemanticTokenTypes.comment & String = js.native
  
  /**
    * @since 3.17.0
    */
  @js.native
  sealed trait decorator
    extends StObject
       with SemanticTokenTypes
  /* "decorator" */ val decorator: typings.vscodeLanguageserverTypes.mod.SemanticTokenTypes.decorator & String = js.native
  
  @js.native
  sealed trait `enum`
    extends StObject
       with SemanticTokenTypes
  /* "enum" */ val `enum`: typings.vscodeLanguageserverTypes.mod.SemanticTokenTypes.`enum` & String = js.native
  
  @js.native
  sealed trait enumMember
    extends StObject
       with SemanticTokenTypes
  /* "enumMember" */ val enumMember: typings.vscodeLanguageserverTypes.mod.SemanticTokenTypes.enumMember & String = js.native
  
  @js.native
  sealed trait event
    extends StObject
       with SemanticTokenTypes
  /* "event" */ val event: typings.vscodeLanguageserverTypes.mod.SemanticTokenTypes.event & String = js.native
  
  @js.native
  sealed trait function
    extends StObject
       with SemanticTokenTypes
  /* "function" */ val function: typings.vscodeLanguageserverTypes.mod.SemanticTokenTypes.function & String = js.native
  
  @js.native
  sealed trait interface
    extends StObject
       with SemanticTokenTypes
  /* "interface" */ val interface: typings.vscodeLanguageserverTypes.mod.SemanticTokenTypes.interface & String = js.native
  
  @js.native
  sealed trait keyword
    extends StObject
       with SemanticTokenTypes
  /* "keyword" */ val keyword: typings.vscodeLanguageserverTypes.mod.SemanticTokenTypes.keyword & String = js.native
  
  @js.native
  sealed trait `macro`
    extends StObject
       with SemanticTokenTypes
  /* "macro" */ val `macro`: typings.vscodeLanguageserverTypes.mod.SemanticTokenTypes.`macro` & String = js.native
  
  @js.native
  sealed trait method
    extends StObject
       with SemanticTokenTypes
  /* "method" */ val method: typings.vscodeLanguageserverTypes.mod.SemanticTokenTypes.method & String = js.native
  
  @js.native
  sealed trait modifier
    extends StObject
       with SemanticTokenTypes
  /* "modifier" */ val modifier: typings.vscodeLanguageserverTypes.mod.SemanticTokenTypes.modifier & String = js.native
  
  @js.native
  sealed trait namespace
    extends StObject
       with SemanticTokenTypes
  /* "namespace" */ val namespace: typings.vscodeLanguageserverTypes.mod.SemanticTokenTypes.namespace & String = js.native
  
  @js.native
  sealed trait number
    extends StObject
       with SemanticTokenTypes
  /* "number" */ val number: typings.vscodeLanguageserverTypes.mod.SemanticTokenTypes.number & String = js.native
  
  @js.native
  sealed trait operator
    extends StObject
       with SemanticTokenTypes
  /* "operator" */ val operator: typings.vscodeLanguageserverTypes.mod.SemanticTokenTypes.operator & String = js.native
  
  @js.native
  sealed trait parameter
    extends StObject
       with SemanticTokenTypes
  /* "parameter" */ val parameter: typings.vscodeLanguageserverTypes.mod.SemanticTokenTypes.parameter & String = js.native
  
  @js.native
  sealed trait property
    extends StObject
       with SemanticTokenTypes
  /* "property" */ val property: typings.vscodeLanguageserverTypes.mod.SemanticTokenTypes.property & String = js.native
  
  @js.native
  sealed trait regexp
    extends StObject
       with SemanticTokenTypes
  /* "regexp" */ val regexp: typings.vscodeLanguageserverTypes.mod.SemanticTokenTypes.regexp & String = js.native
  
  @js.native
  sealed trait string
    extends StObject
       with SemanticTokenTypes
  /* "string" */ val string: typings.vscodeLanguageserverTypes.mod.SemanticTokenTypes.string & String = js.native
  
  @js.native
  sealed trait struct
    extends StObject
       with SemanticTokenTypes
  /* "struct" */ val struct: typings.vscodeLanguageserverTypes.mod.SemanticTokenTypes.struct & String = js.native
  
  /**
    * Represents a generic type. Acts as a fallback for types which can't be mapped to
    * a specific type like class or enum.
    */
  @js.native
  sealed trait `type`
    extends StObject
       with SemanticTokenTypes
  /* "type" */ val `type`: typings.vscodeLanguageserverTypes.mod.SemanticTokenTypes.`type` & String = js.native
  
  @js.native
  sealed trait typeParameter
    extends StObject
       with SemanticTokenTypes
  /* "typeParameter" */ val typeParameter: typings.vscodeLanguageserverTypes.mod.SemanticTokenTypes.typeParameter & String = js.native
  
  @js.native
  sealed trait variable
    extends StObject
       with SemanticTokenTypes
  /* "variable" */ val variable: typings.vscodeLanguageserverTypes.mod.SemanticTokenTypes.variable & String = js.native
}
