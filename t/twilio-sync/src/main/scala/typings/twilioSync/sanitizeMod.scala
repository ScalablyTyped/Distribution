package typings.twilioSync

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object sanitizeMod {
  
  @JSImport("twilio-sync/lib/utils/sanitize", "deepClone")
  @js.native
  def deepClone[T](obj: T): T = js.native
  
  @JSImport("twilio-sync/lib/utils/sanitize", "validateId")
  @js.native
  def validateId(id: js.Any): Unit = js.native
  
  @JSImport("twilio-sync/lib/utils/sanitize", "validateMandatoryTtl")
  @js.native
  def validateMandatoryTtl(ttl: Double): Unit = js.native
  
  @JSImport("twilio-sync/lib/utils/sanitize", "validateOptionalTtl")
  @js.native
  def validateOptionalTtl(ttl: Double): Unit = js.native
  
  @JSImport("twilio-sync/lib/utils/sanitize", "validatePageSize")
  @js.native
  def validatePageSize(pageSize: Double): Unit = js.native
}
