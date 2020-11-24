package typings.xelib.mod

import org.scalablytyped.runtime.TopLevel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait SortMode extends js.Object
@JSImport("xelib", "SortMode")
@js.native
object SortMode extends js.Object {
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[SortMode with Double] = js.native
  
  /**
    * Files are sorted by filename,
    * groups are sorted by display name,
    * and record are sorted by their EditorID.
    */
  @js.native
  sealed trait EditorID extends SortMode
  /* 2 */ @js.native
  object EditorID extends TopLevel[EditorID with Double]
  
  /**
    * Files are sorted by load order,
    * groups are sorted by signature,
    * and records are sorted by FormID
    */
  @js.native
  sealed trait FormID extends SortMode
  /* 1 */ @js.native
  object FormID extends TopLevel[FormID with Double]
  
  /**
    * Files are sorted by filename,
    * groups are sorted by display name,
    * and records are sorted by their FULL name.
    */
  @js.native
  sealed trait Name extends SortMode
  /* 3 */ @js.native
  object Name extends TopLevel[Name with Double]
  
  /**
    * No sorting.
    * Elements will be in native order corresponding to the order in which they were found in the plugin file they were loaded from.
    */
  @js.native
  sealed trait None extends SortMode
  /* 0 */ @js.native
  object None extends TopLevel[None with Double]
}
