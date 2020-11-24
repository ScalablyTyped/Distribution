package typings.typeorm

import typings.typeorm.metadataUniqueMetadataMod.UniqueMetadata
import typings.typeorm.optionsTableUniqueOptionsMod.TableUniqueOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("typeorm/schema-builder/table/TableUnique", JSImport.Namespace)
@js.native
object tableTableUniqueMod extends js.Object {
  
  @js.native
  class TableUnique protected () extends js.Object {
    def this(options: TableUniqueOptions) = this()
    
    /**
      * Columns that contains this constraint.
      */
    var columnNames: js.Array[String] = js.native
    
    /**
      * Constraint name.
      */
    var name: js.UndefOr[String] = js.native
  }
  /* static members */
  @js.native
  object TableUnique extends js.Object {
    
    /**
      * Creates unique from the unique metadata object.
      */
    def create(uniqueMetadata: UniqueMetadata): TableUnique = js.native
  }
}
