package typings.typeorm

import typings.typeorm.browserMod.Connection
import typings.typeorm.browserMod.EntityMetadata
import typings.typeorm.browserMod.SelectQueryBuilder
import typings.typeorm.driverMod.Driver
import typings.typeorm.viewOptionsMod.ViewOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("typeorm/browser/schema-builder/view/View", JSImport.Namespace)
@js.native
object viewMod extends js.Object {
  
  @js.native
  class View () extends js.Object {
    def this(options: ViewOptions) = this()
    
    /**
      * View definition.
      */
    var expression: String | (js.Function1[/* connection */ Connection, SelectQueryBuilder[_]]) = js.native
    
    /**
      * Indicates if view is materialized.
      */
    var materialized: Boolean = js.native
    
    /**
      * Contains database name, schema name and table name.
      * E.g. "myDB"."mySchema"."myTable"
      */
    var name: String = js.native
  }
  /* static members */
  @js.native
  object View extends js.Object {
    
    /**
      * Creates view from a given entity metadata.
      */
    def create(entityMetadata: EntityMetadata, driver: Driver): View = js.native
  }
}
