package typings.tap.mod.Options

import typings.std.RegExp
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Test extends Assert {
  
  var autoend: js.UndefOr[Boolean] = js.native
  
  var bail: js.UndefOr[Boolean] = js.native
  
  var buffered: js.UndefOr[Boolean] = js.native
  
  var grep: js.UndefOr[js.Array[RegExp]] = js.native
  
  var jobs: js.UndefOr[Double] = js.native
  
  var only: js.UndefOr[Boolean] = js.native
  
  var runOnly: js.UndefOr[Boolean] = js.native
  
  var timeout: js.UndefOr[Double] = js.native
}
object Test {
  
  @scala.inline
  def apply(): Test = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Test]
  }
  
  @scala.inline
  implicit class TestOps[Self <: Test] (val x: Self) extends AnyVal {
    
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
    def setAutoend(value: Boolean): Self = this.set("autoend", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAutoend: Self = this.set("autoend", js.undefined)
    
    @scala.inline
    def setBail(value: Boolean): Self = this.set("bail", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteBail: Self = this.set("bail", js.undefined)
    
    @scala.inline
    def setBuffered(value: Boolean): Self = this.set("buffered", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteBuffered: Self = this.set("buffered", js.undefined)
    
    @scala.inline
    def setGrepVarargs(value: RegExp*): Self = this.set("grep", js.Array(value :_*))
    
    @scala.inline
    def setGrep(value: js.Array[RegExp]): Self = this.set("grep", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteGrep: Self = this.set("grep", js.undefined)
    
    @scala.inline
    def setJobs(value: Double): Self = this.set("jobs", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteJobs: Self = this.set("jobs", js.undefined)
    
    @scala.inline
    def setOnly(value: Boolean): Self = this.set("only", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOnly: Self = this.set("only", js.undefined)
    
    @scala.inline
    def setRunOnly(value: Boolean): Self = this.set("runOnly", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRunOnly: Self = this.set("runOnly", js.undefined)
    
    @scala.inline
    def setTimeout(value: Double): Self = this.set("timeout", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTimeout: Self = this.set("timeout", js.undefined)
  }
}
