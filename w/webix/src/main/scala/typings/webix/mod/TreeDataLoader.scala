package typings.webix.mod

import typings.webix.mod.^
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait TreeDataLoader extends StObject {
  
  def loadBranch(id: String, callback: WebixCallback, url: String): js.Promise[js.Any] = js.native
  def loadBranch(id: Double, callback: WebixCallback, url: String): js.Promise[js.Any] = js.native
}
object TreeDataLoader {
  
  @scala.inline
  def apply: TreeDataLoader = ^.asInstanceOf[js.Dynamic].selectDynamic("TreeDataLoader").asInstanceOf[TreeDataLoader]
}
