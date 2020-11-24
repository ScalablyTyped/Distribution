package typings.tern.ternMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DefinitionQueryResult extends js.Object {
  
  /** A slice of the code in front of the definition Can be used to find a definition’s location in a modified file. */
  var context: js.UndefOr[String] = js.native
  
  /** The offset from the start of the context to the actual definition. Can be used to find a definition’s location in a modified file. */
  var contextOffset: js.UndefOr[Double] = js.native
  
  /** If the definition had documentation associated with it, these will also be returned. */
  var doc: js.UndefOr[String] = js.native
  
  /** The end position of the expression. */
  var end: js.UndefOr[Double | Position] = js.native
  
  /** The file in which the definition was defined. */
  var file: js.UndefOr[String] = js.native
  
  /** If the definition had origin information associated with it, these will also be returned. */
  var origin: js.UndefOr[String] = js.native
  
  /** The start position of the expression. */
  var start: js.UndefOr[Double | Position] = js.native
  
  /** If the definition had urls associated with it, these will also be returned. */
  var url: js.UndefOr[String] = js.native
}
object DefinitionQueryResult {
  
  @scala.inline
  def apply(): DefinitionQueryResult = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DefinitionQueryResult]
  }
  
  @scala.inline
  implicit class DefinitionQueryResultOps[Self <: DefinitionQueryResult] (val x: Self) extends AnyVal {
    
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
    def setContext(value: String): Self = this.set("context", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteContext: Self = this.set("context", js.undefined)
    
    @scala.inline
    def setContextOffset(value: Double): Self = this.set("contextOffset", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteContextOffset: Self = this.set("contextOffset", js.undefined)
    
    @scala.inline
    def setDoc(value: String): Self = this.set("doc", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDoc: Self = this.set("doc", js.undefined)
    
    @scala.inline
    def setEnd(value: Double | Position): Self = this.set("end", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteEnd: Self = this.set("end", js.undefined)
    
    @scala.inline
    def setFile(value: String): Self = this.set("file", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFile: Self = this.set("file", js.undefined)
    
    @scala.inline
    def setOrigin(value: String): Self = this.set("origin", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOrigin: Self = this.set("origin", js.undefined)
    
    @scala.inline
    def setStart(value: Double | Position): Self = this.set("start", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteStart: Self = this.set("start", js.undefined)
    
    @scala.inline
    def setUrl(value: String): Self = this.set("url", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteUrl: Self = this.set("url", js.undefined)
  }
}
