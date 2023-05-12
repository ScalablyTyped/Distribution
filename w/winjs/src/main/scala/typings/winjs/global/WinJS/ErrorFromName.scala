package typings.winjs.global.WinJS

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

//#endregion Properties
//#region Objects
/**
  * An error object.
  **/
@JSGlobal("WinJS.ErrorFromName")
@js.native
open class ErrorFromName protected ()
  extends StObject
     with typings.winjs.WinJS.ErrorFromName {
  //#region Constructors
  /**
    * Creates an Error object with the specified name and message properties.
    * @param name The name of this error. The name is meant to be consumed programmatically and should not be localized.
    * @param message The message for this error. The message is meant to be consumed by humans and should be localized.
    **/
  def this(name: String) = this()
  def this(name: String, message: String) = this()
}
object ErrorFromName {
  
  @JSGlobal("WinJS.ErrorFromName")
  @js.native
  val ^ : js.Any = js.native
  
  //#endregion Constructors
  //#region Properties
  /**
    * Indicates that the object is compatibile with declarative processing.
    **/
  /* static member */
  @JSGlobal("WinJS.ErrorFromName.supportedForProcessing")
  @js.native
  def supportedForProcessing: Boolean = js.native
  inline def supportedForProcessing_=(x: Boolean): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("supportedForProcessing")(x.asInstanceOf[js.Any])
}
