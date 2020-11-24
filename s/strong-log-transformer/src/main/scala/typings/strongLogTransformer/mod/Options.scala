package typings.strongLogTransformer.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Options extends js.Object {
  
  var format: String = js.native
  
  var mergeMultiline: Boolean = js.native
  
  var tag: String = js.native
  
  var timeStamp: Boolean = js.native
}
object Options {
  
  @scala.inline
  def apply(format: String, mergeMultiline: Boolean, tag: String, timeStamp: Boolean): Options = {
    val __obj = js.Dynamic.literal(format = format.asInstanceOf[js.Any], mergeMultiline = mergeMultiline.asInstanceOf[js.Any], tag = tag.asInstanceOf[js.Any], timeStamp = timeStamp.asInstanceOf[js.Any])
    __obj.asInstanceOf[Options]
  }
  
  @scala.inline
  implicit class OptionsOps[Self <: Options] (val x: Self) extends AnyVal {
    
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
    def setFormat(value: String): Self = this.set("format", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMergeMultiline(value: Boolean): Self = this.set("mergeMultiline", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTag(value: String): Self = this.set("tag", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTimeStamp(value: Boolean): Self = this.set("timeStamp", value.asInstanceOf[js.Any])
  }
}
