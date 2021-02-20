package typings.typeorm

import typings.typeorm.checkMetadataMod.CheckMetadata
import typings.typeorm.tableCheckOptionsMod.TableCheckOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object tableCheckMod {
  
  @JSImport("typeorm/browser/schema-builder/table/TableCheck", "TableCheck")
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
    
    /**
      * Creates checks from the check metadata object.
      */
    @JSImport("typeorm/browser/schema-builder/table/TableCheck", "TableCheck.create")
    @js.native
    def create(checkMetadata: CheckMetadata): TableCheck = js.native
  }
}
