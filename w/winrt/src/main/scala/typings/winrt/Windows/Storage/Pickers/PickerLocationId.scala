package typings.winrt.Windows.Storage.Pickers

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait PickerLocationId extends StObject
@JSGlobal("Windows.Storage.Pickers.PickerLocationId")
@js.native
object PickerLocationId extends StObject {
  
  @js.native
  sealed trait computerFolder
    extends StObject
       with PickerLocationId
  
  @js.native
  sealed trait desktop
    extends StObject
       with PickerLocationId
  
  @js.native
  sealed trait documentsLibrary
    extends StObject
       with PickerLocationId
  
  @js.native
  sealed trait downloads
    extends StObject
       with PickerLocationId
  
  @js.native
  sealed trait homeGroup
    extends StObject
       with PickerLocationId
  
  @js.native
  sealed trait musicLibrary
    extends StObject
       with PickerLocationId
  
  @js.native
  sealed trait picturesLibrary
    extends StObject
       with PickerLocationId
  
  @js.native
  sealed trait videosLibrary
    extends StObject
       with PickerLocationId
}
