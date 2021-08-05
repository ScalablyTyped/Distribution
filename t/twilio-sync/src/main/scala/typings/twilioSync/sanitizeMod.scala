package typings.twilioSync

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object sanitizeMod {
  
  @JSImport("twilio-sync/lib/utils/sanitize", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def deepClone[T](obj: T): T = ^.asInstanceOf[js.Dynamic].applyDynamic("deepClone")(obj.asInstanceOf[js.Any]).asInstanceOf[T]
  
  inline def validateId(id: js.Any): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("validateId")(id.asInstanceOf[js.Any]).asInstanceOf[Unit]
  
  inline def validateMandatoryTtl(ttl: Double): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("validateMandatoryTtl")(ttl.asInstanceOf[js.Any]).asInstanceOf[Unit]
  
  inline def validateOptionalTtl(ttl: Double): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("validateOptionalTtl")(ttl.asInstanceOf[js.Any]).asInstanceOf[Unit]
  
  inline def validatePageSize(pageSize: Double): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("validatePageSize")(pageSize.asInstanceOf[js.Any]).asInstanceOf[Unit]
}
