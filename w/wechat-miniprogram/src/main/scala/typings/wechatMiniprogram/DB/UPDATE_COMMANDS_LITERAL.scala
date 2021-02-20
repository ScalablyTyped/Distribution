package typings.wechatMiniprogram.DB

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait UPDATE_COMMANDS_LITERAL extends StObject
@JSGlobal("DB.UPDATE_COMMANDS_LITERAL")
@js.native
object UPDATE_COMMANDS_LITERAL extends StObject {
  
  @js.native
  sealed trait ADD_TO_SET extends UPDATE_COMMANDS_LITERAL
  
  // bitwise
  @js.native
  sealed trait BIT extends UPDATE_COMMANDS_LITERAL
  
  @js.native
  sealed trait INC extends UPDATE_COMMANDS_LITERAL
  
  @js.native
  sealed trait MAX extends UPDATE_COMMANDS_LITERAL
  
  @js.native
  sealed trait MIN extends UPDATE_COMMANDS_LITERAL
  
  @js.native
  sealed trait MUL extends UPDATE_COMMANDS_LITERAL
  
  @js.native
  sealed trait POP extends UPDATE_COMMANDS_LITERAL
  
  @js.native
  sealed trait PULL extends UPDATE_COMMANDS_LITERAL
  
  @js.native
  sealed trait PULL_ALL extends UPDATE_COMMANDS_LITERAL
  
  // array
  @js.native
  sealed trait PUSH extends UPDATE_COMMANDS_LITERAL
  
  @js.native
  sealed trait REMOVE extends UPDATE_COMMANDS_LITERAL
  
  @js.native
  sealed trait RENAME extends UPDATE_COMMANDS_LITERAL
  
  // field
  @js.native
  sealed trait SET extends UPDATE_COMMANDS_LITERAL
  
  @js.native
  sealed trait SHIFT extends UPDATE_COMMANDS_LITERAL
  
  @js.native
  sealed trait UNSHIFT extends UPDATE_COMMANDS_LITERAL
}
