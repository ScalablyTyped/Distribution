package typings.xelib.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait ArchiveType extends StObject
@JSImport("xelib", "ArchiveType")
@js.native
object ArchiveType extends StObject {
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[ArchiveType & Double] = js.native
  
  /**
    * Used for Fallout 3, Oblivion, and Skyrim Classic archives.
    */
  @js.native
  sealed trait baFO3
    extends StObject
       with ArchiveType
  /* 2 */ val baFO3: typings.xelib.mod.ArchiveType.baFO3 & Double = js.native
  
  /**
    * Used for Fallout 4 archives.
    */
  @js.native
  sealed trait baFO4
    extends StObject
       with ArchiveType
  /* 4 */ val baFO4: typings.xelib.mod.ArchiveType.baFO4 & Double = js.native
  
  /**
    * Used for Fallout 4 texture archives.
    */
  @js.native
  sealed trait baFO4dds
    extends StObject
       with ArchiveType
  /* 5 */ val baFO4dds: typings.xelib.mod.ArchiveType.baFO4dds & Double = js.native
  
  /**
    * Unused.
    */
  @js.native
  sealed trait baNone
    extends StObject
       with ArchiveType
  /* 0 */ val baNone: typings.xelib.mod.ArchiveType.baNone & Double = js.native
  
  /**
    * Used for Skyrim: Special Edition archives.
    */
  @js.native
  sealed trait baSSE
    extends StObject
       with ArchiveType
  /* 3 */ val baSSE: typings.xelib.mod.ArchiveType.baSSE & Double = js.native
  
  /**
    * Used for Morrowind archives.
    */
  @js.native
  sealed trait baTES3
    extends StObject
       with ArchiveType
  /* 1 */ val baTES3: typings.xelib.mod.ArchiveType.baTES3 & Double = js.native
}
