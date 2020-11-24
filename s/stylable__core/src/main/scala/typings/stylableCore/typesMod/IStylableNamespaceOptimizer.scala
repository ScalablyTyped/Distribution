package typings.stylableCore.typesMod

import typings.std.Record
import typings.stylableCore.stylableMetaMod.StylableMeta
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait IStylableNamespaceOptimizer extends js.Object {
  
  def getNamespace(meta: StylableMeta, _env: js.Any*): String = js.native
  
  var index: Double = js.native
  
  var namespaceMapping: Record[String, String] = js.native
  
  var namespacePrefix: String = js.native
}
object IStylableNamespaceOptimizer {
  
  @scala.inline
  def apply(
    getNamespace: (StylableMeta, /* repeated */ js.Any) => String,
    index: Double,
    namespaceMapping: Record[String, String],
    namespacePrefix: String
  ): IStylableNamespaceOptimizer = {
    val __obj = js.Dynamic.literal(getNamespace = js.Any.fromFunction2(getNamespace), index = index.asInstanceOf[js.Any], namespaceMapping = namespaceMapping.asInstanceOf[js.Any], namespacePrefix = namespacePrefix.asInstanceOf[js.Any])
    __obj.asInstanceOf[IStylableNamespaceOptimizer]
  }
  
  @scala.inline
  implicit class IStylableNamespaceOptimizerOps[Self <: IStylableNamespaceOptimizer] (val x: Self) extends AnyVal {
    
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
    def setGetNamespace(value: (StylableMeta, /* repeated */ js.Any) => String): Self = this.set("getNamespace", js.Any.fromFunction2(value))
    
    @scala.inline
    def setIndex(value: Double): Self = this.set("index", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNamespaceMapping(value: Record[String, String]): Self = this.set("namespaceMapping", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNamespacePrefix(value: String): Self = this.set("namespacePrefix", value.asInstanceOf[js.Any])
  }
}
