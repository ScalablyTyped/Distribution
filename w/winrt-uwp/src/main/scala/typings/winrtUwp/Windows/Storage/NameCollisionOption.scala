package typings.winrtUwp.Windows.Storage

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait NameCollisionOption extends StObject
/** Specifies what to do if a file or folder with the specified name already exists in the current folder when you copy, move, or rename a file or folder. */
@JSGlobal("Windows.Storage.NameCollisionOption")
@js.native
object NameCollisionOption extends StObject {
  
  /** Raise an exception of type System.Exception if the file or folder already exists. */
  @js.native
  sealed trait failIfExists
    extends StObject
       with NameCollisionOption
  
  /** Automatically append a number to the base of the specified name if the file or folder already exists. */
  @js.native
  sealed trait generateUniqueName
    extends StObject
       with NameCollisionOption
  
  /** Replace the existing item if the file or folder already exists. */
  @js.native
  sealed trait replaceExisting
    extends StObject
       with NameCollisionOption
}
