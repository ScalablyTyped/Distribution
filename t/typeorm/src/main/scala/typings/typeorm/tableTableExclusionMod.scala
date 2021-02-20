package typings.typeorm

import typings.typeorm.metadataExclusionMetadataMod.ExclusionMetadata
import typings.typeorm.optionsTableExclusionOptionsMod.TableExclusionOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object tableTableExclusionMod {
  
  @JSImport("typeorm/schema-builder/table/TableExclusion", "TableExclusion")
  @js.native
  class TableExclusion protected () extends StObject {
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
  object TableExclusion {
    
    /**
      * Creates exclusions from the exclusion metadata object.
      */
    @JSImport("typeorm/schema-builder/table/TableExclusion", "TableExclusion.create")
    @js.native
    def create(exclusionMetadata: ExclusionMetadata): TableExclusion = js.native
  }
}
