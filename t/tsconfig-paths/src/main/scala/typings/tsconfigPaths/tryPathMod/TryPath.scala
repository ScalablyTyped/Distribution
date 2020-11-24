package typings.tsconfigPaths.tryPathMod

import typings.tsconfigPaths.tsconfigPathsStrings._package
import typings.tsconfigPaths.tsconfigPathsStrings.extension
import typings.tsconfigPaths.tsconfigPathsStrings.file
import typings.tsconfigPaths.tsconfigPathsStrings.index
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait TryPath extends js.Object {
  
  val path: String = js.native
  
  val `type`: file | extension | index | _package = js.native
}
object TryPath {
  
  @scala.inline
  def apply(path: String, `type`: file | extension | index | _package): TryPath = {
    val __obj = js.Dynamic.literal(path = path.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[TryPath]
  }
  
  @scala.inline
  implicit class TryPathOps[Self <: TryPath] (val x: Self) extends AnyVal {
    
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
    def setPath(value: String): Self = this.set("path", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setType(value: file | extension | index | _package): Self = this.set("type", value.asInstanceOf[js.Any])
  }
}
