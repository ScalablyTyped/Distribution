package typings.winrtUwp.Windows.Storage.AccessCache

import org.scalablytyped.runtime.TopLevel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait AccessCacheOptions extends js.Object

/** Describes the behavior to use when the app accesses an item in a list. */
@JSGlobal("Windows.Storage.AccessCache.AccessCacheOptions")
@js.native
object AccessCacheOptions extends js.Object {
  /** When the app accesses the item, the user is prevented from entering information. */
  @js.native
  sealed trait disallowUserInput extends AccessCacheOptions
  
  /** When the app accesses the item, it is retrieved from a fast location like the local file system. */
  @js.native
  sealed trait fastLocationsOnly extends AccessCacheOptions
  
  /** Default. */
  @js.native
  sealed trait none extends AccessCacheOptions
  
  /** When the app accesses the item in the StorageItemMostRecentlyUsedList , Windows preserves the item's current position in the MRU and does not update the access time of the item. */
  @js.native
  sealed trait suppressAccessTimeUpdate extends AccessCacheOptions
  
  /** When the app accesses the item, the app retrieves a cached, read-only version of the file. This version of the file might not be the most recent. */
  @js.native
  sealed trait useReadOnlyCachedCopy extends AccessCacheOptions
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[AccessCacheOptions with Double] = js.native
  /* 1 */ @js.native
  object disallowUserInput extends TopLevel[disallowUserInput with Double]
  
  /* 2 */ @js.native
  object fastLocationsOnly extends TopLevel[fastLocationsOnly with Double]
  
  /* 0 */ @js.native
  object none extends TopLevel[none with Double]
  
  /* 4 */ @js.native
  object suppressAccessTimeUpdate extends TopLevel[suppressAccessTimeUpdate with Double]
  
  /* 3 */ @js.native
  object useReadOnlyCachedCopy extends TopLevel[useReadOnlyCachedCopy with Double]
  
}

