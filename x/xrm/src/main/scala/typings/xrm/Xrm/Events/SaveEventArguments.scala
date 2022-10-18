package typings.xrm.Xrm.Events

import typings.xrm.XrmEnum.SaveMode
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Interface for save event arguments.
  */
trait SaveEventArguments extends StObject {
  
  /**
    * @summary Gets save mode, as an integer.
    * @returns The save mode.
    * @description Gets save mode, as an integer.<BR>
    * **Values returned are**:
    * * 1      Save
    * * 2      Save and Close
    * * 59     Save and New
    * * 70     AutoSave (Where enabled; can be used with an OnSave handler to conditionally disable auto-saving)
    * * 58     Save as Completed (Activities)
    * * 5      Deactivate
    * * 6      Reactivate
    * * 47     Assign (All user- or team-owned entities)
    * * 7      Send (Email)
    * * 16     Qualify (Lead)
    * * 15     Disqualify (Lead)
    */
  def getSaveMode(): SaveMode
  
  /**
    * Returns a boolean value to indicate if the record's save has been prevented.
    * @returns true if saving is prevented, otherwise false.
    */
  def isDefaultPrevented(): Boolean
  
  /**
    * Prevents the save operation from being submitted to the server.
    * All remaining "on save" handlers will continue execution.
    */
  def preventDefault(): Unit
  
  /**
    * Cancels the save operation if the event handler has a script error,
    * returns a rejected promise for an async event handler or the operation times out.
    */
  def preventDefaultOnError(): Unit
}
object SaveEventArguments {
  
  inline def apply(
    getSaveMode: () => SaveMode,
    isDefaultPrevented: () => Boolean,
    preventDefault: () => Unit,
    preventDefaultOnError: () => Unit
  ): SaveEventArguments = {
    val __obj = js.Dynamic.literal(getSaveMode = js.Any.fromFunction0(getSaveMode), isDefaultPrevented = js.Any.fromFunction0(isDefaultPrevented), preventDefault = js.Any.fromFunction0(preventDefault), preventDefaultOnError = js.Any.fromFunction0(preventDefaultOnError))
    __obj.asInstanceOf[SaveEventArguments]
  }
  
  extension [Self <: SaveEventArguments](x: Self) {
    
    inline def setGetSaveMode(value: () => SaveMode): Self = StObject.set(x, "getSaveMode", js.Any.fromFunction0(value))
    
    inline def setIsDefaultPrevented(value: () => Boolean): Self = StObject.set(x, "isDefaultPrevented", js.Any.fromFunction0(value))
    
    inline def setPreventDefault(value: () => Unit): Self = StObject.set(x, "preventDefault", js.Any.fromFunction0(value))
    
    inline def setPreventDefaultOnError(value: () => Unit): Self = StObject.set(x, "preventDefaultOnError", js.Any.fromFunction0(value))
  }
}
