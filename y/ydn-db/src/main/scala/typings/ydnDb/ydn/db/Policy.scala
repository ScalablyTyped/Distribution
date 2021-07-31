package typings.ydnDb.ydn.db

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait Policy extends StObject
@JSGlobal("ydn.db.Policy")
@js.native
object Policy extends StObject {
  
  @js.native
  sealed trait all
    extends StObject
       with Policy
  
  @js.native
  sealed trait atomic
    extends StObject
       with Policy
  
  @js.native
  sealed trait multi
    extends StObject
       with Policy
  
  @js.native
  sealed trait repeat
    extends StObject
       with Policy
  
  @js.native
  sealed trait single
    extends StObject
       with Policy
}
