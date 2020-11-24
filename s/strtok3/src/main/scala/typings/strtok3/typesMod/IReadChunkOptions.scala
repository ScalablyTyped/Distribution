package typings.strtok3.typesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait IReadChunkOptions extends js.Object {
  
  /**
    * Number of bytes to read.
    */
  var length: js.UndefOr[Double] = js.native
  
  /**
    * If set, will not throw an EOF error if not all of the requested data could be read
    */
  var mayBeLess: js.UndefOr[Boolean] = js.native
  
  /**
    * The offset in the buffer to start writing at; default is 0
    */
  var offset: js.UndefOr[Double] = js.native
  
  /**
    * Position where to begin reading from the file.
    * Default it is `tokenizer.position`.
    * Position may not be less then `tokenizer.position`.
    */
  var position: js.UndefOr[Double] = js.native
}
object IReadChunkOptions {
  
  @scala.inline
  def apply(): IReadChunkOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IReadChunkOptions]
  }
  
  @scala.inline
  implicit class IReadChunkOptionsOps[Self <: IReadChunkOptions] (val x: Self) extends AnyVal {
    
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
    def setLength(value: Double): Self = this.set("length", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLength: Self = this.set("length", js.undefined)
    
    @scala.inline
    def setMayBeLess(value: Boolean): Self = this.set("mayBeLess", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMayBeLess: Self = this.set("mayBeLess", js.undefined)
    
    @scala.inline
    def setOffset(value: Double): Self = this.set("offset", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOffset: Self = this.set("offset", js.undefined)
    
    @scala.inline
    def setPosition(value: Double): Self = this.set("position", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePosition: Self = this.set("position", js.undefined)
  }
}
