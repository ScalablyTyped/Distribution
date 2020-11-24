package typings.xelib.mod

import org.scalablytyped.runtime.TopLevel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait ArchiveType extends js.Object
@JSImport("xelib", "ArchiveType")
@js.native
object ArchiveType extends js.Object {
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[ArchiveType with Double] = js.native
  
  /**
    * Used for Fallout 3, Oblivion, and Skyrim Classic archives.
    */
  @js.native
  sealed trait baFO3 extends ArchiveType
  /* 2 */ @js.native
  object baFO3 extends TopLevel[baFO3 with Double]
  
  /**
    * Used for Fallout 4 archives.
    */
  @js.native
  sealed trait baFO4 extends ArchiveType
  /* 4 */ @js.native
  object baFO4 extends TopLevel[baFO4 with Double]
  
  /**
    * Used for Fallout 4 texture archives.
    */
  @js.native
  sealed trait baFO4dds extends ArchiveType
  /* 5 */ @js.native
  object baFO4dds extends TopLevel[baFO4dds with Double]
  
  /**
    * Unused.
    */
  @js.native
  sealed trait baNone extends ArchiveType
  /* 0 */ @js.native
  object baNone extends TopLevel[baNone with Double]
  
  /**
    * Used for Skyrim: Special Edition archives.
    */
  @js.native
  sealed trait baSSE extends ArchiveType
  /* 3 */ @js.native
  object baSSE extends TopLevel[baSSE with Double]
  
  /**
    * Used for Morrowind archives.
    */
  @js.native
  sealed trait baTES3 extends ArchiveType
  /* 1 */ @js.native
  object baTES3 extends TopLevel[baTES3 with Double]
}
