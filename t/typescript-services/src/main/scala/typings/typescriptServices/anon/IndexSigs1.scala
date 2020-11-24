package typings.typescriptServices.anon

import typings.typescriptServices.TypeScript.IndexSignatureInfo
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait IndexSigs1 extends js.Object {
  
  var indexSigs1: IndexSignatureInfo = js.native
  
  var indexSigs2: IndexSignatureInfo = js.native
}
object IndexSigs1 {
  
  @scala.inline
  def apply(indexSigs1: IndexSignatureInfo, indexSigs2: IndexSignatureInfo): IndexSigs1 = {
    val __obj = js.Dynamic.literal(indexSigs1 = indexSigs1.asInstanceOf[js.Any], indexSigs2 = indexSigs2.asInstanceOf[js.Any])
    __obj.asInstanceOf[IndexSigs1]
  }
  
  @scala.inline
  implicit class IndexSigs1Ops[Self <: IndexSigs1] (val x: Self) extends AnyVal {
    
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
    def setIndexSigs1(value: IndexSignatureInfo): Self = this.set("indexSigs1", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIndexSigs2(value: IndexSignatureInfo): Self = this.set("indexSigs2", value.asInstanceOf[js.Any])
  }
}
