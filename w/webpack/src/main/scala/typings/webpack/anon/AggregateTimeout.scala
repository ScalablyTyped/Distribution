package typings.webpack.anon

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait AggregateTimeout extends js.Object {
  
  /**
  		 * Delay the rebuilt after the first change. Value is a time in ms.
  		 */
  var aggregateTimeout: js.UndefOr[Double] = js.native
  
  /**
  		 * Ignore some files from watching
  		 */
  var ignored: js.UndefOr[StringDictionary[js.Any]] = js.native
  
  /**
  		 * Enable polling mode for watching
  		 */
  var poll: js.UndefOr[Boolean | Double] = js.native
  
  /**
  		 * Stop watching when stdin stream has ended
  		 */
  var stdin: js.UndefOr[Boolean] = js.native
}
object AggregateTimeout {
  
  @scala.inline
  def apply(): AggregateTimeout = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AggregateTimeout]
  }
  
  @scala.inline
  implicit class AggregateTimeoutOps[Self <: AggregateTimeout] (val x: Self) extends AnyVal {
    
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
    def setAggregateTimeout(value: Double): Self = this.set("aggregateTimeout", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAggregateTimeout: Self = this.set("aggregateTimeout", js.undefined)
    
    @scala.inline
    def setIgnored(value: StringDictionary[js.Any]): Self = this.set("ignored", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteIgnored: Self = this.set("ignored", js.undefined)
    
    @scala.inline
    def setPoll(value: Boolean | Double): Self = this.set("poll", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePoll: Self = this.set("poll", js.undefined)
    
    @scala.inline
    def setStdin(value: Boolean): Self = this.set("stdin", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteStdin: Self = this.set("stdin", js.undefined)
  }
}
