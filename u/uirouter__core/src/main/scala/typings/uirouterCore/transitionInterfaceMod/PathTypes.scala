package typings.uirouterCore.transitionInterfaceMod

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait PathTypes extends /* key */ StringDictionary[PathType] {
  var entering: PathType = js.native
  var exiting: PathType = js.native
  var from: PathType = js.native
  var retained: PathType = js.native
  var to: PathType = js.native
}

object PathTypes {
  @scala.inline
  def apply(entering: PathType, exiting: PathType, from: PathType, retained: PathType, to: PathType): PathTypes = {
    val __obj = js.Dynamic.literal(entering = entering.asInstanceOf[js.Any], exiting = exiting.asInstanceOf[js.Any], from = from.asInstanceOf[js.Any], retained = retained.asInstanceOf[js.Any], to = to.asInstanceOf[js.Any])
    __obj.asInstanceOf[PathTypes]
  }
  @scala.inline
  implicit class PathTypesOps[Self <: PathTypes] (val x: Self) extends AnyVal {
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
    def setEntering(value: PathType): Self = this.set("entering", value.asInstanceOf[js.Any])
    @scala.inline
    def setExiting(value: PathType): Self = this.set("exiting", value.asInstanceOf[js.Any])
    @scala.inline
    def setFrom(value: PathType): Self = this.set("from", value.asInstanceOf[js.Any])
    @scala.inline
    def setRetained(value: PathType): Self = this.set("retained", value.asInstanceOf[js.Any])
    @scala.inline
    def setTo(value: PathType): Self = this.set("to", value.asInstanceOf[js.Any])
  }
  
}

