package typings.uifabricUtilities

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libInitialsMod {
  
  @JSImport("@uifabric/utilities/lib/initials", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def getInitials(displayName: String, isRtl: Boolean): String = (^.asInstanceOf[js.Dynamic].applyDynamic("getInitials")(displayName.asInstanceOf[js.Any], isRtl.asInstanceOf[js.Any])).asInstanceOf[String]
  inline def getInitials(displayName: String, isRtl: Boolean, allowPhoneInitials: Boolean): String = (^.asInstanceOf[js.Dynamic].applyDynamic("getInitials")(displayName.asInstanceOf[js.Any], isRtl.asInstanceOf[js.Any], allowPhoneInitials.asInstanceOf[js.Any])).asInstanceOf[String]
  inline def getInitials(displayName: Null, isRtl: Boolean): String = (^.asInstanceOf[js.Dynamic].applyDynamic("getInitials")(displayName.asInstanceOf[js.Any], isRtl.asInstanceOf[js.Any])).asInstanceOf[String]
  inline def getInitials(displayName: Null, isRtl: Boolean, allowPhoneInitials: Boolean): String = (^.asInstanceOf[js.Dynamic].applyDynamic("getInitials")(displayName.asInstanceOf[js.Any], isRtl.asInstanceOf[js.Any], allowPhoneInitials.asInstanceOf[js.Any])).asInstanceOf[String]
  inline def getInitials(displayName: Unit, isRtl: Boolean): String = (^.asInstanceOf[js.Dynamic].applyDynamic("getInitials")(displayName.asInstanceOf[js.Any], isRtl.asInstanceOf[js.Any])).asInstanceOf[String]
  inline def getInitials(displayName: Unit, isRtl: Boolean, allowPhoneInitials: Boolean): String = (^.asInstanceOf[js.Dynamic].applyDynamic("getInitials")(displayName.asInstanceOf[js.Any], isRtl.asInstanceOf[js.Any], allowPhoneInitials.asInstanceOf[js.Any])).asInstanceOf[String]
}
