package typings.twineSugarcube.saveMod

import typings.twineSugarcube.extensionsMod.global.Array
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SavedState extends js.Object {
  
  /** The array of expired moment passage titles, exists only if any moments have expired. */
  var expired: js.UndefOr[Array[String]] = js.native
  
  /** The array of moment objects. */
  var history: Array[SavedMoment] = js.native
  
  /** The index of the active moment. */
  var index: Double = js.native
  
  /** The seed of SugarCube's seedable PRNG, exists only if enabled. */
  var seed: js.UndefOr[String] = js.native
}
object SavedState {
  
  @scala.inline
  def apply(history: Array[SavedMoment], index: Double): SavedState = {
    val __obj = js.Dynamic.literal(history = history.asInstanceOf[js.Any], index = index.asInstanceOf[js.Any])
    __obj.asInstanceOf[SavedState]
  }
  
  @scala.inline
  implicit class SavedStateOps[Self <: SavedState] (val x: Self) extends AnyVal {
    
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
    def setHistory(value: Array[SavedMoment]): Self = this.set("history", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIndex(value: Double): Self = this.set("index", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setExpired(value: Array[String]): Self = this.set("expired", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteExpired: Self = this.set("expired", js.undefined)
    
    @scala.inline
    def setSeed(value: String): Self = this.set("seed", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSeed: Self = this.set("seed", js.undefined)
  }
}
