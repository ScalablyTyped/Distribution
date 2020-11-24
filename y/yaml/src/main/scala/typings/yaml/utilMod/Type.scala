package typings.yaml.utilMod

import org.scalablytyped.runtime.TopLevel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait Type extends js.Object
@JSImport("yaml/util", "Type")
@js.native
object Type extends js.Object {
  
  @JSBracketAccess
  def apply(value: String): js.UndefOr[Type with String] = js.native
  
  @js.native
  sealed trait ALIAS extends Type
  /* "ALIAS" */ @js.native
  object ALIAS extends TopLevel[ALIAS with String]
  
  @js.native
  sealed trait BLANK_LINE extends Type
  /* "BLANK_LINE" */ @js.native
  object BLANK_LINE extends TopLevel[BLANK_LINE with String]
  
  @js.native
  sealed trait BLOCK_FOLDED
    extends Type
       with typings.yaml.typesMod.Scalar.Type
  /* "BLOCK_FOLDED" */ @js.native
  object BLOCK_FOLDED extends TopLevel[BLOCK_FOLDED with String]
  
  @js.native
  sealed trait BLOCK_LITERAL
    extends Type
       with typings.yaml.typesMod.Scalar.Type
  /* "BLOCK_LITERAL" */ @js.native
  object BLOCK_LITERAL extends TopLevel[BLOCK_LITERAL with String]
  
  @js.native
  sealed trait COMMENT extends Type
  /* "COMMENT" */ @js.native
  object COMMENT extends TopLevel[COMMENT with String]
  
  @js.native
  sealed trait DIRECTIVE extends Type
  /* "DIRECTIVE" */ @js.native
  object DIRECTIVE extends TopLevel[DIRECTIVE with String]
  
  @js.native
  sealed trait DOCUMENT extends Type
  /* "DOCUMENT" */ @js.native
  object DOCUMENT extends TopLevel[DOCUMENT with String]
  
  @js.native
  sealed trait FLOW_MAP extends Type
  /* "FLOW_MAP" */ @js.native
  object FLOW_MAP extends TopLevel[FLOW_MAP with String]
  
  @js.native
  sealed trait FLOW_SEQ extends Type
  /* "FLOW_SEQ" */ @js.native
  object FLOW_SEQ extends TopLevel[FLOW_SEQ with String]
  
  @js.native
  sealed trait MAP extends Type
  /* "MAP" */ @js.native
  object MAP extends TopLevel[MAP with String]
  
  @js.native
  sealed trait MAP_KEY extends Type
  /* "MAP_KEY" */ @js.native
  object MAP_KEY extends TopLevel[MAP_KEY with String]
  
  @js.native
  sealed trait MAP_VALUE extends Type
  /* "MAP_VALUE" */ @js.native
  object MAP_VALUE extends TopLevel[MAP_VALUE with String]
  
  @js.native
  sealed trait PLAIN
    extends Type
       with typings.yaml.typesMod.Scalar.Type
  /* "PLAIN" */ @js.native
  object PLAIN extends TopLevel[PLAIN with String]
  
  @js.native
  sealed trait QUOTE_DOUBLE
    extends Type
       with typings.yaml.typesMod.Scalar.Type
  /* "QUOTE_DOUBLE" */ @js.native
  object QUOTE_DOUBLE extends TopLevel[QUOTE_DOUBLE with String]
  
  @js.native
  sealed trait QUOTE_SINGLE
    extends Type
       with typings.yaml.typesMod.Scalar.Type
  /* "QUOTE_SINGLE" */ @js.native
  object QUOTE_SINGLE extends TopLevel[QUOTE_SINGLE with String]
  
  @js.native
  sealed trait SEQ extends Type
  /* "SEQ" */ @js.native
  object SEQ extends TopLevel[SEQ with String]
  
  @js.native
  sealed trait SEQ_ITEM extends Type
  /* "SEQ_ITEM" */ @js.native
  object SEQ_ITEM extends TopLevel[SEQ_ITEM with String]
}
