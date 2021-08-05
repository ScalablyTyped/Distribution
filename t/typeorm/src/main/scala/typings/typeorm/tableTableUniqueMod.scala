package typings.typeorm

import typings.typeorm.metadataUniqueMetadataMod.UniqueMetadata
import typings.typeorm.optionsTableUniqueOptionsMod.TableUniqueOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object tableTableUniqueMod {
  
  @JSImport("typeorm/schema-builder/table/TableUnique", "TableUnique")
  @js.native
  class TableUnique protected () extends StObject {
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
  object TableUnique {
    
    @JSImport("typeorm/schema-builder/table/TableUnique", "TableUnique")
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * Creates unique from the unique metadata object.
      */
    inline def create(uniqueMetadata: UniqueMetadata): TableUnique = ^.asInstanceOf[js.Dynamic].applyDynamic("create")(uniqueMetadata.asInstanceOf[js.Any]).asInstanceOf[TableUnique]
  }
}
