package typings.typeorm.mod

import typings.typeorm.metadataExclusionMetadataMod.ExclusionMetadata
import typings.typeorm.optionsTableExclusionOptionsMod.TableExclusionOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("typeorm", "TableExclusion")
@js.native
class TableExclusion protected ()
  extends typings.typeorm.tableTableExclusionMod.TableExclusion {
  def this(options: TableExclusionOptions) = this()
}
/* static members */
object TableExclusion {
  
  @JSImport("typeorm", "TableExclusion")
  @js.native
  val ^ : js.Any = js.native
  
  /**
    * Creates exclusions from the exclusion metadata object.
    */
  @scala.inline
  def create(exclusionMetadata: ExclusionMetadata): typings.typeorm.tableTableExclusionMod.TableExclusion = ^.asInstanceOf[js.Dynamic].applyDynamic("create")(exclusionMetadata.asInstanceOf[js.Any]).asInstanceOf[typings.typeorm.tableTableExclusionMod.TableExclusion]
}
