package typings.tabris.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TabFolderScrollEvent[Target] extends EventObject[Target] {
  val offset: Double = js.native
  val selection: Tab | (/* import warning: importer.ImportType#apply Failed type conversion: Target['selection'] */ js.Any) = js.native
}

