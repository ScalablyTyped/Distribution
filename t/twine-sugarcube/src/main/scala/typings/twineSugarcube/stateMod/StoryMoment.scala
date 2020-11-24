package typings.twineSugarcube.stateMod

import typings.twineSugarcube.userdataMod.SugarCubeStoryVariables
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait StoryMoment extends js.Object {
  
  var title: String = js.native
  
  var variables: SugarCubeStoryVariables = js.native
}
object StoryMoment {
  
  @scala.inline
  def apply(title: String, variables: SugarCubeStoryVariables): StoryMoment = {
    val __obj = js.Dynamic.literal(title = title.asInstanceOf[js.Any], variables = variables.asInstanceOf[js.Any])
    __obj.asInstanceOf[StoryMoment]
  }
  
  @scala.inline
  implicit class StoryMomentOps[Self <: StoryMoment] (val x: Self) extends AnyVal {
    
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
    def setTitle(value: String): Self = this.set("title", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setVariables(value: SugarCubeStoryVariables): Self = this.set("variables", value.asInstanceOf[js.Any])
  }
}
