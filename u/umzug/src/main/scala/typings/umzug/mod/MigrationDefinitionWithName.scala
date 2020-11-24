package typings.umzug.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait MigrationDefinitionWithName extends Migration {
  
  var name: String = js.native
}
object MigrationDefinitionWithName {
  
  @scala.inline
  def apply(
    down: () => js.Promise[_],
    file: String,
    migration: () => js.Promise[_],
    name: String,
    testFileName: String => Boolean,
    up: () => js.Promise[_]
  ): MigrationDefinitionWithName = {
    val __obj = js.Dynamic.literal(down = js.Any.fromFunction0(down), file = file.asInstanceOf[js.Any], migration = js.Any.fromFunction0(migration), name = name.asInstanceOf[js.Any], testFileName = js.Any.fromFunction1(testFileName), up = js.Any.fromFunction0(up))
    __obj.asInstanceOf[MigrationDefinitionWithName]
  }
  
  @scala.inline
  implicit class MigrationDefinitionWithNameOps[Self <: MigrationDefinitionWithName] (val x: Self) extends AnyVal {
    
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
    def setName(value: String): Self = this.set("name", value.asInstanceOf[js.Any])
  }
}
