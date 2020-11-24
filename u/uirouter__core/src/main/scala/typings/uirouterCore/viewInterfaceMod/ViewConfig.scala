package typings.uirouterCore.viewInterfaceMod

import typings.uirouterCore.pathNodeMod.PathNode
import typings.uirouterCore.stateInterfaceMod.ViewDeclaration
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ViewConfig extends js.Object {
  
  @JSName("$id")
  var $id: Double = js.native
  
  /** Fetches templates, runs dynamic (controller|template)Provider code, lazy loads Components, etc */
  def load(): js.Promise[ViewConfig] = js.native
  
  var loaded: Boolean = js.native
  
  /** The node the ViewConfig is bound to */
  var path: js.Array[PathNode] = js.native
  
  /** The normalized view declaration from [[State.views]] */
  var viewDecl: ViewDeclaration = js.native
}
object ViewConfig {
  
  @scala.inline
  def apply(
    $id: Double,
    load: () => js.Promise[ViewConfig],
    loaded: Boolean,
    path: js.Array[PathNode],
    viewDecl: ViewDeclaration
  ): ViewConfig = {
    val __obj = js.Dynamic.literal($id = $id.asInstanceOf[js.Any], load = js.Any.fromFunction0(load), loaded = loaded.asInstanceOf[js.Any], path = path.asInstanceOf[js.Any], viewDecl = viewDecl.asInstanceOf[js.Any])
    __obj.asInstanceOf[ViewConfig]
  }
  
  @scala.inline
  implicit class ViewConfigOps[Self <: ViewConfig] (val x: Self) extends AnyVal {
    
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
    def set$id(value: Double): Self = this.set("$id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLoad(value: () => js.Promise[ViewConfig]): Self = this.set("load", js.Any.fromFunction0(value))
    
    @scala.inline
    def setLoaded(value: Boolean): Self = this.set("loaded", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPathVarargs(value: PathNode*): Self = this.set("path", js.Array(value :_*))
    
    @scala.inline
    def setPath(value: js.Array[PathNode]): Self = this.set("path", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setViewDecl(value: ViewDeclaration): Self = this.set("viewDecl", value.asInstanceOf[js.Any])
  }
}
