package typings.xelib.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait SortMode extends StObject
@JSImport("xelib", "SortMode")
@js.native
object SortMode extends StObject {
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[SortMode & Double] = js.native
  
  /**
    * Files are sorted by filename,
    * groups are sorted by display name,
    * and record are sorted by their EditorID.
    */
  @js.native
  sealed trait EditorID
    extends StObject
       with SortMode
  /* 2 */ val EditorID: typings.xelib.mod.SortMode.EditorID & Double = js.native
  
  /**
    * Files are sorted by load order,
    * groups are sorted by signature,
    * and records are sorted by FormID
    */
  @js.native
  sealed trait FormID
    extends StObject
       with SortMode
  /* 1 */ val FormID: typings.xelib.mod.SortMode.FormID & Double = js.native
  
  /**
    * Files are sorted by filename,
    * groups are sorted by display name,
    * and records are sorted by their FULL name.
    */
  @js.native
  sealed trait Name
    extends StObject
       with SortMode
  /* 3 */ val Name: typings.xelib.mod.SortMode.Name & Double = js.native
  
  /**
    * No sorting.
    * Elements will be in native order corresponding to the order in which they were found in the plugin file they were loaded from.
    */
  @js.native
  sealed trait None
    extends StObject
       with SortMode
  /* 0 */ val None: typings.xelib.mod.SortMode.None & Double = js.native
}
