package typings.typeorm.browserMod

import typings.typeorm.exclusionMetadataMod.ExclusionMetadata
import typings.typeorm.tableExclusionOptionsMod.TableExclusionOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("typeorm/browser", "TableExclusion")
@js.native
class TableExclusion protected ()
  extends typings.typeorm.tableExclusionMod.TableExclusion {
  def this(options: TableExclusionOptions) = this()
}
/* static members */
object TableExclusion {
  
  @JSImport("typeorm/browser", "TableExclusion")
  @js.native
  val ^ : js.Any = js.native
  
  /**
    * Creates exclusions from the exclusion metadata object.
    */
  @scala.inline
  def create(exclusionMetadata: ExclusionMetadata): typings.typeorm.tableExclusionMod.TableExclusion = ^.asInstanceOf[js.Dynamic].applyDynamic("create")(exclusionMetadata.asInstanceOf[js.Any]).asInstanceOf[typings.typeorm.tableExclusionMod.TableExclusion]
}
