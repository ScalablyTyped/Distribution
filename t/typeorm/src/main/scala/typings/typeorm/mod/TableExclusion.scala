package typings.typeorm.mod

import typings.typeorm.metadataExclusionMetadataMod.ExclusionMetadata
import typings.typeorm.optionsTableExclusionOptionsMod.TableExclusionOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("typeorm", "TableExclusion")
@js.native
class TableExclusion protected ()
  extends typings.typeorm.tableTableExclusionMod.TableExclusion {
  def this(options: TableExclusionOptions) = this()
}
/* static members */
@JSImport("typeorm", "TableExclusion")
@js.native
object TableExclusion extends js.Object {
  
  /**
    * Creates exclusions from the exclusion metadata object.
    */
  def create(exclusionMetadata: ExclusionMetadata): typings.typeorm.tableTableExclusionMod.TableExclusion = js.native
}
