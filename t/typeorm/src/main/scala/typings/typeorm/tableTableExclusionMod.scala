package typings.typeorm

import typings.typeorm.metadataExclusionMetadataMod.ExclusionMetadata
import typings.typeorm.optionsTableExclusionOptionsMod.TableExclusionOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("typeorm/schema-builder/table/TableExclusion", JSImport.Namespace)
@js.native
object tableTableExclusionMod extends js.Object {
  
  @js.native
  class TableExclusion protected () extends js.Object {
    def this(options: TableExclusionOptions) = this()
    
    /**
      * Exclusion expression.
      */
    var expression: js.UndefOr[String] = js.native
    
    /**
      * Constraint name.
      */
    var name: js.UndefOr[String] = js.native
  }
  /* static members */
  @js.native
  object TableExclusion extends js.Object {
    
    /**
      * Creates exclusions from the exclusion metadata object.
      */
    def create(exclusionMetadata: ExclusionMetadata): TableExclusion = js.native
  }
}
