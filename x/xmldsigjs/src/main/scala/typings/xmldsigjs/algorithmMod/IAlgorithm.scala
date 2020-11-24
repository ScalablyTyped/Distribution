package typings.xmldsigjs.algorithmMod

import typings.std.Algorithm
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait IAlgorithm extends js.Object {
  
  var algorithm: Algorithm = js.native
  
  def getAlgorithmName(): String = js.native
  
  var namespaceURI: String = js.native
}
object IAlgorithm {
  
  @scala.inline
  def apply(algorithm: Algorithm, getAlgorithmName: () => String, namespaceURI: String): IAlgorithm = {
    val __obj = js.Dynamic.literal(algorithm = algorithm.asInstanceOf[js.Any], getAlgorithmName = js.Any.fromFunction0(getAlgorithmName), namespaceURI = namespaceURI.asInstanceOf[js.Any])
    __obj.asInstanceOf[IAlgorithm]
  }
  
  @scala.inline
  implicit class IAlgorithmOps[Self <: IAlgorithm] (val x: Self) extends AnyVal {
    
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
    def setAlgorithm(value: Algorithm): Self = this.set("algorithm", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setGetAlgorithmName(value: () => String): Self = this.set("getAlgorithmName", js.Any.fromFunction0(value))
    
    @scala.inline
    def setNamespaceURI(value: String): Self = this.set("namespaceURI", value.asInstanceOf[js.Any])
  }
}
