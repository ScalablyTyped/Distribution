package typings.winrtUwp.Windows.Storage.Pickers

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait PickerLocationId extends StObject
/** Identifies the storage location that the file picker presents to the user. */
@JSGlobal("Windows.Storage.Pickers.PickerLocationId")
@js.native
object PickerLocationId extends StObject {
  
  /** The Computer folder. */
  @js.native
  sealed trait computerFolder
    extends StObject
       with PickerLocationId
  
  /** The Windows desktop. */
  @js.native
  sealed trait desktop
    extends StObject
       with PickerLocationId
  
  /** The Documents library. */
  @js.native
  sealed trait documentsLibrary
    extends StObject
       with PickerLocationId
  
  /** The Downloads folder. */
  @js.native
  sealed trait downloads
    extends StObject
       with PickerLocationId
  
  /** The HomeGroup. */
  @js.native
  sealed trait homeGroup
    extends StObject
       with PickerLocationId
  
  /** The Music library. */
  @js.native
  sealed trait musicLibrary
    extends StObject
       with PickerLocationId
  
  /** The Objects library. */
  @js.native
  sealed trait objects3D
    extends StObject
       with PickerLocationId
  
  /** The Pictures library. */
  @js.native
  sealed trait picturesLibrary
    extends StObject
       with PickerLocationId
  
  /** An unspecified location. */
  @js.native
  sealed trait unspecified
    extends StObject
       with PickerLocationId
  
  /** The Videos library. */
  @js.native
  sealed trait videosLibrary
    extends StObject
       with PickerLocationId
}
