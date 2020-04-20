package typings.umzug.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Migration extends js.Object {
  var file: String
  def down(): js.Promise[_]
  def migration(): js.Promise[_]
  def testFileName(needle: String): Boolean
  def up(): js.Promise[_]
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
}

