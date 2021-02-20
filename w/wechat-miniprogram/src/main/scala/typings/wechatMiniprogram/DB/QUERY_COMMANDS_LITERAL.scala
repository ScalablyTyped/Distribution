package typings.wechatMiniprogram.DB

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait QUERY_COMMANDS_LITERAL extends StObject
@JSGlobal("DB.QUERY_COMMANDS_LITERAL")
@js.native
object QUERY_COMMANDS_LITERAL extends StObject {
  
  // array
  @js.native
  sealed trait ALL extends QUERY_COMMANDS_LITERAL
  
  @js.native
  sealed trait ELEM_MATCH extends QUERY_COMMANDS_LITERAL
  
  // comparison
  @js.native
  sealed trait EQ extends QUERY_COMMANDS_LITERAL
  
  // element
  @js.native
  sealed trait EXISTS extends QUERY_COMMANDS_LITERAL
  
  @js.native
  sealed trait GEO_INTERSECTS extends QUERY_COMMANDS_LITERAL
  
  // geo
  @js.native
  sealed trait GEO_NEAR extends QUERY_COMMANDS_LITERAL
  
  @js.native
  sealed trait GEO_WITHIN extends QUERY_COMMANDS_LITERAL
  
  @js.native
  sealed trait GT extends QUERY_COMMANDS_LITERAL
  
  @js.native
  sealed trait GTE extends QUERY_COMMANDS_LITERAL
  
  @js.native
  sealed trait IN extends QUERY_COMMANDS_LITERAL
  
  @js.native
  sealed trait LT extends QUERY_COMMANDS_LITERAL
  
  @js.native
  sealed trait LTE extends QUERY_COMMANDS_LITERAL
  
  // evaluation
  @js.native
  sealed trait MOD extends QUERY_COMMANDS_LITERAL
  
  @js.native
  sealed trait NEQ extends QUERY_COMMANDS_LITERAL
  
  @js.native
  sealed trait NIN extends QUERY_COMMANDS_LITERAL
  
  @js.native
  sealed trait SIZE extends QUERY_COMMANDS_LITERAL
}
