package typings.xrm

import typings.xrm.Xrm.GlobalContext
import typings.xrm.Xrm.XrmStatic
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object global {
  
  /**
    * Gets the global context.
    * The method provides access to the global context without going through the form context.
    *
    * It is preferreed to use {@link Xrm.Utility.getGlobalContext Xrm.Utility.getGlobalContext()} instead.
    * @see {@link Xrm.Utility.getGlobalContext}
    */
  inline def GetGlobalContext(): GlobalContext = js.Dynamic.global.applyDynamic("GetGlobalContext")().asInstanceOf[GlobalContext]
  
  /**
    * Xrm Namespace
    * @see {@link https://learn.microsoft.com/en-us/power-apps/developer/model-driven-apps/clientapi/reference External Link: Client API Reference}
    */
  @JSGlobal("Xrm")
  @js.native
  val Xrm: XrmStatic = js.native
}
