package typings.uifabricUtilities

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libWarnWarnMod {
  
  @JSImport("@uifabric/utilities/lib/warn/warn", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def setWarningCallback(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("setWarningCallback")().asInstanceOf[Unit]
  inline def setWarningCallback(warningCallback: js.Function1[/* message */ String, Unit]): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("setWarningCallback")(warningCallback.asInstanceOf[js.Any]).asInstanceOf[Unit]
  
  inline def warn(message: String): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("warn")(message.asInstanceOf[js.Any]).asInstanceOf[Unit]
  
  /** NOTE: Mapped type definitions are impossible to translate to Scala.
    * See https://www.typescriptlang.org/docs/handbook/2/mapped-types.html for an intro.
    * You'll have to cast your way around this structure, unfortunately. 
    * TS definition: {{{
    {[ P in keyof T ]:? string}
    }}}
    */
  @js.native
  trait ISettingsMap[T] extends StObject
}
