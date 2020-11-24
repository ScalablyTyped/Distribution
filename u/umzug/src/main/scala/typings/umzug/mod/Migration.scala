package typings.umzug.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Migration extends js.Object {
  
  def down(): js.Promise[_] = js.native
  
  var file: String = js.native
  
  def migration(): js.Promise[_] = js.native
  
  def testFileName(needle: String): Boolean = js.native
  
  def up(): js.Promise[_] = js.native
}
object Migration {
  
  @scala.inline
  def apply(
    down: () => js.Promise[_],
    file: String,
    migration: () => js.Promise[_],
    testFileName: String => Boolean,
    up: () => js.Promise[_]
  ): Migration = {
    val __obj = js.Dynamic.literal(down = js.Any.fromFunction0(down), file = file.asInstanceOf[js.Any], migration = js.Any.fromFunction0(migration), testFileName = js.Any.fromFunction1(testFileName), up = js.Any.fromFunction0(up))
    __obj.asInstanceOf[Migration]
  }
  
  @scala.inline
  implicit class MigrationOps[Self <: Migration] (val x: Self) extends AnyVal {
    
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
    def setDown(value: () => js.Promise[_]): Self = this.set("down", js.Any.fromFunction0(value))
    
    @scala.inline
    def setFile(value: String): Self = this.set("file", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMigration(value: () => js.Promise[_]): Self = this.set("migration", js.Any.fromFunction0(value))
    
    @scala.inline
    def setTestFileName(value: String => Boolean): Self = this.set("testFileName", js.Any.fromFunction1(value))
    
    @scala.inline
    def setUp(value: () => js.Promise[_]): Self = this.set("up", js.Any.fromFunction0(value))
  }
}
