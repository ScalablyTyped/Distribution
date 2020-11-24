package typings.yaml.typesMod.AST

import org.scalablytyped.runtime.StringDictionary
import typings.yaml.mod.Document
import typings.yaml.typesMod.Node
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait NodeToJsonContext
  extends /* key */ StringDictionary[js.Any] {
  
  var anchors: js.UndefOr[js.Array[_]] = js.native
  
  var doc: Document = js.native
  
  var keep: js.UndefOr[Boolean] = js.native
  
  var mapAsMap: js.UndefOr[Boolean] = js.native
  
  var maxAliasCount: js.UndefOr[Double] = js.native
  
  var onCreate: js.UndefOr[js.Function1[/* node */ Node, Unit]] = js.native
}
object NodeToJsonContext {
  
  @scala.inline
  def apply(doc: Document): NodeToJsonContext = {
    val __obj = js.Dynamic.literal(doc = doc.asInstanceOf[js.Any])
    __obj.asInstanceOf[NodeToJsonContext]
  }
  
  @scala.inline
  implicit class NodeToJsonContextOps[Self <: NodeToJsonContext] (val x: Self) extends AnyVal {
    
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
    def setDoc(value: Document): Self = this.set("doc", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAnchorsVarargs(value: js.Any*): Self = this.set("anchors", js.Array(value :_*))
    
    @scala.inline
    def setAnchors(value: js.Array[_]): Self = this.set("anchors", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAnchors: Self = this.set("anchors", js.undefined)
    
    @scala.inline
    def setKeep(value: Boolean): Self = this.set("keep", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteKeep: Self = this.set("keep", js.undefined)
    
    @scala.inline
    def setMapAsMap(value: Boolean): Self = this.set("mapAsMap", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMapAsMap: Self = this.set("mapAsMap", js.undefined)
    
    @scala.inline
    def setMaxAliasCount(value: Double): Self = this.set("maxAliasCount", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMaxAliasCount: Self = this.set("maxAliasCount", js.undefined)
    
    @scala.inline
    def setOnCreate(value: /* node */ Node => Unit): Self = this.set("onCreate", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteOnCreate: Self = this.set("onCreate", js.undefined)
  }
}
