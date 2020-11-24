package typings.webpackbar.mod

import typings.webpackbar.anon.File
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Status extends js.Object {
  
  val color: String = js.native
  
  val details: js.Array[String] = js.native
  
  /** @default false */
  val done: Boolean = js.native
  
  /** @default false */
  val hasErrors: Boolean = js.native
  
  /** @default '' */
  val message: String = js.native
  
  val name: String = js.native
  
  /** @default -1 */
  val progress: Double = js.native
  
  val request: Null | File = js.native
  
  /** @default null */
  val start: (js.Tuple2[Double, Double]) | Null = js.native
}
object Status {
  
  @scala.inline
  def apply(
    color: String,
    details: js.Array[String],
    done: Boolean,
    hasErrors: Boolean,
    message: String,
    name: String,
    progress: Double
  ): Status = {
    val __obj = js.Dynamic.literal(color = color.asInstanceOf[js.Any], details = details.asInstanceOf[js.Any], done = done.asInstanceOf[js.Any], hasErrors = hasErrors.asInstanceOf[js.Any], message = message.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], progress = progress.asInstanceOf[js.Any])
    __obj.asInstanceOf[Status]
  }
  
  @scala.inline
  implicit class StatusOps[Self <: Status] (val x: Self) extends AnyVal {
    
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
    def setColor(value: String): Self = this.set("color", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDetailsVarargs(value: String*): Self = this.set("details", js.Array(value :_*))
    
    @scala.inline
    def setDetails(value: js.Array[String]): Self = this.set("details", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDone(value: Boolean): Self = this.set("done", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHasErrors(value: Boolean): Self = this.set("hasErrors", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMessage(value: String): Self = this.set("message", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setName(value: String): Self = this.set("name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setProgress(value: Double): Self = this.set("progress", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRequest(value: File): Self = this.set("request", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRequestNull: Self = this.set("request", null)
    
    @scala.inline
    def setStart(value: js.Tuple2[Double, Double]): Self = this.set("start", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStartNull: Self = this.set("start", null)
  }
}
