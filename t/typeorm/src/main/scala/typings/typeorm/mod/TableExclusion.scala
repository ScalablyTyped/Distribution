package typings.typeorm.mod

import typings.typeorm.metadataExclusionMetadataMod.ExclusionMetadata
import typings.typeorm.optionsTableExclusionOptionsMod.TableExclusionOptions
import org.scalablytyped.runtime.StObject
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
object TableExclusion {
  
  /**
    * Creates exclusions from the exclusion metadata object.
    */
  @JSImport("typeorm", "TableExclusion.create")
  @js.native
  def create(exclusionMetadata: ExclusionMetadata): typings.typeorm.tableTableExclusionMod.TableExclusion = js.native
}
