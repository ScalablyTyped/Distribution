package typings.typeorm.schemaBuilderSchemaBuilderMod

import typings.typeorm.driverSqlInMemoryMod.SqlInMemory
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SchemaBuilder extends js.Object {
  
  /**
    * Creates complete schemas for the given entity metadatas.
    */
  def build(): js.Promise[Unit] = js.native
  
  /**
    * Returns queries to be executed by schema builder.
    */
  def log(): js.Promise[SqlInMemory] = js.native
}
object SchemaBuilder {
  
  @scala.inline
  def apply(build: () => js.Promise[Unit], log: () => js.Promise[SqlInMemory]): SchemaBuilder = {
    val __obj = js.Dynamic.literal(build = js.Any.fromFunction0(build), log = js.Any.fromFunction0(log))
    __obj.asInstanceOf[SchemaBuilder]
  }
  
  @scala.inline
  implicit class SchemaBuilderOps[Self <: SchemaBuilder] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setBuild(value: () => js.Promise[Unit]): Self = this.set("build", js.Any.fromFunction0(value))
    
    @scala.inline
    def setLog(value: () => js.Promise[SqlInMemory]): Self = this.set("log", js.Any.fromFunction0(value))
  }
}
