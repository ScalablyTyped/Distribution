package typings.twineSugarcube.saveMod

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SavedMoment extends js.Object {
  
  /** The current pull count of SugarCube's seedable PRNG, exists only if enabled. */
  var pull: js.UndefOr[Double] = js.native
  
  /** The title of the associated passage. */
  var title: String = js.native
  
  /** The current variable store object, which contains sigil - less name ⇒ value pairs(e.g.$foo exists as foo). */
  var variables: StringDictionary[js.Any] = js.native
}
object SavedMoment {
  
  @scala.inline
  def apply(title: String, variables: StringDictionary[js.Any]): SavedMoment = {
    val __obj = js.Dynamic.literal(title = title.asInstanceOf[js.Any], variables = variables.asInstanceOf[js.Any])
    __obj.asInstanceOf[SavedMoment]
  }
  
  @scala.inline
  implicit class SavedMomentOps[Self <: SavedMoment] (val x: Self) extends AnyVal {
    
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
    def setVariables(value: StringDictionary[js.Any]): Self = this.set("variables", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPull(value: Double): Self = this.set("pull", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePull: Self = this.set("pull", js.undefined)
  }
}
