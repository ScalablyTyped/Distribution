package typings.uiGrid.mod.treeBase

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ITreeState extends js.Object {
  var expandedState: StringDictionary[String]
}

object ITreeState {
  @scala.inline
  def apply(expandedState: StringDictionary[String]): ITreeState = {
    val __obj = js.Dynamic.literal(expandedState = expandedState.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[ITreeState]
  }
}

