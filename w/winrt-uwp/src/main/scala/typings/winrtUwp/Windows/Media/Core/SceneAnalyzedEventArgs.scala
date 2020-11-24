package typings.winrtUwp.Windows.Media.Core

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Provides data for the SceneAnalysisEffect::SceneAnalyzed event. */
@js.native
trait SceneAnalyzedEventArgs extends js.Object {
  
  /** Gets the result frame from the scene analysis operation. */
  var resultFrame: SceneAnalysisEffectFrame = js.native
}
object SceneAnalyzedEventArgs {
  
  @scala.inline
  def apply(resultFrame: SceneAnalysisEffectFrame): SceneAnalyzedEventArgs = {
    val __obj = js.Dynamic.literal(resultFrame = resultFrame.asInstanceOf[js.Any])
    __obj.asInstanceOf[SceneAnalyzedEventArgs]
  }
  
  @scala.inline
  implicit class SceneAnalyzedEventArgsOps[Self <: SceneAnalyzedEventArgs] (val x: Self) extends AnyVal {
    
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
    def setResultFrame(value: SceneAnalysisEffectFrame): Self = this.set("resultFrame", value.asInstanceOf[js.Any])
  }
}
