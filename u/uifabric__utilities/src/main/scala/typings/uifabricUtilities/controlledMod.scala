package typings.uifabricUtilities

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object controlledMod {
  
  @JSImport("@uifabric/utilities/lib/controlled", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @scala.inline
  def isControlled[P](props: P, valueProp: /* keyof P */ String): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("isControlled")(props.asInstanceOf[js.Any], valueProp.asInstanceOf[js.Any])).asInstanceOf[Boolean]
}
