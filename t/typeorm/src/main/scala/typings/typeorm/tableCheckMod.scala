package typings.typeorm

import typings.typeorm.checkMetadataMod.CheckMetadata
import typings.typeorm.tableCheckOptionsMod.TableCheckOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("typeorm/browser/schema-builder/table/TableCheck", JSImport.Namespace)
@js.native
object tableCheckMod extends js.Object {
  
  @js.native
  class TableCheck protected () extends js.Object {
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
  @js.native
  object TableCheck extends js.Object {
    
    /**
      * Creates checks from the check metadata object.
      */
    def create(checkMetadata: CheckMetadata): TableCheck = js.native
  }
}
