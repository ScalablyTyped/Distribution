package typings.typeorm

import typings.typeorm.metadataCheckMetadataMod.CheckMetadata
import typings.typeorm.optionsTableCheckOptionsMod.TableCheckOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object tableTableCheckMod {
  
  @JSImport("typeorm/schema-builder/table/TableCheck", "TableCheck")
  @js.native
  class TableCheck protected () extends StObject {
    def this(options: TableCheckOptions) = this()
    
    /**
      * Column that contains this constraint.
      */
    var columnNames: js.UndefOr[js.Array[String]] = js.native
    
    /**
      * Check expression.
      */
    var expression: js.UndefOr[String] = js.native
    
    /**
      * Constraint name.
      */
    var name: js.UndefOr[String] = js.native
  }
  /* static members */
  object TableCheck {
    
    @JSImport("typeorm/schema-builder/table/TableCheck", "TableCheck")
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * Creates checks from the check metadata object.
      */
    inline def create(checkMetadata: CheckMetadata): TableCheck = ^.asInstanceOf[js.Dynamic].applyDynamic("create")(checkMetadata.asInstanceOf[js.Any]).asInstanceOf[TableCheck]
  }
}
