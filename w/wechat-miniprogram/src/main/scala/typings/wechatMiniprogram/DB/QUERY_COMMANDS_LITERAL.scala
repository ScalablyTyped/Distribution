package typings.wechatMiniprogram.DB

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait QUERY_COMMANDS_LITERAL extends StObject
@JSGlobal("DB.QUERY_COMMANDS_LITERAL")
@js.native
object QUERY_COMMANDS_LITERAL extends StObject {
  
  // array
  @js.native
  sealed trait ALL
    extends StObject
       with QUERY_COMMANDS_LITERAL
  
  @js.native
  sealed trait ELEM_MATCH
    extends StObject
       with QUERY_COMMANDS_LITERAL
  
  // comparison
  @js.native
  sealed trait EQ
    extends StObject
       with QUERY_COMMANDS_LITERAL
  
  // element
  @js.native
  sealed trait EXISTS
    extends StObject
       with QUERY_COMMANDS_LITERAL
  
  @js.native
  sealed trait GEO_INTERSECTS
    extends StObject
       with QUERY_COMMANDS_LITERAL
  
  // geo
  @js.native
  sealed trait GEO_NEAR
    extends StObject
       with QUERY_COMMANDS_LITERAL
  
  @js.native
  sealed trait GEO_WITHIN
    extends StObject
       with QUERY_COMMANDS_LITERAL
  
  @js.native
  sealed trait GT
    extends StObject
       with QUERY_COMMANDS_LITERAL
  
  @js.native
  sealed trait GTE
    extends StObject
       with QUERY_COMMANDS_LITERAL
  
  @js.native
  sealed trait IN
    extends StObject
       with QUERY_COMMANDS_LITERAL
  
  @js.native
  sealed trait LT
    extends StObject
       with QUERY_COMMANDS_LITERAL
  
  @js.native
  sealed trait LTE
    extends StObject
       with QUERY_COMMANDS_LITERAL
  
  // evaluation
  @js.native
  sealed trait MOD
    extends StObject
       with QUERY_COMMANDS_LITERAL
  
  @js.native
  sealed trait NEQ
    extends StObject
       with QUERY_COMMANDS_LITERAL
  
  @js.native
  sealed trait NIN
    extends StObject
       with QUERY_COMMANDS_LITERAL
  
  @js.native
  sealed trait SIZE
    extends StObject
       with QUERY_COMMANDS_LITERAL
}
